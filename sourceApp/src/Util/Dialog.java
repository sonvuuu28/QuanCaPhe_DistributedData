package Util;

import javax.swing.*;

public class Dialog extends javax.swing.JDialog {

    public enum DataType {
        FLOAT, INTEGER
    }

    private boolean confirmed = false;
    private DataType dataType;
    public String result = null;
    public String mark;

    public Dialog(java.awt.Frame parent, boolean modal, DataType type, String mark) {
        super(parent, modal);
        this.dataType = type;
        this.mark = mark;

        initComponents();
        setLocationRelativeTo(null);
        buttonEvents(type, mark);
    }

    public void buttonEvents(DataType type, String mark) {
        kl.requestFocus();
        if (type == DataType.FLOAT) {
            FloatNumber(kl);
        } else {
            IntNumber(kl);
        }

        kl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    String a = returnNum(kl.getText(), mark); // Thay "50" bằng giá trị mốc động
//                    System.out.println(a);
                }
            }
        });

        Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                String a = returnNum(kl.getText(), mark); // Thay "50" bằng giá trị mốc động
//                System.out.println(a);
            }
        });

    }

    public String returnNum(String num, String mark) {
        if (!num.equals("")) {
            try {
                if (dataType == DataType.INTEGER) {
                    int numValue = Integer.parseInt(num);
                    int markValue = Integer.parseInt(mark);

                    if (numValue > markValue) {
                        JOptionPane.showMessageDialog(null, "Vui lòng điền số bé hơn " + mark, "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return null;
                    }
                } else if (dataType == DataType.FLOAT) {
                    float numValue = Float.parseFloat(num);
                    float markValue = Float.parseFloat(mark);

                    if (numValue > markValue) {
                        JOptionPane.showMessageDialog(null, "Vui lòng điền số bé hơn " + mark, "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return null; // Không đóng dialog
                    }
                }

                dispose(); // Đóng dialog nếu hợp lệ
                result = num;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Số nhập không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng điền khối lượng phù hợp?", "Xác nhận", JOptionPane.ERROR_MESSAGE);
        }
        return result;
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
                String text = textField.getText();
                // Chỉ giữ số và dấu chấm
                text = text.replaceAll("[^\\d.]", "");
                // Xóa dấu chấm nếu có liên tiếp
                text = text.replaceAll("\\.{2,}", ".");

                // Giữ lại số 0 đầu nếu là "0" hoặc "0.xxx", nên không xoá nữa
                // Nhưng chỉ cho phép 1 dấu chấm duy nhất
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
        Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(219, 189, 142));
        jPanel4.setPreferredSize(new java.awt.Dimension(202, 97));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 6));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(190, 85));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 8));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 35));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 6, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Nhập số:");
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
                Dialog dialog = new Dialog(new javax.swing.JFrame(), true, Dialog.DataType.FLOAT, "1.6");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kl;
    // End of variables declaration//GEN-END:variables
}
