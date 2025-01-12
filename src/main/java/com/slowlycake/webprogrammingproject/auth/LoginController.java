package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LoginController", value="/login")
public class LoginController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        AuthService service = new AuthService();
        User user = service.checkLogin(uname,pass);
        if(user != null && user.getPassword().equals(pass)) {
            HttpSession session=req.getSession();
            session.setAttribute("auth", user);
            resp.sendRedirect("index.jsp");
        }
        else {
            req.setAttribute("error","Dang nhap khong thanh cong");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
