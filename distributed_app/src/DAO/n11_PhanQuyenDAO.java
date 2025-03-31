package DAO;

import DTO.PhanQuyenDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;

public class n11_PhanQuyenDAO {

    public static n11_PhanQuyenDAO getInstance() {
        return new n11_PhanQuyenDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM PhanQuyen";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "PQ001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "PQ00" + num;
            } else if (num < 100 && num > 9) {
                ID = "PQ0" + num;
            } else if (num >= 100) {
                ID = "PQ" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(PhanQuyenDTO a) {
        String sql = "INSERT INTO PhanQuyen \n"
                + "           (MaPhanQuyen\n"
                + "           ,TenQuyen\n"
                + "           ,BanHang\n"
                + "           ,KhachHang\n"
                + "           ,NhapHang\n"
                + "           ,XuatKho\n"
                + "           ,Mon\n"
                + "           ,NguyenLieu\n"
                + "           ,LichLam\n"
                + "           ,KhuyenMaiUuDai\n"
                + "           ,NhaCungCap\n"
                + "           ,NhanVien\n"
                + "           ,ThongKe\n"
                + "           ,TrangThai)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setBoolean(3, a.isBanHang());
            st.setBoolean(4, a.isKhachHang());

            st.setBoolean(5, a.isNhapHang());
            st.setBoolean(6, a.isXuatKho());
            st.setBoolean(7, a.isMon());
            st.setBoolean(8, a.isNguyenLieu());

            st.setBoolean(9, a.isLichLam());
            st.setBoolean(10, a.isKhuyenMaiUuDai());
            st.setBoolean(11, a.isNhaCungCap());
            st.setBoolean(12, a.isNhanVien());

            st.setBoolean(13, a.isThongKe());
            st.setBoolean(14, a.isTrangThai());

            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println("Lỗi: Mã phân quyền đã tồn tại!");
            return 0;
        }
        return 1;
    }

    public int update(PhanQuyenDTO a) {
        String sqlUpdate = "UPDATE PhanQuyen "
                + "SET TenQuyen = ?, "
                + "    BanHang = ?, "
                + "    KhachHang = ?, "
                + "    NhapHang = ?, "
                + "    XuatKho = ?, "
                + "    Mon = ?, "
                + "    NguyenLieu = ?, "
                + "    LichLam = ?, "
                + "    KhuyenMaiUuDai = ?, "
                + "    NhaCungCap = ?, "
                + "    NhanVien = ?, "
                + "    ThongKe = ?, "
                + "    TrangThai = ? "
                + "WHERE MaPhanQuyen = ?";

        String sqlSelect = "SELECT TenQuyen, BanHang, KhachHang, NhapHang, XuatKho, Mon, NguyenLieu, LichLam, KhuyenMaiUuDai, NhaCungCap, NhanVien, ThongKe, TrangThai "
                + "FROM PhanQuyen WHERE MaPhanQuyen = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            // Truy vấn dữ liệu cũ
            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMa());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTen = rs.getString("TenQuyen");
                Boolean previousBanHang = rs.getBoolean("BanHang");
                Boolean previousKhachHang = rs.getBoolean("KhachHang");
                Boolean previousNhapHang = rs.getBoolean("NhapHang");
                Boolean previousXuatKho = rs.getBoolean("XuatKho");
                Boolean previousMon = rs.getBoolean("Mon");
                Boolean previousNguyenLieu = rs.getBoolean("NguyenLieu");
                Boolean previousLichLam = rs.getBoolean("LichLam");
                Boolean previousKhuyenMaiUuDai = rs.getBoolean("KhuyenMaiUuDai");
                Boolean previousNhaCungCap = rs.getBoolean("NhaCungCap");
                Boolean previousNhanVien = rs.getBoolean("NhanVien");
                Boolean previousThongKe = rs.getBoolean("ThongKe");
                Boolean previousTrangThai = rs.getBoolean("TrangThai");

                // So sánh dữ liệu
                if (previousTen.equals(a.getTen())
                        && previousBanHang.equals(a.isBanHang())
                        && previousKhachHang.equals(a.isKhachHang())
                        && previousNhapHang.equals(a.isNhapHang())
                        && previousXuatKho.equals(a.isXuatKho())
                        && previousMon.equals(a.isMon())
                        && previousNguyenLieu.equals(a.isNguyenLieu())
                        && previousLichLam.equals(a.isLichLam())
                        && previousKhuyenMaiUuDai.equals(a.isKhuyenMaiUuDai())
                        && previousNhaCungCap.equals(a.isNhaCungCap())
                        && previousNhanVien.equals(a.isNhanVien())
                        && previousThongKe.equals(a.isThongKe())
                        && previousTrangThai.equals(a.isTrangThai())) {
                    JDBCUtil.closeConnection(c);
                    return 2; // Trùng dữ liệu
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0;
            }

            // Thực hiện cập nhật
            PreparedStatement stUpdate = c.prepareStatement(sqlUpdate);
            stUpdate.setString(1, a.getTen());
            stUpdate.setBoolean(2, a.isBanHang());
            stUpdate.setBoolean(3, a.isKhachHang());
            stUpdate.setBoolean(4, a.isNhapHang());
            stUpdate.setBoolean(5, a.isXuatKho());
            stUpdate.setBoolean(6, a.isMon());
            stUpdate.setBoolean(7, a.isNguyenLieu());
            stUpdate.setBoolean(8, a.isLichLam());
            stUpdate.setBoolean(9, a.isKhuyenMaiUuDai());
            stUpdate.setBoolean(10, a.isNhaCungCap());
            stUpdate.setBoolean(11, a.isNhanVien());
            stUpdate.setBoolean(12, a.isThongKe());
            stUpdate.setBoolean(13, a.isTrangThai());
            stUpdate.setString(14, a.getMa());

            int kq = stUpdate.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public int batTat(String ma, Boolean trangThai) {
        String sqlUpdate = "UPDATE PhanQuyen "
                + "SET TrangThai = ? "
                + "WHERE MaPhanQuyen = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            // Truy vấn dữ liệu cũ
            PreparedStatement ps = c.prepareStatement(sqlUpdate);
            ps.setBoolean(1, trangThai);
            ps.setString(2, ma);

            int kq = ps.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public ArrayList<PhanQuyenDTO> listAll() {
        ArrayList<PhanQuyenDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM PhanQuyen";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                PhanQuyenDTO a = new PhanQuyenDTO(rs.getString("MaPhanQuyen"), rs.getString("TenQuyen"),
                        rs.getBoolean("BanHang"), rs.getBoolean("KhachHang"), rs.getBoolean("NhapHang"),
                        rs.getBoolean("XuatKho"), rs.getBoolean("Mon"), rs.getBoolean("NguyenLieu"),
                        rs.getBoolean("LichLam"), rs.getBoolean("KhuyenMaiUuDai"), rs.getBoolean("NhaCungCap"),
                        rs.getBoolean("NhanVien"), rs.getBoolean("ThongKe"), rs.getBoolean("TrangThai"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll error");
        }
        return list;
    }

    public String searchMaPQByName(String ten) {
        String ma = null;
        String sql = "SELECT MaPhanQuyen FROM PhanQuyen WHERE TenQuyen LIKE ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ten);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                ma = rs.getString("MaPhanQuyen");
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchMaPQByName error");
            System.out.println(e);
        }
        return ma;
    }
}
