package BUS;

import DAO.n12_ThongKeDAO;
import Util.Utils;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

public class n12_ThongKeBUS {

    public static n12_ThongKeBUS getInstance() {
        return new n12_ThongKeBUS();
    }

    // Các biểu đồ
    public XYChart createLineChart(ArrayList<Integer> xData, ArrayList<Long> yData, ArrayList<String> seriesThu,
            String title, String xTitle, String yTitle) {
        XYChart lineChart = new XYChartBuilder()
                .width(750)
                .height(500)
                .title(title)
                .xAxisTitle(xTitle)
                .yAxisTitle(yTitle)
                .build();

        lineChart.getStyler().setYAxisDecimalPattern("#,###");

        for (int i = 0; i < seriesThu.size(); i++) {
            String thu = seriesThu.get(i);
            lineChart.addSeries(thu, xData, yData);
        }

        return lineChart;
    }

    public CategoryChart createBarChart(ArrayList<String> categories, ArrayList<Long> chiPhiNhap, ArrayList<Long> chiPhiNhanVien,
            String title, String xTitle, String yTitle) {
        CategoryChart chart = new CategoryChartBuilder()
                .width(800)
                .height(600)
                .title(title)
                .xAxisTitle(xTitle)
                .yAxisTitle(yTitle)
                .build();

        chart.getStyler().setYAxisDecimalPattern("#,###");

        chart.addSeries("Phí nhập hàng", categories, chiPhiNhap);
        chart.addSeries("Lương nhân viên", categories, chiPhiNhanVien);

        return chart;
    }

    // Trang mặc định
    public void setUpHeaderFirstPage(JLabel doanhThu, JLabel hd, JLabel kh, JLabel mon, String maCN) {
        Long doanhThuLong = n12_ThongKeDAO.getInstance().getDoanhThuToday(maCN);
        doanhThu.setText(Utils.getInstance().LongToMoney(doanhThuLong));

        int slHD = n12_ThongKeDAO.getInstance().getSLHoaDonToday(maCN);
        hd.setText(slHD + " hóa đơn");

        int slMon = n12_ThongKeDAO.getInstance().getSLMonToday(maCN);
        mon.setText(slMon + " món");

        int slKH = n12_ThongKeDAO.getInstance().getSLKhachHangToday(maCN);
        kh.setText(slKH + " khách");
    }

    public ArrayList<Long> ListDoanhThuTuan(String maCN) {
        return n12_ThongKeDAO.getInstance().ListDoanhThuTuan(maCN);
    }

    // Trang doanh thu
    public void setUpHeaderSecondPage(JLabel ngay, JLabel tuan, JLabel thang, JLabel nam, String maCN) {
        Long doanhThuNgay = n12_ThongKeDAO.getInstance().getDoanhThuToday(maCN);
        ngay.setText(Utils.getInstance().LongToMoney(doanhThuNgay));

        Long doanhThuTuan = n12_ThongKeDAO.getInstance().getDoanhThuTuan(maCN);
        tuan.setText(Utils.getInstance().LongToMoney(doanhThuTuan));

        Long doanhThuThang = n12_ThongKeDAO.getInstance().getDoanhThuThang(maCN);
        thang.setText(Utils.getInstance().LongToMoney(doanhThuThang));

        Long doanhThuNam = n12_ThongKeDAO.getInstance().getDoanhThuNam(maCN);
        nam.setText(Utils.getInstance().LongToMoney(doanhThuNam));
    }

    public ArrayList<Long> ListDoanhThuThang(String maCN) {
        return n12_ThongKeDAO.getInstance().ListDoanhThuThang(maCN);
    }

    // Trang chi phí
    public void setUpHeaderThirdPage(JLabel nhap, JLabel luong, JLabel tong, String maCN) {
        Long cpn = n12_ThongKeDAO.getInstance().getChiPhiNhapThang(maCN);
        nhap.setText(Utils.getInstance().LongToMoney(cpn));

        Long salary = n12_ThongKeDAO.getInstance().getChiPhiLuongThang(maCN);
        luong.setText(Utils.getInstance().LongToMoney(salary));

        tong.setText(Utils.getInstance().LongToMoney(cpn + salary));
    }

    public ArrayList<Long> ListChiPhiNhapThang(String maCN) {
        return n12_ThongKeDAO.getInstance().ListChiPhiNhapThang(maCN);
    }

    public ArrayList<Long> ListChiPhiLuongThang(String maCN) {
        return n12_ThongKeDAO.getInstance().ListChiPhiLuongThang(maCN);
    }

    // Trang lợi nhuận
    public void setUpHeaderFourthPage(JLabel thang, JLabel nam, String maCN) {
        Long chiPhiThang = n12_ThongKeDAO.getInstance().getChiPhiNhapThang(maCN) + n12_ThongKeDAO.getInstance().getChiPhiLuongThang(maCN);
        Long doanhThuThang = n12_ThongKeDAO.getInstance().getDoanhThuThang(maCN);
        thang.setText(Utils.getInstance().LongToMoney(doanhThuThang - chiPhiThang));

        Long doanhThuNam = n12_ThongKeDAO.getInstance().getDoanhThuNam(maCN);
        Long chiPhiNam = 0L;
        ArrayList<Long> nhap = n12_ThongKeDAO.getInstance().ListChiPhiNhapThang(maCN);
        ArrayList<Long> luong = n12_ThongKeDAO.getInstance().ListChiPhiLuongThang(maCN);
        for (Long a : nhap) {
            chiPhiNam += a;
        }

        for (Long a : luong) {
            chiPhiNam += a;
        }

        nam.setText(Utils.getInstance().LongToMoney(doanhThuNam - chiPhiNam));
    }

    public CategoryChart createBarChart(ArrayList<String> categories, ArrayList<Long> loi,
            String title, String xTitle, String yTitle) {
        CategoryChart chart = new CategoryChartBuilder()
                .width(800)
                .height(600)
                .title(title)
                .xAxisTitle(xTitle)
                .yAxisTitle(yTitle)
                .build();

        chart.getStyler().setYAxisDecimalPattern("#,###");

        chart.addSeries("Lợi nhuận", categories, loi);

        return chart;
    }

    // Trang kho hàng
    public void setUpHeaderFifthPage(JLabel pn, JLabel pxk, JLabel nl, JLabel ncc, String maCN) {
        int slPn = n12_ThongKeDAO.getInstance().getSLPhieuNhapThang(maCN);
        pn.setText(slPn + " phiếu nhập");

        int slXk = n12_ThongKeDAO.getInstance().getSLPhieuXuatKhoThang(maCN);
        pxk.setText(slXk + " phiếu xuất kho");

        int slNl = n12_ThongKeDAO.getInstance().getSLNguyenLieu();
        nl.setText(slNl + " nguyên liệu");

        int slNCC = n12_ThongKeDAO.getInstance().getSLNCC();
        ncc.setText(slNCC + " nhà cung cấp");
    }

    public void setUpBodyKhoHang(JTable table, String maCN) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        ArrayList<Object[]> ds = n12_ThongKeDAO.getInstance().ListThongKeKho(maCN);
        for (Object[] row : ds) {
            model.addRow(new Object[]{
                row[0], 
                row[1], 
                row[3],
                row[4],
                row[2]
            });
        }
    }

}
