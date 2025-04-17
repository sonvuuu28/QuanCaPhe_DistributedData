package GUI;

import BUS.n00_LoginBUS;
import DTO.NhanVienDTO;
import DTO.PhanQuyenDTO;
import Util.JDBCUtil;
import java.awt.*;
import javax.swing.JOptionPane;

public class n00_LoginGUI extends javax.swing.JFrame {

    public static boolean serverTongValid;

    public n00_LoginGUI() {
        initComponents();
        setLocationRelativeTo(null);
        buttonEvents();
        PanelTong.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTong = new javax.swing.JPanel();
        PanelRight = new javax.swing.JPanel();
        PanelLogo = new javax.swing.JPanel();
        LblLogo1 = new javax.swing.JLabel();
        LblLogo2 = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        LblTieuDe = new javax.swing.JLabel();
        LblTaiKhoan = new javax.swing.JLabel();
        LblDangNhap = new javax.swing.JLabel();
        tk = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        log = new javax.swing.JPanel();
        LabelNutDangNhap = new javax.swing.JLabel();
        mk = new javax.swing.JPasswordField();
        server = new javax.swing.JComboBox<>();
        PanelLeft = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelTong.setBackground(new java.awt.Color(255, 255, 255));
        PanelTong.setMaximumSize(new java.awt.Dimension(1361, 763));
        PanelTong.setMinimumSize(new java.awt.Dimension(1361, 763));

        PanelRight.setBackground(new java.awt.Color(255, 255, 255));
        PanelRight.setMaximumSize(new java.awt.Dimension(616, 32767));
        PanelRight.setMinimumSize(new java.awt.Dimension(616, 100));
        PanelRight.setPreferredSize(new java.awt.Dimension(616, 763));

        PanelLogo.setBackground(new java.awt.Color(255, 255, 255));

        LblLogo1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        LblLogo1.setText("CÀ PHÊ SGU");

        LblLogo2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        LblLogo2.setText("XIN CHÀO");

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addComponent(LblLogo1)
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addComponent(LblLogo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addComponent(LblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelInput.setBackground(new java.awt.Color(255, 255, 255));
        PanelInput.setForeground(new java.awt.Color(102, 102, 102));

        LblTieuDe.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        LblTieuDe.setText("ĐĂNG NHẬP");
        LblTieuDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LblTaiKhoan.setText("Tài Khoản");

        LblDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LblDangNhap.setText("Mật Khẩu");

        tk.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tk.setForeground(new java.awt.Color(102, 102, 102));
        tk.setText("username");
        tk.setBorder(null);
        tk.setMaximumSize(new java.awt.Dimension(280, 25));
        tk.setMinimumSize(new java.awt.Dimension(280, 25));
        tk.setPreferredSize(new java.awt.Dimension(429, 25));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        log.setBackground(new java.awt.Color(0, 0, 0));
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setPreferredSize(new java.awt.Dimension(360, 50));
        log.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        LabelNutDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        LabelNutDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelNutDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        LabelNutDangNhap.setText("ĐĂNG NHẬP");
        log.add(LabelNutDangNhap);

        mk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mk.setText("password");
        mk.setBorder(null);
        mk.setPreferredSize(new java.awt.Dimension(429, 25));

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelInputLayout.createSequentialGroup()
                                    .addComponent(LblTaiKhoan)
                                    .addGap(52, 52, 52)
                                    .addComponent(LblTieuDe))
                                .addComponent(LblDangNhap)
                                .addComponent(tk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                        .addComponent(LblTieuDe)
                        .addGap(78, 78, 78))
                    .addComponent(LblTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15)
                .addComponent(tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(LblDangNhap)
                .addGap(18, 18, 18)
                .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        server.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng", "Tp. Hồ Chí Minh", "Hà Nội" }));
        server.setPreferredSize(new java.awt.Dimension(150, 22));

        javax.swing.GroupLayout PanelRightLayout = new javax.swing.GroupLayout(PanelRight);
        PanelRight.setLayout(PanelRightLayout);
        PanelRightLayout.setHorizontalGroup(
            PanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRightLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(PanelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelRightLayout.setVerticalGroup(
            PanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRightLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        PanelLeft.setBackground(new java.awt.Color(122, 74, 74));
        PanelLeft.setMaximumSize(new java.awt.Dimension(739, 763));
        PanelLeft.setMinimumSize(new java.awt.Dimension(739, 763));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Logo2.png"))); // NOI18N

        javax.swing.GroupLayout PanelLeftLayout = new javax.swing.GroupLayout(PanelLeft);
        PanelLeft.setLayout(PanelLeftLayout);
        PanelLeftLayout.setHorizontalGroup(
            PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLeftLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLeftLayout.setVerticalGroup(
            PanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelTongLayout = new javax.swing.GroupLayout(PanelTong);
        PanelTong.setLayout(PanelTongLayout);
        PanelTongLayout.setHorizontalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelTongLayout.setVerticalGroup(
            PanelTongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setChiNhanh() {
        int index = server.getSelectedIndex();
        String nameWithPorts = "";

        switch (index) {
            case 0:
                nameWithPorts = "LAPTOP-VNOPB5Q7\\SERVER:1433";
                serverTongValid = true;
                break;
            case 1:
                nameWithPorts = "LAPTOP-VNOPB5Q7\\NODE1:1434";
                serverTongValid = false;
                break;
            case 2:
                nameWithPorts = "LAPTOP-VNOPB5Q7\\NODE2:1435";
                serverTongValid = false;
                break;
            default:
                System.out.println("server set lỗi");
        }

        JDBCUtil.setServer(nameWithPorts);
    }

    public void login() {
        NhanVienDTO nv = n00_LoginBUS.getInstance().getNhanVienFromTaiKhoan(tk.getText(), mk.getText());
        PhanQuyenDTO pq = n00_LoginBUS.getInstance().getPhanQuyenFromTaiKhoan(tk.getText(), mk.getText());

        if (nv == null) {
            JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (serverTongValid) {
            if (nv.getMaCN() == null) {
                dispose();
                new n01_TrangChuGUI(nv.getMa(), nv.getMaCN(), pq).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            dispose();
            new n01_TrangChuGUI(nv.getMa(), nv.getMaCN(), pq).setVisible(true);
        }
    }

    public void buttonEvents() {
        setChiNhanh();

        server.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                setChiNhanh();
            }
        });

        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                log.setBackground(new Color(133, 133, 133));
                log.setOpaque(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                log.setBackground(new Color(0, 0, 0));
                log.setOpaque(true);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login();
            }
        });

        mk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    login();
                }
            }
        });

        tk.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (tk.getText().equals("username")) {
                    tk.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (tk.getText().isEmpty()) {
                    tk.setText("username");
                }
            }
        });

        mk.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (mk.getText().equals("password")) {
                    mk.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (mk.getText().isEmpty()) {
                    mk.setText("password");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNutDangNhap;
    private javax.swing.JLabel LblDangNhap;
    private javax.swing.JLabel LblLogo1;
    private javax.swing.JLabel LblLogo2;
    private javax.swing.JLabel LblTaiKhoan;
    private javax.swing.JLabel LblTieuDe;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelLeft;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel PanelRight;
    private javax.swing.JPanel PanelTong;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel log;
    private javax.swing.JPasswordField mk;
    private javax.swing.JComboBox<String> server;
    private javax.swing.JTextField tk;
    // End of variables declaration//GEN-END:variables
}
