package com.slowlycake.webprogrammingproject.aigoo404.subcribeForm;

public class SubscriptionService {
    private final SubscriptionDAO subscriptionDAO;

    public SubscriptionService(SubscriptionDAO subscriptionDAO) {
        this.subscriptionDAO = subscriptionDAO;
    }

    public boolean subscribe(String sEmail) {
        return subscriptionDAO.addSubscription(sEmail);
    }
}

