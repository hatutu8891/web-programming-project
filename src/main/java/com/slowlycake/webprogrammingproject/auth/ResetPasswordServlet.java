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
        String email = req.getParameter("email");

        if (email == null || email.isEmpty()) {
            resp.sendRedirect("forgotPassword.jsp");
            return;
        }

        req.setAttribute("email", email);
        req.getRequestDispatcher("resetPassword.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (!password.equals(confirmPassword)) {
            req.setAttribute("error", "Mật khẩu không khớp. Vui lòng thử lại.");
            req.getRequestDispatcher("resetPassword.jsp").forward(req, resp);
            return;
        }

        UserService userService = new UserService();
        try {
            userService.updatePassword(email, password);
            resp.sendRedirect("success.jsp");
        } catch (Exception e) {
            req.setAttribute("error", "Có lỗi xảy ra. Vui lòng thử lại.");
            req.getRequestDispatcher("resetPassword.jsp").forward(req, resp);
        }
    }
}
