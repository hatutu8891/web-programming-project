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
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String pass = req.getParameter("password");
        AuthService service = new AuthService();
        User user = service.checkLogin(name,pass);
        if(user != null) {
            HttpSession session=req.getSession();
            session.setAttribute("auth", user);
            session.setAttribute("handle", user.getHandle());
            if (user.getRole() == 1) {
                req.setAttribute("success", "Xin chào " + user.getHandle());
                resp.sendRedirect(req.getContextPath() + "/adminDashboard.jsp"); // Chuyển đến trang Admin
            } else {
                req.setAttribute("success", "Đăng nhập thành công");
                resp.sendRedirect(req.getContextPath() + "/index.jsp"); // Chuyển đến trang chủ
            }
        }
        else {
            req.setAttribute("error","Sai username hoặc mật khẩu!");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
