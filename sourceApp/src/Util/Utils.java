package Util;

import java.awt.Point;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;

public class Utils {

    public static Utils getInstance() {
        return new Utils();
    }

    public String SQLDateString_Transform_normalDateString(String dateSql) {
        String day = dateSql.substring(8, 10);
        String month = dateSql.substring(5, 7);
        String year = dateSql.substring(0, 4);

        String date = day + "-" + month + "-" + year;
        return date;
    }

    public Date normalDateString_Transform_SQLDate(String date) {
        String day = date.substring(0, 2);
        String month = date.substring(3, 5);
        String year = date.substring(6, 10);

        Date sql = Date.valueOf(year + "-" + month + "-" + day);
        return sql;
    }

    public Long MoneyToLong(String money) {
        money = money.trim();
        money = money.replace(",", "");
        money = money.replace(".", "");
        money = money.replace(" VNĐ", "");

        return Long.valueOf(money);
    }

    public String LongToMoney(Long l) {
        if (l == null) {
            return "0";
        }

        String money = String.valueOf(l);
        StringBuilder sb = new StringBuilder(money);
        int len = sb.length();

        for (int i = len - 3; i > 0; i -= 3) {
            sb.insert(i, '.');
        }

        return sb.toString() + " VNĐ";
    }

    public Long MoneyToLongNoneVND(String money) {
        money = money.trim();
        money = money.replace(",", "");
        money = money.replace(".", "");
        money = money.replace(" VNĐ", "");

        return Long.valueOf(money);
    }

    public String LongToMoneyNoneVND(Long l) {
        if (l == null) {
            return "0";
        }

        String money = String.valueOf(l);
        StringBuilder sb = new StringBuilder(money);
        int len = sb.length();

        for (int i = len - 3; i > 0; i -= 3) {
            sb.insert(i, '.');
        }

        return sb.toString();
    }

    public int createRandomNumbers() {
        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }

    public String hienThi_NgayHienTai() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String pre_ngay = today.format(formatter);
        String ngay = pre_ngay.substring(0, 2);
        String thang = pre_ngay.substring(3, 5);
        String nam = pre_ngay.substring(6, 10);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        String lich = "";
        if (dayOfWeek.getValue() == 7) {
            lich = "Chủ Nhật, " + ngay + " tháng " + thang + " năm " + nam;
        } else {
            lich = "Thứ " + (dayOfWeek.getValue() + 1) + ", " + ngay + " tháng " + thang + " năm " + nam;
        }
        return lich;
    }

    /*Util LỊCH LÀM*/
    public List<Date> getDate_DaysInWeek(Date Ngay) {
        List<Date> list = new ArrayList<>(7);

        LocalDate specificDate = Ngay.toLocalDate();
        LocalDate thu2 = specificDate.with(DayOfWeek.MONDAY);

        for (int i = 0; i < 7; i++) {
            LocalDate currentDay = thu2.plusDays(i);
            Date day = Date.valueOf(currentDay);      // Chuyển LocalDate thành Date
            list.add(day);
        }

        return list;
    }

    private Point initialClick;

    public void dragPanel(JPanel panel, JFrame frame) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }
        });

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (initialClick != null) {
                    // Tính toán vị trí mới của frame
                    int x = frame.getLocation().x + e.getX() - initialClick.x;
                    int y = frame.getLocation().y + e.getY() - initialClick.y;
                    frame.setLocation(x, y);
                }
            }
        });
    }
    
    public void dragPanel(JPanel panel, JDialog frame) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }
        });

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (initialClick != null) {
                    // Tính toán vị trí mới của frame
                    int x = frame.getLocation().x + e.getX() - initialClick.x;
                    int y = frame.getLocation().y + e.getY() - initialClick.y;
                    frame.setLocation(x, y);
                }
            }
        });
    }

    public void sdt(JTextField sdt) {
        sdt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String text = sdt.getText();
                text = text.replaceAll("[^\\d]", "");
                if (!text.isEmpty() && text.charAt(0) != '0') {
                    sdt.setText("");
                    return;
                }
                if (text.length() > 10) {
                    text = text.substring(0, 10);
                }
                sdt.setText(text);
            }
        });
    }

    public void timKiem(JTextField TimKiem) {
        TimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (TimKiem.getText().equals("Tìm kiếm nhanh theo tên")) {
                    TimKiem.setText("");
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (TimKiem.getText().isEmpty()) {
                    TimKiem.setText("Tìm kiếm nhanh theo tên");
                }
            }
        });
    }
//
//    public static void delayAction(int delayMillis, Runnable action) {
//        javax.swing.Timer timer = new javax.swing.Timer(delayMillis, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ((javax.swing.Timer) e.getSource()).stop();
//                action.run();
//            }
//        });
//        timer.setRepeats(false); // Đảm bảo chỉ chạy 1 lần
//        timer.start();
//    }

    public static void main(String[] args) {
//        System.out.println(Utils.getInstance().SQLDateString_Transform_normalDateString(new Date(System.currentTimeMillis()) + ""));
//        System.out.println(Utils.getInstance().normalDateString_Transform_SQLDate("27-02-2025"));
//        System.out.println(Utils.getInstance().MoneyToLong("1,000,000 VNĐ") + 1);
//        System.out.println(Utils.getInstance().LongToMoney(1000000000L));
//        System.out.println(Utils.getInstance().createRandomNumbers());
//        List<Date> ds = Utils.getInstance().getDate_DaysInWeek(Date.valueOf(LocalDate.now()));
//        for (int i = 0; i < 7; i++) {
//            System.out.println(ds.get(i));
//        }
        System.out.println(Utils.getInstance().hienThi_NgayHienTai());
    }
}
