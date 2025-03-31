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
            String sql = "SELECT COUNT(*) AS total FROM NhaCungCap";
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
        String sql = "INSERT INTO NhaCungCap\n"
                + "           (MaNCC\n"
                + "           ,TenNCC\n"
                + "           ,DiaChi\n"
                + "           ,SDT)\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
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
        String sqlUpdate = "UPDATE NhaCungCap "
                + "SET TenNCC = ?, "
                + "    DiaChi = ?, "
                + "    SDT = ? "
                + "WHERE MaNCC = ?";

        String sqlSelect = "SELECT TenNCC, DiaChi, SDT "
                + "FROM NhaCungCap WHERE MaNCC = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            // Truy vấn dữ liệu cũ
            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMaNCC());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTenNCC = rs.getString("TenNCC");
                String previousDiaChi = rs.getString("DiaChi");
                String previousSDT = rs.getString("SDT");

                // So sánh dữ liệu
                if (previousTenNCC.equals(a.getTenNCC())
                        && previousDiaChi.equals(a.getDiaChi())
                        && previousSDT.equals(a.getSDT())) {
                    JDBCUtil.closeConnection(c);
                    return 2; // Trùng dữ liệu
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0; // Không tìm thấy mã CaLam
            }

            // Thực hiện cập nhật
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
        String sql = "SELECT *\n"
                + "  FROM NhaCungCap";
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
        String sql = "select * from NhaCungCap where MaNCC like ? and TenNCC like ? and "
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

    public static void main(String[] args) {
//        NhaCungCapDTO a = new NhaCungCapDTO(null, "Tên nhà cc", "địa 1234", "0825123790");
//        n10_NhaCungCapDAO.getInstance().insert(a);
//        NhaCungCapDTO a1 = new NhaCungCapDTO("NCC002", "Tên nhà cc mới", "địa mới", "0000000000");
//        int i = n10_NhaCungCapDAO.getInstance().update(a1);
//        if ( i == 2 ) {
//            System.out.println("KO CÓ J ĐỂ SỬA");
//        }
//        
//        if ( i == 0 ) {
//            System.out.println("FAIL");
//        }
//        
//        if ( i == 1 ) {
//            System.out.println("SỬA THÀNH CÔNG");
//        }
//        for (NhaCungCapDTO a : n10_NhaCungCapDAO.getInstance().listAll()) {
//            System.out.println(a.getMaNCC() + "\n");
//        }
        for (NhaCungCapDTO a : n10_NhaCungCapDAO.getInstance().search("", "m", "", "")) {
            System.out.println(a.getMaNCC() + " " + a.getTenNCC() + " " + a.getDiaChi() + " " + a.getSDT() + "\n");
        }
    }
}
