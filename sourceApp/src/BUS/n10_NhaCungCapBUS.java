package BUS;

import DAO.n10_NhaCungCapDAO;
import DTO.NhaCungCapDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class n10_NhaCungCapBUS {

    public static n10_NhaCungCapBUS getInstance() {
        return new n10_NhaCungCapBUS();
    }

    public String createID() {
        return n10_NhaCungCapDAO.getInstance().createID();
    }

    public boolean insert(String ma, String ten, String diaChi, String sdt) {
        NhaCungCapDTO dto = new NhaCungCapDTO(ma, ten, diaChi, sdt);
        int dao = n10_NhaCungCapDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Nhà cung cấp mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            case 2:
                JOptionPane.showMessageDialog(null, "Số điện thoại đã được đăng ký cho nhà cung cấp khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
            default:
                JOptionPane.showMessageDialog(null, "Mã nhà cung cấp đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String ma, String ten, String diachi, String sdt) {
        NhaCungCapDTO dto = new NhaCungCapDTO(ma, ten, diachi, sdt);
        int dao = n10_NhaCungCapDAO.getInstance().update(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin nhà cung cấp thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin nhà cung cấp.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin nhà cung cấp không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public void listAll(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NhaCungCapDTO> ds = n10_NhaCungCapDAO.getInstance().listAll();
        int i = 1;
        for (NhaCungCapDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaNCC(), dto.getTenNCC(), dto.getDiaChi(), dto.getSDT()});
            i++;
        }
    }

    public void search(JTable table, String ma, String ten, String diaChi, String sdt) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NhaCungCapDTO> ds = n10_NhaCungCapDAO.getInstance().search(ma, ten, diaChi, sdt);
        int i = 1;
        for (NhaCungCapDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaNCC(), dto.getTenNCC(), dto.getDiaChi(), dto.getSDT()});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy nhà cung cấp phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void searchByName(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NhaCungCapDTO> ds = n10_NhaCungCapDAO.getInstance().search("", ten, "", "");
        int i = 1;
        for (NhaCungCapDTO dto : ds) {
            model.addRow(new Object[]{dto.getMaNCC(), dto.getTenNCC(), dto.getDiaChi(), dto.getSDT()});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy nhà cung cấp phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public boolean checkInput(JTextField ma, JTextField ten, JTextField diachi, JTextField sdt) {
        boolean check = true;

        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (diachi.getText().equals("") && check) {
            diachi.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền địa chỉ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (sdt.getText().equals("") && check) {
            sdt.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền số điện thoại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        return check;
    }
}
