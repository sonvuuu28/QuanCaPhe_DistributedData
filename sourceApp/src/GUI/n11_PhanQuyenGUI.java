package GUI;

import Util.TableCustom;
import java.awt.BorderLayout;
import java.awt.Color;
import BUS.n11_PhanQuyenBUS;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class n11_PhanQuyenGUI extends javax.swing.JPanel {

    private n01_TrangChuGUI frame;

    public n11_PhanQuyenGUI(n01_TrangChuGUI frame) {
        this.frame = frame;
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        Biggest_Header = new javax.swing.JPanel();
        PanelNV = new javax.swing.JPanel();
        LabelBanHang = new javax.swing.JLabel();
        PanelPQ = new javax.swing.JPanel();
        LabelHoaDon = new javax.swing.JLabel();
        LabelMenu = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ten = new javax.swing.JTextField();
        BanHang = new javax.swing.JCheckBox();
        KH = new javax.swing.JCheckBox();
        NhapHang = new javax.swing.JCheckBox();
        XuatKho = new javax.swing.JCheckBox();
        Mon = new javax.swing.JCheckBox();
        NguyenLieu = new javax.swing.JCheckBox();
        LichLam = new javax.swing.JCheckBox();
        KM = new javax.swing.JCheckBox();
        NCC = new javax.swing.JCheckBox();
        NV = new javax.swing.JCheckBox();
        TK = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        BtnThem = new javax.swing.JButton();
        BtnSua = new javax.swing.JButton();
        BtnBatTat = new javax.swing.JButton();
        BtnTaiLai = new javax.swing.JButton();

        Biggest.setBackground(new java.awt.Color(255, 255, 255));
        Biggest.setMaximumSize(new java.awt.Dimension(1156, 661));
        Biggest.setMinimumSize(new java.awt.Dimension(1156, 661));
        Biggest.setPreferredSize(new java.awt.Dimension(1156, 661));

        Biggest_Header.setBackground(new java.awt.Color(255, 255, 255));
        Biggest_Header.setPreferredSize(new java.awt.Dimension(726, 80));
        Biggest_Header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 25, 20));

        PanelNV.setBackground(new java.awt.Color(219, 189, 142));
        PanelNV.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelNV.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelNV.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelNV.setLayout(new java.awt.GridBagLayout());

        LabelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelBanHang.setText("NHÂN VIÊN");
        PanelNV.add(LabelBanHang, new java.awt.GridBagConstraints());

        Biggest_Header.add(PanelNV);

        PanelPQ.setBackground(new java.awt.Color(219, 189, 142));
        PanelPQ.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelPQ.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelPQ.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelPQ.setLayout(new java.awt.GridBagLayout());

        LabelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelHoaDon.setText("PHÂN QUYỀN");
        PanelPQ.add(LabelHoaDon, new java.awt.GridBagConstraints());

        Biggest_Header.add(PanelPQ);

        LabelMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu.setText("Trang phân quyền");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Bán hàng", "Khách", "Nhập hàng", "Xuất kho", "Món", "NgLiệu", "Lịch làm", "KM-UD", "NCC", "NViên", "Thkê", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setPreferredWidth(40);
            table.getColumnModel().getColumn(6).setPreferredWidth(30);
            table.getColumnModel().getColumn(7).setPreferredWidth(45);
            table.getColumnModel().getColumn(10).setPreferredWidth(30);
        }

        jPanel2.setBackground(new java.awt.Color(219, 189, 142));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 230));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 220));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 20, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 3));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tên PQ");
        jLabel1.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel4.add(jLabel1);

        Ten.setText("PQ001");
        Ten.setPreferredSize(new java.awt.Dimension(150, 22));
        jPanel4.add(Ten);

        jPanel1.add(jPanel4);

        BanHang.setBackground(new java.awt.Color(255, 255, 255));
        BanHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BanHang.setText("Quyền bán hàng");
        BanHang.setIconTextGap(20);
        BanHang.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(BanHang);

        KH.setBackground(new java.awt.Color(255, 255, 255));
        KH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KH.setText("Quyền khách hàng");
        KH.setIconTextGap(20);
        KH.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(KH);

        NhapHang.setBackground(new java.awt.Color(255, 255, 255));
        NhapHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NhapHang.setText("Quyền nhập hàng");
        NhapHang.setIconTextGap(20);
        NhapHang.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(NhapHang);

        XuatKho.setBackground(new java.awt.Color(255, 255, 255));
        XuatKho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        XuatKho.setText("Quyền xuất kho");
        XuatKho.setIconTextGap(20);
        XuatKho.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(XuatKho);

        Mon.setBackground(new java.awt.Color(255, 255, 255));
        Mon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mon.setText("Quyền món");
        Mon.setIconTextGap(20);
        Mon.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(Mon);

        NguyenLieu.setBackground(new java.awt.Color(255, 255, 255));
        NguyenLieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NguyenLieu.setText("Quyền nguyên liệu");
        NguyenLieu.setIconTextGap(20);
        NguyenLieu.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(NguyenLieu);

        LichLam.setBackground(new java.awt.Color(255, 255, 255));
        LichLam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LichLam.setText("Quyền lịch làm");
        LichLam.setIconTextGap(20);
        LichLam.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(LichLam);

        KM.setBackground(new java.awt.Color(255, 255, 255));
        KM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KM.setText("Quyền khuyến mãi-ưu đãi");
        KM.setIconTextGap(20);
        KM.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(KM);

        NCC.setBackground(new java.awt.Color(255, 255, 255));
        NCC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NCC.setText("Quyền nhà cung cấp");
        NCC.setIconTextGap(20);
        NCC.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(NCC);

        NV.setBackground(new java.awt.Color(255, 255, 255));
        NV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NV.setText("Quyền nhân viên");
        NV.setIconTextGap(20);
        NV.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(NV);

        TK.setBackground(new java.awt.Color(255, 255, 255));
        TK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TK.setText("Quyền thống kê");
        TK.setIconTextGap(20);
        TK.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel1.add(TK);

        jPanel2.add(jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(136, 220));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 23));

        BtnThem.setBackground(new java.awt.Color(0, 0, 0));
        BtnThem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnThem.setForeground(new java.awt.Color(255, 255, 255));
        BtnThem.setText("Thêm");
        BtnThem.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnThem.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnThem.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel3.add(BtnThem);

        BtnSua.setBackground(new java.awt.Color(0, 0, 0));
        BtnSua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnSua.setForeground(new java.awt.Color(255, 255, 255));
        BtnSua.setText("Sửa");
        BtnSua.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnSua.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnSua.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel3.add(BtnSua);

        BtnBatTat.setBackground(new java.awt.Color(0, 0, 0));
        BtnBatTat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnBatTat.setForeground(new java.awt.Color(255, 255, 255));
        BtnBatTat.setText("Bật/Tắt quyền");
        BtnBatTat.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnBatTat.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnBatTat.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel3.add(BtnBatTat);

        BtnTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        BtnTaiLai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        BtnTaiLai.setText("Tải lại");
        BtnTaiLai.setMaximumSize(new java.awt.Dimension(100, 26));
        BtnTaiLai.setMinimumSize(new java.awt.Dimension(100, 26));
        BtnTaiLai.setPreferredSize(new java.awt.Dimension(120, 26));
        jPanel3.add(BtnTaiLai);

        jPanel2.add(jPanel3);

        javax.swing.GroupLayout BiggestLayout = new javax.swing.GroupLayout(Biggest);
        Biggest.setLayout(BiggestLayout);
        BiggestLayout.setHorizontalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest_Header, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
            .addComponent(LabelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BiggestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneTable)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BiggestLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        BiggestLayout.setVerticalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BiggestLayout.createSequentialGroup()
                .addComponent(Biggest_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(LabelMenu)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        Ten.setText("");
        BanHang.setSelected(false);
        KH.setSelected(false);
        NhapHang.setSelected(false);
        XuatKho.setSelected(false);
        Mon.setSelected(false);
        NguyenLieu.setSelected(false);
        LichLam.setSelected(false);
        KM.setSelected(false);
        NCC.setSelected(false);
        NV.setSelected(false);
        TK.setSelected(false);

        n11_PhanQuyenBUS.getInstance().listAll(table);
    }

    private void buttonEvents() {
        reset();

        PanelNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelNV.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelNV.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Biggest.removeAll();
                n11_NhanVienGUI bh = new n11_NhanVienGUI(frame);
                Biggest.setLayout(new BorderLayout());
                Biggest.add(bh, BorderLayout.CENTER);
                Biggest.revalidate();
                Biggest.repaint();
            }
        });

        PanelPQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelPQ.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelPQ.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {

            }
        });

        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (n11_PhanQuyenBUS.getInstance().checkInput(Ten) == true) {
                    int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn thêm phân quyền không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {
                        boolean a = n11_PhanQuyenBUS.getInstance().insert(Ten.getText(), BanHang.isSelected(), KH.isSelected(), NhapHang.isSelected(),
                                XuatKho.isSelected(), Mon.isSelected(), NguyenLieu.isSelected(), LichLam.isSelected(), KM.isSelected(), NCC.isSelected(),
                                NV.isSelected(), TK.isSelected());
                        if (a == true) {
                            reset();
                        }
                    }
                }
            }
        });

        BtnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                System.out.println(selectedRow);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 phân quyền trong danh sách để sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String ma = model.getValueAt(selectedRow, 0).toString();
                    boolean trangThai = n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(selectedRow, 13).toString());

                    if (n11_PhanQuyenBUS.getInstance().checkInput(Ten) == true) {
                        int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa thông tin phân quyền không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            int a = n11_PhanQuyenBUS.getInstance().update(ma, Ten.getText(), BanHang.isSelected(), KH.isSelected(), NhapHang.isSelected(),
                                    XuatKho.isSelected(), Mon.isSelected(), NguyenLieu.isSelected(), LichLam.isSelected(), KM.isSelected(), NCC.isSelected(),
                                    NV.isSelected(), TK.isSelected(), trangThai);
                            if (a == 1) {
                                reset();
                            }
                        }
                    }
                }
            }
        });

        BtnTaiLai.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset();
            }
        });

        BtnBatTat.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = table.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 phân quyền trong danh sách để sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String thongBao;
                    String ma = model.getValueAt(selectedRow, 0).toString();
                    boolean trangThai = n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(selectedRow, 13).toString());
                    if (trangThai == true) {
                        trangThai = false;
                        thongBao = "tắt";
                    } else {
                        trangThai = true;
                        thongBao = "bật";
                    }
                    if (n11_PhanQuyenBUS.getInstance().checkInput(Ten) == true) {
                        int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn " + thongBao + " phân quyền này không?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            int a = n11_PhanQuyenBUS.getInstance().batTat(ma, trangThai);
                            if (a == 1) {
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

                Ten.setText(model.getValueAt(count, 1).toString());

                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 2).toString())) {
                    BanHang.setSelected(true);
                } else {
                    BanHang.setSelected(false);
                }

                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 3).toString())) {
                    KH.setSelected(true);
                } else {
                    KH.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 4).toString())) {
                    NhapHang.setSelected(true);
                } else {
                    NhapHang.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 5).toString())) {
                    XuatKho.setSelected(true);
                } else {
                    XuatKho.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 6).toString())) {
                    Mon.setSelected(true);
                } else {
                    Mon.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 7).toString())) {
                    NguyenLieu.setSelected(true);
                } else {
                    NguyenLieu.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 8).toString())) {
                    LichLam.setSelected(true);
                } else {
                    LichLam.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 9).toString())) {
                    KM.setSelected(true);
                } else {
                    KM.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 10).toString())) {
                    NCC.setSelected(true);
                } else {
                    NCC.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 11).toString())) {
                    NV.setSelected(true);
                } else {
                    NV.setSelected(false);
                }
                if (n11_PhanQuyenBUS.getInstance().stringToBoolean(model.getValueAt(count, 12).toString())) {
                    TK.setSelected(true);
                } else {
                    TK.setSelected(false);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BanHang;
    private javax.swing.JPanel Biggest;
    private javax.swing.JPanel Biggest_Header;
    private javax.swing.JButton BtnBatTat;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnTaiLai;
    private javax.swing.JButton BtnThem;
    private javax.swing.JCheckBox KH;
    private javax.swing.JCheckBox KM;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JCheckBox LichLam;
    private javax.swing.JCheckBox Mon;
    private javax.swing.JCheckBox NCC;
    private javax.swing.JCheckBox NV;
    private javax.swing.JCheckBox NguyenLieu;
    private javax.swing.JCheckBox NhapHang;
    private javax.swing.JPanel PanelNV;
    private javax.swing.JPanel PanelPQ;
    private javax.swing.JCheckBox TK;
    private javax.swing.JTextField Ten;
    private javax.swing.JCheckBox XuatKho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
