package vn.edu.hcmuaf.fit.login.service;

import vn.edu.hcmuaf.fit.login.dao.AdminDAO;
import vn.edu.hcmuaf.fit.login.model.Admin;
import vn.edu.hcmuaf.fit.login.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AdminService {
    private AdminDAO adminDAO;

    // Constructor
    public AdminService(Connection connection) {
        this.adminDAO = new AdminDAO(connection);
    }
    public AdminService(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    // Thêm quản trị viên mới
    public boolean addAdmin(Admin admin) throws SQLException {
        if (admin == null || admin.getUsername() == null || admin.getPassword() == null) {
            return false;
        }
        if (adminDAO.usernameExists(admin.getUsername())) {
            return false;
        }
        return adminDAO.addAdmin(admin);
    }

    // Lấy danh sách tất cả người dùng
    public List<User> getAllUsers() throws SQLException {
        return adminDAO.getAllUsers();
    }

    // Xóa người dùng
    public boolean deleteUser(String username) throws SQLException {
        if (!adminDAO.usernameExists(username)) {
            System.out.println("Không thể xóa vì không tìm thấy người dùng: " + username);
            return false;
        }
        return adminDAO.deleteUser(username);
    }

    // Lấy thông tin người dùng theo username
    public User getUserByUsername(String username) throws SQLException {
        return adminDAO.getUserByUsername(username);
    }

    // Cập nhật thông tin người dùng
    public boolean updateUser(User user) throws SQLException {
        if (user == null || user.getUsername() == null || user.getPassword() == null || user.getRole() == null) {
            return false;
        }

        if (!adminDAO.usernameExists(user.getUsername())) {
            return false;
        }

        return adminDAO.updateUser(user);
    }
}