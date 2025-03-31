package BUS;

import DAO.*;
import DTO.*;
import GUI.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;

public class n02_BanHangBUS {

    public static n02_BanHangBUS getInstance() {
        return new n02_BanHangBUS();
    }

    // Trang chọn số lượng món
    public boolean insert(String ma, Long tien, String maNV, String maKH, String km, String kmMember, String maCN) {
        HoaDonDTO dto = new HoaDonDTO(ma, Date.valueOf(LocalDate.now()), tien, maNV, maKH, km, kmMember, maCN);
        Boolean dao = n02_HoaDonDAO.getInstance().insert(dto);
        if (dao) {
            JOptionPane.showMessageDialog(null, "Hóa đơn mới đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Tạo hóa đơn thất bại!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public void insertCTHD(ArrayList<ChiTietHoaDonDTO> ds) {
        n02_HoaDonDAO.getInstance().insertChiTietHoaDon(ds);
    }

    public LoaiMonDTO searchLoaiMonByMa_HoatDong(String ma) {
        return n02_BanHangDAO.getInstance().searchLoaiMonByMa_HoatDong(ma);
    }

    public void listCart(JTable table, ArrayList<ChiTietHoaDonDTO> ds) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int i = 1;
        for (ChiTietHoaDonDTO dto : ds) {
            String tenMon = n02_HoaDonDAO.getInstance().searchMonByMa(dto.getMaMon()).getTen();
            model.addRow(new Object[]{i, tenMon, Util.Utils.getInstance().LongToMoney(dto.getDonGia()),
                dto.getSoLuong(), Util.Utils.getInstance().LongToMoney(dto.getThanhTien())});
            i++;
        }
    }

    public void setComboBoxKhuyenMai(JComboBox<KhuyenMaiDTO> loai, Long tongTien) {
        loai.removeAllItems();
        Date now = Date.valueOf(LocalDate.now());
        ArrayList<KhuyenMaiDTO> ds = n02_BanHangDAO.getInstance().listAllKhuyenMai_HoatDong(now, tongTien);

        int phanTram = 0;
        for (KhuyenMaiDTO l : ds) {
            loai.addItem(l);
            if (phanTram < l.getPhanTram()) {
                phanTram = l.getPhanTram();
                loai.setSelectedItem(l);
            }
        }
    }

    public KhuyenMaiDTO selectMaxPhanTramKM(JComboBox<KhuyenMaiDTO> loai) {
        int maxPhanTram = 0;
        KhuyenMaiDTO selectedKM = null;

        for (int i = 0; i < loai.getItemCount(); i++) {
            KhuyenMaiDTO l = loai.getItemAt(i); // Lấy item tại vị trí i
            if (l.getPhanTram() > maxPhanTram) {
                maxPhanTram = l.getPhanTram();
                selectedKM = l;
            }
        }

        if (selectedKM != null) {
            loai.setSelectedItem(selectedKM);
        }
        return selectedKM;
    }

    public KhuyenMaiDTO setLabelKhuyenMaiThanhVien(JLabel khuyenMai, Long chiTieu) {
        Date now = Date.valueOf(LocalDate.now());
        KhuyenMaiDTO km = n02_BanHangDAO.getInstance().listKhuyenMai_Member_HoatDong(now, chiTieu);
        if (km != null) {
            khuyenMai.setText(km.toString());
        } else {
            khuyenMai.setText("None");
        }
        return km;
    }

    // Trang bán hàng
    public ArrayList<MonDTO> searchMonByLoaiMon_HoatDong(String ma) {
        ArrayList<MonDTO> ds = n02_BanHangDAO.getInstance().searchMonByLoaiMon_HoatDong(ma);
        return ds;
    }

    public void setComboBoxLoaiMon(JComboBox loai) {
        loai.removeAllItems();
        ArrayList<LoaiMonDTO> ds = n02_BanHangDAO.getInstance().listAllLoaiMon();
        loai.addItem("Tất cả");
        for (LoaiMonDTO l : ds) {
            loai.addItem(l);
        }
    }

    public ArrayList<MonDTO> listAllMon_HoatDong() {
        ArrayList<MonDTO> ds = n02_BanHangDAO.getInstance().listAllMon_HoatDong();
        return ds;
    }

    public ArrayList<MonDTO> searchMonByTen_HoatDong(String ma) {
        ArrayList<MonDTO> ds = n02_BanHangDAO.getInstance().searchMonByTen_HoatDong(ma);
        return ds;
    }

    public void setMonGUI(JPanel Menu_Body, ArrayList<MonDTO> ds, n02_BanHangGUI frame) {
        Menu_Body.removeAll();
        // lấy danh số lượng để chia size cho Panel sản phẩm
        int soLuongSanPham = ds.size();

        int height_expected = (soLuongSanPham / 4 + 1) * 213;
        Menu_Body.setPreferredSize(new Dimension(687, height_expected));

        for (MonDTO mon : ds) {
            JPanel sanPham = new JPanel(new BorderLayout());
            sanPham.setBackground(Color.white);
            sanPham.setPreferredSize(new Dimension(152, 200));
            sanPham.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.GRAY),
                    new EmptyBorder(15, 0, 15, 0) // Padding trên 10px, dưới 10px
            ));
            String imagePath = "AnhMon/" + mon.getHinhAnh();
            File file = new File(imagePath);
            ImageIcon icon = new ImageIcon(file.getAbsolutePath());
            JLabel labelAnh = new JLabel(icon);

            JLabel tenMon = new JLabel(mon.getTen(), SwingConstants.CENTER);
            tenMon.setFont(new Font("Arial", Font.BOLD, 14));

            String tien = Util.Utils.getInstance().LongToMoney(mon.getGia());
            JLabel giaTien = new JLabel(tien, SwingConstants.CENTER);
            giaTien.setForeground(new Color(0, 102, 0));

            sanPham.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    n02_BanHang_ThongTinMonGUI a = new n02_BanHang_ThongTinMonGUI(mon, frame);
                    a.setVisible(true);
                    a.setLocationRelativeTo(null);
                }
            });

            sanPham.add(labelAnh, BorderLayout.NORTH);
            sanPham.add(tenMon, BorderLayout.CENTER);
            sanPham.add(giaTien, BorderLayout.SOUTH);

            Menu_Body.add(sanPham);
        }

        Menu_Body.revalidate();
        Menu_Body.repaint();
    }

    public static void main(String[] args) {
    }
}
