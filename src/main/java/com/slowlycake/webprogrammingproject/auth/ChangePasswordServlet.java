package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/changePassword")
public class ChangePasswordServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("auth");
        System.out.println(user.toString());
        if (user != null) {
            String currentPassword = request.getParameter("currentPassword");
            String newPassword = request.getParameter("newPassword");
            String confirmPassword = request.getParameter("confirmPassword");

            if (!user.getPassword().equals(currentPassword)) {
                request.setAttribute("error", "Mật khẩu hiện tại không chính xác!");

                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
                return;
            }

            if (!newPassword.equals(confirmPassword)) {
                request.setAttribute("error", "Mật khẩu mới không khớp!");
                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
                return;
            }

            UserService userDao = new UserService();
            userDao.updatePassword(user.getEmail(), newPassword);

            user.setPassword(newPassword);
            session.setAttribute("auth", user);

            request.setAttribute("message", "Đổi mật khẩu thành công!");
            System.out.println("thanh cong");
            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
