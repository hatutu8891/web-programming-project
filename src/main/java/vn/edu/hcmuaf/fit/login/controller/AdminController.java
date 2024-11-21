package vn.edu.hcmuaf.fit.login.controller;

import jakarta.servlet.ServletException;
import vn.edu.hcmuaf.fit.login.dao.AdminDAO;
import vn.edu.hcmuaf.fit.login.model.User;
import vn.edu.hcmuaf.fit.login.service.AdminService;
import vn.edu.hcmuaf.fit.login.service.UserService;

import jakarta.servlet.http.*;
import vn.edu.hcmuaf.fit.login.utils.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AdminController extends HttpServlet {

    private AdminService adminService;
    private UserService userService;

    @Override
    public void init() throws ServletException {
        // Khởi tạo AdminService và UserService với kết nối cơ sở dữ liệu
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        adminService = new AdminService(connection);
        userService = new UserService(connection);
    }

    // Hiển thị tất cả người dùng
    protected void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<User> users = adminService.getAllUsers(); // Lấy danh sách người dùng
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>User List</h2>");
        response.getWriter().println("<ul>");
        for (User user : users) {
            response.getWriter().println("<li>" + user.getUsername() + " - " + user.getEmail() + " - " + user.getRole() + "</li>");
        }
        response.getWriter().println("</ul>");
        response.getWriter().println("</body></html>");
    }

    // Thêm người dùng mới
    protected void addUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String email = request.getParameter("email"); // Lấy email từ request

        User newUser = new User(username, password, role, email); // Tạo đối tượng người dùng mới

        boolean isAdded = userService.registerUser(newUser); // Gọi UserService để thêm người dùng
        if (isAdded) {
            response.sendRedirect("/admin/listUsers"); // Chuyển hướng lại trang danh sách người dùng sau khi thêm
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<p style='color:red;'>Thêm người dùng thất bại.</p>");
            response.getWriter().println("</body></html>");
        }
    }

    // Xóa người dùng
    protected void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        String username = request.getParameter("username"); // Lấy username của người dùng cần xóa
        boolean isDeleted = adminService.deleteUser(username); // Gọi AdminService để xóa người dùng

        if (isDeleted) {
            response.sendRedirect("/admin/listUsers"); // Chuyển hướng lại trang danh sách người dùng sau khi xóa
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<p style='color:red;'>Xóa người dùng thất bại.</p>");
            response.getWriter().println("</body></html>");
        }
    }

    // Cập nhật thông tin người dùng
    protected void updateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String email = request.getParameter("email"); // Lấy email từ request

        User updatedUser = new User(username, password, role, email); // Tạo đối tượng người dùng với thông tin mới

        boolean isUpdated = userService.updateUserInfo(updatedUser); // Cập nhật người dùng qua UserService

        if (isUpdated) {
            response.sendRedirect("/admin/listUsers"); // Chuyển hướng lại trang danh sách người dùng sau khi cập nhật
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<p style='color:red;'>Cập nhật người dùng thất bại.</p>");
            response.getWriter().println("</body></html>");
        }
    }
}