package DTO;

import java.sql.Time;

public class CaLamDTO {

    private String ma;
    private String ten;
    private java.sql.Time timeIn;
    private java.sql.Time timeOut;
    private boolean trangThai;

    public CaLamDTO() {
    }

    public CaLamDTO(String ma, String ten, Time timeIn, Time timeOut, boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
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

    public Time getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Time timeIn) {
        this.timeIn = timeIn;
    }

    public Time getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Time timeOut) {
        this.timeOut = timeOut;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

//    @Override
    public String toString() {
        return ten;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CaLamDTO caLamDTO = (CaLamDTO) obj;
        return ma != null && ma.equals(caLamDTO.getMa());
    }

    @Override
    public int hashCode() {
        return ma != null ? ma.hashCode() : 0;
    }
}
