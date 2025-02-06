package com.slowlycake.webprogrammingproject.aigoo404;

import com.google.gson.Gson;
import com.slowlycake.webprogrammingproject.aigoo404.contact.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/contactManagementServlet")
public class contactManagementServlet extends HttpServlet {
    private ContactDAO contactDao = new ContactDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Contact> reviews = contactDao.getAllContactInfos();

        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(reviews));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}
