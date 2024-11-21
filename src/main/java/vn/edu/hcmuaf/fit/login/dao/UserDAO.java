package vn.edu.hcmuaf.fit.login.dao;

import vn.edu.hcmuaf.fit.login.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private Connection connection;

    // Constructor khởi tạo kết nối cơ sở dữ liệu
    public UserDAO(Connection connection) {
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

    // Phương thức lấy người dùng theo username
    public User getUserByUsername(String username) throws SQLException {
        String query = "SELECT * FROM users WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("role"),
                            rs.getString("email") // Lấy thêm email nếu có
                    );
                }
            }
        }
        return null;
    }

    // Phương thức đăng ký người dùng
    public boolean registerUser(User user) throws SQLException {
        String query = "INSERT INTO users (username, password, role, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getRole());
            stmt.setString(4, user.getEmail()); // Lưu email vào cơ sở dữ liệu
            int result = stmt.executeUpdate();
            return result > 0;
        }
    }

    // Phương thức cập nhật người dùng
    public boolean updateUser(User user) throws SQLException {
        String query = "UPDATE users SET password = ?, role = ?, email = ? WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getPassword());
            stmt.setString(2, user.getRole());
            stmt.setString(3, user.getEmail()); // Cập nhật email
            stmt.setString(4, user.getUsername());
            int result = stmt.executeUpdate();
            return result > 0;
        }
    }

    // Phương thức lấy tất cả người dùng
    public List<User> getAllUsers() throws SQLException {
        String query = "SELECT * FROM users";
        List<User> users = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                users.add(new User(
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role"),
                        rs.getString("email")
                ));
            }
        }
        return users;
    }

    // Phương thức xóa người dùng
    public boolean deleteUser(String username) throws SQLException {
        String query = "DELETE FROM users WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            int result = stmt.executeUpdate();
            return result > 0;
        }
    }
}