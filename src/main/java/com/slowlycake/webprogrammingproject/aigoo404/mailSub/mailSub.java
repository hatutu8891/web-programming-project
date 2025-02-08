package com.slowlycake.webprogrammingproject.aigoo404.mailSub;

import java.sql.Date;

public class mailSub {
    int id;
    String email;
    Date startDate;

    public mailSub() {
    }

    public mailSub(int id, String email, Date startDate) {
        this.id = id;
        this.email = email;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
