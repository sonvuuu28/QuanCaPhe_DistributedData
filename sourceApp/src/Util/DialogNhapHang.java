package Util;

import javax.swing.*;

public class DialogNhapHang extends javax.swing.JDialog {

    public enum DataType {
        FLOAT, INTEGER
    }

    private boolean confirmed = false;
    private DataType dataType;
    public String result = null;
    public String money = null;

    public DialogNhapHang(java.awt.Frame parent, boolean modal, DataType type) {
        super(parent, modal);
        this.dataType = type;

        initComponents();
        setLocationRelativeTo(null);
        buttonEvents(type);
    }

    public void buttonEvents(DataType type) {
        kl.requestFocus();
        if (type == DataType.FLOAT) {
            FloatNumber(kl);
        } else {
            IntNumber(kl);
        }

        Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result = returnNum(kl.getText());
                if (result != null) {
                    money = returnMoney(donGia.getText());
                }
                if (result != null && money != null && !kl.getText().trim().equals("") && !donGia.getText().trim().equals("")) {
                    dispose();
                }
            }
        });

        donGia.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String text = donGia.getText();
                text = text.replaceAll("[^\\d]", "");
                text = text.replaceFirst("^0+", "");
                if (!text.isEmpty()) {
                    try {
                        Long giaDenLong = Long.valueOf(text);
                        donGia.setText(Util.Utils.getInstance().LongToMoneyNoneVND(giaDenLong));
                    } catch (NumberFormatException e) {
                        donGia.setText("");
                    }
                } else {
                    donGia.setText("");
                }
            }
        });

    }

    public String returnNum(String num) {
        if (!num.equals("")) {
            try {
                if (dataType == DataType.INTEGER) {
                    int numValue = Integer.parseInt(num);
                } else if (dataType == DataType.FLOAT) {
                    float numValue = Float.parseFloat(num);
                }

                result = num;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Số nhập không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng điền khối lượng phù hợp?", "Xác nhận", JOptionPane.ERROR_MESSAGE);
            kl.requestFocus();
        }
        return result;
    }

    public String returnMoney(String money) {
        if (!donGia.getText().trim().equals("")) {
            money = Utils.getInstance().MoneyToLongNoneVND(donGia.getText()).toString();
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng điền giá tiền phù hợp?", "Xác nhận", JOptionPane.ERROR_MESSAGE);
            donGia.requestFocus();
        }
        return money;
    }

    public void IntNumber(JTextField textField) {
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

    public void FloatNumber(JTextField textField) {
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textField.requestFocus();
                String text = textField.getText();

                text = text.replaceAll("[^\\d.]", ""); // Chỉ giữ số và dấu chấm
                text = text.replaceAll("\\.{2,}", "."); // Xóa dấu chấm nếu có liên tiếp
                text = text.replaceFirst("^0+(?!\\.)", ""); // Xóa số 0 đầu nếu không phải "0."

                int dotIndex = text.indexOf(".");
                if (dotIndex != -1 && text.indexOf(".", dotIndex + 1) != -1) {
                    text = text.substring(0, dotIndex + 1) + text.substring(dotIndex + 2).replace(".", "");
                }
                textField.setText(text);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        kl = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        donGia = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(219, 189, 142));
        jPanel4.setPreferredSize(new java.awt.Dimension(262, 152));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 6));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 140));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 35));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Khối lượng");
        jPanel2.add(jLabel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 35));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        kl.setPreferredSize(new java.awt.Dimension(100, 24));
        jPanel3.add(kl);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 2));
        jPanel3.add(jSeparator1);

        jPanel2.add(jPanel3);

        jPanel1.add(jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(240, 35));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Giá tiền");
        jLabel2.setPreferredSize(new java.awt.Dimension(63, 16));
        jPanel5.add(jLabel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(120, 35));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 4));

        donGia.setPreferredSize(new java.awt.Dimension(100, 24));
        jPanel6.add(donGia);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(100, 2));
        jPanel6.add(jSeparator2);

        jPanel5.add(jPanel6);

        jPanel1.add(jPanel5);

        Btn.setBackground(new java.awt.Color(0, 0, 0));
        Btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Btn.setForeground(new java.awt.Color(255, 255, 255));
        Btn.setText("OK");
        Btn.setPreferredSize(new java.awt.Dimension(70, 22));
        jPanel1.add(Btn);

        jPanel4.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogNhapHang dialog = new DialogNhapHang(new javax.swing.JFrame(), true, DialogNhapHang.DataType.FLOAT);
//                Dialog dialog = new Dialog(new javax.swing.JFrame(), true, Dialog.DataType.INTEGER, "50");

                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn;
    private javax.swing.JTextField donGia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField kl;
    // End of variables declaration//GEN-END:variables
}
