package com.slowlycake.webprogrammingproject.products;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private int id;
    private String name;
    private String cakeCode;
    private int quantitySold;
    private String desc;
    private BigDecimal review;
    private String img;
    private String category;
    private Date launchDate;

    public Product() {}
    public Product(int id, String name, String cakeCode, int quantitySold, String desc, BigDecimal review, String img, String category, Date launchDate) {
        this.id = id;
        this.name = name;
        this.cakeCode = cakeCode;
        this.quantitySold = quantitySold;
        this.desc = desc;
        this.review = review;
        this.img = img;
        this.category = category;
        this.launchDate = launchDate;
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

    public String getCakeCode() {
        return cakeCode;
    }

    public void setCakeCode(String cakeCode) {
        this.cakeCode = cakeCode;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getReview() {
        return review;
    }

    public void setReview(BigDecimal review) {
        this.review = review;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cakeCode='" + cakeCode + '\'' +
                ", quantitySold=" + quantitySold +
                ", desc='" + desc + '\'' +
                ", review=" + review +
                ", img='" + img + '\'' +
                ", category='" + category + '\'' +
                ", launchDate=" + launchDate +
                '}';
    }
}
