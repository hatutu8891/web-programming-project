package com.slowlycake.webprogrammingproject.aigoo404;

import com.slowlycake.webprogrammingproject.auth.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.*;

@WebServlet("/userManagementServlet")
public class userManagementServlet extends HttpServlet {
    private UserDAO userDAO = new UserDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = userDAO.getAllUsers();

        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(users));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String handle = request.getParameter("handle");
        String email = request.getParameter("email");
        String phoneNum = request.getParameter("phoneNum");
        String address = request.getParameter("address");
        int role = Integer.parseInt(request.getParameter("role"));

        boolean success = userDAO.updateUser(id, name, handle, email, phoneNum, address, role);

        response.getWriter().write(success ? "Cập nhật thành công!" : "Cập nhật thất bại!");
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        boolean success = userDAO.deleteUser(id);

        response.getWriter().write(success ? "Xóa người dùng thành công!" : "Không thể xóa người dùng này!");
    }
}