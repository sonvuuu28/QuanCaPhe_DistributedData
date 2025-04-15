package Util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    private static String serverName;
    private static String portNumber; 
    private static String dbname;
    private static String username;
    private static String password;

    public static void setServer(String serverWithPort) {
        if (serverWithPort.contains(":")) {
            String[] parts = serverWithPort.split(":");
            serverName = parts[0];
            portNumber = parts[1];
        } else {
            serverName = serverWithPort;
            portNumber = "1433"; 
        }
        readFileText();
    }

    public static Connection getConnection() {
        Connection c = null;
        if (checkNullValues()) return null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String dbUrl = "jdbc:sqlserver://" + serverName + ":" + portNumber
                    + ";databaseName=" + dbname + ";encrypt=true;trustServerCertificate=true";

            c = DriverManager.getConnection(dbUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readFileText() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("connect.txt")))) {
            dbname = reader.readLine();
            username = reader.readLine();
            password = reader.readLine();
            if (password == null) password = "";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkNullValues() {
        return serverName == null || dbname == null || username == null;
    }

    public static void main(String[] args) {
        JDBCUtil.setServer("LAPTOP-VNOPB5Q7\\NODE1:1434");
        Connection c = JDBCUtil.getConnection();
        JDBCUtil.closeConnection(c);
    }
}
