package DAO;

import DTO.KhuyenMaiDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;

public class n09_KhuyenMaiDAO {

    public static n09_KhuyenMaiDAO getInstance() {
        return new n09_KhuyenMaiDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM KhuyenMai";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "KM001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "KM00" + num;
            } else if (num < 100 && num > 9) {
                ID = "KM0" + num;
            } else if (num >= 100) {
                ID = "KM" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(KhuyenMaiDTO a) {
        String sql = "INSERT INTO KhuyenMai\n"
                + "           (MaKhuyenMai\n"
                + "           ,TenKhuyenMai\n"
                + "           ,PhanTram\n"
                + "           ,NgayBatDau\n"
                + "           ,NgayKetThuc\n"
                + "           ,ChiTieu\n"
                + "           ,isMember)\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setInt(3, a.getPhanTram());
            st.setDate(4, a.getNgayBatDau());
            st.setDate(5, a.getNgayKetThuc());
            st.setLong(6, a.getChiTieu());
            st.setBoolean(7, a.isIsMember());

            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println("Lỗi: Mã khuyến mãi đã tồn tại!");
            return 0;
        }
        return 1;
    }

    public int update(KhuyenMaiDTO a) {
        String sqlUpdate = "UPDATE KhuyenMai "
                + "SET TenKhuyenMai = ?, "
                + "    PhanTram = ?, "
                + "    NgayBatDau = ?, "
                + "    NgayKetThuc = ?, "
                + "    ChiTieu = ?, "
                + "    isMember = ? "
                + "WHERE MaKhuyenMai = ?";

        String sqlSelect = "SELECT TenKhuyenMai, PhanTram, NgayBatDau, NgayKetThuc,ChiTieu, isMember "
                + "FROM KhuyenMai WHERE MaKhuyenMai = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            // Truy vấn dữ liệu cũ
            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMa());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTen = rs.getString("TenKhuyenMai");
                int previousPhanTram = rs.getInt("PhanTram");
                Date previousNgayBatDau = rs.getDate("NgayBatDau");
                Date previousNgayKetThuc = rs.getDate("NgayKetThuc");
                Long previousChiTieu = rs.getLong("ChiTieu");
                Boolean previousisMember = rs.getBoolean("isMember");

                // So sánh dữ liệu
                if (previousTen.equals(a.getTen()) && previousPhanTram == a.getPhanTram()
                        && previousNgayBatDau.equals(a.getNgayBatDau())
                        && previousNgayKetThuc.equals(a.getNgayKetThuc())
                        && previousChiTieu == a.getPhanTram()
                        && previousisMember == a.isIsMember()) {
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
            stUpdate.setInt(2, a.getPhanTram());
            stUpdate.setDate(3, a.getNgayBatDau());
            stUpdate.setDate(4, a.getNgayKetThuc());
            stUpdate.setLong(5, a.getChiTieu());
            stUpdate.setBoolean(6, a.isIsMember());
            stUpdate.setString(7, a.getMa());

            int kq = stUpdate.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1; // Thành công
            } else {
                return 0; // Thất bại
            }
        } catch (SQLException e) {
            System.out.println("update error");
            System.out.println(e);
            return 0; // Thất bại
        }
    }

    public ArrayList<KhuyenMaiDTO> listAll(Boolean isMem) {
        ArrayList<KhuyenMaiDTO> list = new ArrayList<>();
        String sql = "SELECT *\n, \n"
                + "	case\n"
                + "		when NgayBatDau <= GETDATE() and NgayKetThuc >= GETDATE() then 1\n"
                + "		else 0\n"
                + "	end as HieuLuc"
                + "  FROM KhuyenMai where isMember = ? "
                + " order by HieuLuc desc";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setBoolean(1, isMem);
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
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<KhuyenMaiDTO> search(String ma, String ten, Integer phanTram, Date ngayBatDau, Date ngayKetThuc, Long chitieu, Boolean isMember) {
        ArrayList<KhuyenMaiDTO> list = new ArrayList<>();
        ArrayList<Object> params = new ArrayList<>();
        StringBuilder sql = new StringBuilder("select *, \n"
                + "	case\n"
                + "		when NgayBatDau <= GETDATE() and NgayKetThuc >= GETDATE() then 1\n"
                + "		else 0\n"
                + "	end as HieuLuc		\n"
                + "from KhuyenMai WHERE 1=1 ");

        if (ma != null && !ma.trim().isEmpty()) {
            sql.append(" AND MaKhuyenMai LIKE ?");
            params.add("%" + ma + "%");
        }
        if (ten != null && !ten.trim().isEmpty()) {
            sql.append(" AND TenKhuyenMai LIKE ?");
            params.add("%" + ten + "%");
        }
        if (phanTram != null) {
            sql.append(" AND PhanTram = ?");
            params.add(phanTram);
        }
        if (ngayBatDau != null) {
            sql.append(" AND NgayBatDau >= ?");
            params.add(new java.sql.Date(ngayBatDau.getTime()));
        }

        if (ngayKetThuc != null) {
            sql.append(" AND NgayKetThuc <= ?");
            params.add(new java.sql.Date(ngayKetThuc.getTime()));
        }

        if (chitieu != null) {
            sql.append(" AND ChiTieu = ?");
            params.add(chitieu);
        }
        if (isMember != null) {
            sql.append(" AND isMember = ?");
            params.add(isMember);
        }
        
        sql.append(" order by HieuLuc desc");

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql.toString());

            // Set tham số động cho PreparedStatement
            for (int i = 0; i < params.size(); i++) {
                st.setObject(i + 1, params.get(i));
            }

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                KhuyenMaiDTO a = new KhuyenMaiDTO(
                        rs.getString("MaKhuyenMai"),
                        rs.getString("TenKhuyenMai"),
                        rs.getInt("PhanTram"),
                        rs.getDate("NgayBatDau"),
                        rs.getDate("NgayKetThuc"),
                        rs.getLong("ChiTieu"),
                        rs.getBoolean("isMember")
                );
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("Lỗi tìm kiếm khuyến mãi: " + e.getMessage());
        }

        return list;
    }

}
