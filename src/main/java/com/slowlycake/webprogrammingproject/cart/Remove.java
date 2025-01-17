//package com.slowlycake.webprogrammingproject.controller.cart;
//
//import com.slowlycake.webprogrammingproject.dao.cart.Cart;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//import java.io.IOException;
//
//@WebServlet(name = "RemoveCart", value = "/del-cart")
//public class Remove extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int pid = -1;
//        try {
//            pid = Integer.parseInt(request.getParameter("pid"));
//        } catch (NumberFormatException e) {
//            response.sendRedirect("ShowCart");
//        }
//        HttpSession session = request.getSession(true);
//        Cart cart = (Cart) session.getAttribute("cart");
//        if (cart == null) cart = new Cart();
//        cart.remove(pid);
//        session.setAttribute("cart", cart);
//        response.sendRedirect("ShowCart");
//    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    }
//
//}
