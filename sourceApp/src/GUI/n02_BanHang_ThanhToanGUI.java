package GUI;

import BUS.*;
import DTO.*;
import Util.ChonCN;
import Util.Utils;
import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class n02_BanHang_ThanhToanGUI extends javax.swing.JFrame {

    private n02_BanHangGUI frame;
    private KhachHangDTO khachHang;
    private int phanTramKhuyenMai = 0;
    private KhuyenMaiDTO khuyenMaiMember;

    public int getPhanTramKhuyenMai() {
        return phanTramKhuyenMai;
    }

    public void setPhanTramKhuyenMai(int phanTramKhuyenMai) {
        this.phanTramKhuyenMai = phanTramKhuyenMai;
    }

    public KhuyenMaiDTO getPhanTramKhuyenMaiMember() {
        return khuyenMaiMember;
    }

    public KhachHangDTO getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHangDTO khachHang) {
        if (khachHang != null) {
            this.khachHang = khachHang;
            kh.setText(khachHang.toString());
            khuyenMaiMember = n02_BanHangBUS.getInstance().setLabelKhuyenMaiThanhVien(kmMember, khachHang.getChiTieu());
        } else {
            kh.setText("None");
            kmMember.setText("None");
            khuyenMaiMember = null;
        }
        Long TongTien = tinhTien();
        tongTien.setText(Util.Utils.getInstance().LongToMoney(tinhTienDiscount(TongTien, phanTramKhuyenMai,
                khuyenMaiMember)));
    }

    public n02_BanHang_ThanhToanGUI(n02_BanHangGUI frame) {
        this.frame = frame;
        initComponents();
        buttonEvents();
        Utils.getInstance().dragPanel(PanelNoiDung, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKhung = new javax.swing.JPanel();
        PanelNoiDung = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        BtnCancel = new javax.swing.JPanel();
        btnHuy1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BtnThanhToan = new javax.swing.JButton();
        BtnTaiLai = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LabelMa = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ma = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        LabelMa1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ngay = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        LabelMa2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        nv = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        LabelMa3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        kh = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        LabelMa4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        kmMember = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        LabelMa5 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        km = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        LabelMa6 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        giaTruocGiam = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        LabelMa7 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        tongTien = new javax.swing.JLabel();
        BtnChonKhach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        PanelKhung.setBackground(new java.awt.Color(122, 74, 74));
        PanelKhung.setMaximumSize(new java.awt.Dimension(500, 642));
        PanelKhung.setMinimumSize(new java.awt.Dimension(500, 642));
        PanelKhung.setPreferredSize(new java.awt.Dimension(452, 542));

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setMaximumSize(new java.awt.Dimension(488, 630));
        PanelNoiDung.setMinimumSize(new java.awt.Dimension(488, 630));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(440, 530));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("TẠO HÓA ĐƠN");
        Title.setPreferredSize(new java.awt.Dimension(440, 27));

        BtnCancel.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancel.setMaximumSize(new java.awt.Dimension(28, 28));
        BtnCancel.setPreferredSize(new java.awt.Dimension(28, 28));

        btnHuy1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHuy1.setText("x");
        btnHuy1.setPreferredSize(new java.awt.Dimension(8, 14));
        BtnCancel.add(btnHuy1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(488, 35));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5));

        BtnThanhToan.setBackground(new java.awt.Color(51, 51, 51));
        BtnThanhToan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        BtnThanhToan.setText("Thanh toán");
        BtnThanhToan.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnThanhToan.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnThanhToan.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(BtnThanhToan);

        BtnTaiLai.setBackground(new java.awt.Color(51, 102, 255));
        BtnTaiLai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        BtnTaiLai.setText("Tải Lại");
        BtnTaiLai.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnTaiLai.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnTaiLai.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(BtnTaiLai);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(380, 420));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(125, 31));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        LabelMa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa.setText("Mã HĐ");
        jPanel3.add(LabelMa);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(240, 31));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 5));

        ma.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ma.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ma.setText("HD001");
        ma.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel4.add(ma);

        jPanel2.add(jPanel4);

        jPanel5.add(jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(125, 31));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        LabelMa1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa1.setText("Ngày lập");
        jPanel7.add(LabelMa1);

        jPanel6.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(240, 31));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 5));

        ngay.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ngay.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ngay.setText("28-01-2025");
        ngay.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel8.add(ngay);

        jPanel6.add(jPanel8);

        jPanel5.add(jPanel6);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(125, 31));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        LabelMa2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa2.setText("Nhân viên");
        jPanel10.add(LabelMa2);

        jPanel9.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(240, 31));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 5));

        nv.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        nv.setForeground(new java.awt.Color(0, 102, 204));
        nv.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nv.setText("Nguyễn Văn A");
        nv.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel11.add(nv);

        jPanel9.add(jPanel11);

        jPanel5.add(jPanel9);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(125, 31));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        LabelMa3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa3.setText("Khách hàng");
        jPanel13.add(LabelMa3);

        jPanel12.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(240, 31));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 5));

        kh.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        kh.setForeground(new java.awt.Color(255, 102, 0));
        kh.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kh.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel14.add(kh);

        jPanel12.add(jPanel14);

        jPanel5.add(jPanel12);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(125, 31));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        LabelMa4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa4.setText("Thành viên bậc");
        jPanel16.add(LabelMa4);

        jPanel15.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(240, 31));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 5));

        kmMember.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        kmMember.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        kmMember.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel17.add(kmMember);

        jPanel15.add(jPanel17);

        jPanel5.add(jPanel15);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setPreferredSize(new java.awt.Dimension(125, 31));
        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        LabelMa5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa5.setText("Khuyến mãi");
        jPanel19.add(LabelMa5);

        jPanel18.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setPreferredSize(new java.awt.Dimension(240, 31));
        jPanel20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 5));

        km.setPreferredSize(new java.awt.Dimension(200, 22));
        jPanel20.add(km);

        jPanel18.add(jPanel20);

        jPanel5.add(jPanel18);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setPreferredSize(new java.awt.Dimension(125, 31));
        jPanel22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        LabelMa6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa6.setText("Giá trước giảm");
        jPanel22.add(LabelMa6);

        jPanel21.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setPreferredSize(new java.awt.Dimension(240, 31));
        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 5));

        giaTruocGiam.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        giaTruocGiam.setForeground(new java.awt.Color(204, 0, 51));
        giaTruocGiam.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        giaTruocGiam.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel23.add(giaTruocGiam);

        jPanel21.add(jPanel23);

        jPanel5.add(jPanel21);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setPreferredSize(new java.awt.Dimension(380, 40));
        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setPreferredSize(new java.awt.Dimension(125, 31));
        jPanel25.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        LabelMa7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa7.setText("Tổng tiền");
        jPanel25.add(LabelMa7);

        jPanel24.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setPreferredSize(new java.awt.Dimension(240, 31));
        jPanel26.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 5));

        tongTien.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tongTien.setForeground(new java.awt.Color(0, 153, 0));
        tongTien.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tongTien.setPreferredSize(new java.awt.Dimension(240, 20));
        jPanel26.add(tongTien);

        jPanel24.add(jPanel26);

        jPanel5.add(jPanel24);

        BtnChonKhach.setBackground(new java.awt.Color(255, 102, 0));
        BtnChonKhach.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnChonKhach.setForeground(new java.awt.Color(255, 255, 255));
        BtnChonKhach.setText("...");
        BtnChonKhach.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnChonKhach.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnChonKhach.setPreferredSize(new java.awt.Dimension(23, 23));

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnChonKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelNoiDungLayout.setVerticalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(BtnChonKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );

        PanelKhung.add(PanelNoiDung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset() {
        ma.setText(n02_HoaDonBUS.getInstance().CreateID());
        ngay.setText(Util.Utils.getInstance().SQLDateString_Transform_normalDateString(Date.valueOf(LocalDate.now()) + ""));
        nv.setText(n02_HoaDonBUS.getInstance().searchNhanVienByMa(frame.getMaNV()).toString());

        Long TongTien = tinhTien();
        giaTruocGiam.setText(Util.Utils.getInstance().LongToMoney(TongTien));

        n02_BanHangBUS.getInstance().setComboBoxKhuyenMai(km, TongTien);

        kmMember.setText("None");
        kh.setText("None");

        try {
            KhuyenMaiDTO selectedKM = (KhuyenMaiDTO) km.getSelectedItem();
            phanTramKhuyenMai = selectedKM.getPhanTram();
        } catch (Exception e) {
        }

        tongTien.setText(Util.Utils.getInstance().LongToMoney(tinhTienDiscount(TongTien,
                phanTramKhuyenMai, khuyenMaiMember)));
    }

    private void buttonEvents() {
        reset();

        BtnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCancel.setBackground(new Color(255, 102, 102));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCancel.setBackground(new Color(255, 51, 51));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
            }
        });

        BtnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String maCN = null;
                if (frame.getMaCN() == null) {
                    ChonCN dialog = new ChonCN(new javax.swing.JFrame(), true);
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                    maCN = dialog.maCN;
                } else {
                    maCN = frame.getMaCN();
                }
                if (maCN != null) {
                    int response = JOptionPane.showConfirmDialog(null, "Bạn xác nhận tạo hóa đơn?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        Long tien = null;
                        try {
                            tien = Util.Utils.getInstance().MoneyToLong(tongTien.getText());
                        } catch (Exception e) {
                        }

                        String maKH = null;
                        try {
                            maKH = khachHang.getMaKhachHang();
                        } catch (Exception e) {
                        }
                        String maKMMember = null;
                        try {
                            maKMMember = khuyenMaiMember.getMa();
                        } catch (Exception e) {
                        }
                        String maKM = null;
                        try {
                            KhuyenMaiDTO aKm = (KhuyenMaiDTO) km.getSelectedItem();
                            maKM = aKm.getMa();
                        } catch (Exception e) {
                        }
                        boolean hd = n02_BanHangBUS.getInstance().insert(ma.getText(), tien, frame.getMaNV(), maKH,
                                maKM, maKMMember, maCN);
                        System.out.println(maCN);
                        if (hd) {
                            n02_BanHangBUS.getInstance().insertCTHD(frame.dsCart);
                            frame.dsCart = new ArrayList<>();
                            frame.reset();
                            dispose();
                        }
                    }
                }
            }
        }
        );

        BtnTaiLai.addMouseListener(
                new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt
            ) {
                setKhachHang(null);
                km.setSelectedItem(n02_BanHangBUS.getInstance().selectMaxPhanTramKM(km));
            }
        }
        );

        km.addItemListener(new java.awt.event.ItemListener() {

            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Long TongTien = tinhTien();
                KhuyenMaiDTO selectedKM = (KhuyenMaiDTO) km.getSelectedItem();
                phanTramKhuyenMai = selectedKM.getPhanTram();

                tongTien.setText(Util.Utils.getInstance().LongToMoney(tinhTienDiscount(TongTien, phanTramKhuyenMai,
                        khuyenMaiMember)));
            }
        }
        );

        BtnChonKhach.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n02_BanHang_ThanhToan_chonKhachHang a = new n02_BanHang_ThanhToan_chonKhachHang(n02_BanHang_ThanhToanGUI.this);
                a.setVisible(true);
                a.setLocationRelativeTo(null);
            }
        });
    }

    public Long tinhTienDiscount(Long tienTruocGiam, int phanTramKM, KhuyenMaiDTO phanTramKMMember) {
        int num = 0;
        try {
            num = phanTramKMMember.getPhanTram();
        } catch (Exception e) {
            num = 0;
        }
        Long tienSauGiam = tienTruocGiam - Math.round(tienTruocGiam * (phanTramKM + num) / 100.0);
        return tienSauGiam;
    }

    public Long tinhTien() {
        Long TongTien = 0L;
        for (ChiTietHoaDonDTO cthd : frame.dsCart) {
            TongTien += cthd.getThanhTien();
        }
        return TongTien;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnCancel;
    private javax.swing.JButton BtnChonKhach;
    private javax.swing.JButton BtnTaiLai;
    private javax.swing.JButton BtnThanhToan;
    private javax.swing.JLabel LabelMa;
    private javax.swing.JLabel LabelMa1;
    private javax.swing.JLabel LabelMa2;
    private javax.swing.JLabel LabelMa3;
    private javax.swing.JLabel LabelMa4;
    private javax.swing.JLabel LabelMa5;
    private javax.swing.JLabel LabelMa6;
    private javax.swing.JLabel LabelMa7;
    private javax.swing.JPanel PanelKhung;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel btnHuy1;
    private javax.swing.JLabel giaTruocGiam;
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
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel kh;
    private javax.swing.JComboBox<KhuyenMaiDTO> km;
    private javax.swing.JLabel kmMember;
    private javax.swing.JLabel ma;
    private javax.swing.JLabel ngay;
    private javax.swing.JLabel nv;
    private javax.swing.JLabel tongTien;
    // End of variables declaration//GEN-END:variables
}
