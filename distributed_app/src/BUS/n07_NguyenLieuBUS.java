package BUS;

import DAO.n07_NguyenLieuDAO;
import DTO.NguyenLieuDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class n07_NguyenLieuBUS {

    public static n07_NguyenLieuBUS getInstance() {
        return new n07_NguyenLieuBUS();
    }

    public String createID() {
        return n07_NguyenLieuDAO.getInstance().createID();
    }

    public boolean insert(String Ma, String Ten, Float kl, String donVi, Boolean TrangThai, String maCN) {
        NguyenLieuDTO dto = new NguyenLieuDTO(Ma, Ten, 0F, donVi, TrangThai, maCN);
        int dao = n07_NguyenLieuDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Nguyên liệu mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            default:
                JOptionPane.showMessageDialog(null, "Mã nguyên liệu đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String Ma, String Ten, Float kl, String donVi, Boolean TrangThai, String maCN) {
        System.out.println(kl);

        NguyenLieuDTO dto = new NguyenLieuDTO(Ma, Ten, kl, donVi, TrangThai, maCN);
        int dao = n07_NguyenLieuDAO.getInstance().update(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin nguyên liệu thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin nguyên liệu.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin nguyên liệu không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public void listAll(JTable table, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NguyenLieuDTO> ds = n07_NguyenLieuDAO.getInstance().listAll(maCN);
        int i = 1;
        for (NguyenLieuDTO dto : ds) {
            String status;
            if (dto.getTrangThai() == true) {
                status = "Bật";
            } else {
                status = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getKl(), dto.getDv(), status});
            i++;
        }
    }

    public void search(JTable table, String Ma, String Ten, Float kl, String donVi, Boolean TrangThai, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NguyenLieuDTO> ds = n07_NguyenLieuDAO.getInstance().search(Ma, Ten, null, donVi, TrangThai, maCN);
        int i = 1;
        for (NguyenLieuDTO dto : ds) {
            String status;
            if (dto.getTrangThai() == true) {
                status = "Bật";
            } else {
                status = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getKl(), dto.getDv(), status});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy nguyên liệu phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void searchByName(JTable table, String ten, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NguyenLieuDTO> ds = n07_NguyenLieuDAO.getInstance().search(null, ten, null, null, null, maCN);
        int i = 1;
        for (NguyenLieuDTO dto : ds) {
            String status;
            if (dto.getTrangThai() == true) {
                status = "Bật";
            } else {
                status = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getKl(), dto.getDv(), status});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy nguyên liệu phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public boolean checkInput(JTextField ten, JTextField donVi) {
        boolean check = true;

        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (donVi.getText().equals("") && check) {
            donVi.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền đơn vị!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }
        return check;
    }
}
