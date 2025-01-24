package com.slowlycake.webprogrammingproject.aigoo404.subcribeForm;

import org.jdbi.v3.core.Jdbi;

public class SubscriptionDAO {
    private final Jdbi jdbi;

    public SubscriptionDAO(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public boolean addSubscription(String sEmail) {
        String query = "insert into subscriptions (sEmail, startDate) values (:email, CURDATE())";
        int rowsAffected = jdbi.withHandle(handle ->
                handle.createUpdate(query)
                        .bind("email", sEmail)
                        .execute()
        );
        return rowsAffected > 0;
    }
}
