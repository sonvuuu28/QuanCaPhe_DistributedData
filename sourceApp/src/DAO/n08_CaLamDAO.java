package DAO;

import DTO.CaLamDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;

public class n08_CaLamDAO {

    public static n08_CaLamDAO getInstance() {
        return new n08_CaLamDAO();
    }

    public CaLamDTO searchCaLamByMa(String ma) {
        CaLamDTO a = null;
        String sql = "SELECT * FROM CaLam WHERE MaCaLam LIKE ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + ma + "%");

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                a = new CaLamDTO(rs.getString("MaCaLam"), rs.getString("TenCaLam"),
                        rs.getTime("ThoiGianVao"), rs.getTime("ThoiGianRa"), rs.getBoolean("TrangThai"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("searchLoaiMonByMa" + e.getMessage());
        }
        return a;
    }
    
    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM CaLam where MaCaLam != 'CLOFF' ";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "CL001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "CL00" + num;
            } else if (num < 100 && num > 9) {
                ID = "CL0" + num;
            } else if (num >= 100) {
                ID = "CL" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(CaLamDTO a) {
        String sql = "INSERT INTO CaLam\n"
                + "           (MaCaLam\n"
                + "           ,TenCaLam\n"
                + "           ,ThoiGianVao\n"
                + "           ,ThoiGianRa\n"
                + "           ,TrangThai)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setTime(3, a.getTimeIn());
            st.setTime(4, a.getTimeOut());
            st.setBoolean(5, a.isTrangThai());

            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println("Lỗi: Mã ca làm đã tồn tại!");
            System.out.println(ex);
            return 0;
        }
        return 1;
    }

    public int update(CaLamDTO a) {
        String sqlUpdate = "UPDATE CaLam "
                + "SET TenCaLam = ?, "
                + "    ThoiGianVao = ?, "
                + "    ThoiGianRa = ?, "
                + "    TrangThai = ? "
                + "WHERE MaCaLam = ?";

        String sqlSelect = "SELECT TenCaLam, ThoiGianVao, ThoiGianRa, TrangThai "
                + "FROM CaLam WHERE MaCaLam = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            // Truy vấn dữ liệu cũ
            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMa());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTenCaLam = rs.getString("TenCaLam");
                java.sql.Time previousThoiGianVao = rs.getTime("ThoiGianVao");
                java.sql.Time previousThoiGianRa = rs.getTime("ThoiGianRa");
                String previousTrangThai = rs.getString("TrangThai");

                // So sánh dữ liệu
                if (previousTenCaLam.equals(a.getTen())
                        && previousThoiGianVao.equals(a.getTimeIn())
                        && previousThoiGianRa.equals(a.getTimeOut())
                        && previousTrangThai.equals(a.isTrangThai())) {
                    JDBCUtil.closeConnection(c);
                    return 2; // Trùng dữ liệu
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0; // Không tìm thấy mã CaLam
            }

            // Thực hiện cập nhật
            PreparedStatement stUpdate = c.prepareStatement(sqlUpdate);
            stUpdate.setString(1, a.getTen());
            stUpdate.setTime(2, a.getTimeIn());
            stUpdate.setTime(3, a.getTimeOut());
            stUpdate.setBoolean(4, a.isTrangThai());
            stUpdate.setString(5, a.getMa());

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

    public ArrayList<CaLamDTO> listAll() {
        ArrayList<CaLamDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM CaLam where MaCaLam != 'CLOFF' ";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CaLamDTO a = new CaLamDTO(rs.getString("MaCaLam"), rs.getString("TenCaLam"),
                        rs.getTime("ThoiGianVao"), rs.getTime("ThoiGianRa"), rs.getBoolean("TrangThai"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<CaLamDTO> search(String Ma, String Ten, java.sql.Time ThoiGianVao, java.sql.Time ThoiGianRa, Boolean TrangThai) {
        System.out.println(ThoiGianVao);
        System.out.println(ThoiGianRa);

        ArrayList<CaLamDTO> list = new ArrayList<>();
        // Khởi tạo với WHERE 1=1 để nối các điều kiện
        StringBuilder sql = new StringBuilder("SELECT * FROM CaLam WHERE 1=1");

        if (Ma != null && !Ma.isEmpty()) {
            sql.append(" AND MaCaLam LIKE ?");
        }
        if (Ten != null && !Ten.isEmpty()) {
            sql.append(" AND TenCaLam LIKE ?");
        }
        if (ThoiGianVao != null) {
            sql.append(" AND ThoiGianVao = CAST(? AS TIME)");
        }
        if (ThoiGianRa != null) {
            sql.append(" AND ThoiGianRa = CAST(? AS TIME)");
        }
        if (TrangThai != null) {
            sql.append(" AND TrangThai = ?");
        }
        
        sql.append(" where MaCaLam != 'CLOFF'");

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement st = c.prepareStatement(sql.toString())) {

            int index = 1;

            if (Ma != null && !Ma.isEmpty()) {
                st.setString(index++, "%" + Ma + "%");
            }
            if (Ten != null && !Ten.isEmpty()) {
                st.setString(index++, "%" + Ten + "%");
            }
            if (ThoiGianVao != null) {
                st.setTime(index++, ThoiGianVao);
            }
            if (ThoiGianRa != null) {
                st.setTime(index++, ThoiGianRa);
            }
            if (TrangThai != null) {
                st.setBoolean(index++, TrangThai);
            }

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CaLamDTO a = new CaLamDTO(
                        rs.getString("MaCaLam"),
                        rs.getString("TenCaLam"),
                        rs.getTime("ThoiGianVao"),
                        rs.getTime("ThoiGianRa"),
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
