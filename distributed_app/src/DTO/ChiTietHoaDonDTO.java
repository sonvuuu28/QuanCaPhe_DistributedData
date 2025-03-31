package DTO;

public class ChiTietHoaDonDTO {

    private String ma;
    private String maMon;
    private Long DonGia;
    private int soLuong;
    private Long ThanhTien;

    public ChiTietHoaDonDTO(String ma, String maMon, Long DonGia, int soLuong, Long ThanhTien) {
        this.ma = ma;
        this.maMon = maMon;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public Long getDonGia() {
        return DonGia;
    }

    public void setDonGia(Long DonGia) {
        this.DonGia = DonGia;
    }

    public Long getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Long ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
