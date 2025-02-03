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
    public List<Product> findProductsByNamePart(String namePart) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE name LIKE :namePart")
                        .bind("namePart", "%" + namePart + "%")  // Thêm % vào trước và sau để tìm kiếm phần tên
                        .mapToBean(Product.class)
                        .list()
        );
    }

    public List<Product> findProductsByCategory(String category) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE category = :category")
                        .bind("category", category)
                        .mapToBean(Product.class)
                        .list()
        );
    }

//    public List<Product> findProductsByPrice(int minPrice, int maxPrice ) {
//        return JDBIConnect.get().withHandle(handle ->
//                handle.createQuery("SELECT * FROM products p JWHERE category = :category")
//                        .bind("category", category)
//                        .mapToBean(Product.class)
//                        .list()
//        );
//    }

}
