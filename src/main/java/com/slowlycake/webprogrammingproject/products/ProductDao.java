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
    public void addProduct(Product product) {
        JDBIConnect.get().withHandle(handle ->
                handle.createUpdate("INSERT INTO products (pName, pCode, pQuantitySold, pDesc, pReview, pImg, category, launchDate) " +
                                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)")
                        .bind(0, product.getPName())        // Gắn giá trị cho tham số thứ nhất
                        .bind(1, product.getPCode())        // Gắn giá trị cho tham số thứ hai
                        .bind(2, product.getPQuantitySold())  // Gắn giá trị cho tham số thứ ba
                        .bind(3, product.getPDesc())        // Gắn giá trị cho tham số thứ tư
                        .bind(4, product.getPReview())      // Gắn giá trị cho tham số thứ năm
                        .bind(5, product.getPImg())         // Gắn giá trị cho tham số thứ sáu
                        .bind(6, product.getCategory())     // Gắn giá trị cho tham số thứ bảy
                        .bind(7, product.getLaunchDate())   // Gắn giá trị cho tham số thứ tám
                        .execute()
        );
    }
    public void updateProduct(Product product) {
        JDBIConnect.get().withHandle(handle ->
                handle.createUpdate("UPDATE products SET pName = ?, pCode = ?, pQuantitySold = ?, pDesc = ?, pReview = ?, pImg = ?, category = ?, launchDate = ? " +
                                "WHERE pID = ?")
                        .bind(0, product.getPName())        // Gắn giá trị cho tham số thứ nhất
                        .bind(1, product.getPCode())        // Gắn giá trị cho tham số thứ hai
                        .bind(2, product.getPQuantitySold())  // Gắn giá trị cho tham số thứ ba
                        .bind(3, product.getPDesc())        // Gắn giá trị cho tham số thứ tư
                        .bind(4, product.getPReview())      // Gắn giá trị cho tham số thứ năm
                        .bind(5, product.getPImg())         // Gắn giá trị cho tham số thứ sáu
                        .bind(6, product.getCategory())     // Gắn giá trị cho tham số thứ bảy
                        .bind(7, product.getLaunchDate())   // Gắn giá trị cho tham số thứ tám
                        .bind(8, product.getPID())          // Gắn giá trị cho tham số thứ chín (ID của sản phẩm)
                        .execute()
        );
    }
    public void deleteProductById(int productId) {
        JDBIConnect.get().withHandle(handle ->
                handle.createUpdate("DELETE FROM products WHERE pID = ?")
                        .bind(0, productId)  // Gắn giá trị cho tham số thứ nhất
                        .execute()
        );
    }

    public List<Product> getAllProducts() {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products")
                        .mapToBean(Product.class)
                        .list()
        );
    }


}
