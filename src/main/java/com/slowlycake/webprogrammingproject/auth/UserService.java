package com.slowlycake.webprogrammingproject.auth;

public class UserService {

    private final UserDAO userDao;

    public UserService() {
        this.userDao = new UserDAO();
    }

    // Tìm người dùng bằng tên đăng nhập
    public User findUserByUsername(String username) {
        return userDao.findUserName(username);
    }

    // Tìm người dùng bằng email
    public User findUserByEmail(String email) {
        return userDao.findUserEmail(email);
    }

    // Đăng ký người dùng mới
    public boolean registerUser(User user) {
        if (userDao.findUserName(user.getHandle()) != null || userDao.findUserEmail(user.getEmail()) != null) {
            return false;
        }
        userDao.saveUser(user);
        return true;
    }

    // Cập nhật mật khẩu
    public boolean updatePassword(String email, String newPassword) {
        User user = userDao.findUserEmail(email);
        if (user == null) {
            // Người dùng không tồn tại
            return false;
        }
        userDao.updatePassword(email, newPassword);
        return true;
    }

    // Cập nhật thông tin cá nhân
    public boolean updateProfile(String name, String username, String newEmail, String newPhoneNum, String newAddress) {
        User existingUserByEmail = userDao.findUserEmail(newEmail);
        if (existingUserByEmail != null && !existingUserByEmail.getHandle().equals(username)) {
            // Email đã được sử dụng bởi người dùng khác
            return false;
        }
        return userDao.updateProfile(name, username, newEmail, newPhoneNum, newAddress);
    }
    public String getHandleByUserId(int userId) {
        return userDao.getHandleByUserId(userId);
    }
}
