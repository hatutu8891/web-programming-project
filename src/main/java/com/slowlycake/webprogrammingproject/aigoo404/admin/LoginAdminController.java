package com.slowlycake.webprogrammingproject.aigoo404.admin;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.jdbi.v3.core.Jdbi;

import java.io.*;

@WebServlet("/login-admin")
public class LoginAdminController extends HttpServlet {
    private UserService userService;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String handle = request.getParameter("handle");
        String password = request.getParameter("password");
        User user = userService.login(handle, password);
        if (user != null) {
            if (user.getRole() == 1) {
                response.sendRedirect("adminDashboard.jsp");
            } else {
                response.sendRedirect("index.jsp");
            }
        } else {
            response.sendRedirect("login.jsp?error=invalid");
        }
    }
}