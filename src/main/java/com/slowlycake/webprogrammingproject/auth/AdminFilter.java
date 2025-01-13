package com.slowlycake.webprogrammingproject.auth;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(filterName="AdminFilter",urlPatterns="/admin/*")
public class AdminFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {}
    public void destroy() {}

    @Override
    public void doFilter(ServletRequest re, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) re;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession();
        User u=(User)session.getAttribute("auth");
        if((u == null) || (u.getRole() < 1)){
            response.sendRedirect("../login.jsp");
            return;
        }
        filterChain.doFilter(re, res);
    }
}
