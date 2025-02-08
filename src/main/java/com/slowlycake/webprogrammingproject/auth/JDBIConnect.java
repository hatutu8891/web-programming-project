package com.slowlycake.webprogrammingproject.auth;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jdbi.v3.core.Jdbi;

public class JDBIConnect {
    static Jdbi jdbi;
    public static Jdbi get() {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            if(jdbi==null) makeConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jdbi;
    }

    private static void makeConnect(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(DBProperties.url());
        config.setUsername(DBProperties.username());
        config.setPassword(DBProperties.password());
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(10);
        HikariDataSource src = new HikariDataSource(config);
        jdbi = Jdbi.create(src);

    }

}
