package DTO;

import java.sql.Date;

public class PhieuXuatDTO {

    private String ma;
    private Date ngayLap;
    private String maNV;
    private String maCN;

    public PhieuXuatDTO(String ma, Date ngayLap, String maNV, String maCN) {
        this.ma = ma;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
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

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

}
