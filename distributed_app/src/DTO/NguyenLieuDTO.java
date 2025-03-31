package DTO;

public class NguyenLieuDTO {

    private String ma;
    private String ten;
    private Float kl;
    private String dv;
    private Boolean trangThai;
    private String maChiNhanh;

    public NguyenLieuDTO() {
    }

    public NguyenLieuDTO(String ma, String ten, Float kl, String dv, Boolean trangThai, String maChiNhanh) {
        this.ma = ma;
        this.ten = ten;
        this.kl = kl;
        this.dv = dv;
        this.trangThai = trangThai;
        this.maChiNhanh = maChiNhanh;
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

    public Float getKl() {
        return kl;
    }

    public void setKl(Float kl) {
        this.kl = kl;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaChiNhanh() {
        return maChiNhanh;
    }

    public void setMaChiNhanh(String maChiNhanh) {
        this.maChiNhanh = maChiNhanh;
    }

    @Override
    public String toString() {
        return ten;
    }
    
}
