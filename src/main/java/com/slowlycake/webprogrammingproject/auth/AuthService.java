package com.slowlycake.webprogrammingproject.auth;

public class AuthService {
    public User checkLogin(String uname, String pass) {
        UserService userService=new UserService();
        User u=userService.findUserByUsername(uname);
        if(u!=null &&pass!=null &&pass.equals(u.getUPassword())) {
            return u;
        }
        return null;
    }
}
