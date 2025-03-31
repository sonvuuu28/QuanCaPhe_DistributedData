package DAO;

import DTO.NhanVienDTO;
import Util.JDBCUtil;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class n11_NhanVienDAO {

    public static n11_NhanVienDAO getInstance() {
        return new n11_NhanVienDAO();
    }

    public String createID() {
        String ID = "";
        try {
            Connection c = JDBCUtil.getConnection();
            Statement st = c.createStatement();
            String sql = "SELECT COUNT(*) AS total FROM NhanVien";
            ResultSet rs = st.executeQuery(sql);

            int num = 0;
            if (rs.next()) {
                if (rs.getInt("total") == 0) {
                    ID = "NV001";
                }
                num = rs.getInt("total") + 1;
            }

            if (num < 10 && num > 0) {
                ID = "NV00" + num;
            } else if (num < 100 && num > 9) {
                ID = "NV0" + num;
            } else if (num >= 100) {
                ID = "NV" + num;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("createID Error");
        }
        return ID;
    }

    public int insert(NhanVienDTO a) {
        String sql = "INSERT INTO NhanVien "
                + "(MaNhanVien, TenNhanVien, GioiTinhNhanVien, SoDienThoaiNhanVien, NgaySinhNhanVien, "
                + "ChucVuNhanVien, DiaChi, LuongNhanVien, TrangThaiNhanVien, MaChiNhanh, NgayNghiViec) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, null)";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, a.getMa());
            st.setString(2, a.getTen());
            st.setString(3, a.getGioiTinh());
            st.setString(4, a.getSdt());
            st.setDate(5, new java.sql.Date(a.getNgaySinh().getTime()));
            st.setString(6, a.getChucVu());
            st.setString(7, a.getDiaChi());
            st.setLong(8, a.getLuong());
            st.setBoolean(9, a.getTrangThai());
            st.setString(10, a.getMaCN());

            int rowsInserted = st.executeUpdate();
            JDBCUtil.closeConnection(c);

            if (rowsInserted > 0) {
                System.out.println("Insert thành công!");
                return 1; // Thành công
            } else {
                System.out.println("Insert thất bại!");
                return 0; // Thất bại
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi khi thêm nhân viên: " + ex.getMessage());
            return 0; // Thất bại
        }
    }

    public int update(NhanVienDTO a) {
        String sqlUpdate = "UPDATE NhanVien "
                + "SET TenNhanVien = ?, "
                + "    GioiTinhNhanVien = ?, "
                + "    SoDienThoaiNhanVien = ?, "
                + "    NgaySinhNhanVien = ?, "
                + "    ChucVuNhanVien = ?, "
                + "    DiaChi = ?, "
                + "    LuongNhanVien = ?, "
                + "    TrangThaiNhanVien = ?, "
                + "    MaChiNhanh = ? "
                + "WHERE MaNhanVien = ?";

        String sqlSelect = "SELECT * FROM NhanVien WHERE MaNhanVien = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            // Truy vấn dữ liệu cũ
            PreparedStatement stSelect = c.prepareStatement(sqlSelect);
            stSelect.setString(1, a.getMa());
            ResultSet rs = stSelect.executeQuery();

            if (rs.next()) {
                String prevTen = rs.getString("TenNhanVien");
                String prevGioiTinh = rs.getString("GioiTinhNhanVien");
                String prevSDT = rs.getString("SoDienThoaiNhanVien");
                Date prevNgaySinh = rs.getDate("NgaySinhNhanVien");
                String prevChucVu = rs.getString("ChucVuNhanVien");
                String prevDiaChi = rs.getString("DiaChi");
                Long prevLuong = rs.getLong("LuongNhanVien");
                Boolean prevTrangThai = rs.getBoolean("TrangThaiNhanVien");
                String prevMaCN = rs.getString("MaChiNhanh");

                // So sánh dữ liệu, nếu không thay đổi thì return 2
                if (prevTen.equals(a.getTen())
                        && prevGioiTinh.equals(a.getGioiTinh())
                        && prevSDT.equals(a.getSdt())
                        && prevNgaySinh.equals(a.getNgaySinh())
                        && prevChucVu.equals(a.getChucVu())
                        && prevDiaChi.equals(a.getDiaChi())
                        && prevLuong.equals(a.getLuong())
                        && prevTrangThai.equals(a.getTrangThai())
                        && prevMaCN.equals(a.getMaCN())) {
                    JDBCUtil.closeConnection(c);
                    return 2; // Trùng dữ liệu, không cần cập nhật
                }
            } else {
                JDBCUtil.closeConnection(c);
                return 0; // Không tìm thấy nhân viên
            }

            // Thực hiện cập nhật
            PreparedStatement stUpdate = c.prepareStatement(sqlUpdate);
            stUpdate.setString(1, a.getTen());
            stUpdate.setString(2, a.getGioiTinh());
            stUpdate.setString(3, a.getSdt());
            stUpdate.setDate(4, new java.sql.Date(a.getNgaySinh().getTime()));
            stUpdate.setString(5, a.getChucVu());
            stUpdate.setString(6, a.getDiaChi());
            stUpdate.setLong(7, a.getLuong());
            stUpdate.setBoolean(8, a.getTrangThai());
            stUpdate.setString(9, a.getMaCN());
            stUpdate.setString(10, a.getMa());

            int kq = stUpdate.executeUpdate();
            JDBCUtil.closeConnection(c);

            return (kq > 0) ? 1 : 0; // 1: Thành công, 0: Thất bại
        } catch (SQLException e) {
            System.out.println("Lỗi cập nhật nhân viên: " + e.getMessage());
            return 0; // Thất bại
        }
    }

    public int batTat(String ma, Boolean trangThai) {
        Date date = null;
        if (!trangThai) {
            date = Date.valueOf(LocalDate.now());
        } else {
            date = null;
        }
        String sqlUpdate = "UPDATE NhanVien "
                + "SET TrangThaiNhanVien = ?, "
                + " NgayNghiViec = ?"
                + "WHERE MaNhanVien = ?";

        String sqlTaiKhoan = "UPDATE TaiKhoan SET TrangThai = (SELECT TrangThaiNhanVien FROM NhanVien WHERE MaNhanVien = ?) "
                + "WHERE MaNhanVien = ?";

        try {
            Connection c = JDBCUtil.getConnection();

            PreparedStatement ps = c.prepareStatement(sqlUpdate);
            ps.setBoolean(1, trangThai);
            ps.setDate(2, date);
            ps.setString(3, ma);
            int kq = ps.executeUpdate();

            PreparedStatement ps2 = c.prepareStatement(sqlTaiKhoan);
            ps2.setString(1, ma);
            ps2.setString(2, ma);
            int kq2 = ps2.executeUpdate();

            JDBCUtil.closeConnection(c);

            if (kq > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public ArrayList<NhanVienDTO> listAll() {
        ArrayList<NhanVienDTO> list = new ArrayList<>();
        String sql = "select * from NhanVien\n"
                + "order by TrangThaiNhanVien desc";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NhanVienDTO a = new NhanVienDTO(rs.getString("MaNhanVien"), rs.getString("TenNhanVien"),
                        rs.getString("GioiTinhNhanVien"), rs.getString("SoDienThoaiNhanVien"), rs.getDate("NgaySinhNhanVien"),
                        rs.getString("ChucVuNhanVien"), rs.getString("DiaChi"), rs.getLong("LuongNhanVien"),
                        rs.getBoolean("TrangThaiNhanVien"), rs.getString("MaChiNhanh"), rs.getDate("NgayNghiViec")
                );
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll error");
        }
        return list;
    }

    public ArrayList<NhanVienDTO> search(String ma, String ten, String gioiTinh, String sdt, Date ngaySinh,
            String chucVu, String diaChi, Long luong, Boolean trangThai, String maCN) {
        ArrayList<NhanVienDTO> list = new ArrayList<>();
        ArrayList<Object> params = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM NhanVien WHERE 1=1 ");

        if (ma != null && !ma.trim().isEmpty()) {
            sql.append(" AND MaNhanVien LIKE ?");
            params.add("%" + ma + "%");
        }
        if (ten != null && !ten.trim().isEmpty()) {
            sql.append(" AND TenNhanVien LIKE ?");
            params.add("%" + ten + "%");
        }
        if (gioiTinh != null && !gioiTinh.trim().isEmpty()) {
            sql.append(" AND GioiTinhNhanVien = ?");
            params.add(gioiTinh);
        }
        if (sdt != null && !sdt.trim().isEmpty()) {
            sql.append(" AND SoDienThoaiNhanVien LIKE ?");
            params.add("%" + sdt + "%");
        }
        if (ngaySinh != null) {
            sql.append(" AND NgaySinhNhanVien = ?");
            params.add(new java.sql.Date(ngaySinh.getTime()));
        }
        if (chucVu != null && !chucVu.trim().isEmpty()) {
            sql.append(" AND ChucVuNhanVien LIKE ?");
            params.add("%" + chucVu + "%");
        }
        if (diaChi != null && !diaChi.trim().isEmpty()) {
            sql.append(" AND DiaChi LIKE ?");
            params.add("%" + diaChi + "%");
        }
        if (luong != null) {
            sql.append(" AND LuongNhanVien = ?");
            params.add(luong);
        }
        if (trangThai != null) {
            sql.append(" AND TrangThaiNhanVien = ?");
            params.add(trangThai);
        }
        if (maCN != null && !maCN.trim().isEmpty()) {
            sql.append(" AND MaChiNhanh = ?");
            params.add(maCN);
        }

        sql.append(" order by TrangThaiNhanVien desc");

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql.toString());

            // Gán giá trị tham số vào PreparedStatement
            for (int i = 0; i < params.size(); i++) {
                st.setObject(i + 1, params.get(i));
            }

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NhanVienDTO a = new NhanVienDTO(
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
                list.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("Lỗi tìm kiếm nhân viên: " + e.getMessage());
        }

        return list;
    }

    public ArrayList<NhanVienDTO> searchByName(String ten) {
        ArrayList<NhanVienDTO> ds = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE TenNhanVien LIKE ? order by TrangThaiNhanVien desc";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, "%" + ten + "%"); // Tìm kiếm theo tên gần đúng

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NhanVienDTO a = new NhanVienDTO(
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
                ds.add(a);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("Lỗi khi tìm kiếm nhân viên theo tên: " + e.getMessage());
        }
        return ds;
    }

    public ArrayList<String> listChiNhanh() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "select MaChiNhanh from ChiNhanh\n"
                + "order by TrangThai desc";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("MaChiNhanh"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listChiNhanh error");
        }
        return list;
    }

    public NhanVienDTO searchNhanVienByMa(String maNV) {
        NhanVienDTO nv = null;
        String sql = "SELECT * FROM NhanVien WHERE MaNhanVien = ?";

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

}
