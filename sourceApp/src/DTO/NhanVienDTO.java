package DTO;

import java.sql.Date;

public class NhanVienDTO {

    private String ma;
    private String ten;
    private String gioiTinh;
    private String sdt;
    private Date ngaySinh;
    private String chucVu;
    private String diaChi;
    private Long luong;
    private Boolean trangThai;
    private String maCN;
    private Date ngayNghiViec;

    public NhanVienDTO() {
    }

    public NhanVienDTO(String ma, String ten, String gioiTinh, String sdt, Date ngaySinh, String chucVu, String diaChi, Long luong, Boolean trangThai, String maCN, Date ngayNghiViec) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.chucVu = chucVu;
        this.diaChi = diaChi;
        this.luong = luong;
        this.trangThai = trangThai;
        this.maCN = maCN;
        this.ngayNghiViec = ngayNghiViec;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Long getLuong() {
        return luong;
    }

    public void setLuong(Long luong) {
        this.luong = luong;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public Date getNgayNghiViec() {
        return ngayNghiViec;
    }

    public void setNgayNghiViec(Date ngayNghiViec) {
        this.ngayNghiViec = ngayNghiViec;
    }
    
    @Override
    public String toString() {
        return ma + " - " + ten;
    }

}
