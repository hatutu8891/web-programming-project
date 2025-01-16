package com.slowlycake.webprogrammingproject.aigoo404.admin;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;

import java.util.*;

public class UserDAO {
    private Jdbi jdbi;

    public UserDAO(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public User getUserByUHandle(String uHandle) {
        return jdbi.withHandle(handle -> {
            Query query = handle.createQuery("select * from users where uHandle = :uHandle");
            query.bind("uHandle", uHandle);
            return query.mapToBean(User.class).findOne().orElse(null);
        });
    }

    public List<User> getAllUsers() {
        return jdbi.withHandle(handle -> {
            Query query = handle.createQuery("select uID, uHandle, uName, uEmail, uPhoneNum, uAddress from users");
            return query.mapToBean(User.class).list();
        });
    }
}