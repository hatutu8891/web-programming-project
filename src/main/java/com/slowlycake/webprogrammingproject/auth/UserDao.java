package com.slowlycake.webprogrammingproject.auth;

public class UserDao {


    public User findUserName(String username) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT uID, uHandle, uEmail, uPassword, uName, uRole AS role , uPhoneNum, uAddress FROM users WHERE uHandle = ?")
                        .bind(0, username)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    public User findUserEmail(String email) {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("SELECT  uID, uHandle, uEmail, uPassword, uName, uRole AS role , uPhoneNum, uAddress FROM users WHERE uEmail = ?")
                        .bind(0, email)
                        .mapToBean(User.class)
                        .findFirst()
                        .orElse(null)
        );
    }

    // Lưu người dùng vào cơ sở dữ liệu
    public void saveUser(User user) {
        JDBIConnect.get().withHandle(h ->
                h.createUpdate("INSERT INTO users (uHandle, uEmail, uRole, uPassword,uName) VALUES (? , ? , ? , ?, ?)")
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

    public boolean updateProfile(String uName,String username, String newEmail, String newPhoneNum, String newAddress) {
        return JDBIConnect.get().withHandle(h ->
                h.createUpdate("UPDATE users SET uName=?, uEmail = ?, uPhoneNum = ?, uAddress = ? WHERE uHandle = ?")
                        .bind(0, uName)
                        .bind(1, newEmail)
                        .bind(2, newPhoneNum)
                        .bind(3, newAddress)
                        .bind(4, username)
                        .execute() > 0
        );
    }
}
