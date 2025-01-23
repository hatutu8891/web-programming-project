package com.slowlycake.webprogrammingproject.aigoo404.admin;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;

import java.util.*;

public class UserDAO {

    public User getUserByHandle(String handle) {
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
                user.setHandle(rs.getString("handle"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhoneNum(rs.getString("phoneNum"));
                user.setAddress(rs.getString("address"));
                return user;
            }).list();
        });
    }
}