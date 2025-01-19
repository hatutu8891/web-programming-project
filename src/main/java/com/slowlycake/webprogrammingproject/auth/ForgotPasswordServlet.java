package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Properties;
import jakarta.mail.Session;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.Message;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.Transport;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;

@WebServlet(name = "ForgotPasswordServlet", value = "/forgotPassword")
public class ForgotPasswordServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");

        // Kiểm tra email có tồn tại không
        UserService userService = new UserService();
        User user = userService.findUserByEmail(email);

        if (user == null) {
            req.setAttribute("error", "Email không tồn tại.");
            req.getRequestDispatcher("forgotPassword.jsp").forward(req, resp);
            return;
        }

        // Gửi email với liên kết để reset mật khẩu
        String resetLink = "http://localhost:8080/project/resetPassword?email=" + email;
        String subject = "Yêu cầu đặt lại mật khẩu";
        String message = "Vui lòng click vào liên kết sau để đặt lại mật khẩu của bạn: " + resetLink;

        try {
            sendEmail(email, subject, message);
            req.setAttribute("success", "Đã gửi email hướng dẫn đặt lại mật khẩu.");
        } catch (Exception e) {
            req.setAttribute("error", "Đã xảy ra lỗi khi gửi email. Vui lòng thử lại.");
            e.printStackTrace();
        }

        req.getRequestDispatcher("forgotPassword.jsp").forward(req, resp);
    }

    private void sendEmail(String to, String subject, String message) throws MessagingException {
        String from = "haiht1004@gmail.com";
        String host = "smtp.gmail.com";
        final String username = "haiht1004@gmail.com";
        final String password = "zdxm qybk vgss oqed";

        // Cấu hình các thuộc tính cho gửi email qua SMTP
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Tạo một phiên làm việc với thông tin xác thực
        Session session = Session.getInstance(properties, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // Tạo một đối tượng MimeMessage
        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress(from));
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(message);

        // Gửi email
        Transport.send(mimeMessage);
        System.out.println("Email đã được gửi thành công!"+to);
    }

}
