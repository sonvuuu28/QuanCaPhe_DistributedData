package BUS;

import DAO.n06_MonDAO;
import DTO.MonDTO;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class n06_MonBUS {

    public static n06_MonBUS getInstance() {
        return new n06_MonBUS();
    }

    public String createID() {
        return n06_MonDAO.getInstance().createID();
    }

    public void setUp(JTable table, JComboBox comboboxLoaiMon, JComboBox comboboxTrangThai) {
        comboboxTrangThai.removeAllItems();
        comboboxLoaiMon.removeAllItems();

        listAll(table);
        ArrayList<String> ds = n06_MonDAO.getInstance().listTenLoaiMon();
        comboboxLoaiMon.addItem("None");
        for (String a : ds) {
            comboboxLoaiMon.addItem(a);
        }
        comboboxTrangThai.addItem("None");
        comboboxTrangThai.addItem("Bật");
        comboboxTrangThai.addItem("Tắt");

    }

    public boolean insert(String ma, String ten, String hinhAnh, Long donGia, Boolean trangThai, String MaLoaiMon) {
        MonDTO dto = new MonDTO(ma, ten, hinhAnh, donGia, trangThai, MaLoaiMon);
        int dao = n06_MonDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Món mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            default:
                JOptionPane.showMessageDialog(null, "Mã món đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String ma, String ten, String hinhAnh, Long donGia, Boolean trangThai, String MaLoaiMon) {
        MonDTO dto = new MonDTO(ma, ten, hinhAnh, donGia, trangThai, MaLoaiMon);
        int dao = n06_MonDAO.getInstance().update(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin món thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin món.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin món không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public void listAll(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<MonDTO> ds = n06_MonDAO.getInstance().listAll();
        int i = 1;
        for (MonDTO dto : ds) {
            String trangThai = null;
            if (dto.getTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), Util.Utils.getInstance().LongToMoney(dto.getGia()), trangThai,
                n06_MonDAO.getInstance().searchTenLoaiMonByMa(dto.getMaLoaiMon())});
            i++;
        }
    }

    public void search(JTable table, String ma, String ten, Long gia, Boolean TrangThai, String MaLoaiMon) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<MonDTO> ds = n06_MonDAO.getInstance().search(ma, ten, gia, TrangThai, MaLoaiMon);
        int i = 1;
        for (MonDTO dto : ds) {
            String trangThai = null;
            if (dto.getTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), Util.Utils.getInstance().LongToMoney(dto.getGia()), trangThai,
                n06_MonDAO.getInstance().searchTenLoaiMonByMa(dto.getMaLoaiMon())});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy món phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void searchByName(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<MonDTO> ds = n06_MonDAO.getInstance().search(null, ten, null, null, null);
        int i = 1;
        for (MonDTO dto : ds) {
            String trangThai = null;
            if (dto.getTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), Util.Utils.getInstance().LongToMoney(dto.getGia()), trangThai,
                n06_MonDAO.getInstance().searchTenLoaiMonByMa(dto.getMaLoaiMon())});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy món phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public boolean checkInput(JTextField ma, JTextField ten, JTextField anh, JTextField gia, JComboBox trangThai, JComboBox loaiMon) {
        boolean check = true;

        if (ma.getText().equals("") && check) {
            ma.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng tải lại trang để lấy mã mới!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }
        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }
        if (anh.getText().equals("") && check) {
            anh.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ảnh!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }
        if (gia.getText().equals("") && check) {
            gia.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền đơn giá!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }
//        if (check) {
//            try {
//                Long a = Long.valueOf(gia.getText());
//                if (a < 0) {
//                    JOptionPane.showMessageDialog(null, "Vui lòng điền đơn giá là số dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//                    gia.requestFocus();
//                    check = false;
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Vui lòng điền đơn giá là số tự nhiên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//                gia.requestFocus();
//                check = false;
//            }
//        }
        try {
            if (trangThai.getSelectedItem().toString().equals("None") && check) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn trạng thái!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                check = false;
            }
        } catch (Exception e) {
        }
        if (loaiMon.getSelectedItem().toString().equals("None") && check) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn loại món!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        return check;
    }

    public String searchMaLoaiMonByTen(String ten) {
        return n06_MonDAO.getInstance().searchMaLoaiMonByTen(ten);
    }

    public String searchAnhMonByMa(String ma) {
        return n06_MonDAO.getInstance().searchAnhMonByMa(ma);
    }
}
