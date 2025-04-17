/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    // Thông tin kết nối
    private static final String SERVER_NAME = "LAPTOP-VNOPB5Q7\\NODE2"; // hoặc IP của server
    private static final int PORT_NUMBER = 1435;         // port mặc định
    private static final String DATABASE_NAME = "QuanCaPhe";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123";

    public static void main(String[] args) {
        String connectionUrl = String.format(
            "jdbc:sqlserver://%s:%d;databaseName=%s;encrypt=true;trustServerCertificate=true;",
            SERVER_NAME, PORT_NUMBER, DATABASE_NAME
        );

        // Kết nối và truy vấn dữ liệu mẫu
        try (Connection conn = DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {

            System.out.println("Kết nối thành công đến SQL Server!");

            String sql = "SELECT TOP 10 MaChiNhanh, TenChiNhanh, DiaChi, TrangThai FROM ChiNhanh";
            try (ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    String id = rs.getString("MaChiNhanh");
                    String name = rs.getString("TenChiNhanh");
                    System.out.printf("%s | %s |\n", id, name);
                }
            }

        } catch (SQLException e) {
            System.err.println("Kết nối thất bại hoặc có lỗi khi truy vấn dữ liệu.");
            e.printStackTrace();
        }
    }
}
