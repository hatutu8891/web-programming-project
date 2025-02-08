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
    private final UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("auth");
        if (user != null) {
            String newName = request.getParameter("name");
            String newEmail = request.getParameter("email");
            String newPhoneNum = request.getParameter("phone");
            String newAddress = request.getParameter("address");

            if (newName == null || newName.trim().isEmpty()) {
                request.setAttribute("error", "Tên người dùng không được để trống!");
                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
                return;
            }

            if (newEmail == null || !newEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                request.setAttribute("error", "Email không hợp lệ!");
                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
                return;
            }

            if (newPhoneNum == null || !newPhoneNum.matches("^\\d{10,15}$")) {
                request.setAttribute("error", "Số điện thoại không hợp lệ!");
                request.getRequestDispatcher("userInfo.jsp").forward(request, response);
                return;
            }

            boolean isUpdated = userService.updateProfile(newName,user.getHandle(), newEmail, newPhoneNum, newAddress);

            if (isUpdated) {
                user.setName(newName);
                user.setEmail(newEmail);
                user.setPhoneNum(newPhoneNum);
                user.setAddress(newAddress);
                session.setAttribute("auth", user);

                request.setAttribute("message", "Cập nhật thông tin cá nhân thành công!");
            } else {
                request.setAttribute("error", "Cập nhật thông tin cá nhân thất bại! Vui lòng thử lại.");
            }

            request.getRequestDispatcher("userInfo.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
