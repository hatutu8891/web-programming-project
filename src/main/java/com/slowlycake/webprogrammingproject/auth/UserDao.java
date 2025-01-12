package com.slowlycake.webprogrammingproject.auth;

import jakarta.el.BeanELResolver;
import com.slowlycake.webprogrammingproject.auth.User;

public class UserDao {


    public User findUserName(String username) {
        return JDBIConnect.get().withHandle(h -> h.createQuery("select * from users where username= :username").bind("username",username).mapToBean(User.class).findFirst().orElse(null));
    }

}
