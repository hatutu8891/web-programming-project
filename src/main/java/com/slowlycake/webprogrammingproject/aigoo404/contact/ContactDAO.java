package com.slowlycake.webprogrammingproject.aigoo404.contact;

import com.slowlycake.webprogrammingproject.auth.*;

import java.util.*;

public class ContactDAO {
    public List<Contact> getAllContactInfos() {
        return JDBIConnect.get().withHandle(h ->
                h.createQuery("select * from contactinfos")
                        .mapToBean(Contact.class)
                        .list()
        );
    }
}
