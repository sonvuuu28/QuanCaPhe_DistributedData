package BUS;

import DAO.n11_NhanVienDAO;
import DAO.n11_PhanQuyenDAO;
import DAO.n11_TaiKhoanDAO;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class n11_TaiKhoanBUS {

    public static n11_TaiKhoanBUS getInstance() {
        return new n11_TaiKhoanBUS();
    }

    public String createID() {
        return n11_TaiKhoanDAO.getInstance().createID();
    }

    public boolean insert(String ma, String ten, String mk, String maPQ, String maNV, Boolean trangThai, String maCN) {
        TaiKhoanDTO dto = new TaiKhoanDTO(createID(), ten, mk, maPQ, maNV, trangThai, maCN);
        int dao = n11_TaiKhoanDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Tài khoản mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            default:
                JOptionPane.showMessageDialog(null, "Mã tài khoản đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String maTK, String maPQ, String matKhau) {
        int dao = n11_TaiKhoanDAO.getInstance().update(maTK, maPQ, matKhau);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin tài khoản thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin tài khoản.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin tài khoản không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public int batTat(String ma, boolean trangThai) {
        String thongBao;
        if (trangThai == true) {
            thongBao = "Bật";
        } else {
            thongBao = "Tắt";
        }

        int dao = n11_TaiKhoanDAO.getInstance().batTat(ma, trangThai);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "" + thongBao
                        + " tài khoản thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE
                );
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể " + thongBao
                        + " tài khoản.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE
                );
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin tài khoản không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public boolean checkInput(JTextField ten) {
        boolean check = true;

        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên đăng nhập!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        return check;
    }

    public void comboboxPhanQuyen(JComboBox<String> phanQuyen) {
        ArrayList<Object[]> ds = n11_TaiKhoanDAO.getInstance().listPhanQuyen();

        for (Object[] quyen : ds) {
            phanQuyen.addItem(quyen[1].toString()); // Lấy "Tên quyền" từ danh sách
        }
    }

    public TaiKhoanDTO searchTaiKhoanTheoMaNhanVien(String maNV) {
        TaiKhoanDTO tk = null;

        tk = n11_TaiKhoanDAO.getInstance().searchTaiKhoanTheoMaNhanVien(maNV);

        return tk;
    }

    public TaiKhoanDTO searchTaiKhoanTheoMaTaiKhoan(String maNV) {
        TaiKhoanDTO tk = null;

        tk = n11_TaiKhoanDAO.getInstance().searchTaiKhoanTheoMaTaiKhoan(maNV);

        return tk;
    }

    public String searchPhanQuyenTheoMa(String maPQ) {
        String tenPQ = null;

        tenPQ = n11_TaiKhoanDAO.getInstance().searchTenPhanQuyenTheoMa(maPQ);

        return tenPQ;
    }

    public String searchMaPQByName(String ten) {
        String ma = null;
        ma = n11_PhanQuyenDAO.getInstance().searchMaPQByName(ten);
        return ma;
    }

    public void searchNhanVienByMa(JLabel nv, String ma) {
        NhanVienDTO a = n11_NhanVienDAO.getInstance().searchNhanVienByMa(ma);
        nv.setText("NV: " + a.getTen());
    }

    public String searchMaChiNhanhByMaNhanVien(String maNV) {
        NhanVienDTO a = n11_NhanVienDAO.getInstance().searchNhanVienByMa(maNV);
        return a.getMaCN();
    }
}
