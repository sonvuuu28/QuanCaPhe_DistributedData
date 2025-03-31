package GUI;

import BUS.n04_PhieuNhapBUS;
import Util.TableCustom;
import Util.Utils;
import java.awt.Color;

public class n04_PhieuNhap_CTPNGUI extends javax.swing.JFrame {

    private n04_PhieuNhapGUI frame;

    public n04_PhieuNhap_CTPNGUI(n04_PhieuNhapGUI frame) {
        this.frame = frame;
        initComponents();
        buttonEvents();
        Utils.getInstance().dragPanel(PanelNoiDung, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        PanelNoiDung = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnCancel = new javax.swing.JPanel();
        labelCancel = new javax.swing.JLabel();
        ngayLap = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        nv = new javax.swing.JLabel();
        ncc = new javax.swing.JLabel();
        tongTien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(122, 74, 74));
        jPanel3.setPreferredSize(new java.awt.Dimension(492, 462));

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(480, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(471, 28));

        BtnCancel.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancel.setMaximumSize(new java.awt.Dimension(28, 28));
        BtnCancel.setPreferredSize(new java.awt.Dimension(585, 28));

        labelCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCancel.setText("x");
        labelCancel.setPreferredSize(new java.awt.Dimension(8, 14));
        BtnCancel.add(labelCancel);

        ngayLap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ngayLap.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ngayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ngayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Chi tiết phiếu nhập hàng");
        Title.setMaximumSize(new java.awt.Dimension(1000, 32));
        Title.setPreferredSize(new java.awt.Dimension(858, 32));

        scrollPaneTable.setPreferredSize(new java.awt.Dimension(440, 300));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PN", "Mã NL", "Khối lượng", "Đơn giá", "Thành tiền"
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
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
        }
        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);

        nv.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        nv.setForeground(new java.awt.Color(0, 102, 204));
        nv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nv.setText("NV: Vũ Thiên Sơn");

        ncc.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ncc.setForeground(new java.awt.Color(255, 102, 0));
        ncc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ncc.setText("NCC: Trung Nguyên Legend");

        tongTien.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tongTien.setForeground(new java.awt.Color(0, 153, 0));
        tongTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tongTien.setText("1.000.000 VNĐ");

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                                .addComponent(nv, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelNoiDungLayout.setVerticalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ncc, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(nv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel3.add(PanelNoiDung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEvents() {
        n04_PhieuNhapBUS.getInstance().setUpCTPN(table, frame.getMaPN(), nv, ncc, tongTien, ngayLap);
        n04_PhieuNhapBUS.getInstance().listCTPN(table, frame.getMaPN());
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
    private javax.swing.JPanel BtnCancel;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCancel;
    private javax.swing.JLabel ncc;
    private javax.swing.JLabel ngayLap;
    private javax.swing.JLabel nv;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable table;
    private javax.swing.JLabel tongTien;
    // End of variables declaration//GEN-END:variables
}
