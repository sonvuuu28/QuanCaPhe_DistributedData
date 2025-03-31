package DTO;

public class ChiNhanhDTO {

    private String ma;
    private String ten;
    private String diaChi;
    private Boolean trangThai;

    public ChiNhanhDTO(String ma, String ten, String diaChi, Boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public ChiNhanhDTO() {
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "CN: " + ten;
    }

}
