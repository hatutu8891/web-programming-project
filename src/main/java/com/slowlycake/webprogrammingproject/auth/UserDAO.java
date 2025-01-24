package com.slowlycake.webprogrammingproject.auth;

public class UserDAO {

    // Tìm người dùng bằng handle (username)
    public User findUserName(String username) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT id, handle, name, email, password, phoneNum, address, role FROM users WHERE handle = ?")
                        .bind(0, username)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    // Tìm người dùng bằng email
    public User findUserEmail(String email) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT id, handle, name, email, password, phoneNum, address, role FROM users WHERE email = ?")
                        .bind(0, email)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    // Lưu người dùng mới vào cơ sở dữ liệu
    public void saveUser(User user) {
        JDBIConnect.get().withHandle(h ->
                h.createUpdate("INSERT INTO users (handle, name, email, password, phoneNum, address, role) VALUES (?, ?, ?, ?, ?, ?, ?)")
                        .bind(0, user.getHandle())
                        .bind(1, user.getName())
                        .bind(2, user.getEmail())
                        .bind(3, user.getPassword())
                        .bind(4, user.getPhoneNum())
                        .bind(5, user.getAddress())
                        .bind(6, user.getRole())
                        .execute()
        );
    }

    // Cập nhật mật khẩu người dùng
    public void updatePassword(String email, String newPassword) {
        JDBIConnect.get().withHandle(h ->
                h.createUpdate("UPDATE users SET password = ? WHERE email = ?")
                        .bind(0, newPassword)
                        .bind(1, email)
                        .execute()
        );
    }

    // Cập nhật thông tin hồ sơ người dùng
    public boolean updateProfile(String name, String handle, String email, String phoneNum, String address) {
        return JDBIConnect.get().withHandle(h ->
                h.createUpdate("UPDATE users SET name = ?, email = ?, phoneNum = ?, address = ? WHERE handle = ?")
                        .bind(0, name)
                        .bind(1, email)
                        .bind(2, phoneNum)
                        .bind(3, address)
                        .bind(4, handle)
                        .execute() > 0
        );
    }
}
