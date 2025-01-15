package com.slowlycake.webprogrammingproject.products;

public class Size {
    private int size;  // Tên kích thước (ví dụ: "L", "M", "S")
    private double price; // Giá của kích thước
    private int quantity; // Số lượng của kích thước

    // Constructor
    public Size(int size, double price, int quantity) {
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter và Setter cho quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
