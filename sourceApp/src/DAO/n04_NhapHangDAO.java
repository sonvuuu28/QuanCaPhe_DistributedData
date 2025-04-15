package DAO;

import DTO.*;
import Util.JDBCUtil;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class n04_NhapHangDAO {

    public static n04_NhapHangDAO getInstance() {
        return new n04_NhapHangDAO();
    }

    public boolean insert(PhieuNhapDTO hd) {
        boolean result = true;
        String sql = "INSERT INTO LINK.QuanCaPhe.dbo.PhieuNhap(MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNCC, MaChiNhanh) "
                + "VALUES(?, ?, ?, ?, ?, ?)";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, hd.getMaPN());
            st.setDate(2, hd.getNgayLap());
            st.setLong(3, hd.getTongTien());
            st.setString(4, hd.getMaNV());
            st.setString(5, hd.getMaNCC());
            st.setString(6, hd.getMaCN());
            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            result = false;
        }
        return result;
    }

    public boolean insertCTPN(ArrayList<ChiTietPhieuNhapDTO> dsChiTiet, String maCN) {
        boolean result = false;
        String sql = "INSERT INTO LINK.QuanCaPhe.dbo.ChiTietPhieuNhap(MaPhieuNhap, MaNguyenLieu, KhoiLuong, DonGia, ThanhTien) "
                + " VALUES (?, ?, ?, ?, ?)";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement prep = c.prepareStatement(sql)) {

            for (ChiTietPhieuNhapDTO cthd : dsChiTiet) {
                prep.setString(1, cthd.getMaPN());
                prep.setString(2, cthd.getMaNL());
                prep.setFloat(3, cthd.getKl());
                prep.setLong(4, cthd.getDonGia());
                prep.setLong(5, cthd.getThanhTien());

                prep.addBatch(); // Thêm vào batch
            }

            int[] rows = prep.executeBatch(); // Chạy batch một lần
            result = Arrays.stream(rows).allMatch(row -> row > 0); // Kiểm tra tất cả đều thành công
            upDateNguyenLieuUp(dsChiTiet, maCN);
        } catch (SQLException ex) {
            System.out.println("Lỗi insertCTPN: " + ex);
        }

        return result;
    }

    public void upDateNguyenLieuUp(ArrayList<ChiTietPhieuNhapDTO> dsChiTiet, String maCN) {
        String sql = "UPDATE LINK.QuanCaPhe.dbo.NguyenLieuKho "
                + "SET KhoiLuong = KhoiLuong + CAST(? AS DECIMAL(18, 6)) "
                + "WHERE MaNguyenLieu = ? and MaChiNhanh = ? ";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement prep = c.prepareStatement(sql)) {

            for (ChiTietPhieuNhapDTO cthd : dsChiTiet) {
                BigDecimal kl = BigDecimal.valueOf(cthd.getKl());  // Chuyển về BigDecimal

                prep.setBigDecimal(1, kl);
                prep.setString(2, cthd.getMaNL());
                prep.setString(3, maCN);
                prep.addBatch();
            }

            int[] rows = prep.executeBatch(); // Chạy batch một lần
            boolean allSuccess = Arrays.stream(rows).allMatch(row -> row > 0);
            System.out.println(allSuccess ? "Cập nhật thành công!" : "Có lỗi khi cập nhật!");

        } catch (SQLException ex) {
            System.out.println("Lỗi insert upDateNguyenLieuUp: " + ex);
        }
    }

    public ArrayList<NguyenLieuDTO> listAll_KhoHang(String maCN) {
        ArrayList<NguyenLieuDTO> list = new ArrayList<>();
        String sql = "exec spud_listAll_NguyenLieu ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NguyenLieuDTO a = new NguyenLieuDTO(rs.getString("MaNguyenLieu"), rs.getString("TenNguyenLieu"),
                        rs.getFloat("KhoiLuong"), rs.getString("DonVi"), rs.getBoolean("TrangThai"),
                        null);
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll_KhoHang error");
        }
        return list;
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM  LINK.QuanCaPhe.dbo.PhieuNhap";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "PN001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "PN00" + num;
            } else if (num < 100 && num > 9) {
                ID = "PN0" + num;
            } else if (num >= 100) {
                ID = "PN" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public NhanVienDTO searchNhanVienByMa(String maNV) {
        NhanVienDTO nv = null;
        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.NhanVien WHERE MaNhanVien = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maNV);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                nv = new NhanVienDTO(
                        rs.getString("MaNhanVien"),
                        rs.getString("TenNhanVien"),
                        rs.getString("GioiTinhNhanVien"),
                        rs.getString("SoDienThoaiNhanVien"),
                        rs.getDate("NgaySinhNhanVien"),
                        rs.getString("ChucVuNhanVien"),
                        rs.getString("DiaChi"),
                        rs.getLong("LuongNhanVien"),
                        rs.getBoolean("TrangThaiNhanVien"),
                        rs.getString("MaChiNhanh"),
                        rs.getDate("NgayNghiViec")
                );
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchNhanVienByMa Error");
        }
        return nv;
    }

    public NhaCungCapDTO searchNCCByMa(String ma) {
        NhaCungCapDTO ncc = null;
        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.NhaCungCap WHERE MaNCC = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                ncc = new NhaCungCapDTO(rs.getString("MaNCC"), rs.getString("TenNCC"),
                        rs.getString("DiaChi"), rs.getString("SDT"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchNCCByMa Error");
        }
        return ncc;
    }
}
