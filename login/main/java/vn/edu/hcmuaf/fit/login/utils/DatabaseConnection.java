package vn.edu.hcmuaf.fit.login.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/user_management";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Phương thức để lấy kết nối đến cơ sở dữ liệu
    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage(), e);
        }
    }

    // Phương thức để đóng kết nối
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Không thể đóng kết nối: " + e.getMessage());
            }
        }
    }
}
