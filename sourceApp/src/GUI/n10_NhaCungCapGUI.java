package GUI;

import BUS.n10_NhaCungCapBUS;
import Util.TableCustom;
import Util.Utils;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class n10_NhaCungCapGUI extends javax.swing.JPanel {

    public n10_NhaCungCapGUI() {
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        Body_Title = new javax.swing.JLabel();
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
        jPanel35 = new javax.swing.JPanel();
        diachi = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        LblMaHoaDon14 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        sdt = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
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

        Biggest.setBackground(new java.awt.Color(255, 255, 255));
        Biggest.setMaximumSize(new java.awt.Dimension(1156, 661));
        Biggest.setMinimumSize(new java.awt.Dimension(1156, 661));
        Biggest.setPreferredSize(new java.awt.Dimension(1156, 661));

        Body_Title.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        Body_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Body_Title.setText("Nhà cung cấp");
        Body_Title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Body_Title.setMaximumSize(new java.awt.Dimension(246, 42));
        Body_Title.setMinimumSize(new java.awt.Dimension(246, 42));
        Body_Title.setPreferredSize(new java.awt.Dimension(246, 42));

        Biggest_Wrapper.setBackground(new java.awt.Color(219, 189, 142));

        Wrapper_Inner.setBackground(new java.awt.Color(255, 255, 255));
        Wrapper_Inner.setMaximumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setMinimumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setPreferredSize(new java.awt.Dimension(250, 280));
        Wrapper_Inner.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("Thông tin nhà cung cấp");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(175, 35));
        Wrapper_Inner.add(jLabel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon12.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon12.setText("Mã NCC");
        LblMaHoaDon12.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel1.add(LblMaHoaDon12);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel29.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        ma.setBackground(new java.awt.Color(238, 238, 238));
        ma.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ma.setForeground(new java.awt.Color(51, 0, 204));
        ma.setText("NCC001");
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
        LblMaHoaDon13.setText("Tên NCC");
        LblMaHoaDon13.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel2.add(LblMaHoaDon13);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setPreferredSize(new java.awt.Dimension(150, 37));
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon15.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon15.setText("Địa chỉ");
        LblMaHoaDon15.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel4.add(LblMaHoaDon15);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel35.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        diachi.setBorder(null);
        diachi.setMaximumSize(new java.awt.Dimension(200, 25));
        diachi.setMinimumSize(new java.awt.Dimension(200, 25));
        diachi.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel35.add(diachi);

        jSeparator16.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator16.setPreferredSize(new java.awt.Dimension(130, 5));
        jPanel35.add(jSeparator16);

        jPanel4.add(jPanel35);

        Wrapper_Inner.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(240, 47));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon14.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon14.setText("SĐT");
        LblMaHoaDon14.setPreferredSize(new java.awt.Dimension(60, 16));
        jPanel3.add(LblMaHoaDon14);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setPreferredSize(new java.awt.Dimension(150, 37));
        jPanel33.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        sdt.setBorder(null);
        sdt.setMaximumSize(new java.awt.Dimension(200, 25));
        sdt.setMinimumSize(new java.awt.Dimension(200, 25));
        sdt.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel33.add(sdt);

        jSeparator15.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator15.setPreferredSize(new java.awt.Dimension(130, 5));
        jPanel33.add(jSeparator15);

        jPanel3.add(jPanel33);

        Wrapper_Inner.add(jPanel3);

        Biggest_Wrapper.add(Wrapper_Inner);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

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
                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        functionBarLayout.setVerticalGroup(
            functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTaiLai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(0, 0, Short.MAX_VALUE))
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

        javax.swing.GroupLayout BiggestLayout = new javax.swing.GroupLayout(Biggest);
        Biggest.setLayout(BiggestLayout);
        BiggestLayout.setHorizontalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addComponent(Body_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BiggestLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(functionBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BiggestLayout.setVerticalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addComponent(Body_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(functionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BiggestLayout.createSequentialGroup()
                        .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(BiggestLayout.createSequentialGroup()
                        .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(Biggest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reset() {
        ma.setFocusable(true);
        ma.setText(n10_NhaCungCapBUS.getInstance().createID());
        ten.setText("");
        sdt.setText("");
        diachi.setText("");
        TimKiem.setText("Tìm kiếm nhanh theo tên");
        n10_NhaCungCapBUS.getInstance().listAll(table);
        Utils.getInstance().timKiem(TimKiem);
    }

    private void buttonEvents() {
        reset();
        Utils.getInstance().sdt(sdt);

        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    n10_NhaCungCapBUS.getInstance().searchByName(table, TimKiem.getText());
                }
            }
        });

        LabelAnhTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n10_NhaCungCapBUS.getInstance().searchByName(table, TimKiem.getText());
            }
        });

        BtnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n10_NhaCungCapBUS.getInstance().search(table, ma.getText(), ten.getText(), diachi.getText(), sdt.getText());
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

        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (n10_NhaCungCapBUS.getInstance().checkInput(ma, ten, diachi, sdt) == true) {
                    int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm nhà cung cấp không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        boolean i = n10_NhaCungCapBUS.getInstance().insert(ma.getText(), ten.getText(), diachi.getText(), sdt.getText());
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
                if (ma.getText().equals(n10_NhaCungCapBUS.getInstance().createID())) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 nhà cung cấp trong danh sách để sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (n10_NhaCungCapBUS.getInstance().checkInput(ma, ten, diachi, sdt) == true) {
                        int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa thông tin nhà cung cấp không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            int i = n10_NhaCungCapBUS.getInstance().update(ma.getText(), ten.getText(), diachi.getText(), sdt.getText());
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
                diachi.setText(model.getValueAt(count, 2).toString());
                sdt.setText(model.getValueAt(count, 3).toString());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest;
    private javax.swing.JPanel Biggest_Wrapper;
    private javax.swing.JLabel Body_Title;
    private javax.swing.JPanel BtnBar;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnTimKiem;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JLabel LblMaHoaDon12;
    private javax.swing.JLabel LblMaHoaDon13;
    private javax.swing.JLabel LblMaHoaDon14;
    private javax.swing.JLabel LblMaHoaDon15;
    private javax.swing.JPanel PanelTaiLai;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JPanel Wrapper_Inner;
    private javax.swing.JTextField diachi;
    private javax.swing.JPanel functionBar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JTextField ma;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTextField sdt;
    private javax.swing.JTable table;
    private javax.swing.JTextField ten;
    // End of variables declaration//GEN-END:variables
}
