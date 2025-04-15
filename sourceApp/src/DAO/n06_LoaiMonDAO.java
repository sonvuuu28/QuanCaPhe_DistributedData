package DAO;

import DTO.LoaiMonDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;

public class n06_LoaiMonDAO {

    public static n06_LoaiMonDAO getInstance() {
        return new n06_LoaiMonDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM LINK.QuanCaPhe.dbo.LoaiMon";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "LM001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "LM00" + num;
            } else if (num < 100 && num > 9) {
                ID = "LM0" + num;
            } else if (num >= 100) {
                ID = "LM" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(LoaiMonDTO a) {
        String sql = "insert into LINK.QuanCaPhe.dbo.LoaiMon(MaLoaiMon, TenLoaiMon, TrangThai) "
                + "values(?, ?, ?) ";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setBoolean(3, a.isTrangThai());

            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println("Lỗi: Mã loại món đã tồn tại!");
            System.out.println(ex);
            return 0;
        }
        return 1;
    }

    public int update(LoaiMonDTO a) {
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.LoaiMon "
                + "SET TenLoaiMon = ?, "
                + "    TrangThai = ? "
                + "WHERE MaLoaiMon = ?";

        String sqlSelect = "SELECT TenLoaiMon, TrangThai "
                + "FROM LoaiMon WHERE MaLoaiMon = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            // Truy vấn dữ liệu cũ
            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMa());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTenLoaiMon = rs.getString("TenLoaiMon");
                String previousTrangThai = rs.getString("TrangThai");

                if (previousTenLoaiMon.equals(a.getTen())
                        && previousTrangThai.equals(a.isTrangThai())) {
                    JDBCUtil.closeConnection(c);
                    return 2; 
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0; 
            }
            
            PreparedStatement stUpdate = c.prepareStatement(sqlUpdate);
            stUpdate.setString(1, a.getTen());
            stUpdate.setBoolean(2, a.isTrangThai());
            stUpdate.setString(3, a.getMa());

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

    public ArrayList<LoaiMonDTO> listAll() {
        ArrayList<LoaiMonDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.LoaiMon";
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
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<LoaiMonDTO> search(String Ma, String Ten, Boolean TrangThai) {
        ArrayList<LoaiMonDTO> list = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM LINK.QuanCaPhe.dbo.LoaiMon WHERE 1=1");

        if (Ma != null && !Ma.isEmpty()) {
            sql.append(" AND MaLoaiMon LIKE ?");
        }
        if (Ten != null && !Ten.isEmpty()) {
            sql.append(" AND TenLoaiMon LIKE ?");
        }
        if (TrangThai != null) {
            sql.append(" AND TrangThai = ?");
        }

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

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                LoaiMonDTO a = new LoaiMonDTO(
                        rs.getString("MaLoaiMon"),
                        rs.getString("TenLoaiMon"),
                        rs.getBoolean("TrangThai")
                );
                list.add(a);
            }
        } catch (Exception e) {
            System.out.println("search error");
            e.printStackTrace();
        }

        return list;
    }
}
