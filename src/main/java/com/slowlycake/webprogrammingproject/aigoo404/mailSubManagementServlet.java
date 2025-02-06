package com.slowlycake.webprogrammingproject.aigoo404;

import com.google.gson.Gson;
import com.slowlycake.webprogrammingproject.aigoo404.mailSub.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet("/mailSubManagementServlet")
public class mailSubManagementServlet extends HttpServlet {
    private mailSubDAO mailSubDAO = new mailSubDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<mailSub> mailSubs = mailSubDAO.getAllMailSubs();

        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(mailSubs));
    }
}
