package com.slowlycake.webprogrammingproject.aigoo404;

import com.google.gson.Gson;
import com.slowlycake.webprogrammingproject.aigoo404.ingredient.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/storageManagementServlet")
public class storageManagementServlet extends HttpServlet {
    private IngredientDAO ingredientDAO = new IngredientDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Ingredient> ingredients = ingredientDAO.getAllIngredients();

        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(ingredients));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            String name = request.getParameter("name");
            int stockQuantity = Integer.parseInt(request.getParameter("stockQuantity"));
            int reqQuantity = Integer.parseInt(request.getParameter("reqQuantity"));

            ingredientDAO.addIngredient(name, stockQuantity, reqQuantity);
            response.getWriter().write("{\"message\": \"Ingredient added successfully\"}");
        }

        else if ("edit".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            int stockQuantity = Integer.parseInt(request.getParameter("stockQuantity"));
            int reqQuantity = Integer.parseInt(request.getParameter("reqQuantity"));

            ingredientDAO.updateIngredient(id, stockQuantity, reqQuantity);
            response.getWriter().write("{\"message\": \"Ingredient updated successfully\"}");
        }

        else if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            ingredientDAO.deleteIngredient(id);
            response.getWriter().write("{\"message\": \"Ingredient deleted successfully\"}");
        }
    }
}