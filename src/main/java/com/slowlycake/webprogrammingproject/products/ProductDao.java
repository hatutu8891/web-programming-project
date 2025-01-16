package com.slowlycake.webprogrammingproject.products;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;

import java.util.List;

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
    public List<Product> findProductsByCakeCode(String cakecode) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE cakecode = :cakecode")
                        .bind("cakecode", cakecode)
                        .mapToBean(Product.class)
                        .list()
        );
    }

}
