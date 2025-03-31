package GUI;

import BUS.n04_NhapHangBUS;
import BUS.n10_NhaCungCapBUS;
import Util.TableCustom;
import Util.Utils;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class n04_NhapHang_DsNCCGUI extends javax.swing.JFrame {

    private n04_NhapHang_ThanhToanGUI frame;

    public n04_NhapHang_DsNCCGUI(n04_NhapHang_ThanhToanGUI frame) {
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
        PanelTool = new javax.swing.JPanel();
        BtnXacNhan = new javax.swing.JButton();
        BtnTimKiem = new javax.swing.JButton();
        BtnTaiLai = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        BtnThem = new javax.swing.JButton();
        BtnCancel = new javax.swing.JPanel();
        labelCancel = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
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
        PanelTimKiem = new javax.swing.JPanel();
        TimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelKhung.setBackground(new java.awt.Color(122, 74, 74));
        PanelKhung.setMaximumSize(new java.awt.Dimension(870, 490));
        PanelKhung.setMinimumSize(new java.awt.Dimension(870, 490));
        PanelKhung.setPreferredSize(new java.awt.Dimension(870, 490));

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setMaximumSize(new java.awt.Dimension(858, 478));
        PanelNoiDung.setMinimumSize(new java.awt.Dimension(858, 478));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(858, 478));

        PanelTool.setBackground(new java.awt.Color(255, 255, 255));
        PanelTool.setMaximumSize(new java.awt.Dimension(1000, 50));
        PanelTool.setMinimumSize(new java.awt.Dimension(50, 50));
        PanelTool.setPreferredSize(new java.awt.Dimension(420, 35));
        PanelTool.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        BtnXacNhan.setBackground(new java.awt.Color(51, 51, 51));
        BtnXacNhan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        BtnXacNhan.setText("Xác Nhận");
        BtnXacNhan.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnXacNhan.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnXacNhan.setPreferredSize(new java.awt.Dimension(90, 25));
        PanelTool.add(BtnXacNhan);

        BtnTimKiem.setBackground(new java.awt.Color(0, 153, 0));
        BtnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        BtnTimKiem.setText("Tìm kiếm");
        BtnTimKiem.setMaximumSize(new java.awt.Dimension(100, 24));
        BtnTimKiem.setMinimumSize(new java.awt.Dimension(100, 24));
        BtnTimKiem.setPreferredSize(new java.awt.Dimension(90, 25));
        PanelTool.add(BtnTimKiem);

        BtnTaiLai.setBackground(new java.awt.Color(51, 102, 255));
        BtnTaiLai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        BtnTaiLai.setText("Tải lại");
        BtnTaiLai.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnTaiLai.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnTaiLai.setPreferredSize(new java.awt.Dimension(90, 25));
        PanelTool.add(BtnTaiLai);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Danh sách nhà cung cấp");
        Title.setMaximumSize(new java.awt.Dimension(1000, 32));
        Title.setPreferredSize(new java.awt.Dimension(858, 32));

        BtnThem.setBackground(new java.awt.Color(51, 51, 51));
        BtnThem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnThem.setForeground(new java.awt.Color(255, 255, 255));
        BtnThem.setText("Tạo mới NCC");
        BtnThem.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnThem.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnThem.setPreferredSize(new java.awt.Dimension(90, 25));

        BtnCancel.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancel.setMaximumSize(new java.awt.Dimension(28, 28));
        BtnCancel.setPreferredSize(new java.awt.Dimension(28, 28));

        labelCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCancel.setText("x");
        labelCancel.setPreferredSize(new java.awt.Dimension(8, 14));
        BtnCancel.add(labelCancel);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên NCC", "Địa chỉ", "Số điện thoại"
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
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
        }
        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);

        Biggest_Wrapper.setBackground(new java.awt.Color(219, 189, 142));

        Wrapper_Inner.setBackground(new java.awt.Color(255, 255, 255));
        Wrapper_Inner.setMaximumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setMinimumSize(new java.awt.Dimension(403, 457));
        Wrapper_Inner.setPreferredSize(new java.awt.Dimension(250, 270));
        Wrapper_Inner.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setText("Thông tin nhà cung cấp");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(0, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(175, 35));
        Wrapper_Inner.add(jLabel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PanelTool, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                        .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                        .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelNoiDungLayout.setVerticalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Biggest_Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addComponent(BtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(PanelTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        PanelKhung.add(PanelNoiDung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset() {
        ma.setFocusable(true);
        ma.setText(n10_NhaCungCapBUS.getInstance().createID());
        ten.setText("");
        sdt.setText("");
        diachi.setText("");
        TimKiem.setText("Tìm kiếm nhanh theo tên");
        n10_NhaCungCapBUS.getInstance().listAll(table);
    }

    private void buttonEvents() {
        reset();
        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    n10_NhaCungCapBUS.getInstance().searchByName(table, TimKiem.getText());
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
                n10_NhaCungCapBUS.getInstance().searchByName(table, TimKiem.getText());
            }
        });

        BtnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n10_NhaCungCapBUS.getInstance().search(table, ma.getText(), ten.getText(), diachi.getText(), sdt.getText());
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

        BtnXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                TableModel model = table.getModel();

                if (selectedRow == -1) {
                    JOptionPane.showConfirmDialog(null, "Vui lòng nhấn chọn 1 nhà cung cấp từ danh sách", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                } else {
                    String Ten = n04_NhapHangBUS.getInstance().setMaNCC(model.getValueAt(selectedRow, 0).toString());
                    frame.setMaNCC(model.getValueAt(selectedRow, 0).toString());
                    frame.ncc.setText(Ten);
                    dispose();
                }
            }
        });

        BtnTaiLai.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
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
                diachi.setText(model.getValueAt(count, 2).toString());
                sdt.setText(model.getValueAt(count, 3).toString());
            }
        });
        labelCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
            }
        });

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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest_Wrapper;
    private javax.swing.JPanel BtnCancel;
    private javax.swing.JButton BtnTaiLai;
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnTimKiem;
    private javax.swing.JButton BtnXacNhan;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LblMaHoaDon12;
    private javax.swing.JLabel LblMaHoaDon13;
    private javax.swing.JLabel LblMaHoaDon14;
    private javax.swing.JLabel LblMaHoaDon15;
    private javax.swing.JPanel PanelKhung;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JPanel PanelTool;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel Wrapper_Inner;
    private javax.swing.JTextField diachi;
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
    private javax.swing.JLabel labelCancel;
    private javax.swing.JTextField ma;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTextField sdt;
    private javax.swing.JTable table;
    private javax.swing.JTextField ten;
    // End of variables declaration//GEN-END:variables
}
