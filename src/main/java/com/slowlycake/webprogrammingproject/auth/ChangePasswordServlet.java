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
    private UserDao userDao = new UserDao();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("auth");
        System.out.println(user.toString());
        if (user != null) {
            String currentPassword = request.getParameter("currentPassword");
            String newPassword = request.getParameter("newPassword");
            String confirmPassword = request.getParameter("confirmPassword");
            System.out.println(currentPassword);
            System.out.println(newPassword);
            System.out.println(confirmPassword);
            System.out.println(user.getPassword());
            // Kiểm tra mật khẩu hiện tại
            if (!user.getPassword().equals(currentPassword)) {
                request.setAttribute("error", "Mật khẩu hiện tại không chính xác!");
                System.out.println("2");
                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
                return;
            }

            // Kiểm tra xác nhận mật khẩu mới
            if (!newPassword.equals(confirmPassword)) {
                request.setAttribute("error", "Mật khẩu mới không khớp!");
                System.out.println("3");
                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
                return;
            }

            // Cập nhật mật khẩu trong cơ sở dữ liệu
            UserDao userDao = new UserDao();
            userDao.updatePassword(user.getEmail(), newPassword);

            // Cập nhật mật khẩu trong session
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
