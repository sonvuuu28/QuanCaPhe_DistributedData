package DAO;

import DTO.KhuyenMaiDTO;
import DTO.LoaiMonDTO;
import DTO.MonDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;

public class n02_BanHangDAO {

    public static n02_BanHangDAO getInstance() {
        return new n02_BanHangDAO();
    }

    public ArrayList<LoaiMonDTO> listAllLoaiMon() {
        ArrayList<LoaiMonDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM LoaiMon";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                LoaiMonDTO a = new LoaiMonDTO(rs.getString("MaLoaiMon"), rs.getString("TenLoaiMon"), rs.getBoolean("TrangThai"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAllLoaiMon error");
        }
        return list;
    }

    public ArrayList<KhuyenMaiDTO> listAllKhuyenMai_HoatDong(Date now, Long tongTien) {
        ArrayList<KhuyenMaiDTO> list = new ArrayList<>();
        String sql = "declare @now Date = ? \n"
                + "declare @tongTien BigInt = ? \n"
                + "select * from KhuyenMai where isMember = 0 and NgayBatDau <= @now and NgayKetThuc >= @now and ChiTieu <= @tongTien";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setDate(1, now);
            st.setLong(2, tongTien);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                KhuyenMaiDTO a = new KhuyenMaiDTO(rs.getString("MaKhuyenMai"), rs.getString("TenKhuyenMai"),
                        rs.getInt("PhanTram"), rs.getDate("NgayBatDau"), rs.getDate("NgayKetThuc"),
                        rs.getLong("ChiTieu"), rs.getBoolean("isMember"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAllKhuyenMai_HoatDong error");
        }
        return list;
    }

    public KhuyenMaiDTO listKhuyenMai_Member_HoatDong(Date now, Long chiTieu) {
        KhuyenMaiDTO km = null;
        String sql = "declare @now Date = ?\n"
                + "declare @chiTieu BigInt = ? \n"
                + "select top 1 * from KhuyenMai \n"
                + "where isMember = 1 and NgayBatDau <= @now and NgayKetThuc >= @now and @chiTieu >= ChiTieu\n"
                + "order by PhanTram desc";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setDate(1, now);
            st.setLong(2, chiTieu);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                km = new KhuyenMaiDTO(rs.getString("MaKhuyenMai"), rs.getString("TenKhuyenMai"),
                        rs.getInt("PhanTram"), rs.getDate("NgayBatDau"), rs.getDate("NgayKetThuc"),
                        rs.getLong("ChiTieu"), rs.getBoolean("isMember"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAllKhuyenMai_HoatDong error");
        }
        return km;
    }

    public ArrayList<MonDTO> listAllMon_HoatDong() {
        ArrayList<MonDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM Mon where TrangThai = 1 order by TrangThai desc";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                MonDTO a = new MonDTO(rs.getString("MaMon"), rs.getString("TenMon"), rs.getString("HinhAnh"),
                        rs.getLong("Gia"), rs.getBoolean("TrangThai"), rs.getString("MaLoaiMon"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAllMon_HoatDong error");
        }
        return list;
    }

    public ArrayList<MonDTO> searchMonByTen_HoatDong(String ten) {
        ArrayList<MonDTO> ds = new ArrayList<>();
        String sql = "SELECT * FROM Mon WHERE TenMon LIKE ? and TrangThai = 1 order by TrangThai desc";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + ten + "%");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                MonDTO a = new MonDTO(rs.getString("MaMon"), rs.getString("TenMon"), rs.getString("HinhAnh"),
                        rs.getLong("Gia"), rs.getBoolean("TrangThai"), rs.getString("MaLoaiMon"));
                ds.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchMonByMa_HoatDong" + e.getMessage());
        }
        return ds;
    }

    public ArrayList<MonDTO> searchMonByLoaiMon_HoatDong(String ten) {
        ArrayList<MonDTO> ds = new ArrayList<>();
        String sql = "SELECT * FROM Mon WHERE MaLoaiMon LIKE ? and TrangThai = 1 order by TrangThai desc";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + ten + "%");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                MonDTO a = new MonDTO(rs.getString("MaMon"), rs.getString("TenMon"), rs.getString("HinhAnh"),
                        rs.getLong("Gia"), rs.getBoolean("TrangThai"), rs.getString("MaLoaiMon"));
                ds.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchMonByLoaiMon_HoatDong" + e.getMessage());
        }
        return ds;
    }

    public LoaiMonDTO searchLoaiMonByMa_HoatDong(String ma) {
        LoaiMonDTO a = null;
        String sql = "SELECT * FROM LoaiMon WHERE MaLoaiMon LIKE ? and TrangThai = 1 order by TrangThai desc";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + ma + "%");

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                a = new LoaiMonDTO(rs.getString("MaLoaiMon"), rs.getString("TenLoaiMon"), rs.getBoolean("TrangThai"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchLoaiMonByMa_HoatDong" + e.getMessage());
        }
        return a;
    }
}
