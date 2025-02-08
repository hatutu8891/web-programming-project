package com.slowlycake.webprogrammingproject.products;

public class ProductInList {
    private String name;
    private String price;//Xuất ra chuỗi giá giao động của bánh từ size lớn nhất đến size nhỏ nhất
    private int quanlityOrderer;
    private int rating;

    public ProductInList(String name, String price, int quanlityOrderer, int rating) {
        this.name = name;
        this.price = price;
        this.quanlityOrderer = quanlityOrderer;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuanlityOrderer() {
        return quanlityOrderer;
    }

    public void setQuanlityOrderer(int quanlityOrderer) {
        this.quanlityOrderer = quanlityOrderer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
