package BUS;

import DAO.n04_NhapHangDAO;
import DAO.n07_NguyenLieuDAO;
import DTO.ChiTietPhieuNhapDTO;
import DTO.NguyenLieuDTO;
import DTO.PhieuNhapDTO;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.*;
import javax.swing.table.*;
import Util.Utils;
import java.math.BigDecimal;
import java.time.LocalDate;

public class n04_NhapHangBUS {

    public static n04_NhapHangBUS getInstance() {
        return new n04_NhapHangBUS();
    }

    public String createID() {
        return n04_NhapHangDAO.getInstance().createID();
    }

    public void listCart(JTable table, ArrayList<ChiTietPhieuNhapDTO> dsCart, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int i = 1;
        for (ChiTietPhieuNhapDTO dto : dsCart) {
            String ten = n07_NguyenLieuDAO.getInstance().searchNguyenLieuByMa(dto.getMaNL(), maCN).getTen();
            String donVi = n07_NguyenLieuDAO.getInstance().searchNguyenLieuByMa(dto.getMaNL(), maCN).getDv();
            model.addRow(new Object[]{i, ten, dto.getKl(), donVi, Utils.getInstance().LongToMoney(dto.getDonGia()),
                Utils.getInstance().LongToMoney(dto.getThanhTien())});
            i++;
        }
    }

    public String setMaNCC(String ma) {
        return n04_NhapHangDAO.getInstance().searchNCCByMa(ma).getTenNCC();
    }

    public void setUp_n04_NhapHang_ThanhToanGUI(JLabel MaPN, JLabel ngayLap, JLabel nv, JLabel tongTienLbl, String maNV, Long tongTien) {
        MaPN.setText(n04_NhapHangDAO.getInstance().createID());
        ngayLap.setText(Utils.getInstance().SQLDateString_Transform_normalDateString(new Date(System.currentTimeMillis()) + ""));
        nv.setText(n04_NhapHangDAO.getInstance().searchNhanVienByMa(maNV).getTen());

        tongTienLbl.setText(Utils.getInstance().LongToMoney(tongTien));
    }

    public void listAll_KhoHang(JTable table, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<NguyenLieuDTO> ds = n04_NhapHangDAO.getInstance().listAll_KhoHang(maCN);
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

    public Long tinhTongTien(JTable gioHang) {
        int rows = gioHang.getRowCount();
        Long tongTien = 0L;
        TableModel model = gioHang.getModel();

        for (int i = 0; i < rows; i++) {
            tongTien = tongTien + Long.valueOf(model.getValueAt(i, 5).toString());

        }
        return tongTien;
    }

    public boolean insert(String ma, Long tongTien, String maNV, String maNCC, String maCN) {
        PhieuNhapDTO dto = new PhieuNhapDTO(ma, Date.valueOf(LocalDate.now()), tongTien, maNV, maNCC, maCN);
        Boolean dao = n04_NhapHangDAO.getInstance().insert(dto);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Phiếu nhập mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Tạo phiếu nhập thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public void insertCTPX(ArrayList<ChiTietPhieuNhapDTO> ds) {
        n04_NhapHangDAO.getInstance().insertCTPN(ds);
    }
}
