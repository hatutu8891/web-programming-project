package com.slowlycake.webprogrammingproject.aigoo404.ingredient;

public class Ingredient {
    int id;
    String name;
    int spId;
    String unit;
    int stockQuantity;
    int reqQuantity;

    public Ingredient() {
    }

    public Ingredient(int id, String name, int spId, String unit, int stockQuantity, int reqQuantity) {
        this.id = id;
        this.name = name;
        this.spId = spId;
        this.unit = unit;
        this.stockQuantity = stockQuantity;
        this.reqQuantity = reqQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpId() {
        return spId;
    }

    public void setSpId(int spId) {
        this.spId = spId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getReqQuantity() {
        return reqQuantity;
    }

    public void setReqQuantity(int reqQuantity) {
        this.reqQuantity = reqQuantity;
    }
}
