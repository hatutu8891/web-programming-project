package com.slowlycake.webprogrammingproject.auth;

public class AuthService {
    public User checkLogin(String uname, String pass) {
        UserDao udao=new UserDao();
        User u=udao.findUserName(uname);
        if(u!=null &&pass!=null &&pass.equals(u.getPassword())) {
            u.setPassword(null);
            return u;
        }
        return null;
    }
}
