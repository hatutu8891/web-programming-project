package com.slowlycake.webprogrammingproject.dao.cart;

import java.io.Serializable;

public class CartProduct implements Serializable {
    private int id;
    private String title;
    private double price;
    private String img;
    private int quantity;

    public CartProduct() {
    }

    public CartProduct(int id, String title, double price, String img) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  id +
                "," + title  +
                "," + price +
                "," + img ;
    }
}

