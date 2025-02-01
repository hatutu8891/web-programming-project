package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;

@WebFilter("/adminDashboard.jsp")
public class LoginFilter implements Filter {
    private static final List<String> restrictedPages = Arrays.asList(
            "/adminDashboard.jsp", "/contactManagement.jsp", "mailSubManagement.jsp", "/orderManagement.jsp",
            "/userManagement.jsp", "/productManagement.jsp", "/reviewManagement.jsp"
    );

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        HttpSession session = req.getSession(false);
        Object authUser = (session != null) ? session.getAttribute("auth") : null;

        if (authUser == null) {
            req.setAttribute("error", "Vui lòng đăng nhập trước!");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }
}

