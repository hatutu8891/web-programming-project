package com.slowlycake.webprogrammingproject.aigoo404;

import com.google.gson.Gson;
import com.slowlycake.webprogrammingproject.products.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.sql.Date;

@WebServlet("/productManagementServlet")
public class productManagementServlet extends HttpServlet {
    private ProductDAO productDAO = new ProductDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productDAO.getAllProducts();

        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(products));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Add a new product
        String name = request.getParameter("name");
        String cakeCode = request.getParameter("cakeCode");
        String desc = request.getParameter("desc");
        String img = request.getParameter("img");
        String category = request.getParameter("category");
        String launchDate = request.getParameter("launchDate");

        // Get selected flavors and variants
        String[] flavorIdsStr = request.getParameterValues("flavors");
        String[] sizes = request.getParameterValues("size[]");
        String[] prices = request.getParameterValues("price[]");

        List<Integer> flavorIds = new ArrayList<>();
        List<Variant> variants = new ArrayList<>();

        if (flavorIdsStr != null) {
            for (String id : flavorIdsStr) {
                flavorIds.add(Integer.parseInt(id));
            }
        }

        if (sizes != null && prices != null) {
            for (int i = 0; i < sizes.length; i++) {
                variants.add(new Variant(0, Integer.parseInt(sizes[i]), new BigDecimal(prices[i])));
            }
        }

        Product product = new Product(0, name, cakeCode, 0, desc, BigDecimal.ZERO, img, category, Date.valueOf(launchDate));
        int productId = productDAO.addProduct(product, flavorIds, variants);

        response.setContentType("application/json");
        response.getWriter().write("{\"success\": " + (productId != -1) + "}");
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Edit an existing product
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String cakeCode = request.getParameter("cakeCode");
        String desc = request.getParameter("desc");
        String img = request.getParameter("img");
        String category = request.getParameter("category");
        String launchDate = request.getParameter("launchDate");

        // Get flavors and variants
        String[] flavorIdsStr = request.getParameterValues("flavors");
        String[] sizes = request.getParameterValues("size[]");
        String[] prices = request.getParameterValues("price[]");

        List<Integer> flavorIds = new ArrayList<>();
        List<Variant> variants = new ArrayList<>();

        if (flavorIdsStr != null) {
            for (String fid : flavorIdsStr) {
                flavorIds.add(Integer.parseInt(fid));
            }
        }

        if (sizes != null && prices != null) {
            for (int i = 0; i < sizes.length; i++) {
                variants.add(new Variant(0, Integer.parseInt(sizes[i]), new BigDecimal(prices[i])));
            }
        }

        Product product = new Product(id, name, cakeCode, 0, desc, BigDecimal.ZERO, img, category, Date.valueOf(launchDate));
        boolean success = productDAO.editProduct(product, flavorIds, variants);

        response.setContentType("application/json");
        response.getWriter().write("{\"success\": " + success + "}");
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean success = productDAO.deleteProduct(id);

        response.setContentType("application/json");
        response.getWriter().write("{\"success\": " + success + "}");
    }
}
