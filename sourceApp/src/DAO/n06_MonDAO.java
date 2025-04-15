package DAO;

import DTO.MonDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;

public class n06_MonDAO {

    public static n06_MonDAO getInstance() {
        return new n06_MonDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM LINK.QuanCaPhe.dbo.Mon";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "M001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "M00" + num;
            } else if (num < 100 && num > 9) {
                ID = "M0" + num;
            } else if (num >= 100) {
                ID = "M" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(MonDTO a) {
        String sql = "INSERT INTO LINK.QuanCaPhe.dbo.Mon   "
                + "(MaMon, TenMon, HinhAnh, Gia, TrangThai, MaLoaiMon)    "
                + "VALUES(?,?,?,?,?,?)   ";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setString(3, a.getHinhAnh());
            st.setLong(4, a.getGia());
            st.setBoolean(5, true);
            st.setString(6, a.getMaLoaiMon());

            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println("Lỗi: Mã món đã tồn tại!");
            System.out.println(ex);
            return 0;
        }
        return 1;
    }

    public int update(MonDTO a) {
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.Mon "
                + "SET TenMon = ?, "
                + "    HinhAnh = ?, "
                + "    Gia = ?, "
                + "    TrangThai = ?, "
                + "    MaLoaiMon = ? "
                + "WHERE MaMon = ?";

        String sqlSelect = "SELECT TenMon, HinhAnh, Gia, TrangThai, MaLoaiMon "
                + "FROM Mon WHERE MaMon = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMa());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTenMon = rs.getString("TenMon");
                String previousHinhAnh = rs.getString("HinhAnh");
                Long previousGia = rs.getLong("Gia");
                Boolean previousTrangThai = rs.getBoolean("TrangThai");
                String previousMaLoaiMon = rs.getString("MaLoaiMon");

                if (Objects.equals(previousTenMon, a.getTen())
                        && Objects.equals(previousHinhAnh, a.getHinhAnh())
                        && Objects.equals(previousGia, a.getGia())
                        && Objects.equals(previousTrangThai, a.getTrangThai())
                        && Objects.equals(previousMaLoaiMon, a.getMaLoaiMon())) {
                    JDBCUtil.closeConnection(c);
                    return 2;
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0;
            }

            PreparedStatement st = c.prepareStatement(sqlUpdate);

            st.setString(1, a.getTen());
            st.setString(2, a.getHinhAnh());
            st.setLong(3, a.getGia());
            st.setBoolean(4, a.getTrangThai());
            st.setString(5, a.getMaLoaiMon());
            st.setString(6, a.getMa());

            int kq = st.executeUpdate();
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

    public ArrayList<MonDTO> listAll() {
        ArrayList<MonDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.Mon order by TrangThai desc";
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
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<MonDTO> search(String Ma, String Ten, Long DonGia, Boolean TrangThai, String MaLoaiMon) {
        ArrayList<MonDTO> list = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM LINK.QuanCaPhe.dbo.Mon WHERE 1=1");

        if (Ma != null && !Ma.isEmpty()) {
            sql.append(" AND MaMon LIKE ?");
        }
        if (Ten != null && !Ten.isEmpty()) {
            sql.append(" AND TenMon LIKE ?");
        }
        if (TrangThai != null) {
            sql.append(" AND TrangThai = ?");
        }
        if (DonGia != null) {
            sql.append(" AND Gia = ?");
        }
        if (MaLoaiMon != null && !MaLoaiMon.isEmpty()) {
            sql.append(" AND MaLoaiMon = ?");
        }

        sql.append(" ORDER BY TrangThai DESC");

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement st = c.prepareStatement(sql.toString())) {

            int index = 1;

            if (Ma != null && !Ma.isEmpty()) {
                st.setString(index++, "%" + Ma + "%");
            }
            if (Ten != null && !Ten.isEmpty()) {
                st.setString(index++, "%" + Ten + "%");
            }
            if (TrangThai != null) {
                st.setBoolean(index++, TrangThai);
            }
            if (DonGia != null) {
                st.setLong(index++, DonGia);
            }
            if (MaLoaiMon != null && !MaLoaiMon.isEmpty()) {
                st.setString(index++, MaLoaiMon);
            }

            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    MonDTO a = new MonDTO(rs.getString("MaMon"), rs.getString("TenMon"), rs.getString("HinhAnh"),
                            rs.getLong("Gia"), rs.getBoolean("TrangThai"), rs.getString("MaLoaiMon"));
                    list.add(a);
                }
            }
        } catch (Exception e) {
            System.out.println("search error");
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<MonDTO> searchByName(String ten) {
        ArrayList<MonDTO> ds = new ArrayList<>();
        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.Mon WHERE MaMon LIKE ? order by TrangThai desc";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + ten + "%"); // Tìm kiếm theo tên gần đúng

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                MonDTO a = new MonDTO(rs.getString("MaMon"), rs.getString("TenMon"), rs.getString("HinhAnh"),
                        rs.getLong("Gia"), rs.getBoolean("TrangThai"), rs.getString("MaLoaiMon"));
                ds.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchByName: " + e.getMessage());
        }
        return ds;
    }

    public ArrayList<String> listTenLoaiMon() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select TenLoaiMon from LoaiMon\n"
                + "order by TrangThai desc";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("TenLoaiMon"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listTenLoaiMon error");
        }
        return list;
    }

    public String searchMaLoaiMonByTen(String ten) {
        String ma = null;
        String sql = "SELECT MaLoaiMon FROM LoaiMon WHERE TenLoaiMon LIKE ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ten);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                ma = rs.getString("MaLoaiMon");
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchMaLoaiMonByTen error");
            System.out.println(e);
        }
        return ma;
    }

    public String searchTenLoaiMonByMa(String ten) {
        String ma = null;
        String sql = "SELECT TenLoaiMon FROM LoaiMon WHERE MaLoaiMon LIKE ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ten);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                ma = rs.getString("TenLoaiMon");
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchTenLoaiMonByMa error");
            System.out.println(e);
        }
        return ma;
    }

    public String searchAnhMonByMa(String ten) {
        String anh = null;
        String sql = "SELECT HinhAnh FROM Mon WHERE MaMon LIKE ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ten);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                anh = rs.getString("HinhAnh");
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchAnhMonByMa error");
            System.out.println(e);
        }
        return anh;
    }
}
