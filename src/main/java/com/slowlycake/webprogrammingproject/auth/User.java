package com.slowlycake.webprogrammingproject.auth;

public class User {
    private int id; // userID
    private String handle; // user handle name
    private String name; // username
    private String email; // user email
    private String password; // user password
    private String phoneNum; // user phone number
    private String address; // user address
    private int role; // user role (0=normal, 1=admin)

    // Constructor mặc định
    public User() {
    }
    public User(String handle,String email,String password,String name,String phoneNum,String address) {
        this.handle = handle;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
    }
    // Constructor đầy đủ tham số
    public User(int id, String handle, String name, String email, String password, String phoneNum, String address, int role) {
        this.id = id;
        this.handle = handle;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.address = address;
        this.role = role;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", handle='" + handle + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", role=" + role +
                '}';
    }
}
