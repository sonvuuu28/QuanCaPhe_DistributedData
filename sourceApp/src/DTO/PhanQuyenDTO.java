package DTO;

public class PhanQuyenDTO {

    private String ma;
    private String ten;
    private Boolean BanHang;
    private Boolean KhachHang;
    private Boolean NhapHang;
    private Boolean XuatKho;
    private Boolean Mon;
    private Boolean NguyenLieu;
    private Boolean LichLam;
    private Boolean KhuyenMaiUuDai;
    private Boolean NhaCungCap;
    private Boolean NhanVien;
    private Boolean ThongKe;
    private int DoUuTien;
    private Boolean trangThai;

    public PhanQuyenDTO(String ma, String ten, Boolean BanHang, Boolean KhachHang, Boolean NhapHang, Boolean XuatKho, Boolean Mon, Boolean NguyenLieu, Boolean LichLam, Boolean KhuyenMaiUuDai, Boolean NhaCungCap, Boolean NhanVien, Boolean ThongKe, int DoUuTien, Boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.BanHang = BanHang;
        this.KhachHang = KhachHang;
        this.NhapHang = NhapHang;
        this.XuatKho = XuatKho;
        this.Mon = Mon;
        this.NguyenLieu = NguyenLieu;
        this.LichLam = LichLam;
        this.KhuyenMaiUuDai = KhuyenMaiUuDai;
        this.NhaCungCap = NhaCungCap;
        this.NhanVien = NhanVien;
        this.ThongKe = ThongKe;
        this.DoUuTien = DoUuTien;
        this.trangThai = trangThai;
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

    public Boolean getBanHang() {
        return BanHang;
    }

    public void setBanHang(Boolean BanHang) {
        this.BanHang = BanHang;
    }

    public Boolean getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(Boolean KhachHang) {
        this.KhachHang = KhachHang;
    }

    public Boolean getNhapHang() {
        return NhapHang;
    }

    public void setNhapHang(Boolean NhapHang) {
        this.NhapHang = NhapHang;
    }

    public Boolean getXuatKho() {
        return XuatKho;
    }

    public void setXuatKho(Boolean XuatKho) {
        this.XuatKho = XuatKho;
    }

    public Boolean getMon() {
        return Mon;
    }

    public void setMon(Boolean Mon) {
        this.Mon = Mon;
    }

    public Boolean getNguyenLieu() {
        return NguyenLieu;
    }

    public void setNguyenLieu(Boolean NguyenLieu) {
        this.NguyenLieu = NguyenLieu;
    }

    public Boolean getLichLam() {
        return LichLam;
    }

    public void setLichLam(Boolean LichLam) {
        this.LichLam = LichLam;
    }

    public Boolean getKhuyenMaiUuDai() {
        return KhuyenMaiUuDai;
    }

    public void setKhuyenMaiUuDai(Boolean KhuyenMaiUuDai) {
        this.KhuyenMaiUuDai = KhuyenMaiUuDai;
    }

    public Boolean getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(Boolean NhaCungCap) {
        this.NhaCungCap = NhaCungCap;
    }

    public Boolean getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(Boolean NhanVien) {
        this.NhanVien = NhanVien;
    }

    public Boolean getThongKe() {
        return ThongKe;
    }

    public void setThongKe(Boolean ThongKe) {
        this.ThongKe = ThongKe;
    }

    public int getDoUuTien() {
        return DoUuTien;
    }

    public void setDoUuTien(int DoUuTien) {
        this.DoUuTien = DoUuTien;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
