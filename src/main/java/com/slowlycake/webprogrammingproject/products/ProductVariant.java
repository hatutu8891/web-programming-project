package com.slowlycake.webprogrammingproject.products;

public class ProductVariant {
    private int id;
    private int pId;
    private int vId;

    public ProductVariant(int id, int pId, int vId) {
        this.id = id;
        this.pId = pId;
        this.vId = vId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    @Override
    public String toString() {
        return "ProductVariant{" +
                "id=" + id +
                ", pId=" + pId +
                ", vId=" + vId +
                '}';
    }
}
