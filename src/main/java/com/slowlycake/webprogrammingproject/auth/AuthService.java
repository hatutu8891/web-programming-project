package com.slowlycake.webprogrammingproject.auth;

public class AuthService {
    public User checkLogin(String uname, String pass) {
        UserService userService=new UserService();
        User u=userService.findUserByUsername(uname);
        System.out.println(u);
        if(u!=null &&pass!=null &&pass.equals(u.getPassword())) {
            return u;
        }
        return null;
    }
}
