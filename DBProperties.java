package com.slowlycake.webprogrammingproject.dao.db;

import java.io.IOException;
import java.util.Properties;

public class DBProperties {
    private static Properties prop = new Properties();
    static {
        try {
            prop.load(DBProperties.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String url() {

        return prop.get("db.url").toString();
    }

    public static String username() {

        return prop.get("db.username").toString();
    }
    public static String password() {
        return prop.get("db.password").toString();

    }

}
