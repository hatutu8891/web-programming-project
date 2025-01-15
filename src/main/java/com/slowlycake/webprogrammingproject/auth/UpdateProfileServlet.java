package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/updateProfile")
public class UpdateProfileServlet extends HttpServlet {
    private UserDao userDao = new UserDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("auth");

        if (user != null) {
            String newEmail = request.getParameter("email");

            if (newEmail == null || !newEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                request.setAttribute("error", "Email không hợp lệ!");
                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
                return;
            }

            boolean isUpdated = userDao.updateEmail(user.getUsername(), newEmail);

            if (isUpdated) {
                // Cập nhật email trong session
                user.setEmail(newEmail);
                session.setAttribute("auth", user);

                request.setAttribute("message", "Cập nhật email thành công!");
            } else {
                request.setAttribute("error", "Cập nhật email thất bại! Vui lòng thử lại.");
            }

            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
