package com.slowlycake.webprogrammingproject.auth;

public class AuthService {
    public User checkLogin(String name, String pass) {
        UserService userService=new UserService();
        User u=userService.findUserByUsername(name);
        if(u!=null &&pass!=null &&pass.equals(u.getPassword())) {
            return u;
        }
        return null;
    }
}
