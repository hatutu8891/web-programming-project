package com.slowlycake.webprogrammingproject.auth;


public class UserService {

    private final UserDao userDao;

    // Constructor khởi tạo UserDao
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    // Tìm người dùng theo tên người dùng (uHandle)
    public User findUserByUsername(String username) {
        return userDao.findUserName(username);
    }

    // Tìm người dùng theo email
    public User findUserByEmail(String email) {
        return userDao.findUserEmail(email);
    }

    // Lưu người dùng mới vào cơ sở dữ liệu
    public void registerUser(User user) {
        // Kiểm tra trước khi lưu người dùng
        if (userDao.findUserName(user.getUHandle()) != null) {
            throw new IllegalArgumentException("Username already exists!");
        }
        if (userDao.findUserEmail(user.getUEmail()) != null) {
            throw new IllegalArgumentException("Email already exists!");
        }
        userDao.saveUser(user);
    }

    // Cập nhật mật khẩu người dùng
    public void changePassword(String email, String newPassword) {
        if (userDao.findUserEmail(email) == null) {
            throw new IllegalArgumentException("User not found!");
        }
        userDao.updatePassword(email, newPassword);
    }

    // Cập nhật email người dùng
    public boolean changeEmail(String username, String newEmail) {
        if (userDao.findUserName(username) == null) {
            throw new IllegalArgumentException("User not found!");
        }
        return userDao.updateEmail(username, newEmail);
    }
}
