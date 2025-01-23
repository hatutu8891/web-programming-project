package com.slowlycake.webprogrammingproject.auth;

public class UserDao {


    public User findUserName(String username) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT id, handle, email, password, name, role AS role , phoneNum, address FROM users WHERE handle = ?")
                        .bind(0, username)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    public User findUserEmail(String email) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT id, handle, email, password, name, role AS role , phoneNum, address FROM users WHERE email = ?")
                        .bind(0, email)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    // Lưu người dùng vào cơ sở dữ liệu
    public void saveUser(User user) {
        JDBIConnect.get().withHandle(h ->
                h.createUpdate("INSERT INTO users (handle, email, role, password,name) VALUES (? , ? , ? , ?, ?)")
                        .bind(0, user.getHandle())
                        .bind(1, user.getEmail())
                        .bind(2, user.getRole())
                        .bind(3, user.getPassword())
                        .bind(4, user.getName())
                        .execute()
        );
    }

    public void updatePassword(String email, String newPassword) {
        JDBIConnect.get().withHandle(h ->
                h.createUpdate("UPDATE users SET password = ? WHERE email = ?")
                        .bind(0, newPassword)
                        .bind(1, email)
                        .execute()
        );
    }

    public boolean updateProfile(String name,String username, String newEmail, String newPhoneNum, String newAddress) {
        return JDBIConnect.get().withHandle(h ->
                h.createUpdate("UPDATE users SET name=?, email = ?, phoneNum = ?, address = ? WHERE handle = ?")
                        .bind(0, name)
                        .bind(1, newEmail)
                        .bind(2, newPhoneNum)
                        .bind(3, newAddress)
                        .bind(4, username)
                        .execute() > 0
        );
    }
}
