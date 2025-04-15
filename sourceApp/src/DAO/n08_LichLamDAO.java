package DAO;

import DTO.CaLamDTO;
import DTO.NhanVienDTO;
import java.sql.PreparedStatement;
import java.sql.*;
import Util.JDBCUtil;
import java.util.ArrayList;
import java.util.List;

public class n08_LichLamDAO {

    public static n08_LichLamDAO getInstance() {
        return new n08_LichLamDAO();
    }

    public ArrayList<CaLamDTO> listAllCa() {
        ArrayList<CaLamDTO> list = new ArrayList<>();
        String sql = "SELECT *\n"
                + "  FROM CaLam where MaCaLam != 'CLOFF' and TrangThai = 1";
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

    public boolean checkExistLichLam(Date date, String MaCN) {
        Date chuNhat = Util.Utils.getInstance().getDate_DaysInWeek(date).get(6);
        String sql = "select count(*) as sl from LINK.QuanCaPhe.dbo.LichLam where NgayLam = ? ";
        if (MaCN != null) {
            sql += " and MaChiNhanh = ? ";
        }
        boolean exists = false;
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setDate(1, chuNhat);
            if (MaCN != null) {
                st.setString(2, MaCN);
            }
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int sl = rs.getInt("sl");
                exists = sl > 0;
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("checkExistLichLam");
            exists = false;
        }
        return exists;
    }

    public ArrayList<NhanVienDTO> listNhanVien(String MaCN) {
        if (MaCN.equals("Tổng")) {
            MaCN = null;
        }
        ArrayList<NhanVienDTO> ds = new ArrayList<>();
        String sql = "";
        if (MaCN == null) {
            sql = "select * from NhanVien where [TrangThaiNhanVien] = 1 and MaChiNhanh is Null ";

        } else {
            sql = "select * from NhanVien where [TrangThaiNhanVien] = 1 and MaChiNhanh = '" + MaCN + "'";

        }

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO(
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
                ds.add(nv);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listNhanVien!");
        }

        return ds;
    }

    public ArrayList<CaLamDTO> listCaLam() {
        ArrayList<CaLamDTO> ds = new ArrayList<>();

        String sql = "select * from CaLam where [TrangThai] = 1 or MaCaLam = 'CLOFF' ";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CaLamDTO ca = new CaLamDTO(rs.getString("MaCaLam"), rs.getString("TenCaLam"),
                        rs.getTime("ThoiGianVao"), rs.getTime("ThoiGianRa"), rs.getBoolean("TrangThai"));
                ds.add(ca);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listCaLam!");
        }

