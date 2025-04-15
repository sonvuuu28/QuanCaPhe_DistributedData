package GUI;

import BUS.*;
import DTO.*;
import Util.DialogNhapHang;
import Util.TableCustom;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.TableModel;

public class n04_NhapHangGUI extends javax.swing.JPanel {

    public n01_TrangChuGUI frame;
    public ArrayList<ChiTietPhieuNhapDTO> dsCart = new ArrayList<>();

    public ArrayList<ChiTietPhieuNhapDTO> getDsCart() {
        return dsCart;
    }

    public n04_NhapHangGUI(n01_TrangChuGUI frame) {
        this.frame = frame;
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        PanelNhapHang = new javax.swing.JPanel();
        LabelBanHang = new javax.swing.JLabel();
        PanelPhieuNhap = new javax.swing.JPanel();
        LabelHoaDon = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        PanelKhoHang = new javax.swing.JPanel();
        LabelMenu = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        PanelTimKiem = new javax.swing.JPanel();
        TimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();
        boxCN = new javax.swing.JComboBox<>();
        PanelGioHang = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BtnNhapKho = new javax.swing.JButton();
        BtnXoa = new javax.swing.JButton();
        BtnSua = new javax.swing.JButton();
        LabelGioHang = new javax.swing.JLabel();
        scrollPaneTable1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        PanelTaiLai = new javax.swing.JPanel();
        LabelTaiLai = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1156, 661));

        Biggest.setBackground(new java.awt.Color(255, 255, 255));
        Biggest.setPreferredSize(new java.awt.Dimension(1156, 661));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setPreferredSize(new java.awt.Dimension(1156, 80));
        Header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 25, 20));

        PanelNhapHang.setBackground(new java.awt.Color(219, 189, 142));
        PanelNhapHang.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelNhapHang.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelNhapHang.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelNhapHang.setLayout(new java.awt.GridBagLayout());

        LabelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelBanHang.setText("NHẬP HÀNG");
        PanelNhapHang.add(LabelBanHang, new java.awt.GridBagConstraints());

        Header.add(PanelNhapHang);

        PanelPhieuNhap.setBackground(new java.awt.Color(219, 189, 142));
        PanelPhieuNhap.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelPhieuNhap.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelPhieuNhap.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelPhieuNhap.setLayout(new java.awt.GridBagLayout());

        LabelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelHoaDon.setText("PHIẾU NHẬP");
        PanelPhieuNhap.add(LabelHoaDon, new java.awt.GridBagConstraints());

        Header.add(PanelPhieuNhap);

        Body.setBackground(new java.awt.Color(219, 189, 142));
        Body.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        PanelKhoHang.setBackground(new java.awt.Color(255, 255, 255));
        PanelKhoHang.setPreferredSize(new java.awt.Dimension(558, 556));

        LabelMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu.setText("Kho hàng");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên NL", "Khối lượng", "Đơn vị", "Tình trạng"
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
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(270, 32));

        TimKiem.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        TimKiem.setForeground(new java.awt.Color(0, 102, 0));
        TimKiem.setText("Tìm tên nguyên liệu");
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

        boxCN.setPreferredSize(new java.awt.Dimension(140, 22));

        javax.swing.GroupLayout PanelKhoHangLayout = new javax.swing.GroupLayout(PanelKhoHang);
        PanelKhoHang.setLayout(PanelKhoHangLayout);
        PanelKhoHangLayout.setHorizontalGroup(
            PanelKhoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelKhoHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKhoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKhoHangLayout.createSequentialGroup()
                        .addComponent(boxCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        PanelKhoHangLayout.setVerticalGroup(
            PanelKhoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhoHangLayout.createSequentialGroup()
                .addComponent(LabelMenu)
                .addGap(21, 21, 21)
                .addGroup(PanelKhoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelKhoHangLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(boxCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Body.add(PanelKhoHang);

        PanelGioHang.setBackground(new java.awt.Color(255, 255, 255));
        PanelGioHang.setPreferredSize(new java.awt.Dimension(558, 556));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 22, 30));

        BtnNhapKho.setBackground(new java.awt.Color(51, 51, 51));
        BtnNhapKho.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnNhapKho.setForeground(new java.awt.Color(255, 255, 255));
        BtnNhapKho.setText("Nhập kho");
        BtnNhapKho.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel4.add(BtnNhapKho);

        BtnXoa.setBackground(new java.awt.Color(51, 51, 51));
        BtnXoa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnXoa.setForeground(new java.awt.Color(255, 255, 255));
        BtnXoa.setText("Xóa");
        BtnXoa.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel4.add(BtnXoa);

        BtnSua.setBackground(new java.awt.Color(51, 51, 51));
        BtnSua.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnSua.setForeground(new java.awt.Color(255, 255, 255));
        BtnSua.setText("Sửa");
        BtnSua.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel4.add(BtnSua);

        LabelGioHang.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelGioHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelGioHang.setText("Danh sách nhập");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên NL", "Khối lượng", "Đơn vị", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(30);
            table1.getColumnModel().getColumn(3).setPreferredWidth(30);
            table1.getColumnModel().getColumn(4).setPreferredWidth(40);
        }
        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);
        TableCustom.apply(scrollPaneTable1, TableCustom.TableType.MULTI_LINE);

        PanelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        PanelTaiLai.setMaximumSize(new java.awt.Dimension(34, 34));

        LabelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        LabelTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // NOI18N
        LabelTaiLai.setOpaque(true);
        PanelTaiLai.add(LabelTaiLai);

        javax.swing.GroupLayout PanelGioHangLayout = new javax.swing.GroupLayout(PanelGioHang);
        PanelGioHang.setLayout(PanelGioHangLayout);
        PanelGioHangLayout.setHorizontalGroup(
            PanelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelGioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGioHangLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelGioHangLayout.setVerticalGroup(
            PanelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGioHangLayout.createSequentialGroup()
                .addComponent(LabelGioHang)
                .addGap(20, 20, 20)
                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Body.add(PanelGioHang);

        javax.swing.GroupLayout BiggestLayout = new javax.swing.GroupLayout(Biggest);
        Biggest.setLayout(BiggestLayout);
        BiggestLayout.setHorizontalGroup(
            BiggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addContainerGap())
        );

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
    public void reset() {
        TimKiem.setText("Tìm tên nguyên liệu");
        if (frame.maCN == null) {
            n04_NhapHangBUS.getInstance().searchByName(table, "", boxCN.getSelectedItem().toString());
        } else {
            n04_NhapHangBUS.getInstance().listAll_KhoHang(table, frame.maCN);
        }
        dsCart = new ArrayList<>();
        listCart();
    }

    private void buttonEvents() {
        comboboxCN(frame.maCN);
        reset();

        boxCN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                n05_XuatKhoBUS.getInstance().searchByName(table, "", boxCN.getSelectedItem().toString());
            }
        });

        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    if (frame.maCN == null) {
                        n04_NhapHangBUS.getInstance().searchByName(table, TimKiem.getText(), boxCN.getSelectedItem().toString());
                    } else {
                        n04_NhapHangBUS.getInstance().searchByName(table, TimKiem.getText(), frame.maCN);
                    }
                }
            }
        });

        TimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (TimKiem.getText().equals("Tìm tên nguyên liệu")) {
                    TimKiem.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (TimKiem.getText().isEmpty()) {
                    TimKiem.setText("Tìm tên nguyên liệu");
                }
            }
        });

        LabelAnhTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (frame.maCN == null) {
                    n04_NhapHangBUS.getInstance().searchByName(table, TimKiem.getText(), boxCN.getSelectedItem().toString());
                } else {
                    n04_NhapHangBUS.getInstance().searchByName(table, TimKiem.getText(), frame.maCN);
                }
            }
        });

        PanelNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelNhapHang.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelNhapHang.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        PanelPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelPhieuNhap.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelPhieuNhap.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Biggest.removeAll();
                n04_PhieuNhapGUI bh = new n04_PhieuNhapGUI(frame);
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

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createItem(table, table1);
            }
        });

        BtnNhapKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (table1.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn danh sách nguyên liệu cần nhập kho!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                } else {
                    String macn = null;
                    if (frame.maCN == null) {
                        macn = boxCN.getSelectedItem().toString();
                    } else {
                        macn = frame.maCN;
                    }
                    n04_NhapHang_ThanhToanGUI a = new n04_NhapHang_ThanhToanGUI(n04_NhapHangGUI.this, macn);
                    a.setVisible(true);
                    a.setLocationRelativeTo(null);
                }
            }
        });

        BtnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (dsCart.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Giỏ rỗng. Không thể xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int selectedRow = table1.getSelectedRow();
                    if (selectedRow == -1) {
                        JOptionPane.showMessageDialog(null, "Chọn 1 món để xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        dsCart.remove(selectedRow);
                        listCart();
                    }
                }
            }
        });

        BtnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (dsCart.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Giỏ rỗng. Không thể sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int selectedRow = table1.getSelectedRow();
                    if (selectedRow == -1) {
                        JOptionPane.showMessageDialog(null, "Chọn 1 món để xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        createItem(table, table1);
                        listCart();
                    }
                }
            }
        });
    }

    public void listCart() {
        n04_NhapHangBUS.getInstance().listCart(table1, dsCart, frame.maCN);
    }

    public void addToCart(ChiTietPhieuNhapDTO dto) {
        dsCart.add(dto);
    }

    public void dropDuplicateCtpn(ChiTietPhieuNhapDTO a) {
        dsCart.removeIf(ctpn -> ctpn.getMaNL().equals(a.getMaNL()));
    }

    public void createItem(JTable khoHang, JTable gioHang) {
        int selectedRow = khoHang.getSelectedRow();
        TableModel khoModel = khoHang.getModel();

        String ma = n04_NhapHangBUS.getInstance().createID();
        NguyenLieuDTO nguyenLieu = (NguyenLieuDTO) khoModel.getValueAt(selectedRow, 1);
        String donVi = khoModel.getValueAt(selectedRow, 3).toString();

        DialogNhapHang dialog = new DialogNhapHang(new javax.swing.JFrame(), true, DialogNhapHang.DataType.FLOAT);
        dialog.setVisible(true);

        Float klCanMua = null;
        Long gia = null;

        try {
            if (dialog.result != null && !dialog.result.trim().isEmpty()) {
                klCanMua = Float.valueOf(dialog.result.trim());
            }
            if (dialog.money != null && !dialog.money.trim().isEmpty()) {
                gia = Long.valueOf(dialog.money.trim());
            }
        } catch (NumberFormatException e) {
            return;
        }

        if (klCanMua == null || gia == null) {
            return;
        }

        Long thanhTien = (long) (gia.floatValue() * klCanMua);

        ChiTietPhieuNhapDTO ctpn = new ChiTietPhieuNhapDTO(ma, nguyenLieu.getMa(), klCanMua, gia, thanhTien);
        dropDuplicateCtpn(ctpn);
        addToCart(ctpn);
        listCart();
    }

    private void comboboxCN(String maCN) {
        if (maCN != null) {
            boxCN.setVisible(false);
        } else {
            n11_NhanVienBUS.getInstance().comboBoxChiNhanh_khongTong(boxCN, null);
            n07_NguyenLieuBUS.getInstance().searchByName(table, "", boxCN.getSelectedItem().toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest;
    private javax.swing.JPanel Body;
    private javax.swing.JButton BtnNhapKho;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnXoa;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelGioHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JPanel PanelGioHang;
    private javax.swing.JPanel PanelKhoHang;
    private javax.swing.JPanel PanelNhapHang;
    private javax.swing.JPanel PanelPhieuNhap;
    private javax.swing.JPanel PanelTaiLai;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JComboBox<String> boxCN;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JScrollPane scrollPaneTable1;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
