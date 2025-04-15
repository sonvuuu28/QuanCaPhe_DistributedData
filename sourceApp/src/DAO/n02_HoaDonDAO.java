package DAO;

import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.KhuyenMaiDTO;
import DTO.MonDTO;
import DTO.NhanVienDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class n02_HoaDonDAO {

    public static n02_HoaDonDAO getInstance() {
        return new n02_HoaDonDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total from LINK.QuanCaPhe.dbo.HoaDon";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "HD001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "HD00" + num;
            } else if (num < 100 && num > 9) {
                ID = "HD0" + num;
            } else if (num >= 100) {
                ID = "HD" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

//    public boolean insert(HoaDonDTO hd) {
//        boolean result = false;
//        String sqlInsert = "INSERT INTO LINK.QuanCaPhe.dbo.HoaDon(MaHoaDon, NgayLapHoaDon, TongTienHoaDon, MaNhanVien, MaKhachHang, MaKhuyenMai, MaKhuyenMaiMember, MaChiNhanh) "
//                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?) ";
//        String sqlUpdate = " UPDATE LINK.QuanCaPhe.dbo.KhachHang SET ChiTieu = ChiTieu + ? WHERE MaKhachHang = ? ";
//
//        try (Connection c = JDBCUtil.getConnection()) {
//            c.setAutoCommit(false);  // Bắt đầu transaction
//
//            try (Statement stmt = c.createStatement()) {
//                stmt.execute("SET XACT_ABORT ON");
//            }
//            try (PreparedStatement prepInsert = c.prepareStatement(sqlInsert)) {
//                prepInsert.setString(1, hd.getMa());
//                prepInsert.setDate(2, hd.getNgayLap());
//                prepInsert.setLong(3, hd.getTongTien());
//                prepInsert.setString(4, hd.getMaNV());
//                prepInsert.setString(5, hd.getMaKH());
//
//                if (hd.getMaKM() != null) {
//                    prepInsert.setString(6, hd.getMaKM());
//                } else {
//                    prepInsert.setNull(6, java.sql.Types.VARCHAR);
//                }
//
//                if (hd.getMaKMMember() != null) {
//                    prepInsert.setString(7, hd.getMaKMMember());
//                } else {
//                    prepInsert.setNull(7, java.sql.Types.VARCHAR);
//                }
//
//                prepInsert.setString(8, hd.getMaCN());
//
//                if (prepInsert.executeUpdate() > 0) {
//                    if (hd.getMaKH() != null && !hd.getMaKH().isEmpty()) {
//                        try (PreparedStatement prepUpdate = c.prepareStatement(sqlUpdate)) {
//                            prepUpdate.setLong(1, hd.getTongTien());
//                            prepUpdate.setString(2, hd.getMaKH());
//                            prepUpdate.executeUpdate();
//                        }
//                    }
//                    result = true;
//                }
//
//                c.commit();
//            } catch (SQLException ex) {
//                c.rollback();
//                ex.printStackTrace();
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
//        return result;
//    }
    public boolean insert(HoaDonDTO hd) {
        boolean result = false;
        String sqlInsert = "INSERT INTO LINK.QuanCaPhe.dbo.HoaDon(MaHoaDon, NgayLapHoaDon, TongTienHoaDon, MaNhanVien, MaKhachHang, MaKhuyenMai, MaKhuyenMaiMember, MaChiNhanh) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.KhachHang SET ChiTieu = ChiTieu + ? WHERE MaKhachHang = ?";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement prepInsert = c.prepareStatement(sqlInsert)) {

            prepInsert.setString(1, hd.getMa());
            prepInsert.setDate(2, hd.getNgayLap());
            prepInsert.setLong(3, hd.getTongTien());
            prepInsert.setString(4, hd.getMaNV());
            prepInsert.setString(5, hd.getMaKH());

            if (hd.getMaKM() != null) {
                prepInsert.setString(6, hd.getMaKM());
            } else {
                prepInsert.setNull(6, java.sql.Types.VARCHAR);
            }

            if (hd.getMaKMMember() != null) {
                prepInsert.setString(7, hd.getMaKMMember());
            } else {
                prepInsert.setNull(7, java.sql.Types.VARCHAR);
            }

            prepInsert.setString(8, hd.getMaCN());

            if (prepInsert.executeUpdate() > 0) {
                result = true;

                // Nếu có khách hàng thì cộng ChiTieu
                if (hd.getMaKH() != null && !hd.getMaKH().isEmpty()) {
                    try (PreparedStatement prepUpdate = c.prepareStatement(sqlUpdate)) {
                        prepUpdate.setLong(1, hd.getTongTien());
                        prepUpdate.setString(2, hd.getMaKH());
                        prepUpdate.executeUpdate();
                    }
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public boolean insertChiTietHoaDon(ArrayList<ChiTietHoaDonDTO> dsChiTiet) {
        boolean result = false;
        String sql = "INSERT INTO LINK.QuanCaPhe.dbo.ChiTietHoaDon(MaHoaDon, MaMon, DonGia, SoLuong, ThanhTien) VALUES (?, ?, ?, ?, ?)";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement prep = c.prepareStatement(sql)) {

            for (ChiTietHoaDonDTO cthd : dsChiTiet) {
                prep.setString(1, cthd.getMa());
                prep.setString(2, cthd.getMaMon());
                prep.setLong(3, cthd.getDonGia());
                prep.setInt(4, cthd.getSoLuong());
                prep.setLong(5, cthd.getThanhTien());

                prep.addBatch(); // Thêm vào batch
            }

            int[] rows = prep.executeBatch(); // Chạy batch một lần
            result = Arrays.stream(rows).allMatch(row -> row > 0); // Kiểm tra tất cả đều thành công

        } catch (SQLException ex) {
            System.out.println("Lỗi insert ChiTietHoaDon: " + ex);
        }

        return result;
    }

    public ArrayList<ChiTietHoaDonDTO> listAllCthd(String ma) {
        ArrayList<ChiTietHoaDonDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM LINK.QuanCaPhe.dbo.ChiTietHoaDon"
                + " where MaHoaDon = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietHoaDonDTO a = new ChiTietHoaDonDTO(rs.getString("MaHoaDon"), rs.getString("MaMon"),
                        rs.getLong("DonGia"), rs.getInt("SoLuong"), rs.getLong("ThanhTien"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAllCthd error");
        }
        return list;
    }

    public ArrayList<HoaDonDTO> listAll(String maCN) {
        ArrayList<HoaDonDTO> list = new ArrayList<>();

        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.HoaDon ";
        if (maCN != null) {
            sql += " where MaChiNhanh = ? ";
        }
        sql = sql + " order by MaHoaDon desc ";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);

            if (maCN != null) {
                ps.setString(1, maCN);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonDTO a = new HoaDonDTO(rs.getString("MaHoaDon"), rs.getDate("NgayLapHoaDon"),
                        rs.getLong("TongTienHoaDon"), rs.getString("MaNhanVien"), rs.getString("MaKhachHang"),
                        rs.getString("MaKhuyenMai"), rs.getString("MaKhuyenMaiMember"), rs.getString("MaChiNhanh"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<HoaDonDTO> search(String ma, Date ngayBD, Date ngayKT, Long giaTu, Long giaDen, String maCN) {
        ArrayList<HoaDonDTO> list = new ArrayList<>();
        ArrayList<Object> params = new ArrayList<>();

        StringBuilder sql = new StringBuilder("select * from LINK.QuanCaPhe.dbo.HoaDon where 1=1");

        if (ma != null && !ma.trim().isEmpty()) {
            sql.append(" AND MaHoaDon LIKE ?");
            params.add("%" + ma + "%");
        }
        if (ngayBD != null) {
            sql.append(" AND NgayLapHoaDon >= ?");
            params.add(new java.sql.Date(ngayBD.getTime()));
        }
        if (ngayKT != null) {
            sql.append(" AND NgayLapHoaDon <= ?");
            params.add(new java.sql.Date(ngayKT.getTime()));
        }
        if (giaTu != null) {
            sql.append(" AND TongTienHoaDon >= ?");
            params.add(giaTu);
        }
        if (giaDen != null) {
            sql.append(" AND TongTienHoaDon <= ?");
            params.add(giaDen);
        }
        if (maCN != null && !maCN.trim().isEmpty()) {
            sql.append(" AND MaChiNhanh = ?");
            params.add(maCN);
        }

        sql.append(" order by MaHoaDon desc");

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql.toString())) {

            for (int i = 0; i < params.size(); i++) {
                ps.setObject(i + 1, params.get(i));
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    HoaDonDTO a = new HoaDonDTO(rs.getString("MaHoaDon"), rs.getDate("NgayLapHoaDon"),
                            rs.getLong("TongTienHoaDon"), rs.getString("MaNhanVien"), rs.getString("MaKhachHang"),
                            rs.getString("MaKhuyenMai"), rs.getString("MaKhuyenMaiMember"), rs.getString("MaChiNhanh"));
                    list.add(a);
                }
            }
        } catch (SQLException e) {
            System.out.println("search error: " + e.getMessage());
        }
        return list;
    }

    public HoaDonDTO searchHoaDonByMa(String ma) {
        HoaDonDTO pn = null;
        String sql = "SELECT * FROM HoaDon WHERE MaHoaDon = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                pn = new HoaDonDTO(rs.getString("MaHoaDon"), rs.getDate("NgayLapHoaDon"),
                        rs.getLong("TongTienHoaDon"), rs.getString("MaNhanVien"), rs.getString("MaKhachHang"),
                        rs.getString("MaKhuyenMai"), rs.getString("MaKhuyenMaiMember"), rs.getString("MaChiNhanh"));
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchHoaDonByMa Error");
        }
        return pn;
    }

    public MonDTO searchMonByMa(String ma) {
        MonDTO pn = null;
        String sql = "SELECT * FROM Mon WHERE MaMon = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                pn = new MonDTO(rs.getString("MaMon"), rs.getString("TenMon"), rs.getString("HinhAnh"),
                        rs.getLong("Gia"), rs.getBoolean("TrangThai"), rs.getString("MaLoaiMon"));
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchMonByMa Error");
        }
        return pn;
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

    public KhuyenMaiDTO searchKhuyenMaiByMa(String ma) {
        KhuyenMaiDTO nv = null;
        String sql = "SELECT * FROM KhuyenMai WHERE MakhuyenMai = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                nv = new KhuyenMaiDTO(
                        rs.getString("MaKhuyenMai"),
                        rs.getString("TenKhuyenMai"),
                        rs.getInt("PhanTram"),
                        rs.getDate("NgayBatDau"),
                        rs.getDate("NgayKetThuc"),
                        rs.getLong("ChiTieu"),
                        rs.getBoolean("isMember")
                );
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchKhuyenMaiByMa Error");
        }
        return nv;
    }

    public KhachHangDTO searchKhachHangByMa(String ma) {
        KhachHangDTO kh = null;
        String sql = "SELECT * FROM KhachHang WHERE MaKhachHang = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                kh = new KhachHangDTO(rs.getString("MaKhachHang"), rs.getString("TenKhachHang"),
                        rs.getDate("NgaySinh"), rs.getString("GioiTinh"), rs.getLong("ChiTieu"),
                        rs.getString("SDT"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchKhachHangByMa Error");
        }
        return kh;
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

    public Map<String, KhachHangDTO> getAllKhachHang() {
        Map<String, KhachHangDTO> map = new HashMap<>();
        String sql = "SELECT * FROM KhachHang";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO(
                        rs.getString("MaKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getDate("NgaySinh"),
                        rs.getString("GioiTinh"),
                        rs.getLong("ChiTieu"),
                        rs.getString("SDT")
                );
                map.put(kh.getMaKhachHang(), kh);
            }
        } catch (SQLException e) {
            System.out.println("getAllKhachHang error: " + e);
        }
        return map;
    }

    public Map<String, KhuyenMaiDTO> getAllKhuyenMai() {
        Map<String, KhuyenMaiDTO> map = new HashMap<>();
        String sql = "SELECT * FROM KhuyenMai";

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                KhuyenMaiDTO km = new KhuyenMaiDTO(
                        rs.getString("MaKhuyenMai"),
                        rs.getString("TenKhuyenMai"),
                        rs.getInt("PhanTram"),
                        rs.getDate("NgayBatDau"),
                        rs.getDate("NgayKetThuc"),
                        rs.getLong("ChiTieu"),
                        rs.getBoolean("isMember")
                );
                map.put(km.getMa(), km);
            }
        } catch (SQLException e) {
            System.out.println("getAllKhuyenMai error: " + e);
        }
        return map;
    }

}
