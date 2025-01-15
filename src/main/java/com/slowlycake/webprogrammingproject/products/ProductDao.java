package com.slowlycake.webprogrammingproject.products;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;

public class ProductDao {
    public Product findProductById(int productId) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE id = ?")
                        .bind(0, productId)
                        .mapToBean(Product.class)
                        .findFirst()
                        .orElse(null)
        );
    }
}
