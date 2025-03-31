package BUS;

import DAO.n06_LoaiMonDAO;
import DTO.LoaiMonDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class n06_LoaiMonBUS {

    public static n06_LoaiMonBUS getInstance() {
        return new n06_LoaiMonBUS();
    }

    public String createID() {
        return n06_LoaiMonDAO.getInstance().createID();
    }

    public boolean insert(String ma, String ten, Boolean trangThai) {
        LoaiMonDTO dto = new LoaiMonDTO(ma, ten, trangThai);
        int dao = n06_LoaiMonDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Loại món mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            default:
                JOptionPane.showMessageDialog(null, "Mã loại món đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String ma, String ten, Boolean TrangThai) {
        LoaiMonDTO dto = new LoaiMonDTO(ma, ten, TrangThai);
        int dao = n06_LoaiMonDAO.getInstance().update(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin loại món thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin loại món.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin loại món không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public void listAll(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<LoaiMonDTO> ds = n06_LoaiMonDAO.getInstance().listAll();
        int i = 1;
        for (LoaiMonDTO dto : ds) {
            String trangThai = null;
            if (dto.isTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), trangThai});
            i++;
        }
    }

    public void search(JTable table, String ma, String ten, Boolean TrangThai) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<LoaiMonDTO> ds = n06_LoaiMonDAO.getInstance().search(ma, ten, TrangThai);
        int i = 1;
        for (LoaiMonDTO dto : ds) {
            String trangThai = null;
            if (dto.isTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), trangThai});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy loại món phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void searchByName(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<LoaiMonDTO> ds = n06_LoaiMonDAO.getInstance().search("", ten, null);
        int i = 1;
        for (LoaiMonDTO dto : ds) {
            String trangThai = null;
            if (dto.isTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), trangThai});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy loại món phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public boolean checkInput(JTextField ma, JTextField ten) {
        boolean check = true;

        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        return check;
    }
}
