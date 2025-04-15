package BUS;

import DAO.n11_NhanVienDAO;
import DTO.NhanVienDTO;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class n11_NhanVienBUS {

    public static n11_NhanVienBUS getInstance() {
        return new n11_NhanVienBUS();
    }

    public String createID() {
        return n11_NhanVienDAO.getInstance().createID();
    }

    public boolean insert(String ma, String ten, String gioiTinh, String sdt, Date ngaySinh,
            String chucVu, String diaChi, Long luong, Boolean trangThai, String maCN) {
        NhanVienDTO dto = new NhanVienDTO(ma, ten, gioiTinh, sdt, ngaySinh, chucVu, diaChi, luong, trangThai, maCN, null);
        int result = n11_NhanVienDAO.getInstance().insert(dto);

        if (result == 1) {
            JOptionPane.showMessageDialog(null, "Nhân viên mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Mã nhân viên đã tồn tại.\nVui lòng thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public int update(String ma, String ten, String gioiTinh, String sdt, Date ngaySinh,
            String chucVu, String diaChi, Long luong, Boolean trangThai, String maCN, Date ngayNghiViec) {
        System.out.println(ngayNghiViec);
        NhanVienDTO dto = new NhanVienDTO(ma, ten, gioiTinh, sdt, ngaySinh, chucVu, diaChi, luong, trangThai, maCN, ngayNghiViec);

        int result = n11_NhanVienDAO.getInstance().update(dto);
        switch (result) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin nhân viên thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin nhân viên.\nVui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Thông tin nhân viên không có thay đổi nào mới.\nVui lòng kiểm tra lại dữ liệu đã nhập!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return result;
    }

    public int batTat(String ma, Boolean trangThai) {
        int result = n11_NhanVienDAO.getInstance().batTat(ma, trangThai);
        String thongBao = trangThai ? "bật" : "tắt";
        switch (result) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        thongBao + " trạng thái thông tin nhân viên thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể " + thongBao + "  thông tin nhân viên.\nVui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Thông tin nhân viên không có thay đổi nào mới.\nVui lòng kiểm tra lại dữ liệu đã nhập!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return result;
    }

    public void listAll(JTable table, String MaChiNhanh) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        ArrayList<NhanVienDTO> ds = n11_NhanVienDAO.getInstance().listAll(MaChiNhanh);

        for (NhanVienDTO dto : ds) {
            String luong = Util.Utils.getInstance().LongToMoney(dto.getLuong());
            String ngaySinh = Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgaySinh().toString());
            String ngayNghiViec = (dto.getNgayNghiViec() != null)
                    ? Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayNghiViec().toString())
                    : "";

            model.addRow(new Object[]{
                dto.getMa(),
                dto.getTen(),
                dto.getGioiTinh(),
                dto.getSdt(),
                ngaySinh,
                dto.getChucVu(),
                dto.getDiaChi(),
                luong,
                dto.getTrangThai() ? "Đang làm" : "Nghỉ việc",
                dto.getMaCN(),
                ngayNghiViec
            });
        }
    }

    public void search(JTable table, String ma, String ten, String gioiTinh, String sdt, Date ngaySinh,
            String chucVu, String diaChi, Long luong, Boolean trangThai, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ trong bảng trước khi thêm mới

        ArrayList<NhanVienDTO> ds = n11_NhanVienDAO.getInstance().search(ma, ten, gioiTinh, sdt, ngaySinh,
                chucVu, diaChi, luong, trangThai, maCN);

        for (NhanVienDTO dto : ds) {
            String luongg = Util.Utils.getInstance().LongToMoney(dto.getLuong());
            String NgaySinh = Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgaySinh().toString());
            String ngayNghiViec = (dto.getNgayNghiViec() != null)
                    ? Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayNghiViec().toString())
                    : "";
            model.addRow(new Object[]{
                dto.getMa(),
                dto.getTen(),
                dto.getGioiTinh(),
                dto.getSdt(),
                NgaySinh,
                dto.getChucVu(),
                dto.getDiaChi(),
                luongg,
                dto.getTrangThai() ? "Đang làm" : "Nghỉ việc",
                dto.getMaCN(),
                ngayNghiViec
            });
        }

        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy nhân viên phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void searchByName(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        ArrayList<NhanVienDTO> ds = n11_NhanVienDAO.getInstance().searchByName(ten);

        for (NhanVienDTO dto : ds) {
            String luongg = Util.Utils.getInstance().LongToMoney(dto.getLuong());
            String NgaySinh = Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgaySinh().toString());
            String ngayNghiViec = (dto.getNgayNghiViec() != null)
                    ? Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayNghiViec().toString())
                    : "";
            model.addRow(new Object[]{
                dto.getMa(),
                dto.getTen(),
                dto.getGioiTinh(),
                dto.getSdt(),
                NgaySinh,
                dto.getChucVu(),
                dto.getDiaChi(),
                luongg,
                dto.getTrangThai() ? "Đang làm" : "Nghỉ việc",
                dto.getMaCN(),
                ngayNghiViec
            });
        }

        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy nhân viên phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public boolean checkInput(JTextField ma, JTextField ten, JComboBox gioiTinh, JTextField sdt, JDateChooser ngaySinh, JTextField diaChi,
            JTextField chucVu, JTextField luong, JComboBox chiNhanh) {
        boolean check = true;

        if (ma.getText().equals("") && check) {
            ma.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng tải lại trang để lấy mã!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (gioiTinh.getSelectedItem().toString().equals("None") && check) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
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

        if (ngaySinh.getDate() == null && check) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày sinh!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (ngaySinh.getDate().getTime() > System.currentTimeMillis() && check) {
            JOptionPane.showMessageDialog(null, "Ngày sinh không được lớn hơn ngày hiện tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -18);
        if (ngaySinh.getDate().getTime() > cal.getTimeInMillis() && check) {
            JOptionPane.showMessageDialog(null, "Nhân viên phải đủ 18 tuổi!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (diaChi.getText().equals("") && check) {
            diaChi.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền địa chỉ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (chucVu.getText().equals("") && check) {
            chucVu.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền chức vụ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (luong.getText().equals("") && check) {
            luong.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền lương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (check) {
            try {
                Long a = Util.Utils.getInstance().MoneyToLongNoneVND(luong.getText());
                if (a < 0) {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền lương là số dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    luong.requestFocus();
                    check = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền lương là số tự nhiên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                luong.requestFocus();
                check = false;
            }
        }

//        if (chiNhanh.getSelectedItem().toString().equals("None") && check) {
//            JOptionPane.showMessageDialog(null, "Vui lòng chọn chi nhánh!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//            check = false;
//        }
        return check;
    }

    public void comboBoxChiNhanh(JComboBox<String> ChiNhanh, String MaChiNhanh) {
        ChiNhanh.removeAllItems();

        ArrayList<String> ds = n11_NhanVienDAO.getInstance().listChiNhanh();

        if (MaChiNhanh == null) {
            ChiNhanh.addItem("Tổng");
        }
        for (String chiNhanh : ds) {
            ChiNhanh.addItem(chiNhanh);
        }
    }
    
    public void comboBoxChiNhanh_khongTong(JComboBox<String> ChiNhanh, String MaChiNhanh) {
        ChiNhanh.removeAllItems();

        ArrayList<String> ds = n11_NhanVienDAO.getInstance().listChiNhanh();

        for (String chiNhanh : ds) {
            ChiNhanh.addItem(chiNhanh);
        }
    }

}
