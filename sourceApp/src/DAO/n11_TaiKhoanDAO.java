package DAO;

import DTO.NhanVienDTO;
import DTO.PhanQuyenDTO;
import DTO.TaiKhoanDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;

public class n11_TaiKhoanDAO {

    public static n11_TaiKhoanDAO getInstance() {
        return new n11_TaiKhoanDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM TaiKhoan";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "TK001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "TK00" + num;
            } else if (num < 100 && num > 9) {
                ID = "TK0" + num;
            } else if (num >= 100) {
                ID = "TK" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(TaiKhoanDTO a) {
        String sql = "INSERT INTO LINK.QuanCaPhe.dbo.TaiKhoan\n"
                + "           (MaTaiKhoan\n"
                + "           ,TenDangNhap\n"
                + "           ,MatKhau\n"
                + "           ,MaPhanQuyen\n"
                + "           ,MaNhanVien\n"
                + "           ,TrangThai\n"
                + "           ,MaChiNhanh)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setString(3, a.getMatKhau());
            st.setString(4, a.getMaPQ());
            st.setString(5, a.getMaNV());
            st.setBoolean(6, a.isTrangThai());
            st.setString(7, a.getMaCN());

            st.executeUpdate();
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println("Lỗi: Mã tài khoản đã tồn tại!");
            System.out.println(ex);
            return 0;
        }
        return 1;
    }

    public int update(String maTK, String maPQ, String matKhau) {
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.TaiKhoan "
                + "SET MaPhanQuyen = ?, "
                + "    MatKhau = ? "
                + "WHERE MaTaiKhoan = ?";

        String sqlSelect = "SELECT MaPhanQuyen, MatKhau "
                + "FROM TaiKhoan WHERE MaTaiKhoan = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, maTK);
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousMaPhanQuyen = rs.getString("MaPhanQuyen");
                String previousMatKhau = rs.getString("MatKhau");

                if (previousMaPhanQuyen.equals(maPQ) && previousMatKhau.equals(matKhau)) {
                    JDBCUtil.closeConnection(c);
                    return 2;
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0;
            }

            PreparedStatement stUpdate = c.prepareStatement(sqlUpdate);
            stUpdate.setString(1, maPQ);
            stUpdate.setString(2, matKhau);
            stUpdate.setString(3, maTK);

            int kq = stUpdate.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1; // Thành công
            } else {
                return 0; // Thất bại
            }
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int batTat(String maTK, Boolean trangThai) {
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.TaiKhoan "
                + "SET TrangThai = ? "
                + "WHERE MaTaiKhoan = ?";

        String sqlSelect = "SELECT TrangThai "
                + " FROM TaiKhoan WHERE MaTaiKhoan = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, maTK);
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                Boolean previousTrangThai = rs.getBoolean("TrangThai");

                if (previousTrangThai.equals(trangThai)) {
                    JDBCUtil.closeConnection(c);
                    return 2;
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0;
            }

            PreparedStatement stUpdate = c.prepareStatement(sqlUpdate);
            stUpdate.setBoolean(1, trangThai);
            stUpdate.setString(2, maTK);

            int kq = stUpdate.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            String message = e.getMessage();
            return 0;
        }
    }

    public ArrayList<Object[]> listPhanQuyen(String maNV) {
        ArrayList<Object[]> list = new ArrayList<>();
        int myLevel = n11_PhanQuyenDAO.getInstance().searchDoUuTienByMaNV(maNV);
        String sql = "select MaPhanQuyen, TenQuyen from PhanQuyen  "
                + "  where TrangThai = 1 and DoUuTien >= " + myLevel;
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Object[]{rs.getString("MaPhanQuyen"), rs.getString("TenQuyen")});
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listPhanQuyen error");
        }
        return list;
    }

    public TaiKhoanDTO searchTaiKhoanTheoMaNhanVien(String maNV) {
        TaiKhoanDTO tk = null;
        String sql = "SELECT * FROM TaiKhoan WHERE MaNhanVien = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maNV);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                tk = new TaiKhoanDTO(
                        rs.getString("MaTaiKhoan"),
                        rs.getString("TenDangNhap"),
                        rs.getString("MatKhau"),
                        rs.getString("MaPhanQuyen"),
                        rs.getString("MaNhanVien"),
                        rs.getBoolean("TrangThai"),
                        rs.getString("MaChiNhanh")
                );
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchTaiKhoanTheoMaNhanVien Error");
        }
        return tk;
    }

    public TaiKhoanDTO searchTaiKhoanTheoMaTaiKhoan(String ma) {
        TaiKhoanDTO tk = null;
        String sql = "SELECT * FROM TaiKhoan WHERE MaTaiKhoan = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                tk = new TaiKhoanDTO(
                        rs.getString("MaTaiKhoan"),
                        rs.getString("TenDangNhap"),
                        rs.getString("MatKhau"),
                        rs.getString("MaPhanQuyen"),
                        rs.getString("MaNhanVien"),
                        rs.getBoolean("TrangThai"),
                        rs.getString("MaChiNhanh")
                );
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchTaiKhoanTheoMaTaiKhoan Error");
        }
        return tk;
    }

    public String searchTenPhanQuyenTheoMa(String maPQ) {
        String sql = "SELECT TenQuyen FROM PhanQuyen WHERE MaPhanQuyen = ?";
        String tenPQ = null;
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maPQ);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                tenPQ = rs.getString("TenQuyen");
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchTenPhanQuyenTheoMa Error");
        }
        return tenPQ;
    }
}
