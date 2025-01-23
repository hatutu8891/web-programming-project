package com.slowlycake.webprogrammingproject.aigoo404.admin;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;

import java.util.*;

public class UserDAO {

    public User getUserByUHandle(String uHandle) {
        return JDBIConnect.get().withHandle(handle -> {
            Query query = handle.createQuery("select * from users where uHandle = :uHandle");
            query.bind("uHandle", uHandle);
            return query.mapToBean(User.class).findOne().orElse(null);
        });
    }

    public List<User> selectAllUsers() {
        return JDBIConnect.get().withHandle(handle -> {
            Query query = handle.createQuery("select uID, uHandle, uName, uEmail, uPhoneNum, uAddress from users");
            return query.map((rs, ctx) -> {
                User user = new User();
                user.setUID(rs.getInt("uID"));
                user.setUHandle(rs.getString("uHandle"));
                user.setUName(rs.getString("uName"));
                user.setUEmail(rs.getString("uEmail"));
                user.setUPhoneNum(rs.getString("uPhoneNum"));
                user.setUAddress(rs.getString("uAddress"));
                return user;
            }).list();
        });
    }
}