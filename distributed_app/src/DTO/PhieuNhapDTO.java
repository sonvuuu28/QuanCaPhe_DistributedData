package DTO;

import java.sql.Date;

public class PhieuNhapDTO {

    private String maPN;
    private Date ngayLap;
    private Long tongTien;
    private String maNV;
    private String maNCC;
    private String maCN;

    public PhieuNhapDTO(String maPN, Date ngayLap, Long tongTien, String maNV, String maNCC, String maCN) {
        this.maPN = maPN;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.maNV = maNV;
        this.maNCC = maNCC;
        this.maCN = maCN;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Long getTongTien() {
        return tongTien;
    }

    public void setTongTien(Long tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

}
