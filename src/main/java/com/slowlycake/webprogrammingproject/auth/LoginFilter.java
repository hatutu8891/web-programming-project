package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebFilter({"/adminDashboard.jsp", "/contactManagement.jsp", "/mailSubManagement.jsp",
        "/orderManagement.jsp", "/userManagement.jsp", "/productManagement.jsp",
        "/reviewManagement.jsp"})
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        HttpSession session = req.getSession(false);
        User authUser = (session != null) ? (User) session.getAttribute("auth") : null;

        if (authUser == null) {
            session = req.getSession(true); // Ensure session exists
            session.setAttribute("error", "Vui lòng đăng nhập trước!");
            resp.sendRedirect(req.getContextPath() + "/login.jsp");
            return;
        }

        if (authUser.getRole() == 1) {
            chain.doFilter(request, response);
            return;
        }

        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }

    @Override
    public void destroy() {
    }
}