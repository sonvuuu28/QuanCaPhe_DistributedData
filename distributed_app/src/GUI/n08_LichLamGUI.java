package GUI;

import BUS.n08_LichLamBUS;
import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Date;

public class n08_LichLamGUI extends javax.swing.JPanel {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public n08_LichLamGUI() {
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        LabelMenu = new javax.swing.JLabel();
        functionBar = new javax.swing.JPanel();
        PanelTimKiem = new javax.swing.JPanel();
        TimKiem = new javax.swing.JTextField();
        ngay = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        start = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        end = new javax.swing.JLabel();
        PanelTaiLai = new javax.swing.JPanel();
        LabelTaiLai = new javax.swing.JLabel();
        Biggest_Left_Header = new javax.swing.JPanel();
        PanelLichLam = new javax.swing.JPanel();
        LabelBanHang = new javax.swing.JLabel();
        PanelCaLam = new javax.swing.JPanel();
        LabelHoaDon = new javax.swing.JLabel();
        scr = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        scr1 = new javax.swing.JScrollPane();
        tableCa = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        BtnXep = new javax.swing.JButton();

        Biggest.setBackground(new java.awt.Color(255, 255, 255));
        Biggest.setMaximumSize(new java.awt.Dimension(1156, 661));
        Biggest.setMinimumSize(new java.awt.Dimension(1156, 661));

        LabelMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu.setText("Lịch làm");

        functionBar.setBackground(new java.awt.Color(255, 255, 255));
        functionBar.setPreferredSize(new java.awt.Dimension(956, 35));

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(161, 32));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(161, 32));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(163, 32));

        TimKiem.setBackground(new java.awt.Color(241, 240, 240));
        TimKiem.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        TimKiem.setText("Tìm tuần theo ngày");
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 35));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 20, 0));

        jPanel1.setBackground(new java.awt.Color(239, 219, 203));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Thời gian:");
        jPanel1.add(jLabel1);

        start.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        start.setText("as");
        jPanel1.add(start);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("đến");
        jPanel1.add(jLabel3);

        end.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        end.setText("10/03/2025");
        jPanel1.add(end);

        jPanel2.add(jPanel1);

        PanelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        PanelTaiLai.setMaximumSize(new java.awt.Dimension(34, 34));

        LabelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        LabelTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // NOI18N
        LabelTaiLai.setOpaque(true);
        PanelTaiLai.add(LabelTaiLai);

        jPanel2.add(PanelTaiLai);

        javax.swing.GroupLayout functionBarLayout = new javax.swing.GroupLayout(functionBar);
        functionBar.setLayout(functionBarLayout);
        functionBarLayout.setHorizontalGroup(
            functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        functionBarLayout.setVerticalGroup(
            functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        scr.setPreferredSize(new java.awt.Dimension(956, 440));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nhân Viên", "T2 (28/11)", "T3 (29/11)", "T4 (30/11)", "T5 (31/11)", "T6 (10/12)", "T7 (10/12)", "CN (10/12)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(50);
        scr.setViewportView(table);

        jPanel3.setBackground(new java.awt.Color(239, 239, 239));
        jPanel3.setPreferredSize(new java.awt.Dimension(968, 190));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 6));

        scr1.setPreferredSize(new java.awt.Dimension(770, 176));

        tableCa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ca", "Tên ca", "Thời gian vào", "Thời gian ra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCa.setRowHeight(50);
        scr1.setViewportView(tableCa);
        if (tableCa.getColumnModel().getColumnCount() > 0) {
            tableCa.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        jPanel3.add(scr1);
        TableCustom.apply(scr1, TableCustom.TableType.MULTI_LINE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(176, 176));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 70));

        BtnXep.setBackground(new java.awt.Color(0, 0, 0));
        BtnXep.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnXep.setForeground(new java.awt.Color(255, 255, 255));
        BtnXep.setText("Xếp lịch");
        BtnXep.setMaximumSize(new java.awt.Dimension(100, 24));
        BtnXep.setMinimumSize(new java.awt.Dimension(100, 24));
        BtnXep.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel4.add(BtnXep);

        jPanel3.add(jPanel4);

        javax.swing.GroupLayout BiggestLayout = new javax.swing.GroupLayout(Biggest);
        Biggest.setLayout(BiggestLayout);
        BiggestLayout.setHorizontalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Biggest_Left_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(functionBar, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BiggestLayout.setVerticalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addComponent(Biggest_Left_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelMenu)
                .addGap(20, 20, 20)
                .addComponent(functionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scr, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        TableCustom.apply(scr, TableCustom.TableType.MULTI_LINE);

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
        n08_LichLamBUS.getInstance().listAllCa(tableCa);
        TimKiem.setText("Tìm tuần theo ngày");
        n08_LichLamBUS.getInstance().setUp(start, end, table);
    }

    public void resetXepLich(Date ngay) {
        n08_LichLamBUS.getInstance().setLabel_StartEndDate(start, end, ngay);
        n08_LichLamBUS.getInstance().listAll(table, ngay);
        n08_LichLamBUS.getInstance().setHeaderTable_StartEndDate(table, ngay);
    }

    private void buttonEvents() {
        reset();

        ngay.getDateEditor().addPropertyChangeListener("date", evt -> {
            if (ngay.getDate() != null) {
                date = new Date(ngay.getDate().getTime());
                TimKiem.setText(Util.Utils.getInstance().SQLDateString_Transform_normalDateString(date + "") + "");
                n08_LichLamBUS.getInstance().setLabel_StartEndDate(start, end, date);
                n08_LichLamBUS.getInstance().listAll(table, date);
                n08_LichLamBUS.getInstance().setHeaderTable_StartEndDate(table, date);
            }
        });

        PanelLichLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelLichLam.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelLichLam.setBackground(new Color(219, 189, 142));
            }
        });
        PanelCaLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCaLam.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCaLam.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Biggest.removeAll();
                n08_CaLamGUI bh = new n08_CaLamGUI();
                Biggest.setLayout(new BorderLayout());
                Biggest.add(bh, BorderLayout.CENTER); // Adjust the layout constraint as needed
                Biggest.revalidate();
                Biggest.repaint();
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

        BtnXep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n08_LichLam_XepLichGUI a = new n08_LichLam_XepLichGUI(n08_LichLamGUI.this);
                a.setVisible(true);
                a.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest;
    private javax.swing.JPanel Biggest_Left_Header;
    private javax.swing.JButton BtnXep;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JPanel PanelCaLam;
    private javax.swing.JPanel PanelLichLam;
    private javax.swing.JPanel PanelTaiLai;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JLabel end;
    private javax.swing.JPanel functionBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.toedter.calendar.JDateChooser ngay;
    private javax.swing.JScrollPane scr;
    private javax.swing.JScrollPane scr1;
    private javax.swing.JLabel start;
    private javax.swing.JTable table;
    private javax.swing.JTable tableCa;
    // End of variables declaration//GEN-END:variables
}
