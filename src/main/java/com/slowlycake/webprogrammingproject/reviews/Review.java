package com.slowlycake.webprogrammingproject.reviews;

public class Review {
    private int id;
    private int uID;
    private int pID;
    private int rating;
    private String comment;
    public Review() {}
    public Review(int id, int uID, int pID, byte rating, String comment) {
        this.id = id;
        this.uID = uID;
        this.pID = pID;
        this.rating = rating;
        this.comment = comment;
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

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", uID=" + uID +
                ", pID=" + pID +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
