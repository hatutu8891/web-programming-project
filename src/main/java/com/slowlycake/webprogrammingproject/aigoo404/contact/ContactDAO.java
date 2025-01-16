package com.slowlycake.webprogrammingproject.aigoo404.contact;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Update;

public class ContactDAO {
    private Jdbi jdbi;

    public ContactDAO(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public void insertContact(Contact contact) {
        jdbi.useHandle(handle -> {
            Update update = handle.createUpdate("insert into contactinfos (contactName, contactMail, contactSub, contactMess) values (:contactName, :contactMail, :contactSub, :contactMess)");
            update.bind("contactName", contact.getName())
                    .bind("contactMail", contact.getEmail())
                    .bind("contactSub", contact.getSubject())
                    .bind("contactMess", contact.getMessage())
                    .execute();
        });
    }
}
