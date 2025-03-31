package GUI;

import BUS.n02_HoaDonBUS;
import DTO.HoaDonDTO;
import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class n02_HoaDonGUI extends javax.swing.JPanel {

    private n01_TrangChuGUI frame;
    public HoaDonDTO HD;

    public HoaDonDTO getHD() {
        return HD;
    }

    public void setHD(HoaDonDTO HD) {
        this.HD = HD;
    }

    public n02_HoaDonGUI(n01_TrangChuGUI frame) {
        this.frame = frame;
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        PanelBanHang = new javax.swing.JPanel();
        LabelBanHang = new javax.swing.JLabel();
        PanelHoaDon = new javax.swing.JPanel();
        LabelHoaDon = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        Body_Title = new javax.swing.JLabel();
        Body_Function = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BtnTimKiem = new javax.swing.JButton();
        BtnTaiLai = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LblMaHoaDon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ma = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        LblMaHoaDon1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        giaTu = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        LblMaHoaDon2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ngayBD = new com.toedter.calendar.JDateChooser();
        jPanel9 = new javax.swing.JPanel();
        LblMaHoaDon3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        giaDen = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        LblMaHoaDon4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        ngayKT = new com.toedter.calendar.JDateChooser();
        Body_Table = new javax.swing.JPanel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        Biggest.setBackground(new java.awt.Color(255, 255, 255));
        Biggest.setPreferredSize(new java.awt.Dimension(1156, 658));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setPreferredSize(new java.awt.Dimension(1156, 80));
        Header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 25, 20));

        PanelBanHang.setBackground(new java.awt.Color(219, 189, 142));
        PanelBanHang.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelBanHang.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelBanHang.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelBanHang.setLayout(new java.awt.GridBagLayout());

        LabelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelBanHang.setText("BÁN HÀNG");
        PanelBanHang.add(LabelBanHang, new java.awt.GridBagConstraints());

        Header.add(PanelBanHang);

        PanelHoaDon.setBackground(new java.awt.Color(219, 189, 142));
        PanelHoaDon.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelHoaDon.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelHoaDon.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelHoaDon.setLayout(new java.awt.GridBagLayout());

        LabelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelHoaDon.setText("HÓA ĐƠN");
        PanelHoaDon.add(LabelHoaDon, new java.awt.GridBagConstraints());

        Header.add(PanelHoaDon);

        Body.setBackground(new java.awt.Color(219, 189, 142));
        Body.setMaximumSize(new java.awt.Dimension(1113, 566));
        Body.setMinimumSize(new java.awt.Dimension(1113, 566));
        Body.setPreferredSize(new java.awt.Dimension(1113, 566));
        Body.setLayout(new java.awt.BorderLayout());

        Body_Title.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        Body_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Body_Title.setText("Thông tin hóa đơn");
        Body_Title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Body_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Body_Title.setPreferredSize(new java.awt.Dimension(246, 42));
        Body.add(Body_Title, java.awt.BorderLayout.NORTH);

        Body_Function.setBackground(new java.awt.Color(219, 189, 142));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1110, 230));

        BtnTimKiem.setBackground(new java.awt.Color(0, 0, 0));
        BtnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        BtnTimKiem.setLabel("Tìm Kiếm");
        BtnTimKiem.setMaximumSize(new java.awt.Dimension(100, 24));
        BtnTimKiem.setMinimumSize(new java.awt.Dimension(100, 24));
        BtnTimKiem.setPreferredSize(new java.awt.Dimension(100, 30));

        BtnTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        BtnTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        BtnTaiLai.setText("Tải Lại");
        BtnTaiLai.setMaximumSize(new java.awt.Dimension(100, 24));
        BtnTaiLai.setMinimumSize(new java.awt.Dimension(100, 24));
        BtnTaiLai.setPreferredSize(new java.awt.Dimension(100, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(305, 47));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon.setText("Mã hóa đơn");
        LblMaHoaDon.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel1.add(LblMaHoaDon);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 37));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        ma.setBorder(null);
        ma.setMaximumSize(new java.awt.Dimension(200, 25));
        ma.setMinimumSize(new java.awt.Dimension(200, 25));
        ma.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel2.add(ma);

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 5));
        jPanel2.add(jSeparator1);

        jPanel1.add(jPanel2);

        jPanel6.add(jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(305, 47));
        jPanel4.setMinimumSize(new java.awt.Dimension(305, 47));
        jPanel4.setPreferredSize(new java.awt.Dimension(305, 47));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon1.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon1.setText("Giá từ");
        LblMaHoaDon1.setMaximumSize(new java.awt.Dimension(67, 16));
        LblMaHoaDon1.setMinimumSize(new java.awt.Dimension(67, 16));
        LblMaHoaDon1.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel4.add(LblMaHoaDon1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 37));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        giaTu.setBorder(null);
        giaTu.setMaximumSize(new java.awt.Dimension(200, 25));
        giaTu.setMinimumSize(new java.awt.Dimension(200, 25));
        giaTu.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel5.add(giaTu);

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 5));
        jPanel5.add(jSeparator2);

        jPanel4.add(jPanel5);

        jPanel6.add(jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(305, 47));
        jPanel7.setMinimumSize(new java.awt.Dimension(305, 47));
        jPanel7.setPreferredSize(new java.awt.Dimension(305, 47));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon2.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon2.setText("Từ ngày");
        LblMaHoaDon2.setMaximumSize(new java.awt.Dimension(67, 16));
        LblMaHoaDon2.setMinimumSize(new java.awt.Dimension(67, 16));
        LblMaHoaDon2.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel7.add(LblMaHoaDon2);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 37));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 8));

        ngayBD.setPreferredSize(new java.awt.Dimension(160, 22));
        jPanel8.add(ngayBD);

        jPanel7.add(jPanel8);

        jPanel6.add(jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(305, 47));
        jPanel9.setMinimumSize(new java.awt.Dimension(305, 47));
        jPanel9.setPreferredSize(new java.awt.Dimension(305, 47));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon3.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon3.setText("Giá đến");
        LblMaHoaDon3.setMaximumSize(new java.awt.Dimension(67, 16));
        LblMaHoaDon3.setMinimumSize(new java.awt.Dimension(67, 16));
        LblMaHoaDon3.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel9.add(LblMaHoaDon3);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(200, 37));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        giaDen.setBorder(null);
        giaDen.setMaximumSize(new java.awt.Dimension(200, 25));
        giaDen.setMinimumSize(new java.awt.Dimension(200, 25));
        giaDen.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel10.add(giaDen);

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 5));
        jPanel10.add(jSeparator4);

        jPanel9.add(jPanel10);

        jPanel6.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(305, 47));
        jPanel11.setMinimumSize(new java.awt.Dimension(305, 47));
        jPanel11.setPreferredSize(new java.awt.Dimension(305, 47));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 5));

        LblMaHoaDon4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        LblMaHoaDon4.setForeground(new java.awt.Color(153, 102, 0));
        LblMaHoaDon4.setText("Đến ngày");
        LblMaHoaDon4.setMaximumSize(new java.awt.Dimension(67, 16));
        LblMaHoaDon4.setMinimumSize(new java.awt.Dimension(67, 16));
        LblMaHoaDon4.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel11.add(LblMaHoaDon4);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(200, 37));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 8));

        ngayKT.setPreferredSize(new java.awt.Dimension(160, 22));
        jPanel12.add(ngayKT);

        jPanel11.add(jPanel12);

        jPanel6.add(jPanel11);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(BtnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Body_FunctionLayout = new javax.swing.GroupLayout(Body_Function);
        Body_Function.setLayout(Body_FunctionLayout);
        Body_FunctionLayout.setHorizontalGroup(
            Body_FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Body_FunctionLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        Body_FunctionLayout.setVerticalGroup(
            Body_FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Body_FunctionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Body.add(Body_Function, java.awt.BorderLayout.CENTER);

        Body_Table.setBackground(new java.awt.Color(219, 189, 142));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày lập", "Nhân viên", "Khách hàng", "Khuyến mãi", "KM thành viên", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(table);

        javax.swing.GroupLayout Body_TableLayout = new javax.swing.GroupLayout(Body_Table);
        Body_Table.setLayout(Body_TableLayout);
        Body_TableLayout.setHorizontalGroup(
            Body_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1144, Short.MAX_VALUE)
            .addGroup(Body_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Body_TableLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );
        Body_TableLayout.setVerticalGroup(
            Body_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
            .addGroup(Body_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Body_TableLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);

        Body.add(Body_Table, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout BiggestLayout = new javax.swing.GroupLayout(Biggest);
        Biggest.setLayout(BiggestLayout);
        BiggestLayout.setHorizontalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BiggestLayout.setVerticalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        ma.setText("");
        ngayBD.setDate(null);
        ngayKT.setDate(null);
        giaTu.setText("");
        giaDen.setText("");
        n02_HoaDonBUS.getInstance().listAll(table, frame.getMaCN());
    }

    private void buttonEvents() {
        reset();

        giaTu.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String text = giaTu.getText();
                text = text.replaceAll("[^\\d]", "");
                text = text.replaceFirst("^0+", "");
                if (!text.isEmpty()) {
                    try {
                        Long giaDenLong = Long.valueOf(text);
                        giaTu.setText(Util.Utils.getInstance().LongToMoneyNoneVND(giaDenLong));
                    } catch (NumberFormatException e) {
                        giaTu.setText("");
                    }
                } else {
                    giaTu.setText("");
                }
            }
        });

        giaDen.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String text = giaDen.getText();
                text = text.replaceAll("[^\\d]", "");
                text = text.replaceFirst("^0+", "");
                if (!text.isEmpty()) {
                    try {
                        Long giaDenLong = Long.valueOf(text);
                        giaDen.setText(Util.Utils.getInstance().LongToMoneyNoneVND(giaDenLong));
                    } catch (NumberFormatException e) {
                        giaDen.setText("");
                    }
                } else {
                    giaDen.setText("");
                }
            }
        });

        PanelBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBanHang.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBanHang.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Biggest.removeAll();
                n02_BanHangGUI bh = new n02_BanHangGUI(frame);
                Biggest.setLayout(new BorderLayout());
                Biggest.add(bh, BorderLayout.CENTER); // Adjust the layout constraint as needed
                Biggest.revalidate();
                Biggest.repaint();
            }
        });
        PanelHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelHoaDon.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelHoaDon.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                Biggest.removeAll();
