package DTO;

import java.sql.Date;

public class HoaDonDTO {

    private String ma;
    private Date ngayLap;
    private Long tongTien;
    private String maNV;
    private String maKH;
    private String maKM;
    private String maKMMember;
    private String maCN;

    public HoaDonDTO(String ma, Date ngayLap, Long tongTien, String maNV, String maKH, String maKM, String maKMMember, String maCN) {
        this.ma = ma;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.maNV = maNV;
        this.maKH = maKH;
        this.maKM = maKM;
        this.maKMMember = maKMMember;
        this.maCN = maCN;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getMaKMMember() {
        return maKMMember;
    }

    public void setMaKMMember(String maKMMember) {
        this.maKMMember = maKMMember;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

}
