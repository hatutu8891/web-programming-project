package com.slowlycake.webprogrammingproject.products;


import com.slowlycake.webprogrammingproject.aigoo404.contact.Contact;
import com.slowlycake.webprogrammingproject.auth.JDBIConnect;

import java.util.List;

public class ProductDAO {

    // Lấy thông tin chi tiết sản phẩm theo ID
    public Product getProductById(int productId) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE id = ?")
                        .bind(0, productId)
                        .map((rs, ctx) -> new Product(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("cakeCode"),
                                rs.getInt("quantitySold"),
                                rs.getString("desc"),
                                rs.getBigDecimal("review"),
                                rs.getString("img"),
                                rs.getString("category"),
                                rs.getDate("launchDate")
                        ))
                        .findOne()
                        .orElse(null)
        );
    }

    // Lấy danh sách các biến thể (Variant) theo mã bánh (cakeCode)
    public List<Variant> getVariantsByCakeCode(String cakeCode) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT v.* FROM variants v " +
                                "JOIN product_variants pv ON v.id = pv.vId " +
                                "JOIN products p ON pv.pId = p.id WHERE p.cakeCode = ?")
                        .bind(0, cakeCode)
                        .map((rs, ctx) -> new Variant(
                                rs.getInt("id"),
                                rs.getInt("size"),
                                rs.getBigDecimal("price")
                        ))
                        .list()
        );
    }

    // Lấy danh sách sản phẩm cùng danh mục
    public List<Product> getProductsInSameCategory(String category) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE category = ?")
                        .bind(0, category)
                        .map((rs, ctx) -> new Product(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("cakeCode"),
                                rs.getInt("quantitySold"),
                                rs.getString("desc"),
                                rs.getBigDecimal("review"),
                                rs.getString("img"),
                                rs.getString("category"),
                                rs.getDate("launchDate")
                        ))
                        .list()
        );
    }

    public List<String> getProductReviews(int productId) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery(
                                "SELECT CONCAT(u.handle, ': ', r.comment) AS userComment " +
                                        "FROM review r " +
                                        "JOIN users u ON r.uID = u.id " +
                                        "WHERE r.pID = ?"
                        )
                        .bind(0, productId)
                        .mapTo(String.class)
                        .list()
        );
    }

    public List<Product> getAllProducts() {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("select id, name, quantitySold, review, category, launchDate from products")
                        .mapToBean(Product.class)
                        .list()
        );
    }
}