//                n02_HoaDonGUI bh = new n02_HoaDonGUI();
//                Biggest.setLayout(new BorderLayout());
//                Biggest.add(bh, BorderLayout.CENTER); // Adjust the layout constraint as needed
//                Biggest.revalidate();
//                Biggest.repaint();
            }
        });

        BtnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n02_HoaDonBUS.getInstance().search(table, ma, ngayBD, ngayKT, giaTu, giaDen, frame.getMaCN());
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
                int selectedRow = table.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                HoaDonDTO hd = n02_HoaDonBUS.getInstance().searchHoaDonByMa(model.getValueAt(selectedRow, 0).toString());
                n02_HoaDonGUI.this.setHD(hd);
                n02_HoaDon_CTHDGUI a = new n02_HoaDon_CTHDGUI(n02_HoaDonGUI.this);
                a.setVisible(true);
                a.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest;
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Body_Function;
    private javax.swing.JPanel Body_Table;
    private javax.swing.JLabel Body_Title;
    private javax.swing.JButton BtnTaiLai;
    private javax.swing.JButton BtnTimKiem;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LblMaHoaDon;
    private javax.swing.JLabel LblMaHoaDon1;
    private javax.swing.JLabel LblMaHoaDon2;
    private javax.swing.JLabel LblMaHoaDon3;
    private javax.swing.JLabel LblMaHoaDon4;
    private javax.swing.JPanel PanelBanHang;
    private javax.swing.JPanel PanelHoaDon;
    private javax.swing.JTextField giaDen;
    private javax.swing.JTextField giaTu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField ma;
    private com.toedter.calendar.JDateChooser ngayBD;
    private com.toedter.calendar.JDateChooser ngayKT;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
