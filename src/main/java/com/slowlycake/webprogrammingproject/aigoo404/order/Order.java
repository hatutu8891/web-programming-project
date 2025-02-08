package com.slowlycake.webprogrammingproject.aigoo404.order;

import java.sql.Date;

public class Order {
    int id;
    int uID;
    Date date;
    double price;
    int status;
    String username;

    public Order() {
    }

    public Order(int id, int uID, Date date, double price, int status, String username) {
        this.id = id;
        this.uID = uID;
        this.date = date;
        this.price = price;
        this.status = status;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
