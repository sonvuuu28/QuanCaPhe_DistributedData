package BUS;

import DAO.*;
import DTO.*;
import Util.JDBCUtil;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class n05_PhieuXuatBUS {

    public static n05_PhieuXuatBUS getInstance() {
        return new n05_PhieuXuatBUS();
    }

    public void setUpCTPX(JTable table, PhieuXuatDTO hd, JLabel nv, JLabel ngayLap) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        NhanVienDTO nhanVien = n02_HoaDonDAO.getInstance().searchNhanVienByMa(hd.getMaNV());
        ngayLap.setText("Ngày lập: " + Util.Utils.getInstance().SQLDateString_Transform_normalDateString(hd.getNgayLap() + ""));
        nv.setText("NV: " + nhanVien);
    }

    public void listCTPX(JTable table, PhieuXuatDTO px, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<ChiTietPhieuXuatDTO> ds = n05_XuatKhoDAO.getInstance().listAllCtpx(px.getMa());

        for (ChiTietPhieuXuatDTO dto : ds) {
            NguyenLieuDTO nl = n07_NguyenLieuDAO.getInstance().searchNguyenLieuByMa(dto.getMaNL(), maCN);
            model.addRow(new Object[]{dto.getMa(), nl.getTen(), dto.getKl(), nl.getDv()});
        }
    }

    public void listAll(JTable table, String ma) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<PhieuXuatDTO> ds = n05_XuatKhoDAO.getInstance().listAll(ma);

        for (PhieuXuatDTO dto : ds) {
            NhanVienDTO nv = n02_HoaDonDAO.getInstance().searchNhanVienByMa(dto.getMaNV());
            model.addRow(new Object[]{dto.getMa(), Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayLap()+""), nv});
        }
    }

    public void search(JTable table, JTextField ma, JDateChooser ngayBD, JDateChooser ngayKT, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        java.sql.Date ngayBDValue = ngayBD.getDate() != null ? new java.sql.Date(ngayBD.getDate().getTime()) : null;
        java.sql.Date ngayKTValue = ngayKT.getDate() != null ? new java.sql.Date(ngayKT.getDate().getTime()) : null;

        ArrayList<PhieuXuatDTO> ds
                = n05_XuatKhoDAO.getInstance().search(ma.getText(), ngayBDValue, ngayKTValue, maCN);

        for (PhieuXuatDTO dto : ds) {
            NhanVienDTO nv = n02_HoaDonDAO.getInstance().searchNhanVienByMa(dto.getMaNV());
            model.addRow(new Object[]{dto.getMa(), Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayLap()+""), nv});
        }
    }
    
    public PhieuXuatDTO searchPhieuXuatByMa(String ma) {
        return n05_XuatKhoDAO.getInstance().searchPhieuXuatByMa(ma);
    }
}
