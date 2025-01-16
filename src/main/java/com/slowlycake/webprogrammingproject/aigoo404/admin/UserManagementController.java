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
    public void init() {
        Jdbi jdbi = Jdbi.create("jdbc:mariadb://localhost:3306/cakeshopdb", "root", "aigoo404");
        UserDAO userDAO = new UserDAO(jdbi);
        userService = new UserService(userDAO);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> listUsers = userService.getAllUsers();

        for (User user : listUsers) {
            System.out.println(user.getUID() + " - " + user.getUHandle());
        }

        request.setAttribute("listUsers", listUsers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("userManagement.jsp");
        dispatcher.forward(request, response);
    }
}