package com.slowlycake.webprogrammingproject.reviews;

public class Review {
    private int id;
    private int uID;
    private int pID;
    private int rating;
    private String comment;
    private String handle; // Thêm handle để lưu tên người dùng

    public Review() {}

    public Review(int id, int uID, int pID, int rating, String comment, String handle) {
        this.id = id;
        this.uID = uID;
        this.pID = pID;
        this.rating = rating;
        this.comment = comment;
        this.handle = handle;
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

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", uID=" + uID +
                ", pID=" + pID +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                ", handle='" + handle + '\'' +
                '}';
    }
}