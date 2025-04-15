package BUS;

import DAO.n01_TrangChuDAO;
import DTO.NhanVienDTO;
import javax.swing.*;

public class n01_TrangChuBUS {

    public static n01_TrangChuBUS getInstance() {
        return new n01_TrangChuBUS();
    }

    public void searchChiNhanhTheoMaChiNhanh(JLabel label, String ma) {
        String tenCN = "Tổng";
        try {
            tenCN = n01_TrangChuDAO.getInstance().searchChiNhanhTheoMaChiNhanh(ma).getTen();
            label.setText("CN: " + n01_TrangChuDAO.getInstance().searchChiNhanhTheoMaChiNhanh(ma).getTen());
        } catch (Exception e) {
            label.setText("CN: " + tenCN);
        }
    }

    public void searchNhanVienByMa(JLabel tenNV, JLabel tennv, JLabel chucVu, String ma) {
        NhanVienDTO dto = n01_TrangChuDAO.getInstance().searchNhanVienByMa(ma);
        String name = dto.getTen();
        if (name.length() > 14) {
            name = name.substring(name.length() - 11, name.length());
            name = "... " + name;
        }
        tenNV.setText(name);
        tennv.setText(name);
        chucVu.setText(dto.getChucVu());
    }

}
