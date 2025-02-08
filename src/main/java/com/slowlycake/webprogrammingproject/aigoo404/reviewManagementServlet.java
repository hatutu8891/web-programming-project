package com.slowlycake.webprogrammingproject.aigoo404;

import com.slowlycake.webprogrammingproject.reviews.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.*;

@WebServlet("/reviewManagementServlet")
public class reviewManagementServlet extends HttpServlet {
    private ReviewDao reviewDAO = new ReviewDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Review> reviews = reviewDAO.getAllReviews();

        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(reviews));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}
