package vn.edu.hcmuaf.fit.login.service;

import vn.edu.hcmuaf.fit.login.dao.UserDAO;
import vn.edu.hcmuaf.fit.login.model.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserService {

    private UserDAO userDAO;

    public UserService(Connection connection) {
        this.userDAO = new UserDAO(connection);
    }

    // đăng ký người dùng
    public boolean registerUser(User user) {
        try {
            if (userDAO.getUserByUsername(user.getUsername()) != null) {
                return false;
            }
            return userDAO.registerUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức đăng nhập người dùng
    public User loginUser(String username, String password) {
        try {
            User user = userDAO.getUserByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // lấy thông tin người dùng theo username
    public User getUserInfo(String username) {
        try {
            return userDAO.getUserByUsername(username);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // cập nhật thông tin người dùng
    public boolean updateUserInfo(User user) {
        try {
            return userDAO.updateUser(user);  // Cập nhật thông tin người dùng
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // lấy tất cả người dùng
    public List<User> getAllUsers() {
        try {
            return userDAO.getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // xóa người dùng
    public boolean deleteUser(String username) {
        try {
            return userDAO.deleteUser(username);  // Xóa người dùng
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}