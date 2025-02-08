package com.slowlycake.webprogrammingproject.aigoo404.mailSub;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;

import java.util.List;

public class mailSubDAO {
    public List<mailSub> getAllMailSubs() {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("select * from mailsubscribers")
                        .mapToBean(mailSub.class)
                        .list()
        );
    }
}
