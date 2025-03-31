package DAO;

import DTO.NguyenLieuDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;

public class n07_NguyenLieuDAO {

    public static n07_NguyenLieuDAO getInstance() {
        return new n07_NguyenLieuDAO();
    }

    public NguyenLieuDTO searchNguyenLieuByMa(String ma, String maCN) {
        NguyenLieuDTO pn = null;
        String sql = "select * \n"
                + "from NguyenLieu nl \n"
                + "join NguyenLieuKho kho on nl.MaNguyenLieu = kho.MaNguyenLieu\n"
                + "where nl.MaNguyenLieu = ? and MaChiNhanh = ?";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, ma);
            st.setString(2, maCN);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                pn = new NguyenLieuDTO(rs.getString("MaNguyenLieu"), rs.getString("TenNguyenLieu"),
                        rs.getFloat("KhoiLuong"), rs.getString("DonVi"), rs.getBoolean("TrangThai"),
                        rs.getString("MaChiNhanh"));
            }

            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("searchNguyenLieuByMa Error");
        }
        return pn;
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM NguyenLieu";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "NL001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "NL00" + num;
            } else if (num < 100 && num > 9) {
                ID = "NL0" + num;
            } else if (num >= 100) {
                ID = "NL" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(NguyenLieuDTO a) {
        String sql = "INSERT INTO NguyenLieu\n"
                + "           (MaNguyenLieu\n"
                + "           ,TenNguyenLieu\n"
                + "           ,DonVi\n"
                + "           ,TrangThai)\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setString(3, a.getDv());
            st.setBoolean(4, a.getTrangThai());

            st.executeUpdate();
            System.out.println("insert success");
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println("Lỗi: Mã nguyên liệu đã tồn tại!");
            return 0;
        }
        return 1;
    }

    public int update(NguyenLieuDTO a) {
        String sqlUpdate = "UPDATE NguyenLieu "
                + "SET TenNguyenLieu = ?, "
                //                + "    KhoiLuong = ?, "
                + "    DonVi = ?, "
                + "    TrangThai = ? "
                + "WHERE MaNguyenLieu = ?";

        String sqlSelect = "SELECT TenNguyenLieu, DonVi, TrangThai "
                + "FROM NguyenLieu WHERE MaNguyenLieu = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMa());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String previousTenNguyenLieu = rs.getString("TenNguyenLieu");
//                Float previousKhoiLuong = rs.getFloat("KhoiLuong");
                String previousDonVi = rs.getString("DonVi");
                Boolean previousTrangThai = rs.getBoolean("TrangThai");

                if (previousTenNguyenLieu.equals(a.getTen())
                        //                        && Math.abs(previousKhoiLuong - a.getKl()) < 0.0001
                        && previousDonVi.equals(a.getDv())
                        && previousTrangThai.equals(a.getTrangThai())) {
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
//            stUpdate.setFloat(2, a.getKl());
            stUpdate.setString(2, a.getDv());
            stUpdate.setBoolean(3, a.getTrangThai());
            stUpdate.setString(4, a.getMa());

            int kq = stUpdate.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("update");

            return 0;
        }
    }

    public ArrayList<NguyenLieuDTO> listAll(String maCN) {
        ArrayList<NguyenLieuDTO> list = new ArrayList<>();
        String sql = "select * \n"
                + "from NguyenLieu nl \n"
                + "join NguyenLieuKho kho on nl.MaNguyenLieu = kho.MaNguyenLieu\n"
                + "where kho.MaChiNhanh = ?\n"
                + "order by nl.TrangThai desc, nl.MaNguyenLieu asc";
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
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<NguyenLieuDTO> search(String Ma, String Ten, Float kl, String donVi, Boolean TrangThai, String maCN) {
        ArrayList<NguyenLieuDTO> list = new ArrayList<>();
        ArrayList<Object> params = new ArrayList<>();

        StringBuilder sql = new StringBuilder(
                "SELECT nl.MaNguyenLieu, nl.TenNguyenLieu, nk.KhoiLuong, nl.DonVi, nl.TrangThai, nk.MaChiNhanh "
                + "FROM NguyenLieu nl "
                + "JOIN NguyenLieuKho nk ON nl.MaNguyenLieu = nk.MaNguyenLieu "
                + "WHERE nk.MaChiNhanh = ? "
        );

        params.add(maCN);  // MaChiNhanh là tham số đầu tiên

        if (Ma != null && !Ma.trim().isEmpty()) {
            sql.append(" AND nl.MaNguyenLieu LIKE ?");
            params.add("%" + Ma + "%");
        }
        if (Ten != null && !Ten.trim().isEmpty()) {
            sql.append(" AND nl.TenNguyenLieu LIKE ?");
            params.add("%" + Ten + "%");
        }
        if (kl != null) {
            sql.append(" AND nk.KhoiLuong = ?");
            params.add(kl);
        }
        if (donVi != null && !donVi.trim().isEmpty()) {
            sql.append(" AND nl.DonVi LIKE ?");
            params.add("%" + donVi + "%");
        }
        if (TrangThai != null) {
            sql.append(" AND nl.TrangThai = ?");
            params.add(TrangThai);
        }

        sql.append(" ORDER BY nl.TrangThai DESC, nl.MaNguyenLieu ASC");

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql.toString());

            // Gán giá trị tham số động
            for (int i = 0; i < params.size(); i++) {
                st.setObject(i + 1, params.get(i));
            }

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NguyenLieuDTO a = new NguyenLieuDTO(
                        rs.getString("MaNguyenLieu"),
                        rs.getString("TenNguyenLieu"),
                        rs.getFloat("KhoiLuong"),
                        rs.getString("DonVi"),
                        rs.getBoolean("TrangThai"),
                        rs.getString("MaChiNhanh")
                );
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("Lỗi tìm kiếm nguyên liệu: " + e.getMessage());
        }

        return list;
    }

}
