package BUS;

import DAO.n08_CaLamDAO;
import DTO.CaLamDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class n08_CaLamBUS {

    public static n08_CaLamBUS getInstance() {
        return new n08_CaLamBUS();
    }

    public CaLamDTO searchCaLamByMa(String ma) {
        return n08_CaLamDAO.getInstance().searchCaLamByMa(ma);
    }

    public String createID() {
        return n08_CaLamDAO.getInstance().createID();
    }

    public boolean insert(String ma, String ten, java.sql.Time ThoiGianVao, java.sql.Time ThoiGianRa) {
        CaLamDTO dto = new CaLamDTO(ma, ten, ThoiGianVao, ThoiGianRa, true);
        int dao = n08_CaLamDAO.getInstance().insert(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Ca làm mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return true;
            default:
                JOptionPane.showMessageDialog(null, "Mã ca làm đã tồn tại.\n Để tạo mới, vui lòng tải lại trang!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    public int update(String ma, String ten, java.sql.Time ThoiGianVao, java.sql.Time ThoiGianRa, Boolean TrangThai) {
        CaLamDTO dto = new CaLamDTO(ma, ten, ThoiGianVao, ThoiGianRa, TrangThai);
        int dao = n08_CaLamDAO.getInstance().update(dto);
        switch (dao) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Cập nhật thông tin ca làm thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Không thể cập nhật thông tin ca làm.\n Vui lòng kiểm tra lại thông tin.",
                        "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thông tin ca làm không có thay đổi nào mới.\n Vui lòng kiểm tra lại dữ liệu đã nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        return dao;
    }

    public void listAll(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<CaLamDTO> ds = n08_CaLamDAO.getInstance().listAll();
        int i = 1;
        for (CaLamDTO dto : ds) {
            String trangThai = null;
            if (dto.isTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getTimeIn(), dto.getTimeOut(), trangThai});
            i++;
        }
    }

    public void search(JTable table, String ma, String ten, java.sql.Time ThoiGianVao, java.sql.Time ThoiGianRa, Boolean TrangThai) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<CaLamDTO> ds = n08_CaLamDAO.getInstance().search(ma, ten, ThoiGianVao, ThoiGianRa, TrangThai);
        int i = 1;
        for (CaLamDTO dto : ds) {
            String trangThai = null;
            if (dto.isTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getTimeIn(), dto.getTimeOut(), trangThai});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy ca làm phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void searchByName(JTable table, String ten) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<CaLamDTO> ds = n08_CaLamDAO.getInstance().search("", ten, null, null, null);
        int i = 1;
        for (CaLamDTO dto : ds) {
            String trangThai = null;
            if (dto.isTrangThai() == true) {
                trangThai = "Bật";
            } else {
                trangThai = "Tắt";
            }
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getTimeIn(), dto.getTimeOut(), trangThai});
            i++;
        }
        if (ds.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Rất tiếc, không tìm thấy ca làm phù hợp!",
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public boolean checkInput(JTextField ma, JTextField ten, JTextField hhThoiGianVao, JTextField mmThoiGianVao, JTextField hhThoiGianRa, JTextField mmThoiGianRa) {
        boolean check = true;

        if (ten.getText().equals("") && check) {
            ten.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (hhThoiGianVao.getText().equals("") && check) {
            hhThoiGianVao.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền giờ thời gian vào ca!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (check) {
            try {
                System.out.println(hhThoiGianVao.getText());
                int a = Integer.parseInt(hhThoiGianVao.getText());
                if (a >= 24) {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền giờ thời gian vào ca từ 00-> 23!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    check = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền giờ thời gian vào ca là số (hh)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                check = false;
            }
        }

        if (mmThoiGianVao.getText().equals("") && check) {
            mmThoiGianVao.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền phút thời gian vào ca!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (check) {

            try {
                int a = Integer.parseInt(mmThoiGianVao.getText());
                if (a >= 60) {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền phút thời gian vào ca từ 00-> 59!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    check = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền phút thời gian vào ca là số (mm)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                check = false;
            }
        }

        if (hhThoiGianRa.getText().equals("") && check) {
            hhThoiGianRa.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền giờ thời gian ra ca!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }
        if (check) {

            try {
                int a = Integer.parseInt(hhThoiGianRa.getText());
                if (a >= 24) {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền giờ thời gian vào ra từ 00-> 23!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    check = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền giờ thời gian ra ca là số (hh)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                check = false;
            }
        }

        if (mmThoiGianRa.getText().equals("") && check) {
            mmThoiGianRa.requestFocus();
            JOptionPane.showMessageDialog(null, "Vui lòng điền phút thời gian ra ca!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            check = false;
        }

        if (check) {
            try {
                int a = Integer.parseInt(mmThoiGianRa.getText());
                if (a >= 60) {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền phút thời gian ra ca từ 00-> 59!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    check = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng điền phút thời gian ra ca là số (mm)!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                check = false;
            }
        }

        return check;
    }
}
