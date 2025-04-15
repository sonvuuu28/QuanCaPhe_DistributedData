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
            String sql = "SELECT COUNT(*) AS total FROM LINK.QuanCaPhe.dbo.PhanQuyen";
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
        String sql = "INSERT INTO LINK.QuanCaPhe.dbo.PhanQuyen \n"
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
                + "           ,DoUuTien\n"
                + "           ,TrangThai)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setBoolean(3, a.getBanHang());
            st.setBoolean(4, a.getKhachHang());

            st.setBoolean(5, a.getNhapHang());
            st.setBoolean(6, a.getXuatKho());
            st.setBoolean(7, a.getMon());
            st.setBoolean(8, a.getNguyenLieu());

            st.setBoolean(9, a.getLichLam());
            st.setBoolean(10, a.getKhuyenMaiUuDai());
            st.setBoolean(11, a.getNhaCungCap());
            st.setBoolean(12, a.getNhanVien());

            st.setBoolean(13, a.getThongKe());
            st.setInt(14, a.getDoUuTien());
            st.setBoolean(15, a.getTrangThai());

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
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.PhanQuyen "
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
                + "    DoUuTien = ?, "
                + "    TrangThai = ? "
                + "WHERE MaPhanQuyen = ?";

        String sqlSelect = "SELECT TenQuyen, BanHang, KhachHang, NhapHang, XuatKho, Mon, NguyenLieu, LichLam, KhuyenMaiUuDai, NhaCungCap, NhanVien, ThongKe, TrangThai, DoUuTien "
                + "FROM PhanQuyen WHERE MaPhanQuyen = ?";

        try {
            Connection c = JDBCUtil.getConnection();

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
                int previousDoUuTien = rs.getInt("DoUuTien");
                Boolean previousTrangThai = rs.getBoolean("TrangThai");

                if (previousTen.equals(a.getTen())
                        && previousBanHang.equals(a.getBanHang())
                        && previousKhachHang.equals(a.getKhachHang())
                        && previousNhapHang.equals(a.getNhapHang())
                        && previousXuatKho.equals(a.getXuatKho())
                        && previousMon.equals(a.getMon())
                        && previousNguyenLieu.equals(a.getNguyenLieu())
                        && previousLichLam.equals(a.getLichLam())
                        && previousKhuyenMaiUuDai.equals(a.getKhuyenMaiUuDai())
                        && previousNhaCungCap.equals(a.getNhaCungCap())
                        && previousNhanVien.equals(a.getNhanVien())
                        && previousThongKe.equals(a.getThongKe())
                        && previousDoUuTien == a.getDoUuTien()
                        && previousTrangThai.equals(a.getTrangThai())) {
                    JDBCUtil.closeConnection(c);
                    return 2;
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0;
            }

            PreparedStatement stUpdate = c.prepareStatement(sqlUpdate);
            stUpdate.setString(1, a.getTen());
            stUpdate.setBoolean(2, a.getBanHang());
            stUpdate.setBoolean(3, a.getKhachHang());
            stUpdate.setBoolean(4, a.getNhapHang());
            stUpdate.setBoolean(5, a.getXuatKho());
            stUpdate.setBoolean(6, a.getMon());
            stUpdate.setBoolean(7, a.getNguyenLieu());
            stUpdate.setBoolean(8, a.getLichLam());
            stUpdate.setBoolean(9, a.getKhuyenMaiUuDai());
            stUpdate.setBoolean(10, a.getNhaCungCap());
            stUpdate.setBoolean(11, a.getNhanVien());
            stUpdate.setBoolean(12, a.getThongKe());
            stUpdate.setInt(13, a.getDoUuTien());
            stUpdate.setBoolean(14, a.getTrangThai());
            stUpdate.setString(15, a.getMa());

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
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.PhanQuyen "
                + "SET TrangThai = ? "
                + "WHERE MaPhanQuyen = ? ";

        try {
            Connection c = JDBCUtil.getConnection();

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

    public ArrayList<PhanQuyenDTO> listAll(int myLevel) {
        ArrayList<PhanQuyenDTO> list = new ArrayList<>();
        String sql = "declare @myLevel int = " + myLevel
                + " select * from LINK.QuanCaPhe.dbo.PhanQuyen where DoUuTien >= @myLevel "
                + " order by TrangThai desc, DoUuTien ";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                PhanQuyenDTO a = new PhanQuyenDTO(rs.getString("MaPhanQuyen"), rs.getString("TenQuyen"),
                        rs.getBoolean("BanHang"), rs.getBoolean("KhachHang"), rs.getBoolean("NhapHang"),
                        rs.getBoolean("XuatKho"), rs.getBoolean("Mon"), rs.getBoolean("NguyenLieu"),
                        rs.getBoolean("LichLam"), rs.getBoolean("KhuyenMaiUuDai"), rs.getBoolean("NhaCungCap"),
                        rs.getBoolean("NhanVien"), rs.getBoolean("ThongKe"),
                        rs.getInt("DoUuTien"), rs.getBoolean("TrangThai")
                );
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
        String sql = "SELECT MaPhanQuyen FROM LINK.QuanCaPhe.dbo.PhanQuyen WHERE TenQuyen LIKE ?";

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

    public int searchDoUuTienByMaNV(String maNV) {
        Integer doUuTien = null;
        String sql = "select tk.MaNhanVien, pq.DoUuTien \n"
                + "from LINK.QuanCaPhe.dbo.TaiKhoan as tk \n"
                + "join LINK.QuanCaPhe.dbo.PhanQuyen as pq on pq.MaPhanQuyen = tk.MaPhanQuyen\n"
                + "where tk.MaNhanVien = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maNV);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                doUuTien = rs.getInt("DoUuTien");
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchDoUuTienByMaNV error");
            System.out.println(e);
        }
        return doUuTien;
    }
}
