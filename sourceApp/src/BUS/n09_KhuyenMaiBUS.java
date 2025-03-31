package BUS;

import DAO.n09_KhuyenMaiDAO;
import DTO.KhuyenMaiDTO;
import Util.Utils;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class n09_KhuyenMaiBUS {

    public static n09_KhuyenMaiBUS getInstance() {
        return new n09_KhuyenMaiBUS();
    }

    public String createID() {
        return n09_KhuyenMaiDAO.getInstance().createID();
    }

    public boolean insert(String ma, String ten, int phanTram, Date ngayBatDau, Date ngayKetThuc, Long chiTieu, Boolean isMember) {
        KhuyenMaiDTO dto = new KhuyenMaiDTO(ma, ten, phanTram, ngayBatDau, ngayKetThuc, chiTieu, isMember);
        int dao = n09_KhuyenMaiDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mã khuyến mãi mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            default:
                JOptionPane.showMessageDialog(null, "Mã khuyến mãi đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String ma, String ten, int phanTram, Date ngayBatDau, Date ngayKetThuc, Long chiTieu, Boolean isMember) {
        KhuyenMaiDTO dto = new KhuyenMaiDTO(ma, ten, phanTram, ngayBatDau, ngayKetThuc, chiTieu, isMember);
        int dao = n09_KhuyenMaiDAO.getInstance().update(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin khuyến mãi thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin khuyến mãi.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin khuyến mãi không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public void listAll(JTable table, Boolean isMem) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhuyenMaiDTO> ds = n09_KhuyenMaiDAO.getInstance().listAll(isMem);
        int i = 1;
        for (KhuyenMaiDTO dto : ds) {
            String hieuLuc = null;
            if (dto.getNgayBatDau().getTime() <= System.currentTimeMillis() && dto.getNgayKetThuc().getTime() >= System.currentTimeMillis()) {
                hieuLuc = "Có hiệu lực";
            } else {
                hieuLuc = "Không hiệu lực";
            }

            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getNgayBatDau(), dto.getNgayKetThuc(), dto.getPhanTram(),
                Utils.getInstance().LongToMoney(dto.getChiTieu()), hieuLuc});
            i++;
        }
    }

    public void search(JTable table, String ma, String ten, Integer phanTram, Date ngayBatDau, Date ngayKetThuc, Long chiTieu, Boolean isMember) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhuyenMaiDTO> ds = n09_KhuyenMaiDAO.getInstance().search(ma, ten, phanTram, ngayBatDau, ngayKetThuc, chiTieu, isMember);
        int i = 1;
        for (KhuyenMaiDTO dto : ds) {
            String hieuLuc = null;
            if (dto.getNgayBatDau().getTime() <= System.currentTimeMillis() && dto.getNgayKetThuc().getTime() >= System.currentTimeMillis()) {
                hieuLuc = "Có hiệu lực";
            } else {
                hieuLuc = "Không hiệu lực";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getNgayBatDau(), dto.getNgayKetThuc(), dto.getPhanTram(),
                Utils.getInstance().LongToMoney(dto.getChiTieu()), hieuLuc});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy khuyến mãi phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void searchByName(JTable table, String ten, Boolean isMember) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<KhuyenMaiDTO> ds = n09_KhuyenMaiDAO.getInstance().search("", ten, null, null, null, null, isMember);
        int i = 1;
        for (KhuyenMaiDTO dto : ds) {
            String hieuLuc = null;
            if (dto.getNgayBatDau().getTime() <= System.currentTimeMillis() && dto.getNgayKetThuc().getTime() >= System.currentTimeMillis()) {
                hieuLuc = "Có hiệu lực";
            } else {
                hieuLuc = "Không hiệu lực";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getNgayBatDau(), dto.getNgayKetThuc(), dto.getPhanTram(),
                Utils.getInstance().LongToMoney(dto.getChiTieu()), hieuLuc});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy khuyến mãi phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public boolean checkInput(JTextField ma, JTextField ten, JTextField phanTram, JDateChooser ngayBatDau, JDateChooser ngayKetThuc, JTextField chiTieu) {
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

        if (ngayBatDau.getDate() == null && check) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày bắt đầu áp dụng chương trình!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (ngayKetThuc.getDate() == null && check) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày kết thúc áp dụng chương trình!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (ngayBatDau.getDate().getTime() > ngayKetThuc.getDate().getTime() && check) {
            JOptionPane.showMessageDialog(null, "Ngày kết thúc phải lớn hơn ngày bắt đầu chương trình!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (ngayKetThuc.getDate().getTime() <= System.currentTimeMillis() && check) {
            JOptionPane.showMessageDialog(null, "Ngày kết thúc áp dụng chương trình phải lớn hơn ngày hiện tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (phanTram.getText().equals("") && check) {
            phanTram.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền phần trăm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (check) {
            try {
                Integer a = Integer.valueOf(phanTram.getText());
                if (a > 100 || a < 0) {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền phần trăm là số tự nhiên từ 0 -> 100!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    phanTram.requestFocus();
                    check = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền phần trăm là số tự nhiên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                phanTram.requestFocus();
                check = false;
            }
        }

        if (chiTieu.getText().equals("") && check) {
            chiTieu.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền chi tiêu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        return check;
    }
}
