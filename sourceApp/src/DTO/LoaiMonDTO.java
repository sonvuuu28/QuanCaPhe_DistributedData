package DTO;

public class LoaiMonDTO {

    private String ma;
    private String ten;
    private boolean trangThai;

    public LoaiMonDTO() {
    }

    public LoaiMonDTO(String ma, String ten, boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
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

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return ma + " - " + ten ;
    }
    
}
