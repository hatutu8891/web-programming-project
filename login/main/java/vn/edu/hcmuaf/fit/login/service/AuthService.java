package vn.edu.hcmuaf.fit.login.service;

import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.login.dao.UserDAO;
import vn.edu.hcmuaf.fit.login.model.User;

import java.sql.Connection;
import java.sql.SQLException;

public class AuthService {

    private UserDAO userDAO;

    public AuthService() {
    }
    public AuthService(Connection connection) {
        this.userDAO = new UserDAO(connection);
    }

    /**
     * Xác thực đăng nhập của người dùng.
     *
     * @param username Tên đăng nhập của người dùng
     * @param password Mật khẩu của người dùng
     * @return Trả về đối tượng User nếu đăng nhập thành công, hoặc null nếu thất bại
     */
    public User authenticate(String username, String password) throws SQLException {
        // Tìm người dùng trong cơ sở dữ liệu theo username
        User user = userDAO.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user; // Nếu người dùng tồn tại và mật khẩu đúng, trả về đối tượng User
        }
        return null; // Trả về null nếu không tìm thấy hoặc mật khẩu không đúng
    }

    /**
     * Kiểm tra quyền hạn của người dùng (kiểm tra xem có phải admin hay không).
     *
     * @param user Đối tượng User cần kiểm tra
     * @return true nếu người dùng là admin, false nếu không phải
     */
    public boolean isAdmin(User user) {
        return "admin".equals(user.getRole()); // Kiểm tra xem người dùng có phải admin hay không
    }

    /**
     * Đăng xuất người dùng (hủy session).
     *
     * @param session Session hiện tại của người dùng
     */
    public void logout(HttpSession session) {
        if (session != null) {
            session.invalidate(); // Hủy session để đăng xuất người dùng
        }
    }
}