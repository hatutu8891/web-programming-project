package com.slowlycake.webprogrammingproject.aigoo404.admin;

import java.sql.*;
import java.util.*;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User login(String handle, String password) {
        User user = userDAO.getUserByHandle(handle);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userDAO.selectAllUsers();
    }
}

