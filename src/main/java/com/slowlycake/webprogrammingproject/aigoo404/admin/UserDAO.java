package com.slowlycake.webprogrammingproject.aigoo404.admin;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;

import java.util.*;

public class UserDAO {

    public User getUserByUHandle(String handle) {
        return JDBIConnect.get().withHandle(h -> {
            Query query = h.createQuery("select * from users where handle = :handle");
            query.bind("handle", handle);
            return query.mapToBean(User.class).findOne().orElse(null);
        });
    }

    public List<User> selectAllUsers() {
        return JDBIConnect.get().withHandle(h -> {
            Query query = h.createQuery("select id, handle, name, email, phoneNum, address from users");
            return query.map((rs, ctx) -> {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setHandle(rs.getString("Handle"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPhoneNum(rs.getString("PhoneNum"));
                user.setAddress(rs.getString("Address"));
                return user;
            }).list();
        });
    }
}