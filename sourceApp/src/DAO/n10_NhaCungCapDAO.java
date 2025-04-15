package DAO;

import DTO.NhaCungCapDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;

public class n10_NhaCungCapDAO {

    public static n10_NhaCungCapDAO getInstance() {
        return new n10_NhaCungCapDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM LINK.QuanCaPhe.dbo.NhaCungCap";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "NCC001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "NCC00" + num;
            } else if (num < 100 && num > 9) {
                ID = "NCC0" + num;
            } else if (num >= 100) {
                ID = "NCC" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(NhaCungCapDTO a) {
        String sql = "INSERT INTO LINK.QuanCaPhe.dbo.NhaCungCap(MaNCC, TenNCC, DiaChi, SDT) "
                + "  VALUES(?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMaNCC());
            st.setString(2, a.getTenNCC());
            st.setString(3, a.getDiaChi());
            st.setString(4, a.getSDT());

            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            String message = ex.getMessage();
            if (message.contains("PRIMARY KEY constraint")) {
                System.out.println("Lỗi: Mã nhà cung cấp đã tồn tại!");
                return 0;
            } else if (message.contains("UNIQUE KEY constraint")) {
                System.out.println("Lỗi: Số điện thoại đã tồn tại!");
                return 2;
            }
        }
        return 1;
    }

    public int update(NhaCungCapDTO a) {
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.NhaCungCap "
                + "SET TenNCC = ?, "
                + "    DiaChi = ?, "
                + "    SDT = ? "
                + "WHERE MaNCC = ?";

        String sqlSelect = "SELECT TenNCC, DiaChi, SDT "
                + "FROM NhaCungCap WHERE MaNCC = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMaNCC());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTenNCC = rs.getString("TenNCC");
                String previousDiaChi = rs.getString("DiaChi");
                String previousSDT = rs.getString("SDT");

                if (previousTenNCC.equals(a.getTenNCC())
                        && previousDiaChi.equals(a.getDiaChi())
                        && previousSDT.equals(a.getSDT())) {
                    JDBCUtil.closeConnection(c);
                    return 2; // Trùng dữ liệu
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0; 
            }

            PreparedStatement stUpdate = c.prepareStatement(sqlUpdate);
            stUpdate.setString(1, a.getTenNCC());
            stUpdate.setString(2, a.getDiaChi());
            stUpdate.setString(3, a.getSDT());
            stUpdate.setString(4, a.getMaNCC());

            int kq = stUpdate.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1; // Thành công
            } else {
                return 0; // Thất bại
            }
        } catch (SQLException e) {
            String message = e.getMessage();
            return 0;
        }
    }

    public ArrayList<NhaCungCapDTO> listAll() {
        ArrayList<NhaCungCapDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM LINK.QuanCaPhe.dbo.NhaCungCap";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NhaCungCapDTO a = new NhaCungCapDTO(rs.getString("MaNCC"), rs.getString("TenNCC"),
                        rs.getString("DiaChi"), rs.getString("SDT"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<NhaCungCapDTO> search(String Ma, String Ten, String DiaChi, String SDT) {
        ArrayList<NhaCungCapDTO> list = new ArrayList<>();
        String sql = "select * from LINK.QuanCaPhe.dbo.NhaCungCap where MaNCC like ? and TenNCC like ? and "
                + "DiaChi like ? AND SDT like ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + Ma + "%");
            st.setString(2, "%" + Ten + "%");
            st.setString(3, "%" + DiaChi + "%");
            st.setString(4, "%" + SDT + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NhaCungCapDTO a = new NhaCungCapDTO(rs.getString("MaNCC"), rs.getString("TenNCC"),
                        rs.getString("DiaChi"), rs.getString("SDT"));
                list.add(a);
            }
        } catch (Exception e) {
            System.out.println("search error");
            System.out.println(e);
        }
        return list;
    }

}
