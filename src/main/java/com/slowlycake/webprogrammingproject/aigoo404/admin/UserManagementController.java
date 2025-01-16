package com.slowlycake.webprogrammingproject.aigoo404.admin;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.jdbi.v3.core.Jdbi;

import java.io.*;
import java.util.*;

@WebServlet("/user-management")
public class UserManagementController extends HttpServlet {
    private UserService userService;

    @Override
    public void init() throws ServletException {
        Jdbi jdbi = Jdbi.create("jdbc:mariadb://localhost:3306/cakeshopdb", "root", "aigoo404");
        UserDAO userDAO = new UserDAO(jdbi);
        userService = new UserService(userDAO);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = userService.getAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("userManagement.jsp").forward(request, response);
    }
}