package DAO;

import DTO.CaLamDTO;
import DTO.NhanVienDTO;
import java.sql.PreparedStatement;
import java.sql.*;
import Util.JDBCUtil;
import java.time.LocalDate;
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

    public boolean checkExistLichLam(Date date) {
        Date chuNhat = Util.Utils.getInstance().getDate_DaysInWeek(date).get(6);
        String sql = "select count(*) as sl from LichLam where NgayLam = ? ";
        boolean exists = false;
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setDate(1, chuNhat);
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

    public ArrayList<NhanVienDTO> listNhanVien() {
        ArrayList<NhanVienDTO> ds = new ArrayList<>();

        String sql = "select * from NhanVien where [TrangThaiNhanVien] = 1";

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

    public ArrayList<String> listAll(Date Ngay) {
        ArrayList<String> list = new ArrayList<>();
        String sql = "DECLARE @start DATE = ?;\n"
                + "\n"
                + "SELECT \n"
                + "    nv.TenNhanVien,\n"
                + "    COALESCE(c2.TenCaLam, '') AS thu2,\n"
                + "    COALESCE(c3.TenCaLam, '') AS thu3,\n"
                + "    COALESCE(c4.TenCaLam, '') AS thu4,\n"
                + "    COALESCE(c5.TenCaLam, '') AS thu5,\n"
                + "    COALESCE(c6.TenCaLam, '') AS thu6,\n"
                + "    COALESCE(c7.TenCaLam, '') AS thu7,\n"
                + "    COALESCE(c8.TenCaLam, '') AS chunhat\n"
                + "FROM \n"
                + "    NhanVien nv\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = @start) AS t2 ON nv.MaNhanVien = t2.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = DATEADD(DAY, 1, @start)) AS t3 ON nv.MaNhanVien = t3.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = DATEADD(DAY, 2, @start)) AS t4 ON nv.MaNhanVien = t4.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = DATEADD(DAY, 3, @start)) AS t5 ON nv.MaNhanVien = t5.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = DATEADD(DAY, 4, @start)) AS t6 ON nv.MaNhanVien = t6.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = DATEADD(DAY, 5, @start)) AS t7 ON nv.MaNhanVien = t7.MaNhanVien\n"
                + "LEFT JOIN \n"
                + "    (SELECT * FROM LichLam WHERE NgayLam = DATEADD(DAY, 6, @start)) AS cn ON nv.MaNhanVien = cn.MaNhanVien\n"
                + "LEFT JOIN CaLam AS c2 ON t2.MaCaLam = c2.MaCaLam\n"
                + "LEFT JOIN CaLam AS c3 ON t3.MaCaLam = c3.MaCaLam\n"
                + "LEFT JOIN CaLam AS c4 ON t4.MaCaLam = c4.MaCaLam\n"
                + "LEFT JOIN CaLam AS c5 ON t5.MaCaLam = c5.MaCaLam\n"
                + "LEFT JOIN CaLam AS c6 ON t6.MaCaLam = c6.MaCaLam\n"
                + "LEFT JOIN CaLam AS c7 ON t7.MaCaLam = c7.MaCaLam\n"
                + "LEFT JOIN CaLam AS c8 ON cn.MaCaLam = c8.MaCaLam\n"
                + "WHERE \n"
                + "    -- Nếu xem lịch tương lai, chỉ lấy nhân viên chưa nghỉ\n"
                + "    (@start >= GETDATE() AND nv.NgayNghiViec IS NULL)\n"
                + "    -- Nếu xem lịch quá khứ, vẫn lấy nhân viên đã nghỉ nhưng có ca làm\n"
                + "    OR (@start < GETDATE() AND EXISTS (\n"
                + "        SELECT 1 FROM LichLam WHERE LichLam.MaNhanVien = nv.MaNhanVien AND NgayLam >= @start AND NgayLam < DATEADD(DAY, 7, @start)\n"
                + "    ))\n"
                + "ORDER BY nv.MaNhanVien;";

        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setDate(1, Ngay);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                // Lấy dữ liệu từ các cột trong kết quả truy vấn
                String TenNhanVien = rs.getString("TenNhanVien");
                String thu2 = rs.getString("thu2");
                String thu3 = rs.getString("thu3");
                String thu4 = rs.getString("thu4");
                String thu5 = rs.getString("thu5");
                String thu6 = rs.getString("thu6");
                String thu7 = rs.getString("thu7");
                String chunhat = rs.getString("chunhat");

                // Kết hợp dữ liệu thành một chuỗi
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

    public boolean insert(Date date) {
        List<Date> weeks = Util.Utils.getInstance().getDate_DaysInWeek(date);
        ArrayList<NhanVienDTO> dsNV = listAllNhanVien();
        StringBuilder sql = new StringBuilder();
        for (NhanVienDTO nv : dsNV) {
            for (int i = 6; i >= 0; i--) {
                sql.append("EXEC insertLichLam '").append(nv.getMa()).append("', '").append("CLOFF")
                        .append("', '").append(weeks.get(i)).append("'\n");
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

    public ArrayList<NhanVienDTO> listAllNhanVien() {
        ArrayList<NhanVienDTO> list = new ArrayList<>();
        String sql = "select * from NhanVien where TrangThaiNhanVien = 1\n";
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
            System.out.println("listAllNhanVien error");
        }
        return list;
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
