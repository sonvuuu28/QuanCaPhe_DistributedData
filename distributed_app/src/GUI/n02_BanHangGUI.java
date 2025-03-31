package GUI;

import BUS.n02_BanHangBUS;
import java.awt.*;
import Util.TableCustom;
import DTO.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class n02_BanHangGUI extends javax.swing.JPanel {

    public n01_TrangChuGUI frame;
    public ArrayList<MonDTO> ds;
    private MonDTO mon;

    private String maNV;

    public String getMaNV() {
        maNV = frame.getMaNV();
        return maNV;
    }

    private String maCN;

    public String getMaCN() {
        maCN = frame.getMaCN();
        return maCN;
    }

    public ArrayList<ChiTietHoaDonDTO> dsCart = new ArrayList<>();

    public ArrayList<ChiTietHoaDonDTO> getDsCart() {
        return dsCart;
    }

    public void addToCart(ChiTietHoaDonDTO cthd) {
        dsCart.add(cthd);
    }

    public n02_BanHangGUI(n01_TrangChuGUI frame) {
        this.frame = frame;
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        Biggest_Left = new javax.swing.JPanel();
        Biggest_Left_Header = new javax.swing.JPanel();
        PanelBanHang = new javax.swing.JPanel();
        LabelBanHang = new javax.swing.JLabel();
        PanelHoaDon = new javax.swing.JPanel();
        LabelHoaDon = new javax.swing.JLabel();
        Biggest_Left_Menu = new javax.swing.JPanel();
        LabelMenu = new javax.swing.JLabel();
        Menu_Header = new javax.swing.JPanel();
        PanelTimKiem = new javax.swing.JPanel();
        TimKiem = new javax.swing.JTextField();
        LabelAnhTimKiem = new javax.swing.JLabel();
        PanelCombobox = new javax.swing.JPanel();
        LabelLoaiSP = new javax.swing.JLabel();
        loai = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Menu_Body = new javax.swing.JPanel();
        Biggest_Right = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelGioHang = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PanelTaiLai = new javax.swing.JPanel();
        LabelTaiLai = new javax.swing.JLabel();
        scrollPaneTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        BtnThanhToan = new javax.swing.JButton();
        BtnXoa = new javax.swing.JButton();
        BtnSua = new javax.swing.JButton();

        Biggest.setBackground(new java.awt.Color(122, 74, 74));
        Biggest.setPreferredSize(new java.awt.Dimension(1156, 661));
        Biggest.setLayout(new java.awt.BorderLayout());

        Biggest_Left.setBackground(new java.awt.Color(255, 255, 102));
        Biggest_Left.setPreferredSize(new java.awt.Dimension(726, 661));

        Biggest_Left_Header.setBackground(new java.awt.Color(255, 255, 255));
        Biggest_Left_Header.setPreferredSize(new java.awt.Dimension(726, 80));
        Biggest_Left_Header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 25, 20));

        PanelBanHang.setBackground(new java.awt.Color(219, 189, 142));
        PanelBanHang.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelBanHang.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelBanHang.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelBanHang.setLayout(new java.awt.GridBagLayout());

        LabelBanHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelBanHang.setText("BÁN HÀNG");
        PanelBanHang.add(LabelBanHang, new java.awt.GridBagConstraints());

        Biggest_Left_Header.add(PanelBanHang);

        PanelHoaDon.setBackground(new java.awt.Color(219, 189, 142));
        PanelHoaDon.setMaximumSize(new java.awt.Dimension(195, 44));
        PanelHoaDon.setMinimumSize(new java.awt.Dimension(195, 44));
        PanelHoaDon.setPreferredSize(new java.awt.Dimension(195, 44));
        PanelHoaDon.setLayout(new java.awt.GridBagLayout());

        LabelHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelHoaDon.setText("HÓA ĐƠN");
        PanelHoaDon.add(LabelHoaDon, new java.awt.GridBagConstraints());

        Biggest_Left_Header.add(PanelHoaDon);

        Biggest_Left_Menu.setBackground(new java.awt.Color(255, 255, 255));
        Biggest_Left_Menu.setPreferredSize(new java.awt.Dimension(726, 580));

        LabelMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMenu.setText("Thực đơn");

        Menu_Header.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Header.setPreferredSize(new java.awt.Dimension(726, 43));

        PanelTimKiem.setBackground(new java.awt.Color(219, 189, 142));
        PanelTimKiem.setMaximumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setMinimumSize(new java.awt.Dimension(314, 32));
        PanelTimKiem.setPreferredSize(new java.awt.Dimension(270, 32));

        TimKiem.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        TimKiem.setForeground(new java.awt.Color(0, 102, 0));
        TimKiem.setText("Tìm tên món");
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

        PanelCombobox.setBackground(new java.awt.Color(255, 255, 255));
        PanelCombobox.setPreferredSize(new java.awt.Dimension(400, 32));
        PanelCombobox.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        LabelLoaiSP.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelLoaiSP.setText("Loại Sản Phẩm");
        PanelCombobox.add(LabelLoaiSP);

        loai.setPreferredSize(new java.awt.Dimension(150, 22));
        PanelCombobox.add(loai);

        javax.swing.GroupLayout Menu_HeaderLayout = new javax.swing.GroupLayout(Menu_Header);
        Menu_Header.setLayout(Menu_HeaderLayout);
        Menu_HeaderLayout.setHorizontalGroup(
            Menu_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_HeaderLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(PanelCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        Menu_HeaderLayout.setVerticalGroup(
            Menu_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_HeaderLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(Menu_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Menu_Body.setBackground(new java.awt.Color(219, 189, 142));
        Menu_Body.setPreferredSize(new java.awt.Dimension(732, 460));
        Menu_Body.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 17, 10));
        jScrollPane1.setViewportView(Menu_Body);

        javax.swing.GroupLayout Biggest_Left_MenuLayout = new javax.swing.GroupLayout(Biggest_Left_Menu);
        Biggest_Left_Menu.setLayout(Biggest_Left_MenuLayout);
        Biggest_Left_MenuLayout.setHorizontalGroup(
            Biggest_Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Biggest_Left_MenuLayout.createSequentialGroup()
                .addGroup(Biggest_Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Biggest_Left_MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Biggest_Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Biggest_Left_MenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Menu_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(554, 554, 554))
        );
        Biggest_Left_MenuLayout.setVerticalGroup(
            Biggest_Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Biggest_Left_MenuLayout.createSequentialGroup()
                .addComponent(LabelMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(Menu_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Biggest_LeftLayout = new javax.swing.GroupLayout(Biggest_Left);
        Biggest_Left.setLayout(Biggest_LeftLayout);
        Biggest_LeftLayout.setHorizontalGroup(
            Biggest_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Biggest_LeftLayout.createSequentialGroup()
                .addGroup(Biggest_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Biggest_Left_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Biggest_Left_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Biggest_LeftLayout.setVerticalGroup(
            Biggest_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Biggest_LeftLayout.createSequentialGroup()
                .addComponent(Biggest_Left_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Biggest_Left_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Biggest.add(Biggest_Left, java.awt.BorderLayout.WEST);

        Biggest_Right.setBackground(new java.awt.Color(153, 255, 153));
        Biggest_Right.setPreferredSize(new java.awt.Dimension(430, 658));
        Biggest_Right.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 120));

        LabelGioHang.setFont(new java.awt.Font("Segoe UI Black", 0, 28)); // NOI18N
        LabelGioHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelGioHang.setText("Giỏ hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(LabelGioHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Biggest_Right.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(430, 200));

        PanelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        PanelTaiLai.setMaximumSize(new java.awt.Dimension(34, 34));

        LabelTaiLai.setBackground(new java.awt.Color(0, 0, 0));
        LabelTaiLai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        LabelTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/reload.png"))); // NOI18N
        LabelTaiLai.setOpaque(true);
        PanelTaiLai.add(LabelTaiLai);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên món", "Đơn giá", "SL", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PanelTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        TableCustom.apply(scrollPaneTable, TableCustom.TableType.MULTI_LINE);

        Biggest_Right.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 22, 30));

        BtnThanhToan.setBackground(new java.awt.Color(0, 102, 0));
        BtnThanhToan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        BtnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        BtnThanhToan.setText("Thanh Toán");
        BtnThanhToan.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel3.add(BtnThanhToan);

        BtnXoa.setBackground(new java.awt.Color(255, 51, 51));
        BtnXoa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        BtnXoa.setForeground(new java.awt.Color(255, 255, 255));
        BtnXoa.setText("Xóa");
        BtnXoa.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel3.add(BtnXoa);

        BtnSua.setBackground(new java.awt.Color(51, 51, 51));
        BtnSua.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        BtnSua.setForeground(new java.awt.Color(255, 255, 255));
        BtnSua.setText("Sửa");
        BtnSua.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel3.add(BtnSua);

        Biggest_Right.add(jPanel3, java.awt.BorderLayout.SOUTH);

        Biggest.add(Biggest_Right, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Biggest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void reset() {
        n02_BanHangBUS.getInstance().setComboBoxLoaiMon(loai);
        TimKiem.setText("Tìm tên món");

        ds = n02_BanHangBUS.getInstance().listAllMon_HoatDong();
        n02_BanHangBUS.getInstance().setMonGUI(Menu_Body, ds, n02_BanHangGUI.this);

        dsCart = new ArrayList<>();
        listCart();
        timKiem();
    }

    private void buttonEvents() {
        reset();
        SwingUtilities.invokeLater(() -> {
            Biggest.requestFocusInWindow();
        });

        loai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LoaiMonDTO loaiMon;
                ArrayList<MonDTO> ds;
                try {
                    loaiMon = (LoaiMonDTO) loai.getSelectedItem();
                    ds = n02_BanHangBUS.getInstance().searchMonByLoaiMon_HoatDong(loaiMon.getMa());
                } catch (Exception e) {
                    ds = n02_BanHangBUS.getInstance().listAllMon_HoatDong();
                }
                n02_BanHangBUS.getInstance().setMonGUI(Menu_Body, ds, n02_BanHangGUI.this);
            }
        });

        TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    ArrayList<MonDTO> ds = n02_BanHangBUS.getInstance().searchMonByTen_HoatDong(TimKiem.getText());
                    n02_BanHangBUS.getInstance().setMonGUI(Menu_Body, ds, n02_BanHangGUI.this);
                }
            }
        });

        LabelAnhTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArrayList<MonDTO> ds = n02_BanHangBUS.getInstance().searchMonByTen_HoatDong(TimKiem.getText());
                n02_BanHangBUS.getInstance().setMonGUI(Menu_Body, ds, n02_BanHangGUI.this);
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

        PanelBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBanHang.setBackground(new Color(199, 159, 95));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBanHang.setBackground(new Color(219, 189, 142));
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
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
                Biggest.removeAll();
                n02_HoaDonGUI bh = new n02_HoaDonGUI(frame);
                Biggest.setLayout(new BorderLayout());
                Biggest.add(bh, BorderLayout.CENTER); // Adjust the layout constraint as needed
                Biggest.revalidate();
                Biggest.repaint();
            }
        });

        BtnThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (dsCart.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Giỏ hàng rỗng. Không thể thanh toán!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    n02_BanHang_ThanhToanGUI a = new n02_BanHang_ThanhToanGUI(n02_BanHangGUI.this);
                    a.setVisible(true);
                    a.setLocationRelativeTo(null);
                }
            }
        });
        BtnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (dsCart.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Giỏ hàng rỗng. Không thể xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int selectedRow = table.getSelectedRow();
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
                    JOptionPane.showMessageDialog(null, "Giỏ hàng rỗng. Không thể sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow == -1) {
                        JOptionPane.showMessageDialog(null, "Chọn 1 món để sửa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JTextField txtSoLuong = new JTextField();
                        txtSoLuong.setText(table.getValueAt(selectedRow, 3).toString());

                        addNumberOnlyKeyListener(txtSoLuong);
                        int option = JOptionPane.showConfirmDialog(null, txtSoLuong, "Nhập số lượng mới", JOptionPane.OK_CANCEL_OPTION);

                        if (option == JOptionPane.OK_OPTION) {
                            String newQuantityStr = txtSoLuong.getText();
                            if (!newQuantityStr.isEmpty()) {
                                int newQuantity = Integer.parseInt(newQuantityStr);
                                Long donGia = Util.Utils.getInstance().MoneyToLong(table.getValueAt(selectedRow, 2).toString());
                                Long thanhTien = newQuantity * donGia;
                                dsCart.get(selectedRow).setSoLuong(newQuantity);
                                dsCart.get(selectedRow).setThanhTien(thanhTien);
                                table.setValueAt(newQuantity, selectedRow, 3);
                                table.setValueAt(Util.Utils.getInstance().LongToMoney(thanhTien), selectedRow, 4);
                            }
                        }
                    }
                }
            }
        });

    }

    private void addNumberOnlyKeyListener(JTextField textField) {
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String text = textField.getText();
                text = text.replaceAll("[^\\d]", ""); // Chỉ giữ số
                text = text.replaceFirst("^0+", ""); // Xóa số 0 đầu (nếu có)
                textField.setText(text);
            }
        });
    }

    public void listCart() {
        n02_BanHangBUS.getInstance().listCart(table, dsCart);
    }

    public void timKiem() {

        TimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (TimKiem.getText().equals("Tìm tên món")) {
                    TimKiem.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (TimKiem.getText().isEmpty()) {
                    TimKiem.setText("Tìm tên món");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest;
    private javax.swing.JPanel Biggest_Left;
    private javax.swing.JPanel Biggest_Left_Header;
    private javax.swing.JPanel Biggest_Left_Menu;
    private javax.swing.JPanel Biggest_Right;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnThanhToan;
    private javax.swing.JButton BtnXoa;
    private javax.swing.JLabel LabelAnhTimKiem;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelGioHang;
    private javax.swing.JLabel LabelHoaDon;
    private javax.swing.JLabel LabelLoaiSP;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JLabel LabelTaiLai;
    private javax.swing.JPanel Menu_Body;
    private javax.swing.JPanel Menu_Header;
    private javax.swing.JPanel PanelBanHang;
    private javax.swing.JPanel PanelCombobox;
    private javax.swing.JPanel PanelHoaDon;
    private javax.swing.JPanel PanelTaiLai;
    private javax.swing.JPanel PanelTimKiem;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> loai;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
