package vn.edu.hcmuaf.fit.login.dao;

import vn.edu.hcmuaf.fit.login.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {

    private Connection connection;

    // Constructor khởi tạo kết nối cơ sở dữ liệu
    public AdminDAO(Connection connection) {
        this.connection = connection;
    }

    // Phương thức kiểm tra sự tồn tại của username
    public boolean usernameExists(String username) throws SQLException {
        String query = "SELECT 1 FROM users WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    // Phương thức lấy danh sách tất cả người dùng có vai trò admin
    public List<User> getAllAdmins() throws SQLException {
        String sql = "SELECT * FROM users WHERE role = 'admin'";
        List<User> admins = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String role = resultSet.getString("role");
                String email = resultSet.getString("email");
                admins.add(new User(username, password, role, email));
            }
        }
        return admins;
    }

    // Phương thức tìm kiếm admin theo username
    public User getUserByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND role = 'admin'";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String password = resultSet.getString("password");
                    String role = resultSet.getString("role");
                    String email = resultSet.getString("email");
                    return new User(username, password, role, email);
                }
            }
        }
        return null; // Nếu không tìm thấy admin
    }

    // Phương thức thêm một admin mới
    public boolean addAdmin(User user) throws SQLException {
        String sql = "INSERT INTO users (username, password, role, email) VALUES (?, ?, 'admin', ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        }
    }

    // Phương thức xóa admin
    public boolean deleteUser(String username) throws SQLException {
        String sql = "DELETE FROM users WHERE username = ? AND role = 'admin'";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        }
    }

    // Phương thức cập nhật thông tin của admin
    public boolean updateUser(User user) throws SQLException {
        String sql = "UPDATE users SET password = ?, email = ? WHERE username = ? AND role = 'admin'";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getPassword());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getUsername());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        }
    }

    // Phương thức lấy tất cả người dùng
    public List<User> getAllUsers() throws SQLException {
        String sql = "SELECT * FROM users";
        List<User> users = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                users.add(new User(
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("role"),
                        resultSet.getString("email")
                ));
            }
        }
        return users;
    }
}