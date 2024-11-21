package vn.edu.hcmuaf.fit.login.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.login.service.UserService;
import vn.edu.hcmuaf.fit.login.model.User;
import vn.edu.hcmuaf.fit.login.utils.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class UserController extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        // Khởi tạo UserService với kết nối cơ sở dữ liệu
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        userService = new UserService(connection);
    }

    /**
     * Xử lý yêu cầu GET, ví dụ để hiển thị trang thông tin người dùng.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user"); // Lấy thông tin người dùng từ session

        if (user != null) {
            // Nếu người dùng đã đăng nhập, hiển thị thông tin người dùng
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h2>User Profile</h2>");
            response.getWriter().println("<p>Username: " + user.getUsername() + "</p>");
            response.getWriter().println("<p>Email: " + user.getEmail() + "</p>");
            response.getWriter().println("<p>Role: " + user.getRole() + "</p>");
            response.getWriter().println("<form action='updateUser' method='post'>");
            response.getWriter().println("<input type='hidden' name='username' value='" + user.getUsername() + "'>");
            response.getWriter().println("<label for='password'>New Password:</label>");
            response.getWriter().println("<input type='password' id='password' name='password'><br><br>");
            response.getWriter().println("<label for='email'>Email:</label>");
            response.getWriter().println("<input type='email' id='email' name='email' value='" + user.getEmail() + "'><br><br>");
            response.getWriter().println("<input type='submit' value='Update'>");
            response.getWriter().println("</form>");
            response.getWriter().println("</body></html>");
        } else {
            // Nếu người dùng chưa đăng nhập, chuyển hướng đến trang đăng nhập
            response.sendRedirect("login.html");
        }
    }

    /**
     * Xử lý yêu cầu POST, ví dụ để cập nhật thông tin người dùng.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy thông tin từ form (ví dụ: tên đăng nhập, mật khẩu và email)
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String email = request.getParameter("email"); // Lấy email từ request

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user != null && user.getUsername().equals(username)) {
            // Nếu người dùng đã đăng nhập và tên đăng nhập khớp
            user.setPassword(password); // Cập nhật mật khẩu
            user.setRole(role); // Cập nhật vai trò (nếu có)
            user.setEmail(email); // Cập nhật email

            // Cập nhật thông tin người dùng vào cơ sở dữ liệu thông qua UserService
            boolean isUpdated = userService.updateUserInfo(user);

            if (isUpdated) {
                // Nếu cập nhật thành công, chuyển hướng lại trang thông tin người dùng
                session.setAttribute("user", user);
                response.sendRedirect("userProfile.html");
            } else {
                // Nếu cập nhật thất bại, thông báo lỗi
                response.setContentType("text/html");
                response.getWriter().println("<html><body>");
                response.getWriter().println("<p style='color:red;'>Cập nhật thông tin không thành công.</p>");
                response.getWriter().println("</body></html>");
            }
        } else {
            // Nếu không phải người dùng này, chuyển hướng đến trang đăng nhập
            response.sendRedirect("login.html");
        }
    }
}