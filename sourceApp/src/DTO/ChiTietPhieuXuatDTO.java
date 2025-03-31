package DTO;

public class ChiTietPhieuXuatDTO {

    private String ma;
    private String maNL;
    private Float kl;

    public ChiTietPhieuXuatDTO(String ma, String maNL, Float kl) {
        this.ma = ma;
        this.maNL = maNL;
        this.kl = kl;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
        this.maNL = maNL;
    }

    public Float getKl() {
        return kl;
    }

    public void setKl(Float kl) {
        this.kl = kl;
    }

}
