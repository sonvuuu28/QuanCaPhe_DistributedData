package DAO;

import DTO.NhanVienDTO;
import DTO.PhanQuyenDTO;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class n00_LoginDAO {

    public static n00_LoginDAO getInstance() {
        return new n00_LoginDAO();
    }

    public NhanVienDTO getNhanVienFromTaiKhoan(String tenTK, String mk) {
        NhanVienDTO tk = null;
        String sql = "select * from NhanVien \n"
                + "where MaNhanVien = ( select MaNhanVien "
                + "from TaiKhoan where TenDangNhap = ? and MatKhau = ? and TrangThai = 1)";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, tenTK);
            st.setString(2, mk);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                tk = new NhanVienDTO(rs.getString("MaNhanVien"), rs.getString("TenNhanVien"),
                        rs.getString("GioiTinhNhanVien"), rs.getString("SoDienThoaiNhanVien"), rs.getDate("NgaySinhNhanVien"),
                        rs.getString("ChucVuNhanVien"), rs.getString("DiaChi"), rs.getLong("LuongNhanVien"),
                        rs.getBoolean("TrangThaiNhanVien"), rs.getString("MaChiNhanh"), rs.getDate("NgayNghiViec")
                );
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("getNhanVienFromTaiKhoan Error");
        }
        return tk;
    }

    public PhanQuyenDTO getPhanQuyenFromTaiKhoan(String tenTK, String mk) {
        PhanQuyenDTO tk = null;
        String sql = "select * from PhanQuyen \n"
                + "where MaPhanQuyen = ( select MaPhanQuyen "
                + "from TaiKhoan where TenDangNhap = ? and MatKhau = ? )";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, tenTK);
            st.setString(2, mk);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                tk = new PhanQuyenDTO(rs.getString("MaPhanQuyen"), rs.getString("TenQuyen"),
                        rs.getBoolean("BanHang"), rs.getBoolean("KhachHang"), rs.getBoolean("NhapHang"),
                        rs.getBoolean("XuatKho"), rs.getBoolean("Mon"), rs.getBoolean("NguyenLieu"),
                        rs.getBoolean("LichLam"), rs.getBoolean("KhuyenMaiUuDai"), rs.getBoolean("NhaCungCap"),
                        rs.getBoolean("NhanVien"), rs.getBoolean("ThongKe"), rs.getInt("DoUuTien"), rs.getBoolean("TrangThai")
                );
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("getNhanVienFromTaiKhoan Error");
        }
        return tk;
    }
}
