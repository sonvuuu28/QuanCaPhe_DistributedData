package DTO;

import java.sql.Date;

public class KhachHangDTO {

    private String MaKhachHang;
    private String TenKhachHang;
    private Date NgaySinh;
    private String GioiTinh;
    private long ChiTieu;
    private String SDT;

    public KhachHangDTO() {
    }

    public KhachHangDTO(String MaKhachHang, String TenKhachHang, Date NgaySinh, String GioiTinh, long ChiTieu, String SDT) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.ChiTieu = ChiTieu;
        this.SDT = SDT;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public long getChiTieu() {
        return ChiTieu;
    }

    public void setChiTieu(long ChiTieu) {
        this.ChiTieu = ChiTieu;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return MaKhachHang + " - " + TenKhachHang;
    }
    
}
