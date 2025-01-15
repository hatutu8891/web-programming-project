package com.slowlycake.webprogrammingproject.products;

public class Product {
    private int id;
    private String name;
    private String cakecode;
    private String size;
    private double price;
    private int quantityOrdered;
    private String description;
    private String img;
    private String category;
    private int favor;
public Product() {}
    public Product(int id, String name, String cakecode, String size, double price, int quantityOrdered,
                   String description, String img, String category, int favor) {
        this.id = id;
        this.name = name;
        this.cakecode = cakecode;
        this.size = size;
        this.price = price;
        this.quantityOrdered = quantityOrdered;
        this.description = description;
        this.img = img;
        this.category = category;
        this.favor = favor;
    }

    // Getters và Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCakecode() { return cakecode; }
    public String getSize() { return size; }
    public double getPrice() { return price; }
    public int getQuantityOrdered() { return quantityOrdered; }
    public String getDescription() { return description; }
    public String getImg() { return img; }
    public String getCategory() { return category; }
    public int getFavor() { return favor; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCakecode(String cakecode) { this.cakecode = cakecode; }
    public void setSize(String size) { this.size = size; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantityOrdered(int quantityOrdered) { this.quantityOrdered = quantityOrdered; }
    public void setDescription(String description) { this.description = description; }
    public void setImg(String img) { this.img = img; }
    public void setCategory(String category) { this.category = category; }
    public void setFavor(int favor) { this.favor = favor; }
}
