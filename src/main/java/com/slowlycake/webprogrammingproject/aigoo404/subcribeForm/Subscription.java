package com.slowlycake.webprogrammingproject.aigoo404.subcribeForm;

import java.util.*;

public class Subscription {
    private int sID;
    private String sEmail;
    private Date startDate;

    // Getters and Setters
    public int getSID() {
        return sID;
    }

    public void setSID(int id) {
        this.sID = id;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String email) {
        this.sEmail = email;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}

