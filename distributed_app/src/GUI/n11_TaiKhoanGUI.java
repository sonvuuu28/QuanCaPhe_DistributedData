package GUI;

public class n11_TaiKhoanGUI extends javax.swing.JFrame {

    private String maNV;
    private String maCN;

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public n11_TaiKhoanGUI(String maNV, String maCN) {
        this.maNV = maNV;
        this.maCN = maCN;
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Biggest = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Biggest.setBackground(new java.awt.Color(122, 74, 74));
        Biggest.setMaximumSize(new java.awt.Dimension(500, 642));
        Biggest.setMinimumSize(new java.awt.Dimension(500, 0));
        Biggest.setPreferredSize(new java.awt.Dimension(500, 412));

        tab.setPreferredSize(new java.awt.Dimension(450, 340));
        Biggest.add(tab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Biggest, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void buttonEvents() {
        tab.removeAll();
        
        tab.addTab("Tạo tài khoản", new n11_TaiKhoan_Them(n11_TaiKhoanGUI.this));
        tab.addTab("Cấp lại mật khẩu và sửa quyền", new n11_TaiKhoan_CapMatKhauMoi(n11_TaiKhoanGUI.this));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Biggest;
    private javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables
}
