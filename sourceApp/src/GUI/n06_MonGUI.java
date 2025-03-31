package GUI;

import BUS.n06_MonBUS;
import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class n06_MonGUI extends javax.swing.JPanel {

    public void setImageTextField(String image) {
        hinhAnh.setText(image);
    }

    public String getTenMon() {
        return ten.getText();
    }

    public n06_MonGUI() {
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
        jPanel7 = new javax.swing.JPanel();
        LblMaHoaDon16 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        hinhAnh = new javax.swing.JTextField();
        BtnThemAnh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        LblMaHoaDon15 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        gia = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        LblMaHoaDon17 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        trangThai = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        LblMaHoaDon14 = new javax.swing.JLabel();
        loaiMon = new javax.swing.JComboBox<>();
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
        PanelMon = new javax.swing.JPanel();
        LabelBanHang = new javax.swing.JLabel();
        PanelLoaiMon = new javax.swing.JPanel();
        LabelHoaDon = new javax.swing.JLabel();
        LabelMenu = new javax.swing.JLabel();

        Biggest.setBackground(new java.awt.Color(255, 255, 255));
        Biggest.setMaximumSize(new java.awt.Dimension(1156, 661));
        Biggest.setMinimumSize(new java.awt.Dimension(1156, 661));
        Biggest.setPreferredSize(new java.awt.Dimension(1156, 661));

        Biggest_Wrapper.setBackground(new java.awt.Color(219, 189, 142));

        Wrapper_Inner.setBackground(new java.awt.Color(255, 255, 255));
        Wrapper_Inner.setMaximumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setMinimumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setPreferredSize(new java.awt.Dimension(280, 340));
        Wrapper_Inner.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("Thông tin món");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 35));
        Wrapper_Inner.add(jLabel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon12.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon12.setText("Mã món");
        LblMaHoaDon12.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel1.add(LblMaHoaDon12);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel29.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        ma.setBackground(new java.awt.Color(238, 238, 238));
        ma.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ma.setForeground(new java.awt.Color(51, 0, 204));
        ma.setText("M001");
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
        LblMaHoaDon13.setText("Tên món");
        LblMaHoaDon13.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel2.add(LblMaHoaDon13);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel31.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon16.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon16.setText("Hình ảnh");
        LblMaHoaDon16.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel7.add(LblMaHoaDon16);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel36.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 7));

        hinhAnh.setEditable(false);
        hinhAnh.setBorder(null);
        hinhAnh.setMaximumSize(new java.awt.Dimension(200, 25));
        hinhAnh.setMinimumSize(new java.awt.Dimension(200, 25));
        hinhAnh.setPreferredSize(new java.awt.Dimension(105, 25));
        jPanel36.add(hinhAnh);

        BtnThemAnh.setBackground(new java.awt.Color(0, 0, 0));
        BtnThemAnh.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        BtnThemAnh.setForeground(new java.awt.Color(255, 255, 255));
        BtnThemAnh.setText("...");
        BtnThemAnh.setMaximumSize(new java.awt.Dimension(100, 24));
        BtnThemAnh.setMinimumSize(new java.awt.Dimension(100, 24));
        BtnThemAnh.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel36.add(BtnThemAnh);

        jPanel7.add(jPanel36);

        Wrapper_Inner.add(jPanel7);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon15.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon15.setText("Đơn giá");
        LblMaHoaDon15.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel4.add(LblMaHoaDon15);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel35.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        gia.setBorder(null);
        gia.setMaximumSize(new java.awt.Dimension(200, 25));
        gia.setMinimumSize(new java.awt.Dimension(200, 25));
        gia.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel35.add(gia);

        jSeparator16.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator16.setPreferredSize(new java.awt.Dimension(130, 5));
        jPanel35.add(jSeparator16);

        jPanel4.add(jPanel35);

        Wrapper_Inner.add(jPanel4);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon17.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon17.setText("Trạng thái");
        LblMaHoaDon17.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel8.add(LblMaHoaDon17);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setPreferredSize(new java.awt.Dimension(130, 37));
        jPanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 7));

        trangThai.setPreferredSize(new java.awt.Dimension(130, 23));
        jPanel37.add(trangThai);

        jPanel8.add(jPanel37);

        Wrapper_Inner.add(jPanel8);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 12));

        LblMaHoaDon14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon14.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon14.setText("Loại món");
        LblMaHoaDon14.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel3.add(LblMaHoaDon14);

        loaiMon.setPreferredSize(new java.awt.Dimension(130, 23));
        jPanel3.add(loaiMon);

        Wrapper_Inner.add(jPanel3);

        Biggest_Wrapper.add(Wrapper_Inner);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã món", "Tên món", "Đơn giá", "Trạng thái", "Loại món"
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
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
        BtnBar.setPreferredSize(new java.awt.Dimension(315, 100));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(BtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        BtnBarLayout.setVerticalGroup(
            BtnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBarLayout.createSequentialGroup()
                .addGroup(BtnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(BtnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Biggest_Left_Header.setBackground(new java.awt.Color(255, 255, 255));
        Biggest_Left_Header.setPreferredSize(new java.awt.Dimension(726, 80));
        Biggest_Left_Header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 25, 20));

        PanelMon.setBackground(new java.awt.Color(219, 189, 142));
        PanelMon.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelMon.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelMon.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelMon.setLayout(new java.awt.GridBagLayout());

        LabelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelBanHang.setText("MÓN");
        PanelMon.add(LabelBanHang, new java.awt.GridBagConstraints());

        Biggest_Left_Header.add(PanelMon);

        PanelLoaiMon.setBackground(new java.awt.Color(219, 189, 142));
        PanelLoaiMon.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelLoaiMon.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelLoaiMon.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelLoaiMon.setLayout(new java.awt.GridBagLayout());

        LabelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelHoaDon.setText("LOẠI MÓN");
        PanelLoaiMon.add(LabelHoaDon, new java.awt.GridBagConstraints());

        Biggest_Left_Header.add(PanelLoaiMon);

        LabelMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu.setText("Món");

        javax.swing.GroupLayout BiggestLayout = new javax.swing.GroupLayout(Biggest);
        Biggest.setLayout(BiggestLayout);
        BiggestLayout.setHorizontalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBar, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(BiggestLayout.createSequentialGroup()
                .addComponent(Biggest_Left_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(LabelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BiggestLayout.setVerticalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addComponent(Biggest_Left_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelMenu)
                .addGap(15, 15, 15)
                .addComponent(functionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BiggestLayout.createSequentialGroup()
                        .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(BtnBar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Biggest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void reset() {
        n06_MonBUS.getInstance().setUp(table, loaiMon, trangThai);
        ma.setText(n06_MonBUS.getInstance().createID());
        ma.setFocusable(true);
        ten.setText("");
        gia.setText("");
        TimKiem.setText("Tìm kiếm nhanh theo tên");
        trangThai.setSelectedIndex(0);
        loaiMon.setSelectedIndex(0);
        hinhAnh.setText("");
        Util.Utils.getInstance().timKiem(TimKiem);
    }

    private void buttonEvents() {
        reset();
        gia.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String text = gia.getText();
                text = text.replaceAll("[^\\d]", "");
                text = text.replaceFirst("^0+", "");
                if (!text.isEmpty()) {
                    try {
                        Long giaDenLong = Long.valueOf(text);
                        gia.setText(Util.Utils.getInstance().LongToMoneyNoneVND(giaDenLong));
                    } catch (NumberFormatException e) {
                        gia.setText("");
                    }
                } else {
                    gia.setText("");
                }
            }
        });
        PanelMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelMon.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelMon.setBackground(new Color(219, 189, 142));
            }
        });
        PanelLoaiMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelLoaiMon.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelLoaiMon.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Biggest.removeAll();
                n06_LoaiMonGUI bh = new n06_LoaiMonGUI();
                Biggest.setLayout(new BorderLayout());
                Biggest.add(bh, BorderLayout.CENTER); // Adjust the layout constraint as needed
                Biggest.revalidate();
                Biggest.repaint();
            }
        });

        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    n06_MonBUS.getInstance().searchByName(table, TimKiem.getText());
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
                n06_MonBUS.getInstance().searchByName(table, TimKiem.getText());
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

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int count = table.getSelectedRow();
                TableModel model = table.getModel();
                ma.setFocusable(false);

                ma.setText(model.getValueAt(count, 0).toString());
                ten.setText(model.getValueAt(count, 1).toString());
                String giaTien = model.getValueAt(count, 2).toString().replace(" VNĐ", "");
                gia.setText(giaTien);
                trangThai.setSelectedItem(model.getValueAt(count, 3).toString());
                loaiMon.setSelectedItem(model.getValueAt(count, 4).toString());

                hinhAnh.setText(n06_MonBUS.getInstance().searchAnhMonByMa(ma.getText()));
            }
        });

        BtnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Long GiaTryCatch = null;
                try {
                    GiaTryCatch = Util.Utils.getInstance().MoneyToLongNoneVND(gia.getText());
                } catch (Exception e) {

                }

                Boolean status = null;
                if (trangThai.getSelectedItem().toString().equals("Bật")) {
                    status = true;
                } else if (trangThai.getSelectedItem().toString().equals("Tắt")) {
                    status = false;
                }

                String MaLoaiMon;
                try {
                    MaLoaiMon = n06_MonBUS.getInstance().searchMaLoaiMonByTen(loaiMon.getSelectedItem().toString());
                } catch (Exception e) {
                    MaLoaiMon = "";
                }

                System.out.println(MaLoaiMon);

                n06_MonBUS.getInstance().search(table, ma.getText(), ten.getText(), GiaTryCatch, status,
                        MaLoaiMon);
            }
        });

        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (n06_MonBUS.getInstance().checkInput(ma, ten, hinhAnh, gia, null, loaiMon) == true) {
                    int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm món không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        Long GiaTryCatch = null;
                        try {
                            GiaTryCatch = Util.Utils.getInstance().MoneyToLongNoneVND(gia.getText());
                        } catch (Exception e) {

                        }

                        Boolean status = null;
                        if (trangThai.getSelectedItem().toString().equals("Bật")) {
                            status = true;
                        } else if (trangThai.getSelectedItem().toString().equals("Tắt")) {
                            status = false;
                        }

                        String MaLoaiMon;
                        try {
                            MaLoaiMon = n06_MonBUS.getInstance().searchMaLoaiMonByTen(loaiMon.getSelectedItem().toString());
                        } catch (Exception e) {
                            MaLoaiMon = "";
                        }
                        boolean i = n06_MonBUS.getInstance().insert(ma.getText(), ten.getText(), hinhAnh.getText(),
                                GiaTryCatch, status, MaLoaiMon);
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
                if (ma.getText().equals(n06_MonBUS.getInstance().createID())) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 món trong danh sách để sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (n06_MonBUS.getInstance().checkInput(ma, ten, hinhAnh, gia, trangThai, loaiMon) == true) {
                        int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa thông tin món không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            Long GiaTryCatch = null;
                            try {
                                GiaTryCatch = Util.Utils.getInstance().MoneyToLongNoneVND(gia.getText());
                            } catch (Exception e) {

                            }

                            Boolean status = null;
                            if (trangThai.getSelectedItem().toString().equals("Bật")) {
                                status = true;
                            } else if (trangThai.getSelectedItem().toString().equals("Tắt")) {
                                status = false;
                            }

                            String MaLoaiMon;
                            try {
                                MaLoaiMon = n06_MonBUS.getInstance().searchMaLoaiMonByTen(loaiMon.getSelectedItem().toString());
                            } catch (Exception e) {
                                MaLoaiMon = "";
                            }
                            int i = n06_MonBUS.getInstance().update(ma.getText(), ten.getText(), hinhAnh.getText(),
                                    GiaTryCatch, status, MaLoaiMon);
                            if (i == 1 || i == 0) {
                                reset();
                            }
                        }
                    }
                }
            }
        });

        BtnThemAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n06_Mon_AnhGUI a = new n06_Mon_AnhGUI(n06_MonGUI.this, hinhAnh.getText());
                a.setVisible(true);
                a.setLocationRelativeTo(null);
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
    private javax.swing.JButton BtnThemAnh;
    private javax.swing.JButton BtnTimKiem;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JLabel LblMaHoaDon12;
    private javax.swing.JLabel LblMaHoaDon13;
    private javax.swing.JLabel LblMaHoaDon14;
    private javax.swing.JLabel LblMaHoaDon15;
    private javax.swing.JLabel LblMaHoaDon16;
    private javax.swing.JLabel LblMaHoaDon17;
    private javax.swing.JPanel PanelLoaiMon;
    private javax.swing.JPanel PanelMon;
    private javax.swing.JPanel PanelTaiLai;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JPanel Wrapper_Inner;
    private javax.swing.JPanel functionBar;
    private javax.swing.JTextField gia;
    private javax.swing.JTextField hinhAnh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JComboBox<String> loaiMon;
    private javax.swing.JTextField ma;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable table;
    private javax.swing.JTextField ten;
    private javax.swing.JComboBox<String> trangThai;
    // End of variables declaration//GEN-END:variables
}
