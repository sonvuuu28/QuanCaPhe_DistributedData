package GUI;

import BUS.n12_ThongKeBUS;
import org.knowm.xchart.*;

import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;
import Util.TableCustom;

public class n12_ThongKeGUI extends javax.swing.JPanel {

    public n01_TrangChuGUI frame;

    public n12_ThongKeGUI(n01_TrangChuGUI frame) {
        this.frame = frame;
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNoiDung = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        box = new javax.swing.JComboBox<>();
        tab = new javax.swing.JTabbedPane();
        scrDefault = new javax.swing.JScrollPane();
        content = new javax.swing.JPanel();
        content_head = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        label15 = new javax.swing.JPanel();
        doanhThuNgay = new javax.swing.JLabel();
        name15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        label16 = new javax.swing.JPanel();
        hd = new javax.swing.JLabel();
        name16 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        label17 = new javax.swing.JPanel();
        kh = new javax.swing.JLabel();
        name17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        label18 = new javax.swing.JPanel();
        mon = new javax.swing.JLabel();
        name18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        content_body = new javax.swing.JPanel();
        scrDoanhThu = new javax.swing.JScrollPane();
        content1 = new javax.swing.JPanel();
        content_head1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        label8 = new javax.swing.JPanel();
        DT_doanhThuNgay = new javax.swing.JLabel();
        name8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        label9 = new javax.swing.JPanel();
        DT_DoanhThuTuan = new javax.swing.JLabel();
        name9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        label10 = new javax.swing.JPanel();
        DT_DoanhThuThang = new javax.swing.JLabel();
        name10 = new javax.swing.JPanel();
        dt1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        label11 = new javax.swing.JPanel();
        DT_DoanhThuNam = new javax.swing.JLabel();
        name11 = new javax.swing.JPanel();
        dt2 = new javax.swing.JLabel();
        content_body1 = new javax.swing.JPanel();
        scrChiPhi = new javax.swing.JScrollPane();
        content2 = new javax.swing.JPanel();
        content_head2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        label12 = new javax.swing.JPanel();
        CP_ChiPhiNhap = new javax.swing.JLabel();
        name12 = new javax.swing.JPanel();
        cp1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        label13 = new javax.swing.JPanel();
        luong = new javax.swing.JLabel();
        name13 = new javax.swing.JPanel();
        cp2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        label14 = new javax.swing.JPanel();
        tong = new javax.swing.JLabel();
        name14 = new javax.swing.JPanel();
        cp3 = new javax.swing.JLabel();
        content_body2 = new javax.swing.JPanel();
        scrLoiNhuan = new javax.swing.JScrollPane();
        content3 = new javax.swing.JPanel();
        content_head3 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        label19 = new javax.swing.JPanel();
        LN_LoiNhuanThang = new javax.swing.JLabel();
        name19 = new javax.swing.JPanel();
        ln = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        label20 = new javax.swing.JPanel();
        LN_LoiNhuanNam = new javax.swing.JLabel();
        name20 = new javax.swing.JPanel();
        ln1 = new javax.swing.JLabel();
        content_body3 = new javax.swing.JPanel();
        scrKho = new javax.swing.JScrollPane();
        content4 = new javax.swing.JPanel();
        content_head4 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        label21 = new javax.swing.JPanel();
        Kho_pn = new javax.swing.JLabel();
        name21 = new javax.swing.JPanel();
        kho1 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        name24 = new javax.swing.JPanel();
        kho2 = new javax.swing.JLabel();
        label24 = new javax.swing.JPanel();
        Kho_pxk = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        label22 = new javax.swing.JPanel();
        Kho_nl = new javax.swing.JLabel();
        name22 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        label23 = new javax.swing.JPanel();
        Kho_ncc = new javax.swing.JLabel();
        name23 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        content_body4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(1156, 661));
        PanelNoiDung.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));

        Title.setPreferredSize(new java.awt.Dimension(1138, 50));
        Title.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Thống kê");
        Title.add(jLabel1);

        PanelNoiDung.add(Title);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(1138, 22));
        panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 0));

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Doanh thu", "Chi phí", "Lợi nhuận", "Kho hàng" }));
        box.setPreferredSize(new java.awt.Dimension(150, 22));
        panel.add(box);

        PanelNoiDung.add(panel);

        tab.setBackground(new java.awt.Color(255, 255, 255));
        tab.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        tab.setPreferredSize(new java.awt.Dimension(1140, 594));

        scrDefault.setBackground(new java.awt.Color(219, 189, 142));
        scrDefault.setBorder(null);
        scrDefault.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content.setBackground(new java.awt.Color(219, 189, 142));
        content.setPreferredSize(new java.awt.Dimension(1110, 750));
        content.setLayout(new java.awt.BorderLayout());

        content_head.setBackground(new java.awt.Color(219, 189, 142));
        content_head.setPreferredSize(new java.awt.Dimension(1138, 150));
        content_head.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 55, 40));

        jPanel16.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel16.setLayout(new java.awt.BorderLayout());

        label15.setPreferredSize(new java.awt.Dimension(200, 65));
        label15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        doanhThuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label15.add(doanhThuNgay);

        jPanel16.add(label15, java.awt.BorderLayout.CENTER);

        name15.setBackground(new java.awt.Color(185, 170, 157));
        name15.setPreferredSize(new java.awt.Dimension(200, 22));
        name15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel17.setText("Doanh thu hôm nay");
        name15.add(jLabel17);

        jPanel16.add(name15, java.awt.BorderLayout.NORTH);

        content_head.add(jPanel16);

        jPanel17.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel17.setLayout(new java.awt.BorderLayout());

        label16.setPreferredSize(new java.awt.Dimension(200, 65));
        label16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        hd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label16.add(hd);

        jPanel17.add(label16, java.awt.BorderLayout.CENTER);

        name16.setBackground(new java.awt.Color(185, 170, 157));
        name16.setPreferredSize(new java.awt.Dimension(200, 22));
        name16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel18.setText("Số hóa đơn lập hôm nay");
        name16.add(jLabel18);

        jPanel17.add(name16, java.awt.BorderLayout.NORTH);

        content_head.add(jPanel17);

        jPanel18.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel18.setLayout(new java.awt.BorderLayout());

        label17.setPreferredSize(new java.awt.Dimension(200, 65));
        label17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        kh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label17.add(kh);

        jPanel18.add(label17, java.awt.BorderLayout.CENTER);

        name17.setBackground(new java.awt.Color(185, 170, 157));
        name17.setPreferredSize(new java.awt.Dimension(200, 22));
        name17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel19.setText("Khách hàng thành viên mới");
        name17.add(jLabel19);

        jPanel18.add(name17, java.awt.BorderLayout.NORTH);

        content_head.add(jPanel18);

        jPanel19.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel19.setLayout(new java.awt.BorderLayout());

        label18.setPreferredSize(new java.awt.Dimension(200, 65));
        label18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        mon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label18.add(mon);

        jPanel19.add(label18, java.awt.BorderLayout.CENTER);

        name18.setBackground(new java.awt.Color(185, 170, 157));
        name18.setPreferredSize(new java.awt.Dimension(200, 22));
        name18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel20.setText("Số món bán ra hôm nay");
        name18.add(jLabel20);

        jPanel19.add(name18, java.awt.BorderLayout.NORTH);

        content_head.add(jPanel19);

        content.add(content_head, java.awt.BorderLayout.NORTH);

        content_body.setBackground(new java.awt.Color(255, 255, 255));
        content_body.setPreferredSize(new java.awt.Dimension(1138, 580));

        javax.swing.GroupLayout content_bodyLayout = new javax.swing.GroupLayout(content_body);
        content_body.setLayout(content_bodyLayout);
        content_bodyLayout.setHorizontalGroup(
            content_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        content_bodyLayout.setVerticalGroup(
            content_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        content.add(content_body, java.awt.BorderLayout.SOUTH);

        scrDefault.setViewportView(content);

        tab.addTab("", scrDefault);

        scrDoanhThu.setBackground(new java.awt.Color(219, 189, 142));
        scrDoanhThu.setBorder(null);
        scrDoanhThu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content1.setBackground(new java.awt.Color(219, 189, 142));
        content1.setPreferredSize(new java.awt.Dimension(1110, 750));
        content1.setLayout(new java.awt.BorderLayout());

        content_head1.setBackground(new java.awt.Color(219, 189, 142));
        content_head1.setPreferredSize(new java.awt.Dimension(1138, 150));
        content_head1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 55, 40));

        jPanel9.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel9.setLayout(new java.awt.BorderLayout());

        label8.setPreferredSize(new java.awt.Dimension(200, 65));
        label8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        DT_doanhThuNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label8.add(DT_doanhThuNgay);

        jPanel9.add(label8, java.awt.BorderLayout.CENTER);

        name8.setBackground(new java.awt.Color(185, 170, 157));
        name8.setPreferredSize(new java.awt.Dimension(200, 22));
        name8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Doanh thu hôm nay");
        name8.add(jLabel10);

        jPanel9.add(name8, java.awt.BorderLayout.NORTH);

        content_head1.add(jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel10.setLayout(new java.awt.BorderLayout());

        label9.setPreferredSize(new java.awt.Dimension(200, 65));
        label9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        DT_DoanhThuTuan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label9.add(DT_DoanhThuTuan);

        jPanel10.add(label9, java.awt.BorderLayout.CENTER);

        name9.setBackground(new java.awt.Color(185, 170, 157));
        name9.setPreferredSize(new java.awt.Dimension(200, 22));
        name9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setText("Doanh thu tuần này");
        name9.add(jLabel11);

        jPanel10.add(name9, java.awt.BorderLayout.NORTH);

        content_head1.add(jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel11.setLayout(new java.awt.BorderLayout());

        label10.setPreferredSize(new java.awt.Dimension(200, 65));
        label10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        DT_DoanhThuThang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label10.add(DT_DoanhThuThang);

        jPanel11.add(label10, java.awt.BorderLayout.CENTER);

        name10.setBackground(new java.awt.Color(185, 170, 157));
        name10.setPreferredSize(new java.awt.Dimension(200, 22));
        name10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        dt1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        dt1.setText("Doanh thu tháng");
        name10.add(dt1);

        jPanel11.add(name10, java.awt.BorderLayout.NORTH);

        content_head1.add(jPanel11);

        jPanel12.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel12.setLayout(new java.awt.BorderLayout());

        label11.setPreferredSize(new java.awt.Dimension(200, 65));
        label11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        DT_DoanhThuNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label11.add(DT_DoanhThuNam);

        jPanel12.add(label11, java.awt.BorderLayout.CENTER);

        name11.setBackground(new java.awt.Color(185, 170, 157));
        name11.setPreferredSize(new java.awt.Dimension(200, 22));
        name11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        dt2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        dt2.setText("Doanh thu năm");
        name11.add(dt2);
        String thangDT = Date.valueOf(LocalDate.now()).toString().substring(5, 7);
        String namDT = Date.valueOf(LocalDate.now()).toString().substring(0, 4);
        dt1.setText(dt1.getText() + " tháng " + thangDT);
        dt2.setText(dt2.getText() + " năm " + namDT);

        jPanel12.add(name11, java.awt.BorderLayout.NORTH);

        content_head1.add(jPanel12);

        content1.add(content_head1, java.awt.BorderLayout.NORTH);

        content_body1.setBackground(new java.awt.Color(255, 255, 255));
        content_body1.setPreferredSize(new java.awt.Dimension(1138, 580));

        javax.swing.GroupLayout content_body1Layout = new javax.swing.GroupLayout(content_body1);
        content_body1.setLayout(content_body1Layout);
        content_body1Layout.setHorizontalGroup(
            content_body1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        content_body1Layout.setVerticalGroup(
            content_body1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        content1.add(content_body1, java.awt.BorderLayout.SOUTH);

        scrDoanhThu.setViewportView(content1);

        tab.addTab("", scrDoanhThu);

        scrChiPhi.setBackground(new java.awt.Color(219, 189, 142));
        scrChiPhi.setBorder(null);
        scrChiPhi.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content2.setBackground(new java.awt.Color(219, 189, 142));
        content2.setPreferredSize(new java.awt.Dimension(1110, 750));
        content2.setLayout(new java.awt.BorderLayout());

        content_head2.setBackground(new java.awt.Color(219, 189, 142));
        content_head2.setPreferredSize(new java.awt.Dimension(1138, 150));
        content_head2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 75, 40));

        jPanel13.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel13.setLayout(new java.awt.BorderLayout());

        label12.setPreferredSize(new java.awt.Dimension(200, 65));
        label12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        CP_ChiPhiNhap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label12.add(CP_ChiPhiNhap);

        jPanel13.add(label12, java.awt.BorderLayout.CENTER);

        name12.setBackground(new java.awt.Color(185, 170, 157));
        name12.setPreferredSize(new java.awt.Dimension(200, 22));
        name12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        cp1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cp1.setText("Chi phí nhập");
        name12.add(cp1);

        jPanel13.add(name12, java.awt.BorderLayout.NORTH);

        content_head2.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel14.setLayout(new java.awt.BorderLayout());

        label13.setPreferredSize(new java.awt.Dimension(200, 65));
        label13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        luong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label13.add(luong);

        jPanel14.add(label13, java.awt.BorderLayout.CENTER);

        name13.setBackground(new java.awt.Color(185, 170, 157));
        name13.setPreferredSize(new java.awt.Dimension(200, 22));
        name13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        cp2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cp2.setText("Lương nhân viên");
        name13.add(cp2);

        jPanel14.add(name13, java.awt.BorderLayout.NORTH);

        content_head2.add(jPanel14);

        jPanel15.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel15.setLayout(new java.awt.BorderLayout());

        label14.setPreferredSize(new java.awt.Dimension(200, 65));
        label14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        tong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label14.add(tong);

        jPanel15.add(label14, java.awt.BorderLayout.CENTER);

        name14.setBackground(new java.awt.Color(185, 170, 157));
        name14.setPreferredSize(new java.awt.Dimension(200, 22));
        name14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        cp3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cp3.setText("Tổng chi phí");
        name14.add(cp3);
        String thang = Date.valueOf(LocalDate.now()).toString().substring(5, 7);

        cp1.setText(cp1.getText() + " tháng " + thang);
        cp2.setText(cp2.getText() + " tháng " + thang);
        cp3.setText(cp3.getText() + " tháng " + thang);

        jPanel15.add(name14, java.awt.BorderLayout.NORTH);

        content_head2.add(jPanel15);

        content2.add(content_head2, java.awt.BorderLayout.NORTH);

        content_body2.setBackground(new java.awt.Color(255, 255, 255));
        content_body2.setPreferredSize(new java.awt.Dimension(1138, 580));

        javax.swing.GroupLayout content_body2Layout = new javax.swing.GroupLayout(content_body2);
        content_body2.setLayout(content_body2Layout);
        content_body2Layout.setHorizontalGroup(
            content_body2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        content_body2Layout.setVerticalGroup(
            content_body2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        content2.add(content_body2, java.awt.BorderLayout.SOUTH);

        scrChiPhi.setViewportView(content2);

        tab.addTab("", scrChiPhi);

        scrLoiNhuan.setBackground(new java.awt.Color(219, 189, 142));
        scrLoiNhuan.setBorder(null);
        scrLoiNhuan.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content3.setBackground(new java.awt.Color(219, 189, 142));
        content3.setPreferredSize(new java.awt.Dimension(1110, 750));
        content3.setLayout(new java.awt.BorderLayout());

        content_head3.setBackground(new java.awt.Color(219, 189, 142));
        content_head3.setPreferredSize(new java.awt.Dimension(1138, 150));
        content_head3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 75, 40));

        jPanel20.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel20.setLayout(new java.awt.BorderLayout());

        label19.setPreferredSize(new java.awt.Dimension(200, 65));
        label19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        LN_LoiNhuanThang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label19.add(LN_LoiNhuanThang);

        jPanel20.add(label19, java.awt.BorderLayout.CENTER);

        name19.setBackground(new java.awt.Color(185, 170, 157));
        name19.setPreferredSize(new java.awt.Dimension(200, 22));
        name19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        ln.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        ln.setText("Lợi nhuận tháng");
        name19.add(ln);

        jPanel20.add(name19, java.awt.BorderLayout.NORTH);

        content_head3.add(jPanel20);

        jPanel21.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel21.setLayout(new java.awt.BorderLayout());

        label20.setPreferredSize(new java.awt.Dimension(200, 65));
        label20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        LN_LoiNhuanNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label20.add(LN_LoiNhuanNam);

        jPanel21.add(label20, java.awt.BorderLayout.CENTER);

        name20.setBackground(new java.awt.Color(185, 170, 157));
        name20.setPreferredSize(new java.awt.Dimension(200, 22));
        name20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        ln1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        ln1.setText("Lợi nhuận năm");
        name20.add(ln1);
        ln.setText(ln.getText() + " tháng " + thangDT);
        ln1.setText(ln1.getText() + " năm " + namDT);

        jPanel21.add(name20, java.awt.BorderLayout.NORTH);

        content_head3.add(jPanel21);

        content3.add(content_head3, java.awt.BorderLayout.NORTH);

        content_body3.setBackground(new java.awt.Color(255, 255, 255));
        content_body3.setPreferredSize(new java.awt.Dimension(1138, 580));

        javax.swing.GroupLayout content_body3Layout = new javax.swing.GroupLayout(content_body3);
        content_body3.setLayout(content_body3Layout);
        content_body3Layout.setHorizontalGroup(
            content_body3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        content_body3Layout.setVerticalGroup(
            content_body3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        content3.add(content_body3, java.awt.BorderLayout.SOUTH);

        scrLoiNhuan.setViewportView(content3);

        tab.addTab("", scrLoiNhuan);

        scrKho.setBackground(new java.awt.Color(219, 189, 142));
        scrKho.setBorder(null);
        scrKho.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        content4.setBackground(new java.awt.Color(219, 189, 142));
        content4.setPreferredSize(new java.awt.Dimension(1110, 750));
        content4.setLayout(new java.awt.BorderLayout());

        content_head4.setBackground(new java.awt.Color(219, 189, 142));
        content_head4.setPreferredSize(new java.awt.Dimension(1138, 150));
        content_head4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 75, 40));

        jPanel22.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel22.setLayout(new java.awt.BorderLayout());

        label21.setPreferredSize(new java.awt.Dimension(200, 65));
        label21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        Kho_pn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label21.add(Kho_pn);

        jPanel22.add(label21, java.awt.BorderLayout.CENTER);

        name21.setBackground(new java.awt.Color(185, 170, 157));
        name21.setPreferredSize(new java.awt.Dimension(200, 22));
        name21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        kho1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        kho1.setText("Số đợt nhập trong tháng ");
        name21.add(kho1);
        kho1.setText(kho1.getText() + " " + thang);

        jPanel22.add(name21, java.awt.BorderLayout.NORTH);

        content_head4.add(jPanel22);

        jPanel25.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel25.setLayout(new java.awt.BorderLayout());

        name24.setBackground(new java.awt.Color(185, 170, 157));
        name24.setPreferredSize(new java.awt.Dimension(200, 22));
        name24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        kho2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        kho2.setText("Số đợt xuất kho trong tháng ");
        name24.add(kho2);
        kho2.setText(kho2.getText() + " " + thang);

        jPanel25.add(name24, java.awt.BorderLayout.NORTH);

        label24.setPreferredSize(new java.awt.Dimension(200, 65));
        label24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        Kho_pxk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label24.add(Kho_pxk);

        jPanel25.add(label24, java.awt.BorderLayout.CENTER);

        content_head4.add(jPanel25);

        jPanel23.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel23.setLayout(new java.awt.BorderLayout());

        label22.setPreferredSize(new java.awt.Dimension(200, 65));
        label22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        Kho_nl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label22.add(Kho_nl);

        jPanel23.add(label22, java.awt.BorderLayout.CENTER);

        name22.setBackground(new java.awt.Color(185, 170, 157));
        name22.setPreferredSize(new java.awt.Dimension(200, 22));
        name22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel22.setText("Tổng số nguyên liệu trong kho");
        name22.add(jLabel22);

        jPanel23.add(name22, java.awt.BorderLayout.NORTH);

        content_head4.add(jPanel23);

        jPanel24.setPreferredSize(new java.awt.Dimension(200, 90));
        jPanel24.setLayout(new java.awt.BorderLayout());

        label23.setPreferredSize(new java.awt.Dimension(200, 65));
        label23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 22));

        Kho_ncc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label23.add(Kho_ncc);

        jPanel24.add(label23, java.awt.BorderLayout.CENTER);

        name23.setBackground(new java.awt.Color(185, 170, 157));
        name23.setPreferredSize(new java.awt.Dimension(200, 22));
        name23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel23.setText("Số nhà cung cấp");
        name23.add(jLabel23);

        jPanel24.add(name23, java.awt.BorderLayout.NORTH);

        content_head4.add(jPanel24);

        content4.add(content_head4, java.awt.BorderLayout.NORTH);

        content_body4.setBackground(new java.awt.Color(255, 255, 255));
        content_body4.setPreferredSize(new java.awt.Dimension(1138, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        scrollPaneTable.setPreferredSize(new java.awt.Dimension(950, 500));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nguyên liệu", "Tên nguyên liệu", "Số lượng nhập kho", "Số lượng xuất kho", "Số lượng tồn kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(table);

        jPanel1.add(scrollPaneTable);
        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);

        javax.swing.GroupLayout content_body4Layout = new javax.swing.GroupLayout(content_body4);
        content_body4.setLayout(content_body4Layout);
        content_body4Layout.setHorizontalGroup(
            content_body4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        content_body4Layout.setVerticalGroup(
            content_body4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        content4.add(content_body4, java.awt.BorderLayout.SOUTH);

        scrKho.setViewportView(content4);

        tab.addTab("", scrKho);

        PanelNoiDung.add(tab);
        tab.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
            @Override
            protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
                return 0;
            }

            @Override
            protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
                return 0;
            }

            @Override
            protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void buttonEvents() {
        tab.setSelectedIndex(0);
        firstPage();
        box.addActionListener(e -> {
            int selectedIndex = box.getSelectedIndex();
            tab.setSelectedIndex(selectedIndex);  // Chuyển tab ngay lập tức

            switch (selectedIndex) {
                case 0:
                    firstPage();
                case 1:
                    secondPage();
                case 2:
                    thirdPage();
                case 3:
                    forthPage();
                case 4:
                    fifthPage();
            }
        });
    }

    public void firstPage() {
        ArrayList<Integer> xData = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));
        ArrayList<Long> yData = n12_ThongKeBUS.getInstance().ListDoanhThuTuan(frame.maCN);
        ArrayList<String> seriesThu = new ArrayList<>(Arrays.asList("Doanh thu"));

        XYChart chartDefault = n12_ThongKeBUS.getInstance().createLineChart(xData, yData, seriesThu,
                "DOANH THU TUẦN", "Thứ", "Doanh thu (VNĐ)");

        XChartPanel<XYChart> chartPanel = new XChartPanel<>(chartDefault);
        content_body.setLayout(new BorderLayout());
        content_body.add(chartPanel, BorderLayout.CENTER);
        content_body.revalidate();
        content_body.repaint();

        n12_ThongKeBUS.getInstance().setUpHeaderFirstPage(doanhThuNgay, hd, kh, mon, frame.maCN);
    }

    public void secondPage() {
        ArrayList<Integer> xData = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        ArrayList<Long> yData = n12_ThongKeBUS.getInstance().ListDoanhThuThang(frame.maCN);
        ArrayList<String> seriesThu = new ArrayList<>(Arrays.asList("Doanh thu"));

        XYChart chartDefault = n12_ThongKeBUS.getInstance().createLineChart(xData, yData, seriesThu,
                "DOANH THU TỪNG THÁNG", "Thứ", "Doanh thu (VNĐ)");

        XChartPanel<XYChart> chartPanel = new XChartPanel<>(chartDefault);
        content_body1.setLayout(new BorderLayout());
        content_body1.add(chartPanel, BorderLayout.CENTER);
        content_body1.revalidate();
        content_body1.repaint();

        n12_ThongKeBUS.getInstance().setUpHeaderSecondPage(DT_doanhThuNgay, DT_DoanhThuTuan, DT_DoanhThuThang,
                DT_DoanhThuNam, frame.maCN);
    }

    public void thirdPage() {
        ArrayList<String> categories = new ArrayList<>(Arrays.asList("Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5",
                "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"));
        ArrayList<Long> chiPhiNhap = n12_ThongKeBUS.getInstance().ListChiPhiNhapThang(frame.maCN);
        ArrayList<Long> chiPhiNhanVien = n12_ThongKeBUS.getInstance().ListChiPhiLuongThang(frame.maCN);

        CategoryChart chart = n12_ThongKeBUS.getInstance().createBarChart(categories, chiPhiNhap, chiPhiNhanVien, "BIỂU ĐỒ CHI PHÍ",
                "Tháng", "Số tiền (VNĐ)");

        XChartPanel<CategoryChart> chartPanel = new XChartPanel<>(chart);
        content_body2.setLayout(new BorderLayout());
        content_body2.add(chartPanel, BorderLayout.CENTER);
        content_body2.revalidate();
        content_body2.repaint();

        n12_ThongKeBUS.getInstance().setUpHeaderThirdPage(CP_ChiPhiNhap, luong, tong, frame.maCN);
    }

    public void forthPage() {
        ArrayList<String> categories = new ArrayList<>(Arrays.asList("Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5",
                "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"));
        ArrayList<Long> chiPhiNhap = n12_ThongKeBUS.getInstance().ListChiPhiNhapThang(frame.maCN);
        ArrayList<Long> chiPhiNhanVien = n12_ThongKeBUS.getInstance().ListChiPhiLuongThang(frame.maCN);
        ArrayList<Long> doanhThu = n12_ThongKeBUS.getInstance().ListDoanhThuThang(frame.maCN);

        ArrayList<Long> loiNhuan = new ArrayList<>();

        for (int i = 0; i < doanhThu.size(); i++) {
            long ln = doanhThu.get(i) - chiPhiNhap.get(i) - chiPhiNhanVien.get(i);
            loiNhuan.add(ln);
        }

        CategoryChart chart = n12_ThongKeBUS.getInstance().createBarChart(categories, loiNhuan, "BIỂU ĐỒ LỢI NHUẬN TỪNG THÁNG",
                "Tháng", "Số tiền (VNĐ)");

        XChartPanel<CategoryChart> chartPanel = new XChartPanel<>(chart);
        content_body3.setLayout(new BorderLayout());
        content_body3.add(chartPanel, BorderLayout.CENTER);
        content_body3.revalidate();
        content_body3.repaint();

        n12_ThongKeBUS.getInstance().setUpHeaderFourthPage(LN_LoiNhuanThang, LN_LoiNhuanNam, frame.maCN);
    }

    public void fifthPage() {
        
        content_body4.revalidate();
        content_body4.repaint();

        n12_ThongKeBUS.getInstance().setUpHeaderFifthPage(Kho_pn, Kho_pxk, Kho_nl, Kho_ncc, frame.maCN);
        n12_ThongKeBUS.getInstance().setUpBodyKhoHang(table, frame.maCN);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CP_ChiPhiNhap;
    private javax.swing.JLabel DT_DoanhThuNam;
    private javax.swing.JLabel DT_DoanhThuThang;
    private javax.swing.JLabel DT_DoanhThuTuan;
    private javax.swing.JLabel DT_doanhThuNgay;
    private javax.swing.JLabel Kho_ncc;
    private javax.swing.JLabel Kho_nl;
    private javax.swing.JLabel Kho_pn;
    private javax.swing.JLabel Kho_pxk;
    private javax.swing.JLabel LN_LoiNhuanNam;
    private javax.swing.JLabel LN_LoiNhuanThang;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JPanel Title;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JPanel content;
    private javax.swing.JPanel content1;
    private javax.swing.JPanel content2;
    private javax.swing.JPanel content3;
    private javax.swing.JPanel content4;
    private javax.swing.JPanel content_body;
    private javax.swing.JPanel content_body1;
    private javax.swing.JPanel content_body2;
    private javax.swing.JPanel content_body3;
    private javax.swing.JPanel content_body4;
    private javax.swing.JPanel content_head;
    private javax.swing.JPanel content_head1;
    private javax.swing.JPanel content_head2;
    private javax.swing.JPanel content_head3;
    private javax.swing.JPanel content_head4;
    private javax.swing.JLabel cp1;
    private javax.swing.JLabel cp2;
    private javax.swing.JLabel cp3;
    private javax.swing.JLabel doanhThuNgay;
    private javax.swing.JLabel dt1;
    private javax.swing.JLabel dt2;
    private javax.swing.JLabel hd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel kh;
    private javax.swing.JLabel kho1;
    private javax.swing.JLabel kho2;
    private javax.swing.JPanel label10;
    private javax.swing.JPanel label11;
    private javax.swing.JPanel label12;
    private javax.swing.JPanel label13;
    private javax.swing.JPanel label14;
    private javax.swing.JPanel label15;
    private javax.swing.JPanel label16;
    private javax.swing.JPanel label17;
    private javax.swing.JPanel label18;
    private javax.swing.JPanel label19;
    private javax.swing.JPanel label20;
    private javax.swing.JPanel label21;
    private javax.swing.JPanel label22;
    private javax.swing.JPanel label23;
    private javax.swing.JPanel label24;
    private javax.swing.JPanel label8;
    private javax.swing.JPanel label9;
    private javax.swing.JLabel ln;
    private javax.swing.JLabel ln1;
    private javax.swing.JLabel luong;
    private javax.swing.JLabel mon;
    private javax.swing.JPanel name10;
    private javax.swing.JPanel name11;
    private javax.swing.JPanel name12;
    private javax.swing.JPanel name13;
    private javax.swing.JPanel name14;
    private javax.swing.JPanel name15;
    private javax.swing.JPanel name16;
    private javax.swing.JPanel name17;
    private javax.swing.JPanel name18;
    private javax.swing.JPanel name19;
    private javax.swing.JPanel name20;
    private javax.swing.JPanel name21;
    private javax.swing.JPanel name22;
    private javax.swing.JPanel name23;
    private javax.swing.JPanel name24;
    private javax.swing.JPanel name8;
    private javax.swing.JPanel name9;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrChiPhi;
    private javax.swing.JScrollPane scrDefault;
    private javax.swing.JScrollPane scrDoanhThu;
    private javax.swing.JScrollPane scrKho;
    private javax.swing.JScrollPane scrLoiNhuan;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable table;
    private javax.swing.JLabel tong;
    // End of variables declaration//GEN-END:variables
}
