package DAO;

import DTO.ChiTietPhieuNhapDTO;
import DTO.PhieuNhapDTO;
import DTO.NguyenLieuDTO;
import DTO.NhaCungCapDTO;
import DTO.NhanVienDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class n04_PhieuNhapDAO {

    public static n04_PhieuNhapDAO getInstance() {
        return new n04_PhieuNhapDAO();
    }

    public ArrayList<ChiTietPhieuNhapDTO> listAllCtpn(String ma) {
        ArrayList<ChiTietPhieuNhapDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM LINK.QuanCaPhe.dbo.ChiTietPhieuNhap"
                + " where MaPhieuNhap = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietPhieuNhapDTO a = new ChiTietPhieuNhapDTO(rs.getString("MaPhieuNhap"), rs.getString("MaNguyenLieu"),
                        rs.getFloat("KhoiLuong"), rs.getLong("DonGia"), rs.getLong("ThanhTien"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAllCtpn error");
        }
        return list;
    }

    public ArrayList<PhieuNhapDTO> listAll(String maCN) {
        ArrayList<PhieuNhapDTO> list = new ArrayList<>();

        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.PhieuNhap ";
        if (maCN != null) {
            sql += " where MaChiNhanh = ? ";
        }
        sql = sql + " order by MaPhieuNhap desc ";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);

            if (maCN != null) {
                ps.setString(1, maCN);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhapDTO a = new PhieuNhapDTO(rs.getString("MaPhieuNhap"), rs.getDate("NgayLapPhieuNhap"),
                        rs.getLong("TongTienPhieuNhap"), rs.getString("MaNhanVien"), rs.getString("MaNCC"),
                        rs.getString("MaChiNhanh"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<PhieuNhapDTO> search(String ma, Date ngayBD, Date ngayKT, Long giaTu, Long giaDen, String maCN) {
        ArrayList<PhieuNhapDTO> list = new ArrayList<>();
        ArrayList<Object> params = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM LINK.QuanCaPhe.dbo.PhieuNhap WHERE 1=1");

        if (ma != null && !ma.trim().isEmpty()) {
            sql.append(" AND MaPhieuNhap LIKE ?");
            params.add("%" + ma + "%");
        }
        if (ngayBD != null) {
            sql.append(" AND NgayLapPhieuNhap >= ?");
            params.add(new java.sql.Date(ngayBD.getTime()));
        }
        if (ngayKT != null) {
            sql.append(" AND NgayLapPhieuNhap <= ?");
            params.add(new java.sql.Date(ngayKT.getTime()));
        }
        if (giaTu != null) {
            sql.append(" AND TongTienPhieuNhap >= ?");
            params.add(giaTu);
        }
        if (giaDen != null) {
            sql.append(" AND TongTienPhieuNhap <= ?");
            params.add(giaDen);
        }
        if (maCN != null && !maCN.trim().isEmpty()) {
            sql.append(" AND MaChiNhanh = ?");
            params.add(maCN);
        }
        sql.append(" ORDER BY MaPhieuNhap DESC");
        try (Connection c = JDBCUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql.toString())) {

            for (int i = 0; i < params.size(); i++) {
                ps.setObject(i + 1, params.get(i));
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    PhieuNhapDTO a = new PhieuNhapDTO(
                            rs.getString("MaPhieuNhap"),
                            rs.getDate("NgayLapPhieuNhap"),
                            rs.getLong("TongTienPhieuNhap"),
                            rs.getString("MaNhanVien"),
                            rs.getString("MaNCC"),
                            rs.getString("MaChiNhanh")
                    );
                    list.add(a);
                }
            }
        } catch (SQLException e) {
            System.out.println("search error: " + e.getMessage());
        }
        return list;
    }

    public PhieuNhapDTO searchPhieuNhapByMa(String ma) {
        PhieuNhapDTO pn = null;
        String sql = "SELECT * FROM PhieuNhap WHERE MaPhieuNhap = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                pn = new PhieuNhapDTO(
                        rs.getString("MaPhieuNhap"),
                        rs.getDate("NgayLapPhieuNhap"),
                        rs.getLong("TongTienPhieuNhap"),
                        rs.getString("MaNhanVien"),
                        rs.getString("MaNCC"),
                        rs.getString("MaChiNhanh")
                );
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchPhieuNhapByMa Error");
        }
        return pn;
    }

    public NguyenLieuDTO searchNguyenLieuByMa(String ma) {
        NguyenLieuDTO pn = null;
        String sql = "SELECT * FROM NguyenLieu nl "
                + "join NguyenLieuKho as nlk on nl.MaNguyenLieu = nlk.MaNguyenLieu  WHERE nl.MaNguyenLieu = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                pn = new NguyenLieuDTO(rs.getString("MaNguyenLieu"), rs.getString("TenNguyenLieu"),
                        rs.getFloat("KhoiLuong"), rs.getString("DonVi"),
                        rs.getBoolean("TrangThai"), rs.getString("MaChiNhanh"));
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchNguyenLieuByMa Error");
        }
        return pn;
    }

    public Map<String, NhanVienDTO> getAllNhanVien() {
        Map<String, NhanVienDTO> map = new HashMap<>();
        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.NhanVien";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO(
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
                map.put(nv.getMa(), nv);
            }
        } catch (SQLException e) {
            System.out.println("getAllNhanVien error: " + e);
        }
        return map;
    }

    public Map<String, NhaCungCapDTO> getAllKhachHang() {
        Map<String, NhaCungCapDTO> map = new HashMap<>();
        String sql = "SELECT * FROM NhaCungCap";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                NhaCungCapDTO ncc = new NhaCungCapDTO(rs.getString("MaNCC"), rs.getString("TenNCC"),
                        rs.getString("DiaChi"), rs.getString("SDT"));
                map.put(ncc.getMaNCC(), ncc);
            }
        } catch (SQLException e) {
            System.out.println("getAllKhachHang error: " + e);
        }
        return map;
    }
}
