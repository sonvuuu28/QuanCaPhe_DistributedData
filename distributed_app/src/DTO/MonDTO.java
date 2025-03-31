package DTO;

public class MonDTO {

    private String ma;
    private String ten;
    private String HinhAnh;
    private Long Gia;
    private Boolean trangThai;
    private String MaLoaiMon;

    public MonDTO() {
    }

    public MonDTO(String ma, String ten, String HinhAnh, Long Gia, Boolean trangThai, String MaLoaiMon) {
        this.ma = ma;
        this.ten = ten;
        this.HinhAnh = HinhAnh;
        this.Gia = Gia;
        this.trangThai = trangThai;
        this.MaLoaiMon = MaLoaiMon;
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

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public Long getGia() {
        return Gia;
    }

    public void setGia(Long Gia) {
        this.Gia = Gia;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaLoaiMon() {
        return MaLoaiMon;
    }

    public void setMaLoaiMon(String MaLoaiMon) {
        this.MaLoaiMon = MaLoaiMon;
    }

    @Override
    public String toString() {
        return ten;
    }
    
}
