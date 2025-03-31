package BUS;

import DAO.*;
import DTO.*;
import Util.Utils;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class n04_PhieuNhapBUS {

    public static n04_PhieuNhapBUS getInstance() {
        return new n04_PhieuNhapBUS();
    }

    public void setUpCTPN(JTable table, String ma, JLabel nv, JLabel ncc, JLabel tongTienLbl, JLabel ngayLap) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        PhieuNhapDTO pn = n04_PhieuNhapDAO.getInstance().searchPhieuNhapByMa(ma);

        String tenNV = n04_NhapHangDAO.getInstance().searchNhanVienByMa(pn.getMaNV()).getTen();
        String tenNCC = n04_NhapHangDAO.getInstance().searchNCCByMa(pn.getMaNCC()).getTenNCC();
        Long tongTien = pn.getTongTien();
        ngayLap.setText("Ngày lập: " + Util.Utils.getInstance().SQLDateString_Transform_normalDateString(pn.getNgayLap() + ""));
        nv.setText("NV: " + tenNV);
        ncc.setText("NCC: " + tenNCC);
        tongTienLbl.setText("Tổng tiền: " + Utils.getInstance().LongToMoney(tongTien) + "");
    }

    public void listCTPN(JTable table, String ma) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<ChiTietPhieuNhapDTO> ds = n04_PhieuNhapDAO.getInstance().listAllCtpn(ma);

        for (ChiTietPhieuNhapDTO dto : ds) {
            String ten = n04_PhieuNhapDAO.getInstance().searchNguyenLieuByMa(dto.getMaNL()).getTen();
            model.addRow(new Object[]{dto.getMaPN(), ten, dto.getKl(), Utils.getInstance().LongToMoney(dto.getDonGia()),
                Utils.getInstance().LongToMoney(dto.getThanhTien())});
        }
    }

    public void listAll(JTable table, String ma) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<PhieuNhapDTO> ds = n04_PhieuNhapDAO.getInstance().listAll(ma);

        for (PhieuNhapDTO dto : ds) {
            NhanVienDTO nv = n04_NhapHangDAO.getInstance().searchNhanVienByMa(dto.getMaNV());
            NhaCungCapDTO ncc = n04_NhapHangDAO.getInstance().searchNCCByMa(dto.getMaNCC());

            model.addRow(new Object[]{dto.getMaPN(), Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayLap() + ""),
                nv, ncc,  Utils.getInstance().LongToMoney(dto.getTongTien())});
        }
    }

    public void search(JTable table, JTextField ma, JDateChooser ngayBD, JDateChooser ngayKT, JTextField giaTu, JTextField giaDen, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        Long giaTuL = null;
        Long giaDenL = null;
        java.sql.Date ngayBDValue = ngayBD.getDate() != null ? new java.sql.Date(ngayBD.getDate().getTime()) : null;
        java.sql.Date ngayKTValue = ngayKT.getDate() != null ? new java.sql.Date(ngayKT.getDate().getTime()) : null;

        if (!giaTu.getText().isEmpty()) {
            try {
                giaTuL = Long.valueOf(giaTu.getText());
            } catch (Exception e) {
            }
        }

        if (!giaDen.getText().isEmpty()) {
            try {
                giaDenL = Long.valueOf(giaDen.getText());
            } catch (Exception e) {
            }
        }

        ArrayList<PhieuNhapDTO> ds
                = n04_PhieuNhapDAO.getInstance().search(ma.getText(), ngayBDValue, ngayKTValue, giaTuL, giaDenL, maCN);

        for (PhieuNhapDTO dto : ds) {
            NhanVienDTO nv = n04_NhapHangDAO.getInstance().searchNhanVienByMa(dto.getMaNV());
            NhaCungCapDTO ncc = n04_NhapHangDAO.getInstance().searchNCCByMa(dto.getMaNCC());

            model.addRow(new Object[]{dto.getMaPN(), Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayLap() + ""),
                nv, ncc,  Utils.getInstance().LongToMoney(dto.getTongTien())});
        }
    }

}
