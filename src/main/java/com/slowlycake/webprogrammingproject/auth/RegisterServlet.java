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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (!password.equals(confirmPassword)) {
            req.setAttribute("error", "Mật khẩu không khớp.");
            req.getRequestDispatcher("signUp.jsp").forward(req, resp);
            return;
        }

        UserDao userDao = new UserDao();
        if (userDao.findUserName(username) != null) {
            req.setAttribute("error", "Tên đăng nhập đã tồn tại.");
            req.getRequestDispatcher("signUp.jsp").forward(req, resp);
            return;
        }
        if (userDao.findUserEmail(email) != null) {
            req.setAttribute("error", "Email đã tồn tại.");
            req.getRequestDispatcher("signUp.jsp").forward(req, resp);
            return;
        }
        User newUser = new User( username, email, password);
        userDao.saveUser(newUser);

        resp.sendRedirect("login.jsp");
    }
}
