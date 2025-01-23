package com.slowlycake.webprogrammingproject.aigoo404.admin;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.jdbi.v3.core.Jdbi;

import java.io.*;
import java.util.*;

@WebServlet("/user-management")
public class UserManagementController extends HttpServlet {
    private UserService userService;

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