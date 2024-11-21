package vn.edu.hcmuaf.fit.login.controller;

import vn.edu.hcmuaf.fit.login.model.User;
import vn.edu.hcmuaf.fit.login.service.AuthService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.hcmuaf.fit.login.utils.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

//@WebServlet("/login")
public class AuthController extends HttpServlet {
    private AuthService authService;

    @Override
    public void init() throws ServletException {
        // Khởi tạo AuthService
        try {
            Connection connection = DatabaseConnection.getConnection();
            authService = new AuthService(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = null;
        try {
            user = authService.authenticate(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        if (user != null) {
            response.getWriter().write("{\"success\": true, \"message\": \"Đăng nhập thành công!\"}");
        } else {
            response.getWriter().write("{\"success\": false, \"message\": \"Tên đăng nhập hoặc mật khẩu không chính xác!\"}");
        }
    }
}
