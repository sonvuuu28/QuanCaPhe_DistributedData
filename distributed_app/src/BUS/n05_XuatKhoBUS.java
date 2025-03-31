package BUS;

import DAO.*;
import DTO.*;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.*;
import javax.swing.table.*;
import Util.Utils;
import java.math.BigDecimal;
import java.time.LocalDate;

public class n05_XuatKhoBUS {

    public static n05_XuatKhoBUS getInstance() {
        return new n05_XuatKhoBUS();
    }

    public String CreateID() {
        return n05_XuatKhoDAO.getInstance().createID();
    }

    public void setUp_n05_XuatKho_ThanhToanGUI(JLabel MaPN, JLabel ngayLap, JLabel nv, String maNV) {
        MaPN.setText(n05_XuatKhoDAO.getInstance().createID());
        ngayLap.setText(Utils.getInstance().SQLDateString_Transform_normalDateString(new Date(System.currentTimeMillis()) + ""));
        nv.setText(n05_XuatKhoDAO.getInstance().searchNhanVienByMa(maNV).getTen());
    }

    public void listAll_KhoHang(JTable table, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NguyenLieuDTO> ds = n05_XuatKhoDAO.getInstance().listAll_KhoHang(maCN);
        int i = 1;
        for (NguyenLieuDTO dto : ds) {
            String status;
            if (BigDecimal.valueOf(dto.getKl()).compareTo(BigDecimal.ZERO) == 0) {
                status = "Hết";
            } else if (dto.getKl() < 10) {
                status = "Sắp hết";
            } else {
                status = "Đầy đủ";
            }
            model.addRow(new Object[]{dto.getMa(), dto, dto.getKl(), dto.getDv(), status});
            i++;
        }
    }

    public void listCart(JTable table, ArrayList<ChiTietPhieuXuatDTO> dsCart, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int i = 1;
        for (ChiTietPhieuXuatDTO dto : dsCart) {
            String ten = n07_NguyenLieuDAO.getInstance().searchNguyenLieuByMa(dto.getMaNL(), maCN).getTen();
            String donVi = n07_NguyenLieuDAO.getInstance().searchNguyenLieuByMa(dto.getMaNL(), maCN).getDv();
            model.addRow(new Object[]{i, ten, dto.getKl(), donVi});
            i++;
        }
    }

    public void searchByName(JTable table, String ten, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NguyenLieuDTO> ds = n07_NguyenLieuDAO.getInstance().search(null, ten, null, null, true, maCN);
        int i = 1;
        for (NguyenLieuDTO dto : ds) {
            String status;
            if (dto.getKl() < 10) {
                status = "Sắp hết";
            } else if (dto.getKl() == 0) {
                status = "Hết";
            } else {
                status = "Đầy đủ";
            }
            model.addRow(new Object[]{dto.getMa(), dto, dto.getKl(), dto.getDv(), status});
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

    public boolean insert(String ma, String maNV, String maCN) {
        PhieuXuatDTO dto = new PhieuXuatDTO(ma, Date.valueOf(LocalDate.now()), maNV, maCN);
        Boolean dao = n05_XuatKhoDAO.getInstance().insert(dto);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Phiếu xuất kho mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Tạo phiếu xuất kho thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public void insertCTPX(ArrayList<ChiTietPhieuXuatDTO> ds, String maCN) {
        n05_XuatKhoDAO.getInstance().insertChiTietPhieuXuat(ds, maCN);
    }

}
