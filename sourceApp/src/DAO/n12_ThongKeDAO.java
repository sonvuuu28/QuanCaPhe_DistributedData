package DAO;

import Util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class n12_ThongKeDAO {

    public static n12_ThongKeDAO getInstance() {
        return new n12_ThongKeDAO();
    }

    public Long getDoanhThuToday(String maCN) {
        Long doanhThu = null;
        String sql = "select sum(TongTienHoaDon) as doanhThu\n"
                + "from HoaDon \n"
                + "where NgayLapHoaDon = convert(date, getDate()) and MaChiNhanh = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getLong("doanhThu");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getDoanhThuToday" + e.getMessage());
        }
        return doanhThu;
    }

    public Long getDoanhThuTuan(String maCN) {
        Long doanhThu = null;
        String sql = "set datefirst 1\n"
                + "select sum(TongTienHoaDon) as doanhThu\n"
                + "from HoaDon\n"
                + "where MaChiNhanh = ? and NgayLapHoaDon >= dateadd(day, 1 - datepart(weekday,getdate()), convert(date, getdate())) \n"
                + "and NgayLapHoaDon <= dateadd(day, 7 - datepart(weekday,getdate()), convert(date, getdate()));";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getLong("doanhThu");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getDoanhThuTuan" + e.getMessage());
        }
        return doanhThu;
    }

    public Long getDoanhThuThang(String maCN) {
        Long doanhThu = null;
        String sql = "declare @start date = DATEFROMPARTS(YEAR(getdate()),MONTH(getdate()),1)\n"
                + "declare @end date = eomonth(getdate())\n"
                + "SELECT SUM(TongTienHoaDon) AS doanhThu\n"
                + "FROM HoaDon\n"
                + "WHERE MaChiNhanh = ? AND NgayLapHoaDon >= @start AND NgayLapHoaDon <= @end";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getLong("doanhThu");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getDoanhThuThang" + e.getMessage());
        }
        return doanhThu;
    }

    public Long getDoanhThuNam(String maCN) {
        Long doanhThu = null;
        String sql = "SELECT SUM(TongTienHoaDon) AS DoanhThu\n"
                + "FROM HoaDon\n"
                + "WHERE MaChiNhanh = ? AND NgayLapHoaDon >= DATEFROMPARTS(YEAR(GETDATE()), 1, 1) AND NgayLapHoaDon <= DATEFROMPARTS(YEAR(GETDATE()),12,31)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getLong("doanhThu");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getDoanhThuNam" + e.getMessage());
        }
        return doanhThu;
    }

    public int getSLHoaDonToday(String maCN) {
        int doanhThu = 0;
        String sql = "select count(*) as sl\n"
                + "from HoaDon \n"
                + "where NgayLapHoaDon = convert(date, getDate()) and MaChiNhanh = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getInt("sl");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getSLHoaDonToday" + e.getMessage());
        }
        return doanhThu;
    }

    public int getSLMonToday(String maCN) {
        int doanhThu = 0;
        String sql = "select sum(SoLuong) as sl\n"
                + "from ChiTietHoaDon as cthd\n"
                + "join HoaDon as hd on cthd.MaHoaDon = hd.MaHoaDon\n"
                + "where NgayLapHoaDon = convert(date, getDate()) and MaChiNhanh = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getInt("sl");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getSLMonToday" + e.getMessage());
        }
        return doanhThu;
    }

    public int getSLKhachHangToday(String maCN) {
        int doanhThu = 0;
        String sql = "select count(*) as sl\n"
                + "from KhachHang as kh\n"
                + "join HoaDon as hd on kh.MaKhachHang = hd.MaKhachHang \n"
                + "where kh.NgayDangKy = convert(date,getDate()) and hd.MaChiNhanh = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getInt("sl");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getSLKhachHangToday" + e.getMessage());
        }
        return doanhThu;
    }

    // DOANH THU
    public ArrayList<Long> ListDoanhThuTuan(String maCN) {
        ArrayList<Long> ds = new ArrayList<>();
        String sql = "set datefirst 1\n"
                + "SELECT\n"
                + "	SUM(CASE WHEN DATEPART(WEEKDAY, NgayLapHoaDon) = 1 THEN TongTienHoaDon ELSE 0 END) AS [Thu2],\n"
                + "	SUM(CASE WHEN DATEPART(WEEKDAY, NgayLapHoaDon) = 2 THEN TongTienHoaDon ELSE 0 END) AS [Thu3],\n"
                + "    SUM(CASE WHEN DATEPART(WEEKDAY, NgayLapHoaDon) = 3 THEN TongTienHoaDon ELSE 0 END) AS [Thu4],\n"
                + "    SUM(CASE WHEN DATEPART(WEEKDAY, NgayLapHoaDon) = 4 THEN TongTienHoaDon ELSE 0 END) AS [Thu5],\n"
                + "	SUM(CASE WHEN DATEPART(WEEKDAY, NgayLapHoaDon) = 5 THEN TongTienHoaDon ELSE 0 END) AS [Thu6],\n"
                + "	SUM(CASE WHEN DATEPART(WEEKDAY, NgayLapHoaDon) = 6 THEN TongTienHoaDon ELSE 0 END) AS [Thu7],\n"
                + "	SUM(CASE WHEN DATEPART(WEEKDAY, NgayLapHoaDon) = 7 THEN TongTienHoaDon ELSE 0 END) AS [ChuNhat]\n"
                + "FROM HoaDon\n"
                + "WHERE \n"
                + "	NgayLapHoaDon >= DATEADD(DAY, 1 - DATEPART(WEEKDAY, GETDATE()), CONVERT(DATE, GETDATE()))\n"
                + "	AND NgayLapHoaDon <= DATEADD(DAY, 7 - DATEPART(WEEKDAY, GETDATE()), CONVERT(DATE, GETDATE())) AND MaChiNhanh = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ds.add(rs.getLong("Thu2"));
                ds.add(rs.getLong("Thu3"));
                ds.add(rs.getLong("Thu4"));
                ds.add(rs.getLong("Thu5"));
                ds.add(rs.getLong("Thu6"));
                ds.add(rs.getLong("Thu7"));
                ds.add(rs.getLong("ChuNhat"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getDoanhThuTuan" + e.getMessage());
        }
        return ds;
    }

    public ArrayList<Long> ListDoanhThuThang(String maCN) {
        ArrayList<Long> ds = new ArrayList<>();
        String sql = "SELECT\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 1 THEN TongTienHoaDon ELSE 0 END) AS t1,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 2 THEN TongTienHoaDon ELSE 0 END) AS t2,\n"
                + "    SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 3 THEN TongTienHoaDon ELSE 0 END) AS t3,\n"
                + "    SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 4 THEN TongTienHoaDon ELSE 0 END) AS t4,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 5 THEN TongTienHoaDon ELSE 0 END) AS t5,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 6 THEN TongTienHoaDon ELSE 0 END) AS t6,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 7 THEN TongTienHoaDon ELSE 0 END) AS t7,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 8 THEN TongTienHoaDon ELSE 0 END) AS t8,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 9 THEN TongTienHoaDon ELSE 0 END) AS t9,\n"
                + "    SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 10 THEN TongTienHoaDon ELSE 0 END) AS t10,\n"
                + "    SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 11 THEN TongTienHoaDon ELSE 0 END) AS t11,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapHoaDon) = 12 THEN TongTienHoaDon ELSE 0 END) AS t12\n"
                + "FROM HoaDon\n"
                + "WHERE NgayLapHoaDon >= DATEFROMPARTS(year(getdate()), 1, 1) and NgayLapHoaDon <= DATEFROMPARTS(year(getdate()), 12, 31) AND MaChiNhanh = ?\n";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ds.add(rs.getLong("t1"));
                ds.add(rs.getLong("t2"));
                ds.add(rs.getLong("t3"));
                ds.add(rs.getLong("t4"));
                ds.add(rs.getLong("t5"));
                ds.add(rs.getLong("t6"));
                ds.add(rs.getLong("t7"));
                ds.add(rs.getLong("t8"));
                ds.add(rs.getLong("t9"));
                ds.add(rs.getLong("t10"));
                ds.add(rs.getLong("t11"));
                ds.add(rs.getLong("t12"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("ListDoanhThuThang" + e.getMessage());
        }
        return ds;
    }

    // CHI PHÍ
    public Long getChiPhiNam(String maCN) {
        Long doanhThu = null;
        String sql = "SELECT SUM(TongTienPhieuNhap) AS cp\n"
                + "FROM PhieuNhap\n"
                + "WHERE MaChiNhanh = ? AND NgayLapPhieuNhap >= DATEFROMPARTS(YEAR(GETDATE()), 1, 1) AND NgayLapPhieuNhap <= DATEFROMPARTS(YEAR(GETDATE()),12,31)";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getLong("cp");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getChiPhiNam" + e.getMessage());
        }
        return doanhThu;
    }

    public Long getChiPhiNhapThang(String maCN) {
        Long doanhThu = null;
        String sql = "SELECT SUM(TongTienPhieuNhap) AS chiPhi\n"
                + "from PhieuNhap\n"
                + "where MaChiNhanh = ? AND NgayLapPhieuNhap >= DATEFROMPARTS(YEAR(getdate()),MONTH(getdate()),1) and NgayLapPhieuNhap <= eomonth(getdate())";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getLong("chiPhi");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getChiPhiNhapThang" + e.getMessage());
        }
        return doanhThu;
    }

    public Long getChiPhiLuongThang(String maCN) {
        Long doanhThu = null;
        String sql = "select sum(LuongNhanVien) as luong\n"
                + "from NhanVien\n"
                + "where MaChiNhanh = ? and NgayNghiViec is null";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getLong("luong");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getChiPhiLuongThang" + e.getMessage());
        }
        return doanhThu;
    }

    public ArrayList<Long> ListChiPhiNhapThang(String maCN) {
        ArrayList<Long> ds = new ArrayList<>();
        String sql = "SELECT\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 1 THEN TongTienPhieuNhap ELSE 0 END) AS t1,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 2 THEN TongTienPhieuNhap ELSE 0 END) AS t2,\n"
                + "    SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 3 THEN TongTienPhieuNhap ELSE 0 END) AS t3,\n"
                + "    SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 4 THEN TongTienPhieuNhap ELSE 0 END) AS t4,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 5 THEN TongTienPhieuNhap ELSE 0 END) AS t5,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 6 THEN TongTienPhieuNhap ELSE 0 END) AS t6,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 7 THEN TongTienPhieuNhap ELSE 0 END) AS t7,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 8 THEN TongTienPhieuNhap ELSE 0 END) AS t8,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 9 THEN TongTienPhieuNhap ELSE 0 END) AS t9,\n"
                + "    SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 10 THEN TongTienPhieuNhap ELSE 0 END) AS t10,\n"
                + "    SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 11 THEN TongTienPhieuNhap ELSE 0 END) AS t11,\n"
                + "	SUM(CASE WHEN DATEPART(MONTH, NgayLapPhieuNhap) = 12 THEN TongTienPhieuNhap ELSE 0 END) AS t12\n"
                + "FROM PhieuNhap\n"
                + "WHERE NgayLapPhieuNhap >= DATEFROMPARTS(year(getdate()), 1, 1) and NgayLapPhieuNhap <= DATEFROMPARTS(year(getdate()), 12, 31) AND MaChiNhanh = ?\n";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ds.add(rs.getLong("t1"));
                ds.add(rs.getLong("t2"));
                ds.add(rs.getLong("t3"));
                ds.add(rs.getLong("t4"));
                ds.add(rs.getLong("t5"));
                ds.add(rs.getLong("t6"));
                ds.add(rs.getLong("t7"));
                ds.add(rs.getLong("t8"));
                ds.add(rs.getLong("t9"));
                ds.add(rs.getLong("t10"));
                ds.add(rs.getLong("t11"));
                ds.add(rs.getLong("t12"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("ListChiPhiNhapThang" + e.getMessage());
        }
        return ds;
    }

    public ArrayList<Long> ListChiPhiLuongThang(String maCN) {
        ArrayList<Long> ds = new ArrayList<>();
        String sql = "select \n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 1, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 1, 1)) THEN LuongNhanVien ELSE 0 END) AS t1,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 2, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 2, 1)) THEN LuongNhanVien ELSE 0 END) AS t2,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 3, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 3, 1)) THEN LuongNhanVien ELSE 0 END) AS t3,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 4, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 4, 1)) THEN LuongNhanVien ELSE 0 END) AS t4,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 5, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 5, 1)) THEN LuongNhanVien ELSE 0 END) AS t5,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 6, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 6, 1)) THEN LuongNhanVien ELSE 0 END) AS t6,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 7, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 7, 1)) THEN LuongNhanVien ELSE 0 END) AS t7,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 8, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 8, 1)) THEN LuongNhanVien ELSE 0 END) AS t8,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 9, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 9, 1)) THEN LuongNhanVien ELSE 0 END) AS t9,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 10, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 10, 1)) THEN LuongNhanVien ELSE 0 END) AS t10,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 11, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 11, 1)) THEN LuongNhanVien ELSE 0 END) AS t11,\n"
                + "	SUM(CASE WHEN getDate() >= DATEFROMPARTS(year(GETDATE()), 12, 1) and (NgayNghiViec is null or NgayNghiViec > DATEFROMPARTS(year(GETDATE()), 12, 1)) THEN LuongNhanVien ELSE 0 END) AS t12\n"
                + "from NhanVien\n"
                + "where MaChiNhanh = ?";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ds.add(rs.getLong("t1"));
                ds.add(rs.getLong("t2"));
                ds.add(rs.getLong("t3"));
                ds.add(rs.getLong("t4"));
                ds.add(rs.getLong("t5"));
                ds.add(rs.getLong("t6"));
                ds.add(rs.getLong("t7"));
                ds.add(rs.getLong("t8"));
                ds.add(rs.getLong("t9"));
                ds.add(rs.getLong("t10"));
                ds.add(rs.getLong("t11"));
                ds.add(rs.getLong("t12"));
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("ListChiPhiLuongThang" + e.getMessage());
        }
        return ds;
    }

    // Kho
    public int getSLNguyenLieu() {
        int sl = 0;
        String sql = "select count(*) as sl\n"
                + "from NguyenLieu where trangThai = 1 \n";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                sl = rs.getInt("sl");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getSLNguyenLieu" + e.getMessage());
        }
        return sl;
    }

    public int getSLNCC() {
        int sl = 0;
        String sql = "select count(*) as sl\n"
                + "from NhaCungCap \n";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                sl = rs.getInt("sl");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getSLNCC" + e.getMessage());
        }
        return sl;
    }

    public int getSLPhieuNhapThang(String maCN) {
        int doanhThu = 0;
        String sql = "select count(*) as sl from PhieuNhap\n"
                + "where MaChiNhanh = ? and NgayLapPhieuNhap >= DATEFROMPARTS(year(GETDATE()), month(getDate()), 1) "
                + "and NgayLapPhieuNhap <= EOMONTH(GETDATE())";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getInt("sl");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getSLPhieuNhapThang" + e.getMessage());
        }
        return doanhThu;
    }

    public int getSLPhieuXuatKhoThang(String maCN) {
        int doanhThu = 0;
        String sql = "select count(*) as sl from PhieuXuatKho\n"
                + "where MaChiNhanh = ? and NgayLap >= DATEFROMPARTS(year(GETDATE()), month(getDate()), 1) "
                + "and NgayLap <= EOMONTH(GETDATE())";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                doanhThu = rs.getInt("sl");
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getSLPhieuXuatKhoThang" + e.getMessage());
        }
        return doanhThu;
    }

    public ArrayList<Object[]> ListThongKeKho(String maCN) {
        ArrayList<Object[]> ds = new ArrayList<>();
        String sql = "SELECT \n"
                + "    nl.MaNguyenLieu,\n"
                + "    nl.TenNguyenLieu,\n"
                + "    -- Loại bỏ sai số không mong muốn ở khối lượng\n"
                + "    ROUND(nlk.KhoiLuong, 6) AS KhoiLuong,\n"
                + "    \n"
                + "    -- Tính tổng khối lượng nhập trong tháng, loại bỏ sai số\n"
                + "    ISNULL((\n"
                + "        SELECT ROUND(SUM(ctpn.KhoiLuong), 6)\n"
                + "        FROM ChiTietPhieuNhap ctpn\n"
                + "        JOIN PhieuNhap pn ON ctpn.MaPhieuNhap = pn.MaPhieuNhap\n"
                + "        WHERE ctpn.MaNguyenLieu = nl.MaNguyenLieu\n"
                + "          AND pn.MaChiNhanh = nlk.MaChiNhanh\n"
                + "          AND pn.NgayLapPhieuNhap >= DATEFROMPARTS(YEAR(GETDATE()), MONTH(GETDATE()), 1)\n"
                + "          AND pn.NgayLapPhieuNhap <= EOMONTH(GETDATE())\n"
                + "    ), 0) AS slNhap,\n"
                + "\n"
                + "    -- Tính tổng khối lượng xuất trong tháng, loại bỏ sai số\n"
                + "    ISNULL((\n"
                + "		SELECT ROUND(SUM(ctpxk.KhoiLuong), 6)\n"
                + "        FROM ChiTietPhieuXuatKho ctpxk\n"
                + "        JOIN PhieuXuatKho pxk ON ctpxk.MaPhieuXuatKho = pxk.MaPhieuXuatKho\n"
                + "        WHERE ctpxk.MaNguyenLieu = nl.MaNguyenLieu\n"
                + "          AND pxk.MaChiNhanh = nlk.MaChiNhanh\n"
                + "          AND pxk.NgayLap >= DATEFROMPARTS(YEAR(GETDATE()), MONTH(GETDATE()), 1)\n"
                + "          AND pxk.NgayLap <= EOMONTH(GETDATE())\n"
                + "    ), 0) AS slXuat\n"
                + "\n"
                + "FROM \n"
                + "    NguyenLieu nl\n"
                + "JOIN \n"
                + "    NguyenLieuKho nlk ON nl.MaNguyenLieu = nlk.MaNguyenLieu\n"
                + "WHERE \n"
                + "    nlk.MaChiNhanh = ?\n"
                + "ORDER BY \n"
                + "    nl.MaNguyenLieu;";
        try {
            Connection c = JDBCUtil.getConnection();
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, maCN);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Object[] row = {
                    rs.getString("MaNguyenLieu"),
                    rs.getString("TenNguyenLieu"),
                    rs.getFloat("KhoiLuong"),
                    rs.getFloat("slNhap"),
                    rs.getFloat("slXuat")
                };
                ds.add(row);
            }
            JDBCUtil.closeConnection(c);
        } catch (SQLException e) {
            System.out.println("getDoanhThuTuan" + e.getMessage());
        }
        return ds;
    }
}
