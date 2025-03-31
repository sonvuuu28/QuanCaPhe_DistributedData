package GUI;

import BUS.n11_NhanVienBUS;
import Util.TableCustom;
import Util.Utils;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class n11_NhanVienGUI extends javax.swing.JPanel {

    private n01_TrangChuGUI frame;

    public n11_NhanVienGUI(n01_TrangChuGUI frame) {
        this.frame = frame;
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Chu = new javax.swing.JPanel();
        Biggest_Header = new javax.swing.JPanel();
        PanelNV = new javax.swing.JPanel();
        LabelBanHang = new javax.swing.JLabel();
        PanelPQ = new javax.swing.JPanel();
        LabelHoaDon = new javax.swing.JLabel();
        LabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        body1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LblMaHoaDon12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ma = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        LblMaHoaDon13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ten = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        LblMaHoaDon14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        gioiTinh = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        LblMaHoaDon15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        sdt = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        LblMaHoaDon16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        ngaySinh = new com.toedter.calendar.JDateChooser();
        jPanel13 = new javax.swing.JPanel();
        LblMaHoaDon17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        diaChi = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        LblMaHoaDon18 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        chucVu = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        LblMaHoaDon19 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        luong = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        LblMaHoaDon20 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        chiNhanh = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        BtnTimKiem = new javax.swing.JButton();
        BtnThem = new javax.swing.JButton();
        BtnSua = new javax.swing.JButton();
        BtnTaiKhoan = new javax.swing.JButton();
        BtnBatTat = new javax.swing.JButton();
        PanelTaiLai = new javax.swing.JPanel();
        LabelTaiLai = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        functionBar1 = new javax.swing.JPanel();
        PanelTimKiem = new javax.swing.JPanel();
        TimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();

        Biggest.setPreferredSize(new java.awt.Dimension(1156, 661));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1156, 661));

        Chu.setBackground(new java.awt.Color(255, 255, 255));
        Chu.setPreferredSize(new java.awt.Dimension(1156, 1200));

        Biggest_Header.setBackground(new java.awt.Color(255, 255, 255));
        Biggest_Header.setPreferredSize(new java.awt.Dimension(726, 80));
        Biggest_Header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 25, 20));

        PanelNV.setBackground(new java.awt.Color(219, 189, 142));
        PanelNV.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelNV.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelNV.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelNV.setLayout(new java.awt.GridBagLayout());

        LabelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelBanHang.setText("NHÂN VIÊN");
        PanelNV.add(LabelBanHang, new java.awt.GridBagConstraints());

        Biggest_Header.add(PanelNV);

        PanelPQ.setBackground(new java.awt.Color(219, 189, 142));
        PanelPQ.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelPQ.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelPQ.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelPQ.setLayout(new java.awt.GridBagLayout());

        LabelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelHoaDon.setText("PHÂN QUYỀN");
        PanelPQ.add(LabelHoaDon, new java.awt.GridBagConstraints());

        Biggest_Header.add(PanelPQ);

        LabelTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setText("Trang nhân viên");

        jPanel1.setBackground(new java.awt.Color(219, 189, 142));
        jPanel1.setPreferredSize(new java.awt.Dimension(492, 512));

        body1.setBackground(new java.awt.Color(255, 255, 255));
        body1.setMinimumSize(new java.awt.Dimension(512, 542));
        body1.setPreferredSize(new java.awt.Dimension(480, 500));
        body1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Thông tin nhân viên");
        jLabel2.setPreferredSize(new java.awt.Dimension(174, 35));
        body1.add(jLabel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon12.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon12.setText("Mã NV");
        LblMaHoaDon12.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel3.add(LblMaHoaDon12);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(80, 40));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 4));

        ma.setBackground(new java.awt.Color(238, 238, 238));
        ma.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ma.setForeground(new java.awt.Color(51, 0, 204));
        ma.setText("NV001");
        ma.setBorder(null);
        ma.setMaximumSize(new java.awt.Dimension(500, 25));
        ma.setMinimumSize(new java.awt.Dimension(200, 25));
        ma.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel4.add(ma);

        jSeparator13.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator13.setPreferredSize(new java.awt.Dimension(300, 5));
        jPanel4.add(jSeparator13);

        jPanel3.add(jPanel4);

        body1.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel5.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon13.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon13.setText("Tên NV");
        LblMaHoaDon13.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel5.add(LblMaHoaDon13);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 4));

        ten.setBorder(null);
        ten.setMaximumSize(new java.awt.Dimension(500, 25));
        ten.setMinimumSize(new java.awt.Dimension(200, 25));
        ten.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel6.add(ten);

        jSeparator14.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator14.setPreferredSize(new java.awt.Dimension(300, 5));
        jPanel6.add(jSeparator14);

        jPanel5.add(jPanel6);

        body1.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel7.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon14.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon14.setText("Giới tính");
        LblMaHoaDon14.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel7.add(LblMaHoaDon14);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 9));

        gioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Nam", "Nữ" }));
        gioiTinh.setPreferredSize(new java.awt.Dimension(160, 22));
        jPanel8.add(gioiTinh);

        jPanel7.add(jPanel8);

        body1.add(jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel9.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon15.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon15.setText("Số điện thoại");
        LblMaHoaDon15.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel9.add(LblMaHoaDon15);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 4));

        sdt.setBorder(null);
        sdt.setMaximumSize(new java.awt.Dimension(500, 25));
        sdt.setMinimumSize(new java.awt.Dimension(200, 25));
        sdt.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel10.add(sdt);

        jSeparator16.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator16.setPreferredSize(new java.awt.Dimension(300, 5));
        jPanel10.add(jSeparator16);

        jPanel9.add(jPanel10);

        body1.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel11.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon16.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon16.setText("Ngày sinh");
        LblMaHoaDon16.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel11.add(LblMaHoaDon16);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 9));

        ngaySinh.setPreferredSize(new java.awt.Dimension(160, 22));
        jPanel12.add(ngaySinh);

        jPanel11.add(jPanel12);

        body1.add(jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel13.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon17.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon17.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon17.setText("Địa chỉ");
        LblMaHoaDon17.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel13.add(LblMaHoaDon17);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 4));

        diaChi.setBorder(null);
        diaChi.setMaximumSize(new java.awt.Dimension(500, 25));
        diaChi.setMinimumSize(new java.awt.Dimension(200, 25));
        diaChi.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel14.add(diaChi);

        jSeparator18.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator18.setPreferredSize(new java.awt.Dimension(300, 5));
        jPanel14.add(jSeparator18);

        jPanel13.add(jPanel14);

        body1.add(jPanel13);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel15.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon18.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon18.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon18.setText("Chức vụ");
        LblMaHoaDon18.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel15.add(LblMaHoaDon18);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 4));

        chucVu.setBorder(null);
        chucVu.setMaximumSize(new java.awt.Dimension(500, 25));
        chucVu.setMinimumSize(new java.awt.Dimension(200, 25));
        chucVu.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel16.add(chucVu);

        jSeparator21.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator21.setPreferredSize(new java.awt.Dimension(300, 5));
        jPanel16.add(jSeparator21);

        jPanel15.add(jPanel16);

        body1.add(jPanel15);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel17.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon19.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon19.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon19.setText("Lương");
        LblMaHoaDon19.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel17.add(LblMaHoaDon19);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 4));

        luong.setBorder(null);
        luong.setMaximumSize(new java.awt.Dimension(500, 25));
        luong.setMinimumSize(new java.awt.Dimension(200, 25));
        luong.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel18.add(luong);

        jSeparator20.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator20.setPreferredSize(new java.awt.Dimension(300, 5));
        jPanel18.add(jSeparator20);

        jPanel17.add(jPanel18);

        body1.add(jPanel17);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setMinimumSize(new java.awt.Dimension(688, 200));
        jPanel19.setPreferredSize(new java.awt.Dimension(470, 50));
        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon20.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LblMaHoaDon20.setForeground(new java.awt.Color(51, 51, 51));
        LblMaHoaDon20.setText("Chi nhánh");
        LblMaHoaDon20.setPreferredSize(new java.awt.Dimension(120, 16));
        jPanel19.add(LblMaHoaDon20);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 9));

        chiNhanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        chiNhanh.setPreferredSize(new java.awt.Dimension(160, 22));
        jPanel20.add(chiNhanh);

        jPanel19.add(jPanel20);

        body1.add(jPanel19);

        jPanel1.add(body1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        BtnTimKiem.setBackground(new java.awt.Color(0, 0, 0));
        BtnTimKiem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        BtnTimKiem.setText("Tìm kiếm");
        BtnTimKiem.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnTimKiem.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnTimKiem.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel2.add(BtnTimKiem);

        BtnThem.setBackground(new java.awt.Color(0, 0, 0));
        BtnThem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnThem.setForeground(new java.awt.Color(255, 255, 255));
        BtnThem.setText("Thêm");
        BtnThem.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnThem.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnThem.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel2.add(BtnThem);

        BtnSua.setBackground(new java.awt.Color(0, 0, 0));
        BtnSua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnSua.setForeground(new java.awt.Color(255, 255, 255));
        BtnSua.setText("Sửa");
        BtnSua.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnSua.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnSua.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel2.add(BtnSua);

        BtnTaiKhoan.setBackground(new java.awt.Color(0, 0, 0));
        BtnTaiKhoan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        BtnTaiKhoan.setText("Xem tài khoản");
        BtnTaiKhoan.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnTaiKhoan.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnTaiKhoan.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel2.add(BtnTaiKhoan);

        BtnBatTat.setBackground(new java.awt.Color(0, 0, 0));
        BtnBatTat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        BtnBatTat.setForeground(new java.awt.Color(255, 255, 255));
        BtnBatTat.setText("Bật/Tắt trạng thái");
        BtnBatTat.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnBatTat.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnBatTat.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel2.add(BtnBatTat);

        PanelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        PanelTaiLai.setMaximumSize(new java.awt.Dimension(34, 34));

        LabelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        LabelTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // NOI18N
        LabelTaiLai.setOpaque(true);
        PanelTaiLai.add(LabelTaiLai);

        jPanel2.add(PanelTaiLai);

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Giới tính", "SĐT", "Ngày sinh", "Chức vụ", "Địa chỉ", "Lương", "Trạng thái", "Chi nhánh", "Ngày nghỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(10).setPreferredWidth(70);
        }

        functionBar1.setBackground(new java.awt.Color(255, 255, 255));

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(270, 32));

        TimKiem.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        TimKiem.setForeground(new java.awt.Color(0, 102, 0));
        TimKiem.setText("Tìm kiếm nhanh theo tên");
        TimKiem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        LabelAnhTimKiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelAnhTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/search.png"))); // NOI18N

        javax.swing.GroupLayout PanelTimKiemLayout = new javax.swing.GroupLayout(PanelTimKiem);
        PanelTimKiem.setLayout(PanelTimKiemLayout);
        PanelTimKiemLayout.setHorizontalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(LabelAnhTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTimKiemLayout.setVerticalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelAnhTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimKiem))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout functionBar1Layout = new javax.swing.GroupLayout(functionBar1);
        functionBar1.setLayout(functionBar1Layout);
        functionBar1Layout.setHorizontalGroup(
            functionBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionBar1Layout.createSequentialGroup()
                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
        );
        functionBar1Layout.setVerticalGroup(
            functionBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, functionBar1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout ChuLayout = new javax.swing.GroupLayout(Chu);
        Chu.setLayout(ChuLayout);
        ChuLayout.setHorizontalGroup(
            ChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest_Header, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
            .addComponent(LabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ChuLayout.createSequentialGroup()
                .addGroup(ChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChuLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(ChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(functionBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ChuLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChuLayout.setVerticalGroup(
            ChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChuLayout.createSequentialGroup()
                .addComponent(Biggest_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelTitle)
                .addGap(41, 41, 41)
                .addGroup(ChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(functionBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);

        jScrollPane1.setViewportView(Chu);

        javax.swing.GroupLayout BiggestLayout = new javax.swing.GroupLayout(Biggest);
        Biggest.setLayout(BiggestLayout);
        BiggestLayout.setHorizontalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BiggestLayout.setVerticalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void reset() {
        ma.setFocusable(true);
        ma.setText(n11_NhanVienBUS.getInstance().createID());
        ten.setText("");
        gioiTinh.setSelectedIndex(0);
        chiNhanh.setSelectedIndex(0);
        sdt.setText("");
        ngaySinh.setDate(null);
        diaChi.setText("");
        chucVu.setText("");
        luong.setText("");
        TimKiem.setText("Tìm kiếm nhanh theo tên");
        n11_NhanVienBUS.getInstance().comboBoxChiNhanh(chiNhanh);
        n11_NhanVienBUS.getInstance().listAll(table);
        Utils.getInstance().timKiem(TimKiem);
    }

    private void buttonEvents() {
        reset();
        Utils.getInstance().sdt(sdt);
        luong.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String text = luong.getText();
                text = text.replaceAll("[^\\d]", "");
                text = text.replaceFirst("^0+", "");
                if (!text.isEmpty()) {
                    try {
                        Long luongDenLong = Long.valueOf(text);
                        luong.setText(Util.Utils.getInstance().LongToMoneyNoneVND(luongDenLong));
                    } catch (NumberFormatException e) {
                        luong.setText("");
                    }
                } else {
                    luong.setText("");
                }
            }
        });

        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    n11_NhanVienBUS.getInstance().searchByName(table, TimKiem.getText());
                }
            }
        });

        TimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (TimKiem.getText().equals("Tìm kiếm nhanh theo tên")) {
                    TimKiem.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (TimKiem.getText().isEmpty()) {
                    TimKiem.setText("Tìm kiếm nhanh theo tên");
                }
            }
        });

        LabelAnhTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n11_NhanVienBUS.getInstance().searchByName(table, TimKiem.getText());
            }
        });

        PanelTaiLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelTaiLai.setBackground(new Color(106, 105, 105));
                LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload_hover.png")));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelTaiLai.setBackground(new Color(0, 0, 0));
                LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png")));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset();
            }
        });

        PanelNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelNV.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelNV.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });

        PanelPQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelPQ.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelPQ.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Biggest.removeAll();
                n11_PhanQuyenGUI bh = new n11_PhanQuyenGUI(frame);
                Biggest.setLayout(new BorderLayout());
                Biggest.add(bh, BorderLayout.CENTER);
                Biggest.revalidate();
                Biggest.repaint();
            }
        });
        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (n11_NhanVienBUS.getInstance().checkInput(ma, ten, gioiTinh, sdt, ngaySinh, diaChi, chucVu, luong, chiNhanh) == true) {
                    int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm nhân viên không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        Long luongTryCatch = Util.Utils.getInstance().MoneyToLongNoneVND(luong.getText());

                        boolean i = n11_NhanVienBUS.getInstance().insert(ma.getText(), ten.getText(), gioiTinh.getSelectedItem().toString(),
                                sdt.getText(), new java.sql.Date(ngaySinh.getDate().getTime()), chucVu.getText(), diaChi.getText(),
                                luongTryCatch, true, chiNhanh.getSelectedItem().toString());
                        if (i) {
                            reset();
                        }
                    }
                }
            }
        });

        BtnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (ma.getText().equals(n11_NhanVienBUS.getInstance().createID())) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 nhân viên trong danh sách để sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int selectedRow = table.getSelectedRow();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    Boolean trangThai;
                    if (model.getValueAt(selectedRow, 8).toString().equals("Đang làm")) {
                        trangThai = true;
                    } else {
                        trangThai = false;
                    }

                    if (n11_NhanVienBUS.getInstance().checkInput(ma, ten, gioiTinh, sdt, ngaySinh, diaChi, chucVu, luong, chiNhanh) == true) {
                        int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa thông tin nhân viên không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                        Date ngayNghi = null;
                        try {
                            ngayNghi = Date.valueOf(model.getValueAt(selectedRow, 10).toString());
                        } catch (Exception e) {
                        }
                        System.out.println(ngayNghi);
                        if (response == JOptionPane.YES_OPTION) {
                            Long luongTryCatch = Util.Utils.getInstance().MoneyToLongNoneVND(luong.getText());

                            int i = n11_NhanVienBUS.getInstance().update(ma.getText(), ten.getText(), gioiTinh.getSelectedItem().toString(),
                                    sdt.getText(), new java.sql.Date(ngaySinh.getDate().getTime()), chucVu.getText(), diaChi.getText(),
                                    luongTryCatch, trangThai, chiNhanh.getSelectedItem().toString(),
                                    ngayNghi);
                            if (i == 1 || i == 0) {
                                reset();
                            }
                        }
                    }
                }
            }
        });

        BtnBatTat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (ma.getText().equals(n11_NhanVienBUS.getInstance().createID())) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 nhân viên trong danh sách để điều chỉnh trạng thái!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int selectedRow = table.getSelectedRow();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    Boolean trangThai;
                    if (model.getValueAt(selectedRow, 8).toString().equals("Đang làm")) {
                        trangThai = false;
                    } else {
                        trangThai = true;
                    }
                    String thongBao = trangThai ? "bật" : "tắt";
                    if (n11_NhanVienBUS.getInstance().checkInput(ma, ten, gioiTinh, sdt, ngaySinh, diaChi, chucVu, luong, chiNhanh) == true) {
                        int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn " + thongBao + " trạng thái nhân viên không?",
                                "Xác nhận", JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            int i = n11_NhanVienBUS.getInstance().batTat(ma.getText(), trangThai);
                            if (i == 1 || i == 0) {
                                reset();
                            }
                        }
                    }
                }
            }
        });

        BtnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Date ngaySinhTryCatch = null;
                try {
                    ngaySinhTryCatch = new java.sql.Date(ngaySinh.getDate().getTime());
                } catch (Exception e) {

                }

                String gioiTinhTryCatch = null;
                try {
                    gioiTinhTryCatch = gioiTinh.getSelectedItem().toString();
                    if (gioiTinhTryCatch.equals("None")) {
                        gioiTinhTryCatch = null;
                    }
                } catch (Exception e) {

                }

                Long luongTryCatch = null;
                try {
                    luongTryCatch = Util.Utils.getInstance().MoneyToLongNoneVND(luong.getText());
                } catch (Exception e) {

                }

                String chiNhanhTryCatch = null;
                try {
                    chiNhanhTryCatch = chiNhanh.getSelectedItem().toString();
                    if (chiNhanhTryCatch.equals("None")) {
                        chiNhanhTryCatch = null;
                    }
                } catch (Exception e) {

                }
                n11_NhanVienBUS.getInstance().search(table, ma.getText(), ten.getText(), gioiTinhTryCatch,
                        sdt.getText(), ngaySinhTryCatch, chucVu.getText(), diaChi.getText(), luongTryCatch,
                        null, chiNhanhTryCatch);
            }
        });

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int count = table.getSelectedRow();
                TableModel model = table.getModel();
                ma.setFocusable(false);

                ma.setText(model.getValueAt(count, 0).toString());
                ten.setText(model.getValueAt(count, 1).toString());
                if (model.getValueAt(count, 2).toString().equals("Nam")) {
                    gioiTinh.setSelectedIndex(1);
                } else {
                    gioiTinh.setSelectedIndex(2);
                }
                sdt.setText(model.getValueAt(count, 3).toString());
                ngaySinh.setDate((java.sql.Date) model.getValueAt(count, 4));
                chucVu.setText(model.getValueAt(count, 5).toString());
                diaChi.setText(model.getValueAt(count, 6).toString());
                String giaTien = model.getValueAt(count, 7).toString().replace(" VNĐ", "");
                luong.setText(giaTien);
                chiNhanh.setSelectedItem(model.getValueAt(count, 9).toString());
            }
        });

        BtnTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                TableModel model = table.getModel();

                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 nhân viên trong danh sách để xem tài khoản!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    n11_TaiKhoanGUI a = new n11_TaiKhoanGUI(model.getValueAt(selectedRow, 0).toString(), frame.getMaCN());
                    a.setVisible(true);
                    a.setLocationRelativeTo(null);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest;
    private javax.swing.JPanel Biggest_Header;
    private javax.swing.JButton BtnBatTat;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnTaiKhoan;
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnTimKiem;
    private javax.swing.JPanel Chu;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LblMaHoaDon12;
    private javax.swing.JLabel LblMaHoaDon13;
    private javax.swing.JLabel LblMaHoaDon14;
    private javax.swing.JLabel LblMaHoaDon15;
    private javax.swing.JLabel LblMaHoaDon16;
    private javax.swing.JLabel LblMaHoaDon17;
    private javax.swing.JLabel LblMaHoaDon18;
    private javax.swing.JLabel LblMaHoaDon19;
    private javax.swing.JLabel LblMaHoaDon20;
    private javax.swing.JPanel PanelNV;
    private javax.swing.JPanel PanelPQ;
    private javax.swing.JPanel PanelTaiLai;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JPanel body1;
    private javax.swing.JComboBox<String> chiNhanh;
    private javax.swing.JTextField chucVu;
    private javax.swing.JTextField diaChi;
    private javax.swing.JPanel functionBar1;
    private javax.swing.JComboBox<String> gioiTinh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JTextField luong;
    private javax.swing.JTextField ma;
    private com.toedter.calendar.JDateChooser ngaySinh;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTextField sdt;
    private javax.swing.JTable table;
    private javax.swing.JTextField ten;
    // End of variables declaration//GEN-END:variables
}
