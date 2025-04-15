package BUS;

import DAO.n02_HoaDonDAO;
import DTO.ChiTietHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.KhuyenMaiDTO;
import DTO.NhanVienDTO;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class n02_HoaDonBUS {

    public static n02_HoaDonBUS getInstance() {
        return new n02_HoaDonBUS();
    }

    public String CreateID() {
        return n02_HoaDonDAO.getInstance().createID();
    }

    public void setUpCTHD(JTable table, HoaDonDTO hd, JLabel nv, JLabel kh, JLabel tongTienLbl, JLabel ngayLap, JLabel cn) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        NhanVienDTO nhanVien = n02_HoaDonDAO.getInstance().searchNhanVienByMa(hd.getMaNV());
        KhachHangDTO khachHang = n02_HoaDonDAO.getInstance().searchKhachHangByMa(hd.getMaKH());
        Long tongTien = hd.getTongTien();
        ngayLap.setText("Ngày lập: " + Util.Utils.getInstance().SQLDateString_Transform_normalDateString(hd.getNgayLap() + ""));
        nv.setText(nhanVien.toString());
        try {
            kh.setText(khachHang.toString());
        } catch (Exception e) {
            kh.setText("");
        }
        cn.setText(hd.getMaCN());
        tongTienLbl.setText("Tổng tiền: " + Util.Utils.getInstance().LongToMoney(tongTien) + "");
    }

    public void listCTHD(JTable table, HoaDonDTO hd) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<ChiTietHoaDonDTO> ds = n02_HoaDonDAO.getInstance().listAllCthd(hd.getMa());

        for (ChiTietHoaDonDTO dto : ds) {
            String ten = n02_HoaDonDAO.getInstance().searchMonByMa(dto.getMaMon()).getTen();
            model.addRow(new Object[]{dto.getMa(), ten, dto.getSoLuong(), Util.Utils.getInstance().LongToMoney(dto.getDonGia()),
                Util.Utils.getInstance().LongToMoney(dto.getThanhTien())});
        }
    }

//    public void listAll(JTable table, String ma) {
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        model.setRowCount(0);
//        ArrayList<HoaDonDTO> ds = n02_HoaDonDAO.getInstance().listAll(ma);
//
//        for (HoaDonDTO dto : ds) {
//            NhanVienDTO nv = n02_HoaDonDAO.getInstance().searchNhanVienByMa(dto.getMaNV());
//            KhachHangDTO kh = n02_HoaDonDAO.getInstance().searchKhachHangByMa(dto.getMaKH());
//            KhuyenMaiDTO km = n02_HoaDonDAO.getInstance().searchKhuyenMaiByMa(dto.getMaKM());
//            KhuyenMaiDTO kmMember = n02_HoaDonDAO.getInstance().searchKhuyenMaiByMa(dto.getMaKMMember());
//
//            model.addRow(new Object[]{dto.getMa(), Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayLap().toString()),
//                nv, kh, km, kmMember, Util.Utils.getInstance().LongToMoney(dto.getTongTien())});
//        }
//    }
    public void listAll(JTable table, String ma) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<HoaDonDTO> ds = n02_HoaDonDAO.getInstance().listAll(ma);

        // Tải map cache
        Map<String, NhanVienDTO> mapNV = n02_HoaDonDAO.getInstance().getAllNhanVien();
        Map<String, KhachHangDTO> mapKH = n02_HoaDonDAO.getInstance().getAllKhachHang();
        Map<String, KhuyenMaiDTO> mapKM = n02_HoaDonDAO.getInstance().getAllKhuyenMai();

        for (HoaDonDTO dto : ds) {
            NhanVienDTO nv = mapNV.get(dto.getMaNV());
            KhachHangDTO kh = mapKH.get(dto.getMaKH());
            KhuyenMaiDTO km = mapKM.get(dto.getMaKM());
            KhuyenMaiDTO kmMember = mapKM.get(dto.getMaKMMember());

            model.addRow(new Object[]{
                dto.getMa(),
                Util.Utils.getInstance().SQLDateString_Transform_normalDateString(dto.getNgayLap().toString()),
                nv, kh, km, kmMember,
                Util.Utils.getInstance().LongToMoney(dto.getTongTien())
            });
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
                giaTuL = Util.Utils.getInstance().MoneyToLongNoneVND(giaTu.getText());
            } catch (Exception e) {
            }
        }

        if (!giaDen.getText().isEmpty()) {
            try {
                giaDenL = Util.Utils.getInstance().MoneyToLongNoneVND(giaDen.getText());
            } catch (Exception e) {
            }
        }

        ArrayList<HoaDonDTO> ds
                = n02_HoaDonDAO.getInstance().search(ma.getText(), ngayBDValue, ngayKTValue, giaTuL, giaDenL, maCN);

        for (HoaDonDTO dto : ds) {
            NhanVienDTO nv = n02_HoaDonDAO.getInstance().searchNhanVienByMa(dto.getMaNV());
            KhachHangDTO kh = n02_HoaDonDAO.getInstance().searchKhachHangByMa(dto.getMaKH());
            KhuyenMaiDTO km = n02_HoaDonDAO.getInstance().searchKhuyenMaiByMa(dto.getMaKM());
            KhuyenMaiDTO kmMember = n02_HoaDonDAO.getInstance().searchKhuyenMaiByMa(dto.getMaKMMember());

            model.addRow(new Object[]{dto.getMa(), dto.getNgayLap(), nv, kh, km, kmMember,
                Util.Utils.getInstance().LongToMoney(dto.getTongTien())});
        }
    }

    public HoaDonDTO searchHoaDonByMa(String ma) {
        return n02_HoaDonDAO.getInstance().searchHoaDonByMa(ma);
    }

    public NhanVienDTO searchNhanVienByMa(String ma) {
        return n02_HoaDonDAO.getInstance().searchNhanVienByMa(ma);
    }

    public KhachHangDTO searchKhachHangByMa(String ma) {
        return n02_HoaDonDAO.getInstance().searchKhachHangByMa(ma);
    }

}
