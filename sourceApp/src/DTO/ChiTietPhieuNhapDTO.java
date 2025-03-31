package DTO;

public class ChiTietPhieuNhapDTO {

    private String maPN;
    private String maNL;
    private Long DonGia;
    private Long ThanhTien;
    private Float kl;

    public ChiTietPhieuNhapDTO(String maPN, String maNL, Float kl, Long DonGia, Long ThanhTien) {
        this.maPN = maPN;
        this.maNL = maNL;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
        this.kl = kl;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
        this.maNL = maNL;
    }

    public Long getDonGia() {
        return DonGia;
    }

    public void setDonGia(Long DonGia) {
        this.DonGia = DonGia;
    }

    public Long getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Long ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public Float getKl() {
        return kl;
    }

    public void setKl(Float kl) {
        this.kl = kl;
    }

}
