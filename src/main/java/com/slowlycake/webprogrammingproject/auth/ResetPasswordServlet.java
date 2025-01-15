package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ResetPasswordServlet", value = "/resetPassword")
public class ResetPasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Nhận email từ tham số URL (resetPassword?email=email@example.com)
        String email = req.getParameter("email");

        // Kiểm tra nếu không có email hoặc email không hợp lệ, chuyển hướng về trang quên mật khẩu
        if (email == null || email.isEmpty()) {
            resp.sendRedirect("forgotPassword.jsp");
            return;
        }

        // Truyền email vào request để sử dụng trong trang resetPassword.jsp
        req.setAttribute("email", email);
        req.getRequestDispatcher("resetPassword.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lấy các tham số từ form
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        // Kiểm tra mật khẩu và xác nhận mật khẩu có khớp hay không
        if (!password.equals(confirmPassword)) {
            req.setAttribute("error", "Mật khẩu không khớp. Vui lòng thử lại.");
            req.getRequestDispatcher("resetPassword.jsp").forward(req, resp);
            return;
        }

        // Cập nhật mật khẩu trong cơ sở dữ liệu
        UserDao userDao = new UserDao();
        try {
            userDao.updatePassword(email, password);  // Cập nhật mật khẩu mới cho người dùng
            resp.sendRedirect("success.jsp");  // Chuyển hướng đến trang thành công
        } catch (Exception e) {
            req.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại.");
            req.getRequestDispatcher("resetPassword.jsp").forward(req, resp);
        }
    }
}