        return ds;
    }

    public ArrayList<String> listAll(Date Ngay, String MaCN) {
        if (MaCN.equals("Tổng")) {
            MaCN = null;
        }
        ArrayList<String> list = new ArrayList<>();
        String sql = "DECLARE @given DATE = ?  \n"
                + "DECLARE @monday DATE = DATEADD(DAY, 2 - DATEPART(WEEKDAY, @given), @given);\n"
                + "\n"
                + "DECLARE @tuesday   DATE = DATEADD(DAY, 1, @monday);\n"
                + "DECLARE @wednesday DATE = DATEADD(DAY, 2, @monday);\n"
                + "DECLARE @thursday  DATE = DATEADD(DAY, 3, @monday);\n"
                + "DECLARE @friday    DATE = DATEADD(DAY, 4, @monday);\n"
                + "DECLARE @saturday  DATE = DATEADD(DAY, 5, @monday);\n"
                + "DECLARE @sunday    DATE = DATEADD(DAY, 6, @monday);\n"
                + "\n"
                + "SELECT \n"
                + "    nv.TenNhanVien,\n"
                + "    COALESCE(c2.TenCaLam, '') AS thu2,    -- Lịch của thứ Hai\n"
                + "    COALESCE(c3.TenCaLam, '') AS thu3,    -- Lịch của thứ Ba\n"
                + "    COALESCE(c4.TenCaLam, '') AS thu4,    -- Lịch của thứ Tư\n"
                + "    COALESCE(c5.TenCaLam, '') AS thu5,    -- Lịch của thứ Năm\n"
                + "    COALESCE(c6.TenCaLam, '') AS thu6,    -- Lịch của thứ Sáu\n"
                + "    COALESCE(c7.TenCaLam, '') AS thu7,    -- Lịch của thứ Bảy\n"
                + "    COALESCE(c8.TenCaLam, '') AS chunhat  -- Lịch của Chủ Nhật\n"
                + "FROM NhanVien nv\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = @monday) AS t2 ON nv.MaNhanVien = t2.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = @tuesday) AS t3 ON nv.MaNhanVien = t3.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = @wednesday) AS t4 ON nv.MaNhanVien = t4.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = @thursday) AS t5 ON nv.MaNhanVien = t5.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = @friday) AS t6 ON nv.MaNhanVien = t6.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = @saturday) AS t7 ON nv.MaNhanVien = t7.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = @sunday) AS cn ON nv.MaNhanVien = cn.MaNhanVien\n"
                + "LEFT JOIN CaLam AS c2 ON t2.MaCaLam = c2.MaCaLam\n"
                + "LEFT JOIN CaLam AS c3 ON t3.MaCaLam = c3.MaCaLam\n"
                + "LEFT JOIN CaLam AS c4 ON t4.MaCaLam = c4.MaCaLam\n"
                + "LEFT JOIN CaLam AS c5 ON t5.MaCaLam = c5.MaCaLam\n"
                + "LEFT JOIN CaLam AS c6 ON t6.MaCaLam = c6.MaCaLam\n"
                + "LEFT JOIN CaLam AS c7 ON t7.MaCaLam = c7.MaCaLam\n"
                + "LEFT JOIN CaLam AS c8 ON cn.MaCaLam = c8.MaCaLam\n";
        if (MaCN == null) {
            sql += "WHERE  nv.MaChiNhanh is null AND \n";

        } else {
            sql += "WHERE  nv.MaChiNhanh = ? AND \n";

        }
        sql += "    ( \n"
                + "        (@given >= GETDATE() AND nv.NgayNghiViec IS NULL) \n"
                + "        OR (@given < GETDATE() AND EXISTS ( \n"
                + "            SELECT 1 FROM LichLam \n"
                + "            WHERE LichLam.MaNhanVien = nv.MaNhanVien \n"
                + "              AND NgayLam >= @monday \n"
                + "              AND NgayLam < DATEADD(DAY, 7, @monday) \n"
                + "        )) \n"
                + "    ) \n"
                + "ORDER BY nv.MaNhanVien;";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setDate(1, Ngay);
            if (MaCN != null) {
                st.setString(2, MaCN);
            }
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String TenNhanVien = rs.getString("TenNhanVien");
                String thu2 = rs.getString("thu2");
                String thu3 = rs.getString("thu3");
                String thu4 = rs.getString("thu4");
                String thu5 = rs.getString("thu5");
                String thu6 = rs.getString("thu6");
                String thu7 = rs.getString("thu7");
                String chunhat = rs.getString("chunhat");

                String lichLam = String.join(", ", TenNhanVien, thu2, thu3, thu4, thu5, thu6, thu7, chunhat);
                list.add(lichLam);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("listAll");
        }
        return list;
    }

    public boolean insert(Date date, String MaCN) {
        ArrayList<NhanVienDTO> dsNV = new ArrayList<>();
        if (MaCN.equals("Tổng")) {
            MaCN = null;
            dsNV = listNhanVien("Tổng");
        } else {
            dsNV = listNhanVien(MaCN);
        }
        List<Date> weeks = Util.Utils.getInstance().getDate_DaysInWeek(date);
        StringBuilder sql = new StringBuilder();
        for (NhanVienDTO nv : dsNV) {
            for (int i = 6; i >= 0; i--) {
                if (MaCN == null) {
                    sql.append("EXEC insertLichLam '").append(nv.getMa()).append("', '").append("CLOFF")
                            .append("', '").append(weeks.get(i)).append("', ").append(MaCN).append("\n");
                } else {
                    sql.append("EXEC insertLichLam '").append(nv.getMa()).append("', '").append("CLOFF")
                            .append("', '").append(weeks.get(i)).append("', '").append(MaCN).append("'\n");
                }
            }
        }

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement st = c.prepareStatement(sql.toString())) {
            int kq = st.executeUpdate();
            return kq > 0;
        } catch (SQLException ex) {
            System.out.println("Lỗi khi insert lịch làm!");
            ex.printStackTrace();
            return false;
        }
    }

    public boolean update(Date date, String maNV, List<CaLamDTO> dsCa) {
        List<Date> weeks = Util.Utils.getInstance().getDate_DaysInWeek(date);

        StringBuilder sql = new StringBuilder();
        sql.append("declare @maNV nvarchar(50) = ? \n");

        int i = 6;
        for (int size = dsCa.size(); size > 0; size--) {
            sql.append("EXEC updateLichLam @maNV, '").append(dsCa.get(size - 1).getMa())
                    .append("', '").append(weeks.get(i)).append("'\n");
            i--;
        }

        try (Connection c = JDBCUtil.getConnection(); PreparedStatement st = c.prepareStatement(sql.toString())) {

            st.setString(1, maNV);
            int kq = st.executeUpdate();
            return kq > 0;
        } catch (SQLException ex) {
            System.out.println("Lỗi khi update lịch làm!");
            ex.printStackTrace();
            return false;
        }
    }
}
