package com.slowlycake.webprogrammingproject.auth;
import java.io.Serializable;

public class User implements Serializable {
    private int uID;
    private String uHandle;
    private String uName;
    private String uEmail;
    private String uPhoneNum;
    private String uAddress;
    private String uPassword;
    private int role;
    public User(){}
    public User(String uHandle, String uEmail, String uPassword,String uName){
        this.uHandle = uHandle;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
        this.uName = uName;
    }
    public int getUID() {
        return uID;
    }

    public void setUID(int id) {
        this.uID = id;
    }

    public String getUHandle() {
        return uHandle;
    }

    public void setUHandle(String uHandle) {
        this.uHandle = uHandle;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getUPhoneNum() {
        return uPhoneNum;
    }

    public void setUPhoneNum(String uPhoneNum) {
        this.uPhoneNum = uPhoneNum;
    }

    public String getUAddress() {
        return uAddress;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setUAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getUPassword() {
        return uPassword;
    }

    public void setUPassword(String uPassword) {
        this.uPassword = uPassword;
    }
    @Override
    public String toString() {
        return "User{" +
                "uID=" + uID +
                ", uHandle='" + uHandle + '\'' +
                ", uName='" + uName + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uPhoneNum='" + uPhoneNum + '\'' +
                ", uAddress='" + uAddress + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", role=" + role +
                '}';
    }

}

