package BUS;

import DAO.n11_PhanQuyenDAO;
import DTO.PhanQuyenDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class n11_PhanQuyenBUS {

    public static n11_PhanQuyenBUS getInstance() {
        return new n11_PhanQuyenBUS();
    }

    public String createID() {
        return n11_PhanQuyenDAO.getInstance().createID();
    }

    public boolean insert(String ten, boolean BanHang, boolean KhachHang, boolean NhapHang, boolean XuatKho, boolean Mon,
            boolean NguyenLieu, boolean LichLam, boolean KM, boolean NCC, boolean NV,
            boolean TK) {
        PhanQuyenDTO dto = new PhanQuyenDTO(createID(), ten, BanHang, KhachHang, NhapHang, XuatKho, Mon, NguyenLieu, LichLam, KM, NCC, NV, TK, true);
        int dao = n11_PhanQuyenDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Phân quyền mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            default:
                JOptionPane.showMessageDialog(null, "Mã phân quyền đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String ma, String ten, boolean BanHang, boolean KhachHang, boolean NhapHang, boolean XuatKho, boolean Mon,
            boolean NguyenLieu, boolean LichLam, boolean KM, boolean NCC, boolean NV,
            boolean TK, boolean trangThai) {
        PhanQuyenDTO dto = new PhanQuyenDTO(ma, ten, BanHang, KhachHang, NhapHang, XuatKho, Mon, NguyenLieu, LichLam, KM, NCC, NV, TK, trangThai);

        int dao = n11_PhanQuyenDAO.getInstance().update(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin phân quyền thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin phân quyền.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin phân quyền không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public int batTat(String ma, boolean trangThai) {
        String thongBao;
        if (trangThai == true) {
            thongBao = "bật";
        } else {
            thongBao = "tắt";
        }

        int dao = n11_PhanQuyenDAO.getInstance().batTat(ma, trangThai);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "" + thongBao
                        + " phân quyền thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE
                );
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể " + thongBao
                        + " phân quyền.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE
                );
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin phân quyền không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public void listAll(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<PhanQuyenDTO> ds = n11_PhanQuyenDAO.getInstance().listAll();
        int i = 1;
        for (PhanQuyenDTO dto : ds) {
            model.addRow(new Object[]{dto.getMa(),
                dto.getTen(), booleanToString(dto.isBanHang()
                ), booleanToString(dto.isKhachHang()
                ), booleanToString(dto.isNhapHang()
                ), booleanToString(dto.isXuatKho()
                ),
                booleanToString(dto.isMon()
                ), booleanToString(dto.isNguyenLieu()
                ), booleanToString(dto.isLichLam()
                ), booleanToString(dto.isKhuyenMaiUuDai()
                ),
                booleanToString(dto.isNhaCungCap()
                ), booleanToString(dto.isNhanVien()
                ), booleanToString(dto.isThongKe()
                ), booleanToString(dto.isTrangThai()
                )}
            );
            i++;
        }
    }

    public String booleanToString(boolean bool) {
        String string;
        if (bool == true) {
            string = "Có";
        } else {
            string = "Không";
        }
        return string;
    }

    public boolean stringToBoolean(String str) {
        boolean bool;
        if (str.equals("Có")) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public boolean checkInput(JTextField ten) {
        boolean check = true;

        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        return check;
    }

}
