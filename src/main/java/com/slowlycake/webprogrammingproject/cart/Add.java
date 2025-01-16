package com.slowlycake.webprogrammingproject.controller.cart;

import com.slowlycake.webprogrammingproject.dao.cart.Cart;
import com.slowlycake.webprogrammingproject.dao.model.Product;
import com.slowlycake.webprogrammingproject.service.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="AddCart",value = "/add-cart")
public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductService ps = new ProductService();
        Product pid = ps.getDetail(request.getParameter("pid"));
        if(pid == null) {
            response.sendRedirect("list-product?add-cart=false");
        }

        HttpSession session = request.getSession(true);
        Cart c = (Cart) session.getAttribute("cart");
        if(c == null) c=new Cart();
        c.add(pid);
        session.setAttribute("cart", c);
        response.sendRedirect("list-product?add-cart=ok");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
