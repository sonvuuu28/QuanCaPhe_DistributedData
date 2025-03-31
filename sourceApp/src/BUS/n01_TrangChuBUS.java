package BUS;

import DAO.n01_TrangChuDAO;
import DTO.NhanVienDTO;
import javax.swing.*;

public class n01_TrangChuBUS {

    public static n01_TrangChuBUS getInstance() {
        return new n01_TrangChuBUS();
    }

    public void searchChiNhanhTheoMaChiNhanh(JLabel label, String ma) {
        label.setText("CN: " + n01_TrangChuDAO.getInstance().searchChiNhanhTheoMaChiNhanh(ma).getTen());
    }

    public void searchNhanVienByMa(JLabel tenNV, JLabel tennv, JLabel chucVu, String ma) {
        NhanVienDTO dto = n01_TrangChuDAO.getInstance().searchNhanVienByMa(ma);
        tenNV.setText(dto.getTen());
        tennv.setText(dto.getTen());
        chucVu.setText(dto.getChucVu());
    }

}
