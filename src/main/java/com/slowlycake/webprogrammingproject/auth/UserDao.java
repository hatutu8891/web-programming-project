package com.slowlycake.webprogrammingproject.auth;

public class UserDao {

    // Tìm kiếm người dùng theo tên đăng nhập
    public User findUserName(String username) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT * FROM users WHERE username = ?")
                        .bind(0, username)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    // Tìm kiếm người dùng theo email
    public User findUserEmail(String email) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT * FROM users WHERE email = ?")
                        .bind(0, email)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    // Lưu người dùng vào cơ sở dữ liệu
    public void saveUser(User user) {
        JDBIConnect.get().withHandle(h ->
                h.createUpdate("INSERT INTO users (username, email, role, password) VALUES (?, ?, ?, ?)")
                        .bind(0, user.getUsername())
                        .bind(1, user.getEmail())
                        .bind(2, user.getRole())
                        .bind(3, user.getPassword())
                        .execute()
        );
    }
}
