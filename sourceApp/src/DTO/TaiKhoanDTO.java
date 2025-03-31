package DTO;

public class TaiKhoanDTO {

    private String ma;
    private String ten;
    private String matKhau;
    private String maPQ;
    private String maNV;
    private Boolean trangThai;
    private String maCN;

    public TaiKhoanDTO() {
    }

    public TaiKhoanDTO(String ma, String ten, String matKhau, String maPQ, String maNV, Boolean trangThai, String maCN) {
        this.ma = ma;
        this.ten = ten;
        this.matKhau = matKhau;
        this.maPQ = maPQ;
        this.maNV = maNV;
        this.trangThai = trangThai;
        this.maCN = maCN;
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

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getMaPQ() {
        return maPQ;
    }

    public void setMaPQ(String maPQ) {
        this.maPQ = maPQ;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

}
