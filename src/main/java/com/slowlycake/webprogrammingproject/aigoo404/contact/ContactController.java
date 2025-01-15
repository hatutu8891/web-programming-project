package com.slowlycake.webprogrammingproject.aigoo404.contact;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.jdbi.v3.core.Jdbi;

import java.io.*;

@WebServlet("/contact")
public class ContactController extends HttpServlet {
    private ContactService contactService;

    public void init() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Jdbi jdbi = Jdbi.create("jdbc:mariadb://localhost:3306/cakeshopdb", "root", "aigoo404");
        contactService = new ContactService(jdbi);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        Contact contact = new Contact(name, email, subject, message);
        contactService.saveContact(contact);

        // Setting response type to JSON for better front-end handling
        response.setContentType("application/json");
        response.getWriter().write("{\"status\": \"success\", \"message\": \"Message sent\"}");
    }
}
