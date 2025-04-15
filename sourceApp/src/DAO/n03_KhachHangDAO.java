package DAO;

import DTO.KhachHangDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class n03_KhachHangDAO {

    public static n03_KhachHangDAO getInstance() {
        return new n03_KhachHangDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM LINK.QuanCaPhe.dbo.KhachHang";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "KH001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "KH00" + num;
            } else if (num < 100 && num > 9) {
                ID = "KH0" + num;
            } else if (num >= 100) {
                ID = "KH" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(KhachHangDTO a) {
        String sql = "INSERT INTO LINK.QuanCaPhe.dbo.KhachHang\n"
                + "           (MaKhachHang\n"
                + "           ,TenKhachHang\n"
                + "           ,NgaySinh\n"
                + "           ,GioiTinh\n"
                + "           ,ChiTieu\n"
                + "           ,SDT\n"
                + "           ,NgayDangKy)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMaKhachHang());
            st.setString(2, a.getTenKhachHang());
            st.setDate(3, a.getNgaySinh());
            st.setString(4, a.getGioiTinh());
            st.setLong(5, a.getChiTieu());
            st.setString(6, a.getSDT());
            st.setDate(7, Date.valueOf(LocalDate.now()));

            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            String message = ex.getMessage();
            if (message.contains("PRIMARY KEY constraint")) {
                System.out.println("Lỗi: Mã khách hàng đã tồn tại!");
                return 0;
            } else if (message.contains("UNIQUE KEY constraint")) {
                System.out.println("Lỗi: Số điện thoại đã tồn tại!");
                return 2;
            }
        }
        return 1;
    }

    public int update(KhachHangDTO a) {
        String sqlUpdate = "UPDATE LINK.QuanCaPhe.dbo.KhachHang "
                + "SET TenKhachHang = ?, "
                + "    NgaySinh = ?, "
                + "    GioiTinh = ?, "
                + "    SDT = ? "
                + "WHERE MaKhachHang = ?";

        String sqlSelect = "SELECT TenKhachHang, NgaySinh, GioiTinh, SDT "
                + "FROM KhachHang WHERE MaKhachHang = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            // Truy vấn dữ liệu cũ
            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMaKhachHang());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTen = rs.getString("TenKhachHang");
                Date previousNgaySinh = rs.getDate("NgaySinh");
                String previousGioiTinh = rs.getString("GioiTinh");
                String previousSDT = rs.getString("SDT");

                // So sánh dữ liệu
                if (previousTen.equals(a.getTenKhachHang())
                        && previousNgaySinh.equals(a.getNgaySinh())
                        && previousGioiTinh.equals(a.getGioiTinh())
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
            stUpdate.setString(1, a.getTenKhachHang());
            stUpdate.setDate(2, a.getNgaySinh());
            stUpdate.setString(3, a.getGioiTinh());
            stUpdate.setString(4, a.getSDT());
            stUpdate.setString(5, a.getMaKhachHang());

            int kq = stUpdate.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1; 
            } else {
                return 0; 
            }
        } catch (SQLException e) {
            System.out.println("update error");
            System.out.println(e);
            return 0; 
        }
    }

    public ArrayList<KhachHangDTO> listAll() {
        ArrayList<KhachHangDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                KhachHangDTO a = new KhachHangDTO(rs.getString("MaKhachHang"), rs.getString("TenKhachHang"),
                        rs.getDate("NgaySinh"), rs.getString("GioiTinh"), rs.getLong("ChiTieu"), rs.getString("SDT"));
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<KhachHangDTO> search(String ma, String ten, Date ngaysinh, String gioitinh, Long chitieu, String sdt) {
        ArrayList<KhachHangDTO> list = new ArrayList<>();
        ArrayList<Object> params = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM KhachHang WHERE 1=1");

        if (ma != null && !ma.trim().isEmpty()) {
            sql.append(" AND MaKhachHang LIKE ?");
            params.add("%" + ma + "%");
        }
        if (ten != null && !ten.trim().isEmpty()) {
            sql.append(" AND TenKhachHang LIKE ?");
            params.add("%" + ten + "%");
        }
        if (ngaysinh != null) {
            sql.append(" AND NgaySinh = ?");
            params.add(new java.sql.Date(ngaysinh.getTime()));
        }
        if (gioitinh != null && !gioitinh.trim().isEmpty()) {
            sql.append(" AND GioiTinh LIKE ?");
            params.add("%" + gioitinh + "%");
        }
        if (chitieu != null) {
            sql.append(" AND ChiTieu BETWEEN ? AND ?");
            params.add(chitieu);
            params.add(chitieu * 1.05);  // Chi tiêu chạy từ giá nhập đến +5%
        }
        if (sdt != null && !sdt.trim().isEmpty()) {
            sql.append(" AND SDT LIKE ?");
            params.add("%" + sdt + "%");
        }

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql.toString());

            // Set tham số động cho PreparedStatement
            for (int i = 0; i < params.size(); i++) {
                st.setObject(i + 1, params.get(i));
            }

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                KhachHangDTO a = new KhachHangDTO(
                        rs.getString("MaKhachHang"),
                        rs.getString("TenKhachHang"),
                        rs.getDate("NgaySinh"),
                        rs.getString("GioiTinh"),
                        rs.getLong("ChiTieu"),
                        rs.getString("SDT")
                );
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("Lỗi tìm kiếm khách hàng: " + e.getMessage());
        }

        return list;
    }

}
