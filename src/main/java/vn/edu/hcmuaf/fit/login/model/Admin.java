package vn.edu.hcmuaf.fit.login.model;

// Admin kế thừa từ lớp User
public class Admin extends User {
    private String role = "admin";  // Vai trò cố định là admin


    public Admin() {
    }

    public Admin(String username, String password, String email) {
        super(username, password, "admin", email);
    }


    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "role='" + role + '\'' +
                ", username='" + getUsername() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
