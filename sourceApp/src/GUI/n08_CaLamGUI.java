package GUI;

import BUS.n08_CaLamBUS;
import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class n08_CaLamGUI extends javax.swing.JPanel {

    public n08_CaLamGUI() {
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        Biggest_Wrapper = new javax.swing.JPanel();
        Wrapper_Inner = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LblMaHoaDon12 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        ma = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        LblMaHoaDon13 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        ten = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        LblMaHoaDon15 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        hhThoiGianVao = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        mmThoiGianVao = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        LblMaHoaDon16 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        hhThoiGianRa = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        mmThoiGianRa = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        LblMaHoaDon17 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        TrangThai = new javax.swing.JComboBox<>();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        functionBar = new javax.swing.JPanel();
        PanelTimKiem = new javax.swing.JPanel();
        TimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();
        PanelTaiLai = new javax.swing.JPanel();
        LabelTaiLai = new javax.swing.JLabel();
        BtnBar = new javax.swing.JPanel();
        BtnSua = new javax.swing.JButton();
        BtnThem = new javax.swing.JButton();
        BtnTimKiem = new javax.swing.JButton();
        Biggest_Left_Header = new javax.swing.JPanel();
        PanelLichLam = new javax.swing.JPanel();
        LabelBanHang = new javax.swing.JLabel();
        PanelCaLam = new javax.swing.JPanel();
        LabelHoaDon = new javax.swing.JLabel();
        LabelMenu = new javax.swing.JLabel();

        Biggest.setBackground(new java.awt.Color(255, 255, 255));
        Biggest.setMaximumSize(new java.awt.Dimension(1156, 661));
        Biggest.setMinimumSize(new java.awt.Dimension(1156, 661));

        Biggest_Wrapper.setBackground(new java.awt.Color(219, 189, 142));

        Wrapper_Inner.setBackground(new java.awt.Color(255, 255, 255));
        Wrapper_Inner.setMaximumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setMinimumSize(new java.awt.Dimension(0, 0));
        Wrapper_Inner.setPreferredSize(new java.awt.Dimension(250, 300));
        Wrapper_Inner.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("Thông tin ca làm");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(125, 35));
        Wrapper_Inner.add(jLabel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon12.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon12.setText("Mã ca");
        LblMaHoaDon12.setPreferredSize(new java.awt.Dimension(76, 16));
        jPanel1.add(LblMaHoaDon12);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel29.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 4));

        ma.setBackground(new java.awt.Color(238, 238, 238));
        ma.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ma.setForeground(new java.awt.Color(51, 0, 204));
        ma.setText("CL001");
        ma.setBorder(null);
        ma.setMaximumSize(new java.awt.Dimension(200, 25));
        ma.setMinimumSize(new java.awt.Dimension(200, 25));
        ma.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel29.add(ma);

        jSeparator13.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator13.setPreferredSize(new java.awt.Dimension(130, 5));
        jPanel29.add(jSeparator13);

        jPanel1.add(jPanel29);

        Wrapper_Inner.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon13.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon13.setText("Tên ca");
        LblMaHoaDon13.setPreferredSize(new java.awt.Dimension(76, 16));
        jPanel2.add(LblMaHoaDon13);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel31.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 4));

        ten.setBorder(null);
        ten.setMaximumSize(new java.awt.Dimension(200, 25));
        ten.setMinimumSize(new java.awt.Dimension(200, 25));
        ten.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel31.add(ten);

        jSeparator14.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator14.setPreferredSize(new java.awt.Dimension(130, 5));
        jPanel31.add(jSeparator14);

        jPanel2.add(jPanel31);

        Wrapper_Inner.add(jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon15.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon15.setText("Thời gian vào");
        LblMaHoaDon15.setPreferredSize(new java.awt.Dimension(76, 16));
        jPanel4.add(LblMaHoaDon15);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel30.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 4));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        hhThoiGianVao.setBackground(new java.awt.Color(245, 245, 245));
        hhThoiGianVao.setBorder(null);
        hhThoiGianVao.setMaximumSize(new java.awt.Dimension(200, 25));
        hhThoiGianVao.setMinimumSize(new java.awt.Dimension(200, 25));
        hhThoiGianVao.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel3.add(hhThoiGianVao);

        jSeparator17.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator17.setPreferredSize(new java.awt.Dimension(25, 5));
        jPanel3.add(jSeparator17);

        jPanel30.add(jPanel3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText(":");
        jPanel30.add(jLabel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        mmThoiGianVao.setBackground(new java.awt.Color(245, 245, 245));
        mmThoiGianVao.setBorder(null);
        mmThoiGianVao.setMaximumSize(new java.awt.Dimension(200, 25));
        mmThoiGianVao.setMinimumSize(new java.awt.Dimension(200, 25));
        mmThoiGianVao.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel6.add(mmThoiGianVao);

        jSeparator18.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator18.setPreferredSize(new java.awt.Dimension(25, 5));
        jPanel6.add(jSeparator18);

        jPanel30.add(jPanel6);

        jPanel4.add(jPanel30);

        Wrapper_Inner.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon16.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon16.setText("Thời gian ra");
        LblMaHoaDon16.setPreferredSize(new java.awt.Dimension(76, 16));
        jPanel5.add(LblMaHoaDon16);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel33.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 4));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        hhThoiGianRa.setBackground(new java.awt.Color(245, 245, 245));
        hhThoiGianRa.setBorder(null);
        hhThoiGianRa.setMaximumSize(new java.awt.Dimension(200, 25));
        hhThoiGianRa.setMinimumSize(new java.awt.Dimension(200, 25));
        hhThoiGianRa.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel7.add(hhThoiGianRa);

        jSeparator19.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator19.setPreferredSize(new java.awt.Dimension(25, 5));
        jPanel7.add(jSeparator19);

        jPanel33.add(jPanel7);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText(":");
        jPanel33.add(jLabel3);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        mmThoiGianRa.setBackground(new java.awt.Color(245, 245, 245));
        mmThoiGianRa.setBorder(null);
        mmThoiGianRa.setMaximumSize(new java.awt.Dimension(200, 25));
        mmThoiGianRa.setMinimumSize(new java.awt.Dimension(200, 25));
        mmThoiGianRa.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel8.add(mmThoiGianRa);

        jSeparator20.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator20.setPreferredSize(new java.awt.Dimension(25, 5));
        jPanel8.add(jSeparator20);

        jPanel33.add(jPanel8);

        jPanel5.add(jPanel33);

        Wrapper_Inner.add(jPanel5);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon17.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon17.setText("Trạng thái");
        LblMaHoaDon17.setPreferredSize(new java.awt.Dimension(76, 16));
        jPanel9.add(LblMaHoaDon17);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel34.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 10));

        TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bật", "Tắt" }));
        TrangThai.setPreferredSize(new java.awt.Dimension(73, 22));
        jPanel34.add(TrangThai);

        jPanel9.add(jPanel34);

        Wrapper_Inner.add(jPanel9);

        Biggest_Wrapper.add(Wrapper_Inner);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã ca làm", "Tên ca làm", "Giờ vào ca", "Giờ ra ca", "Trạng thái"
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

        functionBar.setBackground(new java.awt.Color(255, 255, 255));

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

        PanelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        PanelTaiLai.setMaximumSize(new java.awt.Dimension(34, 34));

        LabelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        LabelTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // NOI18N
        LabelTaiLai.setOpaque(true);
        PanelTaiLai.add(LabelTaiLai);

        javax.swing.GroupLayout functionBarLayout = new javax.swing.GroupLayout(functionBar);
        functionBar.setLayout(functionBarLayout);
        functionBarLayout.setHorizontalGroup(
            functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionBarLayout.createSequentialGroup()
                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        functionBarLayout.setVerticalGroup(
            functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, functionBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        BtnBar.setBackground(new java.awt.Color(255, 255, 255));
        BtnBar.setPreferredSize(new java.awt.Dimension(260, 90));

        BtnSua.setBackground(new java.awt.Color(0, 0, 0));
        BtnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSua.setForeground(new java.awt.Color(255, 255, 255));
        BtnSua.setText("Sửa");
        BtnSua.setMaximumSize(new java.awt.Dimension(100, 24));
        BtnSua.setMinimumSize(new java.awt.Dimension(100, 24));
        BtnSua.setPreferredSize(new java.awt.Dimension(100, 30));

        BtnThem.setBackground(new java.awt.Color(0, 0, 0));
        BtnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnThem.setForeground(new java.awt.Color(255, 255, 255));
        BtnThem.setText("Thêm");
        BtnThem.setMaximumSize(new java.awt.Dimension(100, 24));
        BtnThem.setMinimumSize(new java.awt.Dimension(100, 24));
        BtnThem.setPreferredSize(new java.awt.Dimension(100, 30));

        BtnTimKiem.setBackground(new java.awt.Color(0, 0, 0));
        BtnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        BtnTimKiem.setText("Tìm kiếm");
        BtnTimKiem.setMaximumSize(new java.awt.Dimension(100, 24));
        BtnTimKiem.setMinimumSize(new java.awt.Dimension(100, 24));
        BtnTimKiem.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout BtnBarLayout = new javax.swing.GroupLayout(BtnBar);
        BtnBar.setLayout(BtnBarLayout);
        BtnBarLayout.setHorizontalGroup(
            BtnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBarLayout.createSequentialGroup()
                .addComponent(BtnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BtnBarLayout.createSequentialGroup()
                .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(BtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtnBarLayout.setVerticalGroup(
            BtnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBarLayout.createSequentialGroup()
                .addGroup(BtnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(BtnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Biggest_Left_Header.setBackground(new java.awt.Color(255, 255, 255));
        Biggest_Left_Header.setPreferredSize(new java.awt.Dimension(726, 80));
        Biggest_Left_Header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 25, 20));

        PanelLichLam.setBackground(new java.awt.Color(219, 189, 142));
        PanelLichLam.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelLichLam.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelLichLam.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelLichLam.setLayout(new java.awt.GridBagLayout());

        LabelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelBanHang.setText("LỊCH LÀM");
        PanelLichLam.add(LabelBanHang, new java.awt.GridBagConstraints());

        Biggest_Left_Header.add(PanelLichLam);

        PanelCaLam.setBackground(new java.awt.Color(219, 189, 142));
        PanelCaLam.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelCaLam.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelCaLam.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelCaLam.setLayout(new java.awt.GridBagLayout());

        LabelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelHoaDon.setText("CA LÀM");
        PanelCaLam.add(LabelHoaDon, new java.awt.GridBagConstraints());

        Biggest_Left_Header.add(PanelCaLam);

        LabelMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu.setText("Ca làm");

        javax.swing.GroupLayout BiggestLayout = new javax.swing.GroupLayout(Biggest);
        Biggest.setLayout(BiggestLayout);
        BiggestLayout.setHorizontalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest_Left_Header, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BiggestLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(functionBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addComponent(LabelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BiggestLayout.setVerticalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addComponent(Biggest_Left_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelMenu)
                .addGap(40, 40, 40)
                .addComponent(functionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BiggestLayout.createSequentialGroup()
                        .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(BtnBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void reset() {
        ma.setFocusable(true);
        ma.setText(n08_CaLamBUS.getInstance().createID());
        ten.setText("");
        hhThoiGianRa.setText("");
        mmThoiGianRa.setText("");
        hhThoiGianVao.setText("");
        mmThoiGianVao.setText("");
        TrangThai.setSelectedIndex(0);
        TimKiem.setText("Tìm kiếm nhanh theo tên");
        n08_CaLamBUS.getInstance().listAll(table);
        Util.Utils.getInstance().timKiem(TimKiem);
    }

    private java.sql.Time createTime(String hh, String mm) {
        String timeString = hh + ":" + mm + ":00";
        java.sql.Time time = null;

        try {
            time = java.sql.Time.valueOf(timeString);
        } catch (Exception e) {
            System.out.println(e);
        }
        return time;
    }

    private void buttonEvents() {
        reset();

        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    n08_CaLamBUS.getInstance().searchByName(table, TimKiem.getText());
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
                n08_CaLamBUS.getInstance().searchByName(table, TimKiem.getText());
            }
        });

        PanelLichLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelLichLam.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelLichLam.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Biggest.removeAll();
                n08_LichLamGUI bh = new n08_LichLamGUI();
                Biggest.setLayout(new BorderLayout());
                Biggest.add(bh, BorderLayout.CENTER); // Adjust the layout constraint as needed
                Biggest.revalidate();
                Biggest.repaint();
            }
        });
        PanelCaLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCaLam.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCaLam.setBackground(new Color(219, 189, 142));
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

        BtnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String hh = hhThoiGianVao.getText();
                String mm = mmThoiGianVao.getText();
                java.sql.Time hh_mm = createTime(hh, mm);

                String hh1 = hhThoiGianRa.getText();
                String mm1 = mmThoiGianRa.getText();
                java.sql.Time hh_mm1 = createTime(hh1, mm1);

                Boolean trangThai = null;
                if (TrangThai.getSelectedItem().toString().equals("Bật")) {
                    trangThai = true;
                } else {
                    trangThai = false;
                }

                n08_CaLamBUS.getInstance().search(table, ma.getText(), ten.getText(), hh_mm, hh_mm1, trangThai);
            }
        });

        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (n08_CaLamBUS.getInstance().checkInput(ma, ten, hhThoiGianVao, mmThoiGianVao, hhThoiGianRa, mmThoiGianRa) == true) {
                    int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm ca làm không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        boolean i = n08_CaLamBUS.getInstance().insert(ma.getText(), ten.getText(),
                                createTime(hhThoiGianVao.getText(), mmThoiGianVao.getText()),
                                createTime(hhThoiGianRa.getText(), mmThoiGianRa.getText()));
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
                if (ma.getText().equals(n08_CaLamBUS.getInstance().createID())) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 ca làm trong danh sách để sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (n08_CaLamBUS.getInstance().checkInput(ma, ten, hhThoiGianVao, mmThoiGianVao, hhThoiGianRa, mmThoiGianRa) == true) {
                        int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa thông tin ca làm không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            Boolean trangThai = null;
                            if (TrangThai.getSelectedItem().toString().equals("Bật")) {
                                trangThai = true;
                            } else {
                                trangThai = false;
                            }
                            int i = n08_CaLamBUS.getInstance().update(ma.getText(), ten.getText(),
                                    createTime(hhThoiGianVao.getText(), mmThoiGianVao.getText()),
                                    createTime(hhThoiGianRa.getText(), mmThoiGianRa.getText()), trangThai);
                            if (i == 1 || i == 0) {
                                reset();
                            }
                        }
                    }
                }
            }
        });

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int count = table.getSelectedRow();
                TableModel model = table.getModel();
                ma.setFocusable(false);

                ma.setText(model.getValueAt(count, 0).toString());
                ten.setText(model.getValueAt(count, 1).toString());

                String ThoiGianVao = model.getValueAt(count, 2).toString();
                hhThoiGianVao.setText(ThoiGianVao.substring(0, 2));
                mmThoiGianVao.setText(ThoiGianVao.substring(3, 5));

                String ThoiGianRa = model.getValueAt(count, 3).toString();
                hhThoiGianRa.setText(ThoiGianRa.substring(0, 2));
                mmThoiGianRa.setText(ThoiGianRa.substring(3, 5));

                if (model.getValueAt(count, 4).toString().equals("Bật")) {
                    TrangThai.setSelectedIndex(0);
                } else {
                    TrangThai.setSelectedIndex(1);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest;
    private javax.swing.JPanel Biggest_Left_Header;
    private javax.swing.JPanel Biggest_Wrapper;
    private javax.swing.JPanel BtnBar;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnTimKiem;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JLabel LblMaHoaDon12;
    private javax.swing.JLabel LblMaHoaDon13;
    private javax.swing.JLabel LblMaHoaDon15;
    private javax.swing.JLabel LblMaHoaDon16;
    private javax.swing.JLabel LblMaHoaDon17;
    private javax.swing.JPanel PanelCaLam;
    private javax.swing.JPanel PanelLichLam;
    private javax.swing.JPanel PanelTaiLai;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JComboBox<String> TrangThai;
    private javax.swing.JPanel Wrapper_Inner;
    private javax.swing.JPanel functionBar;
    private javax.swing.JTextField hhThoiGianRa;
    private javax.swing.JTextField hhThoiGianVao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JTextField ma;
    private javax.swing.JTextField mmThoiGianRa;
    private javax.swing.JTextField mmThoiGianVao;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable table;
    private javax.swing.JTextField ten;
    // End of variables declaration//GEN-END:variables
}
