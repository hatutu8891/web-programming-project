package com.slowlycake.webprogrammingproject.auth;

public class UserDao {


    public User findUserName(String username) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT * FROM users WHERE uHandle = ?")
                        .bind(0, username)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    public User findUserEmail(String email) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT * FROM users WHERE uEmail = ?")
                        .bind(0, email)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    // Lưu người dùng vào cơ sở dữ liệu
    public void saveUser(User user) {
        JDBIConnect.get().withHandle(h ->
                h.createUpdate("INSERT INTO users (uHandle, uEmail, uRole, uPassword,uName) VALUES (?,?, ?, ?, ?)")
                        .bind(0, user.getUHandle())
                        .bind(1, user.getUEmail())
                        .bind(2, user.getRole())
                        .bind(3, user.getUPassword())
                        .bind(4, user.getUName())
                        .execute()
        );
    }

    public void updatePassword(String email, String newPassword) {
        JDBIConnect.get().withHandle(h ->
                h.createUpdate("UPDATE users SET uPassword = ? WHERE uEmail = ?")
                        .bind(0, newPassword)
                        .bind(1, email)
                        .execute()
        );
    }

    public boolean updateEmail(String username, String newEmail) {
        return JDBIConnect.get().withHandle(h ->
                h.createUpdate("UPDATE users SET uEmail = ? WHERE uHandle = ?")
                        .bind(0, newEmail)
                        .bind(1, username)
                        .execute() > 0
        );
    }
}
