package com.slowlycake.webprogrammingproject.aigoo404.subcribeForm;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.jdbi.v3.core.Jdbi;

import java.io.*;

@WebServlet("/subscribe")
public class SubscriptionController extends HttpServlet {
    private SubscriptionService subscriptionService;

    @Override
    public void init() throws ServletException {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Jdbi jdbi = Jdbi.create("jdbc:mariadb://localhost:3306/cakeshopdb",
                    "root",
                    "aigoo404");

            // Initialize DAO and Service
            SubscriptionDAO subscriptionDAO = new SubscriptionDAO(jdbi);
            subscriptionService = new SubscriptionService(subscriptionDAO);
        } catch (Exception e) {
            throw new ServletException("Khởi tạo thất bại", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String sEmail = request.getParameter("sEmail");

        if (sEmail != null && !sEmail.isEmpty()) {
            boolean success = subscriptionService.subscribe(sEmail);

            if (success) {
                response.setContentType("text/plain");
                response.getWriter().write("Đăng ký thành công");
            } else {
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                response.getWriter().write("Đăng ký thất bại. Vui lòng thử lại sau");
            }
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Mail không hợp lệ");
        }
    }
}