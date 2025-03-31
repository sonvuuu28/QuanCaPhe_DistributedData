package DTO;

import java.sql.Date;

public class KhuyenMaiDTO {

    private String ma;
    private String ten;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int phanTram;
    private long chiTieu;
    private boolean isMember;

    public KhuyenMaiDTO() {
    }

    public KhuyenMaiDTO(String ma, String ten, int phanTram, Date ngayBatDau, Date ngayKetThuc, long chiTieu, boolean isMember) {
        this.ma = ma;
        this.ten = ten;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.phanTram = phanTram;
        this.chiTieu = chiTieu;
        this.isMember = isMember;
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

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getPhanTram() {
        return phanTram;
    }

    public void setPhanTram(int phanTram) {
        this.phanTram = phanTram;
    }

    public long getChiTieu() {
        return chiTieu;
    }

    public void setChiTieu(long chiTieu) {
        this.chiTieu = chiTieu;
    }

    public boolean isIsMember() {
        return isMember;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    @Override
    public String toString() {
        return ten + " (" + phanTram + "%)";
    }

    public void setPhanTramKhuyenMaiMember(KhuyenMaiDTO setLabelKhuyenMaiThanhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
