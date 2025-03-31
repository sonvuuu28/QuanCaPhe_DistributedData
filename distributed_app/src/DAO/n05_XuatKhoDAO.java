package DAO;

import DTO.*;
import Util.JDBCUtil;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class n05_XuatKhoDAO {
    
    public static n05_XuatKhoDAO getInstance() {
        return new n05_XuatKhoDAO();
    }
    
    public boolean insert(PhieuXuatDTO hd) {
        boolean result = true;
        String sql = "INSERT INTO PhieuXuatKho(MaPhieuXuatKho, NgayLap, MaNhanVien, MaChiNhanh) "
                + "VALUES(?, ?, ?, ?)";
        
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, hd.getMa());
            st.setDate(2, hd.getNgayLap());
            st.setString(3, hd.getMaNV());
            st.setString(4, hd.getMaCN());
            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            result = false;
        }
        return result;
    }
    
    public boolean insertChiTietPhieuXuat(ArrayList<ChiTietPhieuXuatDTO> dsChiTiet, String maCN) {
        boolean result = false;
        String sql = "INSERT INTO ChiTietPhieuXuatKho(MaPhieuXuatKho, MaNguyenLieu, KhoiLuong) VALUES (?, ?, ?)";
        
        try (Connection c = JDBCUtil.getConnection(); PreparedStatement prep = c.prepareStatement(sql)) {
            
            for (ChiTietPhieuXuatDTO cthd : dsChiTiet) {
                prep.setString(1, cthd.getMa());
                prep.setString(2, cthd.getMaNL());
                prep.setFloat(3, cthd.getKl());
                
                prep.addBatch();
            }
            
            int[] rows = prep.executeBatch();
            result = Arrays.stream(rows).allMatch(row -> row > 0); // Kiểm tra tất cả đều thành công
            upDateNguyenLieuDown(dsChiTiet, maCN);
        } catch (SQLException ex) {
            System.out.println("Lỗi insert ChiTietPhieuXuat: " + ex);
        }
        return result;
    }
    
    public void upDateNguyenLieuDown(ArrayList<ChiTietPhieuXuatDTO> dsChiTiet, String maCN) {
        String sql = "UPDATE NguyenLieuKho "
                + "SET KhoiLuong = KhoiLuong - CAST(? AS DECIMAL(18, 6)) "
                + "WHERE MaNguyenLieu = ?";
        
        try (Connection c = JDBCUtil.getConnection(); PreparedStatement prep = c.prepareStatement(sql)) {
            
            for (ChiTietPhieuXuatDTO cthd : dsChiTiet) {
                BigDecimal kl = BigDecimal.valueOf(cthd.getKl());
                
                prep.setBigDecimal(1, kl);
                prep.setString(2, cthd.getMaNL());
                prep.addBatch();
            }
            
            int[] rows = prep.executeBatch(); // Chạy batch một lần
            boolean allSuccess = Arrays.stream(rows).allMatch(row -> row > 0);
            System.out.println(allSuccess ? "Cập nhật thành công!" : "Có lỗi khi cập nhật!");
            
        } catch (SQLException ex) {
            System.out.println("Lỗi insert upDateNguyenLieuDown: " + ex);
        }
    }
    
    public ArrayList<ChiTietPhieuXuatDTO> listAllCtpx(String ma) {
        ArrayList<ChiTietPhieuXuatDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM ChiTietPhieuXuatKho"
                + " where MaPhieuXuatKho = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietPhieuXuatDTO a = new ChiTietPhieuXuatDTO(rs.getString("MaPhieuXuatKho"), rs.getString("MaNguyenLieu"),
                        rs.getFloat("KhoiLuong"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAllCtpx error");
        }
        return list;
    }
    
    public ArrayList<PhieuXuatDTO> listAll(String ma) {
        ArrayList<PhieuXuatDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM PhieuXuatKho"
                + " where MaChiNhanh = ?"
                + " order by MaPhieuXuatKho desc";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuXuatDTO a = new PhieuXuatDTO(rs.getString("MaPhieuXuatKho"), rs.getDate("NgayLap"),
                        rs.getString("MaNhanVien"), rs.getString("MaChiNhanh"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll error");
        }
        return list;
    }
    
    public ArrayList<PhieuXuatDTO> search(String ma, Date ngayBD, Date ngayKT, String maCN) {
        ArrayList<PhieuXuatDTO> list = new ArrayList<>();
        ArrayList<Object> params = new ArrayList<>();
        StringBuilder sql = new StringBuilder("select * from PhieuXuatKho where MaChiNhanh = ?");
        params.add(maCN);
        if (ma != null && !ma.trim().isEmpty()) {
            sql.append(" AND MaPhieuXuatKho LIKE ?");
            params.add("%" + ma + "%");
        }
        if (ngayBD != null) {
            sql.append(" AND NgayLap >= ?");
            params.add(new java.sql.Date(ngayBD.getTime()));
        }
        if (ngayKT != null) {
            sql.append(" AND NgayLap <= ?");
            params.add(new java.sql.Date(ngayKT.getTime()));
        }
        sql.append(" order by MaPhieuXuatKho desc");
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement ps = c.prepareStatement(sql.toString());
            
            for (int i = 0; i < params.size(); i++) {
                ps.setObject(i + 1, params.get(i));
            }
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuXuatDTO a = new PhieuXuatDTO(rs.getString("MaPhieuXuatKho"), rs.getDate("NgayLap"),
                        rs.getString("MaNhanVien"), rs.getString("MaChiNhanh"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("search error");
        }
        return list;
    }
    
    public ArrayList<NguyenLieuDTO> listAll_KhoHang(String maCN) {
        ArrayList<NguyenLieuDTO> list = new ArrayList<>();
        String sql = "select * \n"
                + "from NguyenLieu nl \n"
                + "join NguyenLieuKho kho on nl.MaNguyenLieu = kho.MaNguyenLieu\n"
                + "where kho.MaChiNhanh = ? and nl.TrangThai = 1\n";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NguyenLieuDTO a = new NguyenLieuDTO(rs.getString("MaNguyenLieu"), rs.getString("TenNguyenLieu"),
                        rs.getFloat("KhoiLuong"), rs.getString("DonVi"), rs.getBoolean("TrangThai"),
                        rs.getString("MaChiNhanh"));
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
            String sql = "SELECT COUNT(*) AS total FROM PhieuXuatKho";
            ResultSet rs = st.executeQuery(sql);
            
            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "PXK001";
                }
                num = rs.getInt("total") + 1;
            }
            
            if (num < 10 && num > 0) {
                ID = "PXK00" + num;
            } else if (num < 100 && num > 9) {
                ID = "PXK0" + num;
            } else if (num >= 100) {
                ID = "PXK" + num;
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
                        rs.getString("MaChiNhanh"), rs.getDate("NgayNghiViec")
                );
            }
            
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchNhanVienByMa Error");
        }
        return nv;
    }
    
    public PhieuXuatDTO searchPhieuXuatByMa(String ma) {
        PhieuXuatDTO pn = null;
        String sql = "SELECT * FROM PhieuXuatKho WHERE MaPhieuXuatKho = ?";
        
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);
            
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                pn = new PhieuXuatDTO(rs.getString("MaPhieuXuatKho"), rs.getDate("NgayLap"),
                        rs.getString("MaNhanVien"), rs.getString("MaChiNhanh"));
            }
            
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchPhieuXuatByMa Error");
        }
        return pn;
    }
    
    public ArrayList<NguyenLieuDTO> listAll_KhoHang() {
        ArrayList<NguyenLieuDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM NguyenLieu"
                + " where TrangThai = 1";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NguyenLieuDTO a = new NguyenLieuDTO(rs.getString("MaNguyenLieu"), rs.getString("TenNguyenLieu"),
                        rs.getFloat("KhoiLuong"), rs.getString("DonVi"), rs.getBoolean("TrangThai"),
                        rs.getString("MaChiNhanh"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll_KhoHang error");
        }
        return list;
    }
}
