package DAO;

import DTO.NhanVienDTO;
import DTO.ChiNhanhDTO;
import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class n01_TrangChuDAO {

    public static n01_TrangChuDAO getInstance() {
        return new n01_TrangChuDAO();
    }

    public ChiNhanhDTO searchChiNhanhTheoMaChiNhanh(String ma) {
        ChiNhanhDTO tk = null;
        String sql = "SELECT * FROM ChiNhanh WHERE MaChiNhanh = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                tk = new ChiNhanhDTO(
                        rs.getString("MaChiNhanh"),
                        rs.getString("TenChiNhanh"),
                        rs.getString("DiaChi"),
                        rs.getBoolean("TrangThai")
                );
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchChiNhanhTheoMaChiNhanh Error");
        }
        return tk;
    }

    public NhanVienDTO searchNhanVienByMa(String maNV) {
        NhanVienDTO nv = null;
        String sql = "SELECT * FROM NhanVien WHERE MaNhanVien = ?";

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

}
