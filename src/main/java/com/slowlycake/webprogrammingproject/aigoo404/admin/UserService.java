package com.slowlycake.webprogrammingproject.aigoo404.admin;

import java.sql.*;
import java.util.*;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User login(String uHandle, String password) {
        User user = userDAO.getUserByUHandle(uHandle);
        if (user != null && user.getUPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}

