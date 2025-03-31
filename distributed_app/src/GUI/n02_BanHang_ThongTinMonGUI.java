package GUI;

import BUS.n02_BanHangBUS;
import BUS.n02_HoaDonBUS;
import DTO.*;
import Util.Utils;
import java.awt.Color;
import javax.swing.JOptionPane;

public class n02_BanHang_ThongTinMonGUI extends javax.swing.JFrame {

    private n02_BanHangGUI frame;
    private MonDTO mon;

    public n02_BanHang_ThongTinMonGUI(MonDTO mon, n02_BanHangGUI frame) {
        this.frame = frame;
        this.mon = mon;
        initComponents();
        nhomNutChucNang();
        Utils.getInstance().dragPanel(PanelNoiDung, this);
    }

    private void reset(MonDTO mon) {
        ma.setText(mon.getMa());
        ten.setText(mon.getTen());
        LoaiMonDTO loaiMon = n02_BanHangBUS.getInstance().searchLoaiMonByMa_HoatDong(mon.getMaLoaiMon());
        loai.setText(loaiMon.toString());
        gia.setText(Util.Utils.getInstance().LongToMoney(mon.getGia()));
        sl.setText("");
    }

    private void nhomNutChucNang() {
        reset(mon);

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

        BtnXN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handle();
            }
        });

        sl.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String text = sl.getText();
                text = text.replaceAll("[^\\d]", "");
                text = text.replaceFirst("^0+", "");
                if (!text.isEmpty()) {
                    try {
                        int number = Integer.parseInt(text);
                        sl.setText(String.valueOf(number));
                    } catch (NumberFormatException e) {
                        sl.setText("");
                    }
                } else {
                    sl.setText("");
                }
            }

            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    handle();
                }
            }
        });

    }

    public void handle() {
        if (!sl.getText().equals("")) {
            String maHD = n02_HoaDonBUS.getInstance().CreateID();
            Integer soLuong = Integer.valueOf(sl.getText());
            Long gia = soLuong.longValue() * mon.getGia();

            ChiTietHoaDonDTO cthd = new ChiTietHoaDonDTO(maHD, mon.getMa(), mon.getGia(),
                    soLuong, gia);

            dropDuplicateCthd(cthd);
            frame.addToCart(cthd);
            frame.listCart();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số lượng!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // nếu trùng vứt cái cũ add cái mới
    public void dropDuplicateCthd(ChiTietHoaDonDTO a) {
        frame.dsCart.removeIf(cthd -> cthd.getMaMon().equals(a.getMaMon()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKhung = new javax.swing.JPanel();
        PanelNoiDung = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        BtnXN = new javax.swing.JButton();
        BtnCancel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NoiDung = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LabelMa1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ma = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        LabelMa2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ten = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        LabelMa3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        gia = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        LabelMa4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        loai = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        LabelMa5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        sl = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(219, 195, 165));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(332, 412));
        setResizable(false);

        PanelKhung.setBackground(new java.awt.Color(122, 74, 74));
        PanelKhung.setMaximumSize(new java.awt.Dimension(352, 500));
        PanelKhung.setMinimumSize(new java.awt.Dimension(0, 0));
        PanelKhung.setPreferredSize(new java.awt.Dimension(332, 412));

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setMaximumSize(new java.awt.Dimension(340, 478));
        PanelNoiDung.setMinimumSize(new java.awt.Dimension(0, 0));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(320, 400));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("THÔNG TIN MÓN ĂN");
        Title.setPreferredSize(new java.awt.Dimension(320, 32));

        BtnXN.setBackground(new java.awt.Color(51, 51, 51));
        BtnXN.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        BtnXN.setForeground(new java.awt.Color(255, 255, 255));
        BtnXN.setText("Xác Nhận");
        BtnXN.setMaximumSize(new java.awt.Dimension(90, 25));
        BtnXN.setMinimumSize(new java.awt.Dimension(90, 25));
        BtnXN.setPreferredSize(new java.awt.Dimension(90, 25));

        BtnCancel.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancel.setMaximumSize(new java.awt.Dimension(28, 28));
        BtnCancel.setPreferredSize(new java.awt.Dimension(28, 28));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("x");
        jLabel1.setPreferredSize(new java.awt.Dimension(8, 14));
        BtnCancel.add(jLabel1);

        NoiDung.setBackground(new java.awt.Color(255, 255, 255));
        NoiDung.setMaximumSize(new java.awt.Dimension(320, 284));
        NoiDung.setPreferredSize(new java.awt.Dimension(280, 284));
        NoiDung.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 18));

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 32));

        LabelMa1.setBackground(new java.awt.Color(255, 255, 255));
        LabelMa1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa1.setText("Mã món");
        LabelMa1.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(LabelMa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelMa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        ma.setBackground(new java.awt.Color(255, 255, 255));
        ma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ma.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ma.setText("PXK001");
        ma.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        NoiDung.add(jPanel1);

        jPanel4.setBackground(new java.awt.Color(204, 255, 51));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(120, 32));

        LabelMa2.setBackground(new java.awt.Color(255, 255, 255));
        LabelMa2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa2.setText("Tên món");
        LabelMa2.setPreferredSize(new java.awt.Dimension(120, 34));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(LabelMa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelMa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        ten.setBackground(new java.awt.Color(255, 255, 255));
        ten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ten.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ten.setText("cafe");
        ten.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        NoiDung.add(jPanel4);

        jPanel7.setBackground(new java.awt.Color(204, 255, 51));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(120, 32));

        LabelMa3.setBackground(new java.awt.Color(255, 255, 255));
        LabelMa3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa3.setText("Đơn giá");
        LabelMa3.setPreferredSize(new java.awt.Dimension(120, 34));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addComponent(LabelMa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelMa3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        gia.setBackground(new java.awt.Color(255, 255, 255));
        gia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gia.setForeground(new java.awt.Color(0, 102, 204));
        gia.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        gia.setText("20");
        gia.setOpaque(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        NoiDung.add(jPanel7);

        jPanel10.setBackground(new java.awt.Color(204, 255, 51));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(120, 32));

        LabelMa4.setBackground(new java.awt.Color(255, 255, 255));
        LabelMa4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa4.setText("Loại");
        LabelMa4.setPreferredSize(new java.awt.Dimension(120, 34));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addComponent(LabelMa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelMa4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        loai.setBackground(new java.awt.Color(255, 255, 255));
        loai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loai.setForeground(new java.awt.Color(51, 51, 51));
        loai.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        loai.setText("loại món");
        loai.setOpaque(true);
        loai.setPreferredSize(new java.awt.Dimension(150, 32));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        NoiDung.add(jPanel10);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(270, 32));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(120, 32));

        LabelMa5.setBackground(new java.awt.Color(255, 255, 255));
        LabelMa5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelMa5.setText("Nhập số lượng");
        LabelMa5.setPreferredSize(new java.awt.Dimension(160, 32));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addComponent(LabelMa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LabelMa5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(70, 32));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING, 0, 2));

        sl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sl.setForeground(new java.awt.Color(0, 102, 0));
        sl.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        sl.setText("28");
        sl.setBorder(null);
        sl.setPreferredSize(new java.awt.Dimension(40, 26));
        jPanel15.add(sl);

        jSeparator14.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator14.setPreferredSize(new java.awt.Dimension(40, 5));
        jPanel15.add(jSeparator14);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        NoiDung.add(jPanel13);

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoiDungLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addGroup(PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(NoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelNoiDungLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(BtnXN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelNoiDungLayout.setVerticalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoiDungLayout.createSequentialGroup()
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(NoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BtnXN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        PanelKhung.add(PanelNoiDung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelKhung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private MonDTO Mon;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnCancel;
    private javax.swing.JButton BtnXN;
    private javax.swing.JLabel LabelMa1;
    private javax.swing.JLabel LabelMa2;
    private javax.swing.JLabel LabelMa3;
    private javax.swing.JLabel LabelMa4;
    private javax.swing.JLabel LabelMa5;
    private javax.swing.JPanel NoiDung;
    private javax.swing.JPanel PanelKhung;
    private javax.swing.JPanel PanelNoiDung;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel gia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JLabel loai;
    private javax.swing.JLabel ma;
    private javax.swing.JTextField sl;
    private javax.swing.JLabel ten;
    // End of variables declaration//GEN-END:variables
}
