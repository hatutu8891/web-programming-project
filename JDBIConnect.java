package com.slowlycake.webprogrammingproject.dao.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jdbi.v3.core.Jdbi;

import java.sql.SQLException;

public class JDBIConnect {
    static Jdbi jdbi;
    public static Jdbi get() {
        if(jdbi==null) makeConnect();
        return jdbi;
    }

    private static void makeConnect() {
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(DBProperties.url());
        config.setUsername(DBProperties.username());
        config.setPassword(DBProperties.password());
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(10);

//        MysqlDataSource src = new MysqlDataSource();
//        src.setUrl(DBProperties.url());
//        src.setUser(DBProperties.username());
//        src.setPassword(DBProperties.password());
//        try {
//            src.setUseCompression(true);
//            src.setAutoReconnect(true);
//        } catch (SQLException e) {
//        }
        HikariDataSource src = new HikariDataSource(config);
        jdbi = Jdbi.create(src);

    }

}
