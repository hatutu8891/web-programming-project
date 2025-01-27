package com.slowlycake.webprogrammingproject.auth;

public class AuthService {
    public User checkLogin(String name, String pass) {
        UserDao udao=new UserDao();
        User u=udao.findUserName(name);
        if(u!=null &&pass!=null &&pass.equals(u.getPassword())) {
            return u;
        }
        return null;
    }
}
