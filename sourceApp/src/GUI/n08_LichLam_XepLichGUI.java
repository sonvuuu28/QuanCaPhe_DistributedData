package GUI;

import BUS.*;
import DTO.*;
import Util.Utils;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class n08_LichLam_XepLichGUI extends javax.swing.JFrame {

    public n08_LichLamGUI frame;
    private Date date;
    public String maCN;

    public n08_LichLam_XepLichGUI(n08_LichLamGUI frame, String maCN) {
        this.frame = frame;
        this.maCN = maCN;
        initComponents();
        buttonEvents();
        Utils.getInstance().dragPanel(PanelNoiDung, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        PanelKhung = new javax.swing.JPanel();
        PanelNoiDung = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        BtnCancel = new javax.swing.JPanel();
        labelCancel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Biggest_Wrapper = new javax.swing.JPanel();
        Wrapper_Inner = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        LblMaHoaDon19 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        nv = new javax.swing.JComboBox<>();
        thu2 = new javax.swing.JPanel();
        LblMaHoaDon12 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        t2 = new javax.swing.JComboBox<>();
        thu3 = new javax.swing.JPanel();
        LblMaHoaDon13 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        t3 = new javax.swing.JComboBox<>();
        thu4 = new javax.swing.JPanel();
        LblMaHoaDon15 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        t4 = new javax.swing.JComboBox<>();
        thu5 = new javax.swing.JPanel();
        LblMaHoaDon14 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        t5 = new javax.swing.JComboBox<>();
        thu6 = new javax.swing.JPanel();
        LblMaHoaDon16 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        t6 = new javax.swing.JComboBox<>();
        thu7 = new javax.swing.JPanel();
        LblMaHoaDon17 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        t7 = new javax.swing.JComboBox<>();
        chuNhat = new javax.swing.JPanel();
        LblMaHoaDon18 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        cn = new javax.swing.JComboBox<>();
        PanelTool = new javax.swing.JPanel();
        BtnThem = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnTaiLai = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        start = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        end = new javax.swing.JLabel();
        PanelTimKiem = new javax.swing.JPanel();
        TimKiem = new javax.swing.JTextField();
        ngay = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        PanelKhung.setBackground(new java.awt.Color(122, 74, 74));
        PanelKhung.setMaximumSize(new java.awt.Dimension(870, 490));
        PanelKhung.setMinimumSize(new java.awt.Dimension(870, 490));
        PanelKhung.setPreferredSize(new java.awt.Dimension(612, 462));

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setMaximumSize(new java.awt.Dimension(858, 478));
        PanelNoiDung.setMinimumSize(new java.awt.Dimension(858, 478));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(600, 450));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(600, 28));

        BtnCancel.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancel.setMaximumSize(new java.awt.Dimension(28, 28));
        BtnCancel.setPreferredSize(new java.awt.Dimension(28, 28));

        labelCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCancel.setText("x");
        labelCancel.setPreferredSize(new java.awt.Dimension(8, 14));
        BtnCancel.add(labelCancel);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Title.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("XẾP LỊCH LÀM");
        Title.setMaximumSize(new java.awt.Dimension(1000, 32));
        Title.setPreferredSize(new java.awt.Dimension(600, 32));

        Biggest_Wrapper.setBackground(new java.awt.Color(219, 189, 142));
        Biggest_Wrapper.setPreferredSize(new java.awt.Dimension(512, 242));
        Biggest_Wrapper.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 6));

        Wrapper_Inner.setBackground(new java.awt.Color(255, 255, 255));
        Wrapper_Inner.setMaximumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setMinimumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setPreferredSize(new java.awt.Dimension(500, 230));
        Wrapper_Inner.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 8));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon19.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon19.setText("Nhân viên");
        LblMaHoaDon19.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel8.add(LblMaHoaDon19);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel30.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        nv.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel30.add(nv);

        jPanel8.add(jPanel30);

        Wrapper_Inner.add(jPanel8);

        thu2.setBackground(new java.awt.Color(255, 255, 255));
        thu2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon12.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon12.setText("Thứ 2");
        LblMaHoaDon12.setPreferredSize(new java.awt.Dimension(60, 16));
        thu2.add(LblMaHoaDon12);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel29.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        t2.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel29.add(t2);

        thu2.add(jPanel29);

        Wrapper_Inner.add(thu2);

        thu3.setBackground(new java.awt.Color(255, 255, 255));
        thu3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon13.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon13.setText("Thứ 3");
        LblMaHoaDon13.setPreferredSize(new java.awt.Dimension(60, 16));
        thu3.add(LblMaHoaDon13);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel31.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        t3.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel31.add(t3);

        thu3.add(jPanel31);

        Wrapper_Inner.add(thu3);

        thu4.setBackground(new java.awt.Color(255, 255, 255));
        thu4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon15.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon15.setText("Thứ 4");
        LblMaHoaDon15.setPreferredSize(new java.awt.Dimension(60, 16));
        thu4.add(LblMaHoaDon15);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel35.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        t4.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel35.add(t4);

        thu4.add(jPanel35);

        Wrapper_Inner.add(thu4);

        thu5.setBackground(new java.awt.Color(255, 255, 255));
        thu5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon14.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon14.setText("Thứ 5");
        LblMaHoaDon14.setPreferredSize(new java.awt.Dimension(60, 16));
        thu5.add(LblMaHoaDon14);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel33.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        t5.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel33.add(t5);

        thu5.add(jPanel33);

        Wrapper_Inner.add(thu5);

        thu6.setBackground(new java.awt.Color(255, 255, 255));
        thu6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon16.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon16.setText("Thứ 6");
        LblMaHoaDon16.setPreferredSize(new java.awt.Dimension(60, 16));
        thu6.add(LblMaHoaDon16);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel36.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        t6.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel36.add(t6);

        thu6.add(jPanel36);

        Wrapper_Inner.add(thu6);

        thu7.setBackground(new java.awt.Color(255, 255, 255));
        thu7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon17.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon17.setText("Thứ 7");
        LblMaHoaDon17.setPreferredSize(new java.awt.Dimension(60, 16));
        thu7.add(LblMaHoaDon17);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        t7.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel37.add(t7);

        thu7.add(jPanel37);

        Wrapper_Inner.add(thu7);

        chuNhat.setBackground(new java.awt.Color(255, 255, 255));
        chuNhat.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon18.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon18.setText("Chủ nhật");
        LblMaHoaDon18.setPreferredSize(new java.awt.Dimension(60, 16));
        chuNhat.add(LblMaHoaDon18);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel38.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        cn.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel38.add(cn);

        chuNhat.add(jPanel38);

        Wrapper_Inner.add(chuNhat);

        Biggest_Wrapper.add(Wrapper_Inner);

        PanelTool.setBackground(new java.awt.Color(255, 255, 255));
        PanelTool.setMaximumSize(new java.awt.Dimension(1000, 50));
        PanelTool.setMinimumSize(new java.awt.Dimension(50, 50));
        PanelTool.setPreferredSize(new java.awt.Dimension(420, 35));
        PanelTool.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 35, 5));

        BtnThem.setBackground(new java.awt.Color(51, 51, 51));
        BtnThem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnThem.setForeground(new java.awt.Color(255, 255, 255));
        BtnThem.setText("Tạo lịch");
        BtnThem.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnThem.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnThem.setPreferredSize(new java.awt.Dimension(90, 25));
        PanelTool.add(BtnThem);

        BtnUpdate.setBackground(new java.awt.Color(0, 153, 0));
        BtnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setText("Chỉnh");
        BtnUpdate.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnUpdate.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnUpdate.setPreferredSize(new java.awt.Dimension(90, 25));
        PanelTool.add(BtnUpdate);

        BtnTaiLai.setBackground(new java.awt.Color(51, 102, 255));
        BtnTaiLai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        BtnTaiLai.setText("Tải lại");
        BtnTaiLai.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnTaiLai.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnTaiLai.setPreferredSize(new java.awt.Dimension(90, 25));
        PanelTool.add(BtnTaiLai);

        jPanel11.setBackground(new java.awt.Color(245, 245, 245));
        jPanel11.setPreferredSize(new java.awt.Dimension(350, 24));

        jLabel1.setText("Thời gian:");
        jPanel11.add(jLabel1);

        start.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel11.add(start);

        jLabel3.setText("đến");
        jPanel11.add(jLabel3);

        end.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jPanel11.add(end);

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(161, 32));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(161, 32));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(163, 32));

        TimKiem.setBackground(new java.awt.Color(241, 240, 240));
        TimKiem.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        TimKiem.setText("Chọn ngày trong tuần");
        TimKiem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TimKiem.setDisabledTextColor(new java.awt.Color(0, 102, 0));
        TimKiem.setEnabled(false);
        TimKiem.setMaximumSize(new java.awt.Dimension(130, 18));
        TimKiem.setMinimumSize(new java.awt.Dimension(130, 18));
        TimKiem.setPreferredSize(new java.awt.Dimension(130, 18));

        ngay.setPreferredSize(new java.awt.Dimension(20, 22));

        javax.swing.GroupLayout PanelTimKiemLayout = new javax.swing.GroupLayout(PanelTimKiem);
        PanelTimKiem.setLayout(PanelTimKiemLayout);
        PanelTimKiemLayout.setHorizontalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTimKiemLayout.setVerticalGroup(
            PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTimKiemLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(PanelTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(PanelTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelNoiDungLayout.setVerticalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelKhungLayout = new javax.swing.GroupLayout(PanelKhung);
        PanelKhung.setLayout(PanelKhungLayout);
        PanelKhungLayout.setHorizontalGroup(
            PanelKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhungLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PanelNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelKhungLayout.setVerticalGroup(
            PanelKhungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhungLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(PanelNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void reset(Date Ngay) {
        if (Ngay == null) {
            Ngay = Date.valueOf(LocalDate.now());
        }
        n08_LichLamBUS.getInstance().setLabel_StartEndDate(start, end, Ngay);

        nv.setSelectedIndex(0);
        JComboBox<CaLamDTO>[] comboBoxes = new JComboBox[]{t2, t3, t4, t5, t6, t7, cn};
        for (JComboBox<CaLamDTO> box : comboBoxes) {
            CaLamDTO ca = n08_CaLamBUS.getInstance().searchCaLamByMa("CLOFF");
            box.setSelectedItem(ca);
        }
        TimKiem.setText("Chọn ngày trong tuần");
        setJPanel_NgayTuongLai(Ngay);

        ngay.setDate(Ngay);
        TimKiem.setText(Utils.getInstance().SQLDateString_Transform_normalDateString(Ngay + ""));

        addOrUpdateBtn(Ngay);
    }

    private void buttonEvents() {
        n08_LichLamBUS.getInstance().setUp_XepLichLamGUI_combobox(nv, t2, t3, t4, t5, t6, t7, cn, maCN);
        reset(null);
        BtnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
            }
        });

        BtnTaiLai.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset(null);
            }
        });

        ngay.getDateEditor().addPropertyChangeListener("date", evt -> {
            if (ngay.getDate() != null) {
                if (n08_LichLamBUS.getInstance().checkInput(ngay)) {
                    date = new Date(ngay.getDate().getTime());
                    reset(date);
                    setJPanel_NgayTuongLai(date);
                    addOrUpdateBtn(date);
                    frame.resetXepLich(date);
                } else {
                    ngay.setDate(null);
                }
            }
        });

        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (n08_LichLamBUS.getInstance().checkInput(ngay)) {
                    date = new Date(ngay.getDate().getTime());

                    int response = JOptionPane.showConfirmDialog(null, "Bạn muốn khởi tạo tuần làm "
                            + "không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        if (n08_LichLamBUS.getInstance().insert(date, maCN)) {
                            frame.resetXepLich(date);
                            reset(date);
                        }
                    }
                }
            }
        });

        BtnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (n08_LichLamBUS.getInstance().checkInput(ngay)) {
                    date = new Date(ngay.getDate().getTime());
                    NhanVienDTO nhanVien = (NhanVienDTO) nv.getSelectedItem();
                    ArrayList<CaLamDTO> ds = new ArrayList<>();
                    ds.add((CaLamDTO) t2.getSelectedItem());
                    ds.add((CaLamDTO) t3.getSelectedItem());
                    ds.add((CaLamDTO) t4.getSelectedItem());
                    ds.add((CaLamDTO) t5.getSelectedItem());
                    ds.add((CaLamDTO) t6.getSelectedItem());
                    ds.add((CaLamDTO) t7.getSelectedItem());
                    ds.add((CaLamDTO) cn.getSelectedItem());
                    if (n08_LichLamBUS.getInstance().update(date, nhanVien, ds)) {
                        frame.resetXepLich(date);
                        reset(date);
                    }
                }
            }
        });
    }

    public void addOrUpdateBtn(Date date) {
        Boolean bus = n08_LichLamBUS.getInstance().checkExistLichLam(date, maCN);
        if (bus) {
            BtnThem.setVisible(false);
            BtnUpdate.setVisible(true);
        } else {
            BtnThem.setVisible(true);
            BtnUpdate.setVisible(false);
        }
    }

    public void setJPanel_NgayTuongLai(Date ngay) {
        List<Date> week = Util.Utils.getInstance().getDate_DaysInWeek(ngay);
        Date now = Date.valueOf(LocalDate.now().plusDays(1));

        JPanel[] dayCombos = {thu2, thu3, thu4, thu5, thu6, thu7, chuNhat};

        for (int i = 0; i < week.size(); i++) {
            if (week.get(i).before(now)) {
                dayCombos[i].setVisible(false);
            } else {
                dayCombos[i].setVisible(true);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest_Wrapper;
    private javax.swing.JPanel BtnCancel;
    private javax.swing.JButton BtnTaiLai;
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JLabel LblMaHoaDon12;
    private javax.swing.JLabel LblMaHoaDon13;
    private javax.swing.JLabel LblMaHoaDon14;
    private javax.swing.JLabel LblMaHoaDon15;
    private javax.swing.JLabel LblMaHoaDon16;
    private javax.swing.JLabel LblMaHoaDon17;
    private javax.swing.JLabel LblMaHoaDon18;
    private javax.swing.JLabel LblMaHoaDon19;
    private javax.swing.JPanel PanelKhung;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JPanel PanelTool;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel Wrapper_Inner;
    private javax.swing.JPanel chuNhat;
    private javax.swing.JComboBox<CaLamDTO> cn;
    private javax.swing.JLabel end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelCancel;
    private com.toedter.calendar.JDateChooser ngay;
    private javax.swing.JComboBox<String> nv;
    private javax.swing.JLabel start;
    private javax.swing.JComboBox<CaLamDTO> t2;
    private javax.swing.JComboBox<CaLamDTO> t3;
    private javax.swing.JComboBox<CaLamDTO> t4;
    private javax.swing.JComboBox<CaLamDTO> t5;
    private javax.swing.JComboBox<CaLamDTO> t6;
    private javax.swing.JComboBox<CaLamDTO> t7;
    private javax.swing.JPanel thu2;
    private javax.swing.JPanel thu3;
    private javax.swing.JPanel thu4;
    private javax.swing.JPanel thu5;
    private javax.swing.JPanel thu6;
    private javax.swing.JPanel thu7;
    // End of variables declaration//GEN-END:variables
}
