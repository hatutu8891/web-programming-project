package com.slowlycake.webprogrammingproject.auth;

import org.jdbi.v3.core.Jdbi;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JDBIConnect {
    private static final Jdbi jdbi;

    static {
        try {
            // Đọc file cấu hình config.properties
            Properties properties = new Properties();
            InputStream input = JDBIConnect.class.getClassLoader().getResourceAsStream("config.properties");
            if (input == null) {
                throw new FileNotFoundException("Không tìm thấy file 'config.properties' trong thư mục");
            }
            properties.load(input);

            // Lấy thông tin kết nối từ file config.properties
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // Đăng ký driver MariaDB (nếu cần)
            try {
                Class.forName("org.mariadb.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Không tìm thấy driver của MariaDB", e);
            }

            // Tạo kết nối với cơ sở dữ liệu
            jdbi = Jdbi.create(url, username, password);
        } catch (IOException e) {
            throw new RuntimeException("Không thể khởi tạo JDBI", e);
        }
    }

    // Phương thức để lấy JDBI instance
    public static Jdbi get() {
        return jdbi;
    }
}
