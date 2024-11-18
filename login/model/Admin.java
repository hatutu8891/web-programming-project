

public class Admin extends User {

    // Constructor
    public Admin(int id, String username, String password) {
        super(id, username, password, "admin"); // Gọi constructor của User và set role = "admin"
    }

    // Bạn có thể thêm các phương thức hoặc thuộc tính khác cho Admin ở đây nếu cần
    @Override
    public String toString() {
        return "Admin [id=" + getId() + ", username=" + getUsername() + ", password=" + getPassword() + ", role=" + getRole() + "]";
    }
}
