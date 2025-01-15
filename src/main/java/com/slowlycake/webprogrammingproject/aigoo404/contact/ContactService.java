package com.slowlycake.webprogrammingproject.aigoo404.contact;

import org.jdbi.v3.core.Jdbi;

public class ContactService {
    private ContactDAO contactDAO;

    public ContactService(Jdbi jdbi) {
        this.contactDAO = new ContactDAO(jdbi);
    }

    public void saveContact(Contact contact) {
        contactDAO.insertContact(contact);
    }
}