package BUS;

import DAO.*;
import DTO.*;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class n08_LichLamBUS {

    public static n08_LichLamBUS getInstance() {
        return new n08_LichLamBUS();
    }

    public boolean checkExistLichLam(Date date, String MaCN) {
        boolean dao = n08_LichLamDAO.getInstance().checkExistLichLam(date, MaCN);
        return dao;
    }

    public void listAllCa(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<CaLamDTO> ds = n08_LichLamDAO.getInstance().listAllCa();
        int i = 1;
        for (CaLamDTO dto : ds) {
            model.addRow(new Object[]{dto.getMa(), dto.getTen(), dto.getTimeIn(), dto.getTimeOut()});
            i++;
        }
    }

    //JFrame XẾP LỊCH LÀM 
    public void setUp_XepLichLamGUI(JLabel start, JLabel end, JTable table, String MaCN) {
        Date date = Date.valueOf(LocalDate.now());
        setLabel_StartEndDate(start, end, date);
        setHeaderTable_StartEndDate(table, date);
        listAll(table, date, MaCN);
    }

    public void setUp_XepLichLamGUI_combobox(JComboBox nv, JComboBox<CaLamDTO> t2, JComboBox<CaLamDTO> t3, JComboBox<CaLamDTO> t4,
            JComboBox<CaLamDTO> t5, JComboBox<CaLamDTO> t6, JComboBox<CaLamDTO> t7, JComboBox<CaLamDTO> cn) {
        ArrayList<NhanVienDTO> dsNV = n08_LichLamDAO.getInstance().listNhanVien();
        ArrayList<CaLamDTO> dsCa = n08_LichLamDAO.getInstance().listCaLam();

        for (NhanVienDTO dto : dsNV) {
            nv.addItem(dto);
        }
        JComboBox<CaLamDTO>[] comboBoxes = new JComboBox[]{t2, t3, t4, t5, t6, t7, cn};

        for (JComboBox<CaLamDTO> cb : comboBoxes) {
            for (CaLamDTO dto : dsCa) {
                cb.addItem(dto);
            }
        }
    }

    public boolean insert(Date date, String MaCN) {
        boolean dao = n08_LichLamDAO.getInstance().insert(date, MaCN);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Tạo tuần làm thành công!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Thêm lịch làm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean update(Date date, NhanVienDTO nv, List<CaLamDTO> dsCa) {
        boolean dao = n08_LichLamDAO.getInstance().update(date, nv.getMa(), dsCa);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Chỉnh lịch làm thành công cho "
                    + nv.getTen() + "!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Thêm lịch làm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean checkInput(JDateChooser dateChooser) {
        boolean check = true;

        if (check) {
            try {
                Date dateChoiceOfUser = new Date(dateChooser.getDate().getTime());
                if (dateChoiceOfUser.before(Date.valueOf(LocalDate.now().plusDays(1)))) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày tương lai!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    check = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày của tuần cần xếp!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                check = false;
            }
        }

        return check;
    }

    //JFrame LỊCH LÀM 
    public void setUp(JLabel start, JLabel end, JTable table, String MaCN) {
        Date date = Date.valueOf(LocalDate.now());
        setLabel_StartEndDate(start, end, date);
        setHeaderTable_StartEndDate(table, date);
        listAll(table, date, MaCN);
    }

    public void setLabel_StartEndDate(JLabel start, JLabel end, Date date) {
        List<Date> ds = Util.Utils.getInstance().getDate_DaysInWeek(date);
        start.setText(Util.Utils.getInstance().SQLDateString_Transform_normalDateString(ds.get(0) + ""));
        end.setText(Util.Utils.getInstance().SQLDateString_Transform_normalDateString(ds.get(6) + ""));
    }

    public void setHeaderTable_StartEndDate(JTable table, Date date) {
        LocalDate specificDate = date.toLocalDate();
        LocalDate thu2 = specificDate.with(DayOfWeek.MONDAY);

        // Định dạng ngày theo "dd/MM"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");

        List<String> headers = new ArrayList<>();
        headers.add("Nhân Viên");
        for (int i = 0; i < 7; i++) {
            LocalDate currentDay = thu2.plusDays(i); // Thêm i ngày vào ngày thứ Hai
            String formattedDate = currentDay.format(formatter); // Định dạng ngày
            if (i != 6) {
                headers.add("T" + (i + 2) + " " + formattedDate); // Thêm vào danh sách, ví dụ: T2 25/11
            } else {
                headers.add("CN" + " " + formattedDate); // Thêm vào danh sách, ví dụ: T2 25/11
            }
        }

        String[] columnNames = headers.toArray(new String[0]);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setColumnIdentifiers(columnNames);
    }

    public void listAll(JTable table, Date date, String MaCN) {
        Date Monday = Util.Utils.getInstance().getDate_DaysInWeek(date).get(0);
        ArrayList<String> ds = n08_LichLamDAO.getInstance().listAll(Monday, MaCN);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (String row : ds) {
            String[] rowData = row.split(", ");
            model.addRow(rowData);
        }
    }

}