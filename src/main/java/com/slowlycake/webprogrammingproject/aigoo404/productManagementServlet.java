package com.slowlycake.webprogrammingproject.aigoo404;

import com.google.gson.Gson;
import com.slowlycake.webprogrammingproject.products.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/productManagementServlet")
public class productManagementServlet extends HttpServlet {
    private ProductDAO productDAO = new ProductDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productDAO.getAllProducts();

        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(products));
    }
}
