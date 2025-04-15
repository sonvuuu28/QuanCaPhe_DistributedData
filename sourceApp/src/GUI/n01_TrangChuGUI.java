package GUI;

import BUS.n01_TrangChuBUS;
import DTO.PhanQuyenDTO;
import Util.ChonCN;
import java.awt.BorderLayout;
import java.awt.Color;

public class n01_TrangChuGUI extends javax.swing.JFrame {

    public String maNV;
    public String maCN;
    public PhanQuyenDTO pq;

    public n01_TrangChuGUI(String maNV, String maCN, PhanQuyenDTO pq) {
        this.maNV = maNV;
        this.maCN = maCN;
        this.pq = pq;
        initComponents();
        buttonEvents();
    }

    public String getMaNV() {
        return maNV;
    }

    public String getMaCN() {
        return maCN;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        biggest = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ngayHienTai = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        ChiNhanh = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        TenNV = new javax.swing.JLabel();
        signOutButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        chucVu = new javax.swing.JLabel();
        Tennv = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        BtnBanHang = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtnKH = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BtnNhapHang = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        BtnXuatKho = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        BtnMon = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BtnNL = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        BtnLichLam = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        BtnKM = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        BtnNCC = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        BtnNV = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        BtnTK = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        PanelNoiDung = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1361, 763));
        setMinimumSize(new java.awt.Dimension(1361, 763));
        setPreferredSize(new java.awt.Dimension(1375, 799));
        setResizable(false);

        setLocationRelativeTo(null);
        biggest.setBackground(new java.awt.Color(122, 74, 74));
        biggest.setMaximumSize(new java.awt.Dimension(1361, 763));
        biggest.setMinimumSize(new java.awt.Dimension(1361, 763));
        biggest.setPreferredSize(new java.awt.Dimension(1361, 763));

        jPanel4.setBackground(new java.awt.Color(122, 74, 74));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        jPanel2.setBackground(new java.awt.Color(219, 189, 142));
        jPanel2.setPreferredSize(new java.awt.Dimension(233, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel3.setBackground(new java.awt.Color(219, 189, 142));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CÀ PHÊ SGU");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("xin chào");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 87;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel3, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2);

        jPanel5.setBackground(new java.awt.Color(219, 189, 142));
        jPanel5.setPreferredSize(new java.awt.Dimension(280, 46));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 8));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Calendar.png"))); // NOI18N
        jPanel5.add(jLabel4);

        ngayHienTai.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ngayHienTai.setText("Chủ nhật, 21 tháng 2 năm 2025");
        jPanel5.add(ngayHienTai);

        jPanel4.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(122, 74, 74));

        jPanel9.setBackground(new java.awt.Color(219, 189, 142));
        jPanel9.setPreferredSize(new java.awt.Dimension(280, 46));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        ChiNhanh.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ChiNhanh.setText("CN1: TP Hồ Chí Minh");
        jPanel9.add(ChiNhanh, new java.awt.GridBagConstraints());

        jPanel7.setBackground(new java.awt.Color(219, 189, 142));
        jPanel7.setPreferredSize(new java.awt.Dimension(280, 46));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        TenNV.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        TenNV.setText("VŨ THIÊN SƠN");
        jPanel7.add(TenNV);

        signOutButton.setBackground(new java.awt.Color(239, 219, 203));
        signOutButton.setPreferredSize(new java.awt.Dimension(105, 34));

        jLabel6.setText("Đăng Xuất");
        signOutButton.add(jLabel6);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/DangXuat.png"))); // NOI18N
        signOutButton.add(jLabel8);

        jPanel7.add(signOutButton);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Thông tin người dùng");

        chucVu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chucVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chucVu.setText("Nhân viên bán hàng");

        Tennv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tennv.setText("Vũ Thiên Sơn");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/NguoiDung.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chucVu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tennv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addComponent(Tennv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Navigator.setBackground(new java.awt.Color(255, 255, 255));
        Navigator.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        BtnBanHang.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnBanHang.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Cart.png"))); // NOI18N
        BtnBanHang.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Bán hàng");
        BtnBanHang.add(jLabel15);

        Navigator.add(BtnBanHang);

        BtnKH.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnKH.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/KhachHang.png"))); // NOI18N
        BtnKH.add(jLabel16);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Khách hàng");
        BtnKH.add(jLabel17);

        Navigator.add(BtnKH);

        BtnNhapHang.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnNhapHang.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/NhapHang.png"))); // NOI18N
        BtnNhapHang.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Nhập hàng");
        BtnNhapHang.add(jLabel19);

        Navigator.add(BtnNhapHang);

        BtnXuatKho.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnXuatKho.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/xuatKho.png"))); // NOI18N
        BtnXuatKho.add(jLabel34);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Xuất kho");
        BtnXuatKho.add(jLabel35);

        Navigator.add(BtnXuatKho);

        BtnMon.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnMon.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/CoffeeMug.png"))); // NOI18N
        BtnMon.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Món");
        BtnMon.add(jLabel21);

        Navigator.add(BtnMon);

        BtnNL.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnNL.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon("D:\\Nam3_HK2\\CSDL_PhanTan\\QuanCaPhe_PhanTan\\sourceApp\\src\\IMAGE\\NguyenLieu.png")); // NOI18N
        BtnNL.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Nguyên Liệu");
        BtnNL.add(jLabel23);

        Navigator.add(BtnNL);

        BtnLichLam.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnLichLam.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon("D:\\Nam3_HK2\\CSDL_PhanTan\\QuanCaPhe_PhanTan\\sourceApp\\src\\IMAGE\\LichLam.png")); // NOI18N
        BtnLichLam.add(jLabel24);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Lịch Làm");
        BtnLichLam.add(jLabel25);

        Navigator.add(BtnLichLam);

        BtnKM.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnKM.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon("D:\\Nam3_HK2\\CSDL_PhanTan\\QuanCaPhe_PhanTan\\sourceApp\\src\\IMAGE\\GiamGia.png")); // NOI18N
        BtnKM.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Khuyến mãi");
        BtnKM.add(jLabel27);

        Navigator.add(BtnKM);

        BtnNCC.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnNCC.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/NhaCungCap.png"))); // NOI18N
        BtnNCC.add(jLabel28);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Nhà cung cấp");
        BtnNCC.add(jLabel29);

        Navigator.add(BtnNCC);

        BtnNV.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnNV.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/NhanVien.png"))); // NOI18N
        BtnNV.add(jLabel36);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Nhân viên");
        BtnNV.add(jLabel37);

        Navigator.add(BtnNV);

        BtnTK.setPreferredSize(new java.awt.Dimension(142, 35));
        BtnTK.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 15, 5));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/ThongKe.png"))); // NOI18N
        BtnTK.add(jLabel32);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Thống kê");
        BtnTK.add(jLabel33);

        Navigator.add(BtnTK);

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(1156, 661));
        PanelNoiDung.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout biggestLayout = new javax.swing.GroupLayout(biggest);
        biggest.setLayout(biggestLayout);
        biggestLayout.setHorizontalGroup(
            biggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biggestLayout.createSequentialGroup()
                .addGroup(biggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(biggestLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(biggestLayout.createSequentialGroup()
                        .addGroup(biggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Navigator, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(PanelNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        biggestLayout.setVerticalGroup(
            biggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biggestLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(biggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(biggestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(biggestLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Navigator, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelNoiDung.removeAll();
        n02_BanHangGUI kh = new n02_BanHangGUI(n01_TrangChuGUI.this);
        PanelNoiDung.add(kh, BorderLayout.CENTER);
        PanelNoiDung.revalidate();
        PanelNoiDung.repaint();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(biggest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(biggest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUp_LeftBar() {
        if (pq.getBanHang() == false) {
            BtnBanHang.setVisible(false);
        }
        if (pq.getKhachHang() == false) {
            BtnKH.setVisible(false);
        }
        if (pq.getNhapHang() == false) {
            BtnNhapHang.setVisible(false);
        }
        if (pq.getXuatKho() == false) {
            BtnXuatKho.setVisible(false);
        }
        if (pq.getMon() == false) {
            BtnMon.setVisible(false);
        }
        if (pq.getNguyenLieu() == false) {
            BtnNL.setVisible(false);
        }
        if (pq.getLichLam() == false) {
            BtnLichLam.setVisible(false);
        }
        if (pq.getKhuyenMaiUuDai() == false) {
            BtnKM.setVisible(false);
        }
        if (pq.getNhaCungCap() == false) {
            BtnNCC.setVisible(false);
        }
        if (pq.getNhanVien() == false) {
            BtnNV.setVisible(false);
        }
        if (pq.getThongKe() == false) {
            BtnTK.setVisible(false);
        }
    }

    private void setUp() {
        ngayHienTai.setText(Util.Utils.getInstance().hienThi_NgayHienTai());
        n01_TrangChuBUS.getInstance().searchChiNhanhTheoMaChiNhanh(ChiNhanh, getMaCN());
        n01_TrangChuBUS.getInstance().searchNhanVienByMa(TenNV, Tennv, chucVu, getMaNV());
        Util.Utils.getInstance().dragPanel(biggest, this);
    }

    private void buttonEvents() {
        setUp();
        setUp_LeftBar();
        signOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signOutButton.setBackground(new Color(200, 174, 153));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                signOutButton.setBackground(new Color(239, 219, 203));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n00_LoginGUI a = new n00_LoginGUI();
                a.setVisible(true);
                a.setLocationRelativeTo(null);
                dispose();
            }
        });

        BtnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBanHang.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBanHang.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n02_BanHangGUI kh = new n02_BanHangGUI(n01_TrangChuGUI.this);
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnKH.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnKH.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n03_KhachHangGUI kh = new n03_KhachHangGUI();
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNhapHang.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNhapHang.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n04_NhapHangGUI kh = new n04_NhapHangGUI(n01_TrangChuGUI.this);
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnXuatKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnXuatKho.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnXuatKho.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n05_XuatKhoGUI kh = new n05_XuatKhoGUI(n01_TrangChuGUI.this);
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMon.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnMon.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n06_MonGUI kh = new n06_MonGUI();
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnNL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNL.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNL.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n07_NguyenLieuGUI kh = new n07_NguyenLieuGUI(n01_TrangChuGUI.this);
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnLichLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLichLam.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLichLam.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n08_LichLamGUI kh = new n08_LichLamGUI(n01_TrangChuGUI.this);
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnKM.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnKM.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n09_KhuyenMaiGUI kh = new n09_KhuyenMaiGUI();
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNCC.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNCC.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n10_NhaCungCapGUI kh = new n10_NhaCungCapGUI();
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnNV.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNV.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n11_NhanVienGUI kh = new n11_NhanVienGUI(n01_TrangChuGUI.this);
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });

        BtnTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnTK.setBackground(Color.white);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnTK.setBackground(new Color(242, 242, 242));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelNoiDung.removeAll();
                n12_ThongKeGUI kh = new n12_ThongKeGUI(n01_TrangChuGUI.this);
                PanelNoiDung.add(kh, BorderLayout.CENTER);
                PanelNoiDung.revalidate();
                PanelNoiDung.repaint();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnBanHang;
    private javax.swing.JPanel BtnKH;
    private javax.swing.JPanel BtnKM;
    private javax.swing.JPanel BtnLichLam;
    private javax.swing.JPanel BtnMon;
    private javax.swing.JPanel BtnNCC;
    private javax.swing.JPanel BtnNL;
    private javax.swing.JPanel BtnNV;
    private javax.swing.JPanel BtnNhapHang;
    private javax.swing.JPanel BtnTK;
    private javax.swing.JPanel BtnXuatKho;
    private javax.swing.JLabel ChiNhanh;
    private javax.swing.JPanel Navigator;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JLabel TenNV;
    private javax.swing.JLabel Tennv;
    private javax.swing.JPanel biggest;
    private javax.swing.JLabel chucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel ngayHienTai;
    private javax.swing.JPanel signOutButton;
    // End of variables declaration//GEN-END:variables
}
