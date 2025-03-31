package GUI;

import java.awt.Image;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class n06_Mon_AnhGUI extends javax.swing.JFrame {

    private String fileName;
    private String HinhAnh;
    private n06_MonGUI frame;

    public n06_Mon_AnhGUI(n06_MonGUI frame, String HinhAnh) {
        this.frame = frame;
        this.HinhAnh = HinhAnh;
        initComponents();
        buttonEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnThem = new javax.swing.JButton();
        BtnXN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(122, 74, 74));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 280));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("ẢNH MÓN ABC");
        Title.setPreferredSize(new java.awt.Dimension(250, 22));
        jPanel2.add(Title);

        jPanel3.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        label.setBackground(new java.awt.Color(204, 255, 204));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setOpaque(true);
        label.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(label);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 37));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 8));

        BtnThem.setBackground(new java.awt.Color(51, 51, 51));
        BtnThem.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        BtnThem.setForeground(new java.awt.Color(255, 255, 255));
        BtnThem.setText("Chọn");
        BtnThem.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel4.add(BtnThem);

        BtnXN.setBackground(new java.awt.Color(0, 153, 0));
        BtnXN.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        BtnXN.setForeground(new java.awt.Color(255, 255, 255));
        BtnXN.setText("Xác nhận");
        BtnXN.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel4.add(BtnXN);

        jPanel2.add(jPanel4);

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEvents() {
        setImage();
        Title.setText(frame.getTenMon());

        BtnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Chọn ảnh");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setAcceptAllFileFilterUsed(false);
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Hình ảnh", "jpg", "jpeg", "png", "gif"));

                int returnValue = fileChooser.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    setLabelImage(file.getAbsolutePath());
                    fileName = file.getName();
                }
            }
        });

        BtnXN.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int response = JOptionPane.showConfirmDialog(null, "Bạn xác nhận chọn ảnh này " + fileName + "?", "Xác nhận", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    frame.setImageTextField(fileName);
                    dispose();
                }
            }
        });
    }

    public void setLabelImage(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(img));
    }

    private void setImage() {
        String relativePath = new File("AnhMon/" + HinhAnh).getAbsolutePath();
        File file = new File(relativePath);
        if (!file.exists()) {
            System.out.println("File không tồn tại: " + relativePath);
            return;
        }
        ImageIcon icon = new ImageIcon(relativePath);
        Image img = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(img));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnXN;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
