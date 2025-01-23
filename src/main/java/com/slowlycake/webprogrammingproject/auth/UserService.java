package com.slowlycake.webprogrammingproject.auth;

public class UserService {

    private final UserDao userDao;

    public UserService() {
        this.userDao = new UserDao();
    }

    public User findUserByUsername(String username) {
        return userDao.findUserName(username);
    }

    public User findUserByEmail(String email) {
        return userDao.findUserEmail(email);
    }

    public boolean registerUser(User user) {
        if (userDao.findUserName(user.getHandle()) != null || userDao.findUserEmail(user.getEmail()) != null) {
            // Tên đăng nhập hoặc email đã tồn tại
            return false;
        }
        userDao.saveUser(user);
        return true;
    }

    public boolean updatePassword(String email, String newPassword) {
        User user = userDao.findUserEmail(email);
        if (user == null) {
            // Người dùng không tồn tại
            return false;
        }
        userDao.updatePassword(email, newPassword);
        return true;
    }

    public boolean updateProfile(String name,String username, String newEmail, String newPhoneNum, String newAddress) {
        if (userDao.findUserEmail(newEmail) != null) {
            // Email đã được sử dụng
            return false;
        }
        return userDao.updateProfile(name, username, newEmail, newPhoneNum, newAddress);
    }

    public boolean login(String username, String password) {
        User user = userDao.findUserName(username);
        if (user == null) {
            // Tên đăng nhập không tồn tại
            return false;
        }
        return user.getPassword().equals(password);
    }
}
