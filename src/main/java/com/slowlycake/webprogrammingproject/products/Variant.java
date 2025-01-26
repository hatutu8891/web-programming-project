package com.slowlycake.webprogrammingproject.products;


import java.math.BigDecimal;

public class Variant {
    private int id;
    private int size;
    private BigDecimal price;

    public Variant(int id, int size, BigDecimal price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "id=" + id +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
