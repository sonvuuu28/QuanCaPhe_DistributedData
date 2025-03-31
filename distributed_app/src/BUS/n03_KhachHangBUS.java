package BUS;

import DAO.n03_KhachHangDAO;
import DTO.KhachHangDTO;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class n03_KhachHangBUS {

    public static n03_KhachHangBUS getInstance() {
        return new n03_KhachHangBUS();
    }

    public String createID() {
        return n03_KhachHangDAO.getInstance().createID();
    }

    public boolean insert(String ma, String ten, Date ngaysinh, String gioitinh, String sdt) {
        KhachHangDTO dto = new KhachHangDTO(ma, ten, ngaysinh, gioitinh, 0, sdt);
        int dao = n03_KhachHangDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mã khách hàng mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            case 2:
                JOptionPane.showMessageDialog(null, "Số điện thoại đã được đăng ký cho khách hàng khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
            default:
                JOptionPane.showMessageDialog(null, "Mã khách hàng đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String ma, String ten, Date ngaysinh, String gioitinh, Long chiTieu, String sdt) {
        KhachHangDTO dto = new KhachHangDTO(ma, ten, ngaysinh, gioitinh, chiTieu, sdt);
        int dao = n03_KhachHangDAO.getInstance().update(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin khách hàng thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin khách hàng.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin khách hàng không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public void listAll(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhachHangDTO> ds = n03_KhachHangDAO.getInstance().listAll();
        int i = 1;
        for (KhachHangDTO dto : ds) {
            String chitieu = Util.Utils.getInstance().LongToMoney(dto.getChiTieu());
            model.addRow(new Object[]{dto.getMaKhachHang(), dto.getTenKhachHang(), dto.getGioiTinh(), dto.getSDT(), dto.getNgaySinh(), chitieu});
            i++;
        }
    }

    public void search(JTable table, String ma, String ten, Date ngaysinh, String gioitinh, Long chiTieu, String sdt) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhachHangDTO> ds = n03_KhachHangDAO.getInstance().search(ma, ten, ngaysinh, gioitinh, chiTieu, sdt);
        int i = 1;
        for (KhachHangDTO dto : ds) {
            String chitieu = Util.Utils.getInstance().LongToMoney(dto.getChiTieu());
            model.addRow(new Object[]{dto.getMaKhachHang(), dto.getTenKhachHang(), dto.getGioiTinh(), dto.getSDT(), dto.getNgaySinh(), chitieu});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy khách hàng phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void searchByName(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhachHangDTO> ds = n03_KhachHangDAO.getInstance().search("", ten, null, "", null, "");
        int i = 1;
        for (KhachHangDTO dto : ds) {
            String chitieu = Util.Utils.getInstance().LongToMoney(dto.getChiTieu());
            model.addRow(new Object[]{dto.getMaKhachHang(), dto.getTenKhachHang(), dto.getGioiTinh(), dto.getSDT(), dto.getNgaySinh(), chitieu});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy khách hàng phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public boolean checkInput(JTextField ma, JTextField ten, JComboBox gioiTinh, JDateChooser ngaysinh, JTextField sdt) {
        boolean check = true;

        if (ma.getText().equals("") && check) {
            ma.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tải lại trang để lấy mã!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (sdt.getText().equals("") && check) {
            sdt.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền số điện thoại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (!sdt.getText().matches("^0\\d{9}$") && check) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số điện thoại có 10 số và bắt đầu là số 0 !", "FAIL", JOptionPane.ERROR_MESSAGE);
            sdt.requestFocus();
            check = false;
        }

        if (gioiTinh.getSelectedItem().toString().equals("None") && check) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (ngaysinh.getDate() == null && check) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày sinh!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (ngaysinh.getDate().getTime() > System.currentTimeMillis()) {
            JOptionPane.showMessageDialog(null, "Ngày sinh không được lớn hơn ngày hiện tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        return check;
    }
}
