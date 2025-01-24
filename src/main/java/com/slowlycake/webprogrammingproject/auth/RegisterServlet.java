package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String uname = req.getParameter("uname");
        String email = req.getParameter("email");
        String phoneNum = req.getParameter("phoneNum");
        String address = req.getParameter("address");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        // Kiểm tra mật khẩu khớp nhau
        if (!password.equals(confirmPassword)) {
            req.setAttribute("error", "Mật khẩu không khớp.");
            req.getRequestDispatcher("signUp.jsp").forward(req, resp);
            return;
        }

        UserService userService = new UserService();

        // Kiểm tra username đã tồn tại
        if (userService.findUserByUsername(username) != null) {
            req.setAttribute("error", "Tên đăng nhập đã tồn tại.");
            req.getRequestDispatcher("signUp.jsp").forward(req, resp);
            return;
        }

        // Kiểm tra email đã tồn tại
        if (userService.findUserByEmail(email) != null) {
            req.setAttribute("error", "Email đã tồn tại.");
            req.getRequestDispatcher("signUp.jsp").forward(req, resp);
            return;
        }

        // Tạo user mới
        User newUser = new User(username, email, password, uname, phoneNum, address);
        if (userService.registerUser(newUser)) {
            resp.sendRedirect("login.jsp");
        } else {
            req.setAttribute("error", "Đăng ký thất bại. Vui lòng thử lại.");
            req.getRequestDispatcher("signUp.jsp").forward(req, resp);
        }
    }
}
