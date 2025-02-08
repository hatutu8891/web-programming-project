package com.slowlycake.webprogrammingproject.products;

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

    public List<String> getFlavorsByCakeCode(String cakeCode) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery("SELECT f.flavor_name FROM flavors f " +
                                "JOIN product_flavors pf ON f.id = pf.fID " +
                                "JOIN products p ON pf.pID = p.id WHERE p.cakeCode = ?")
                        .bind(0, cakeCode)
                        .mapTo(String.class)
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

    public int addProduct(Product product, List<Integer> flavorIds, List<Variant> variants) {
        return JDBIConnect.get().withHandle(handle -> {
            handle.begin();
            try {
                int productId = handle.createUpdate(
                                "INSERT INTO products (name, cakeCode, quantitySold, desc, review, img, category, launchDate) " +
                                        "VALUES (?, ?, 0, ?, 0.0, ?, ?, ?)")
                        .bind(0, product.getName())
                        .bind(1, product.getCakeCode())
                        .bind(2, product.getDesc())
                        .bind(3, product.getImg())
                        .bind(4, product.getCategory())
                        .bind(5, product.getLaunchDate())
                        .executeAndReturnGeneratedKeys("id")
                        .mapTo(Integer.class)
                        .one();

                for (Integer flavorId : flavorIds) {
                    handle.createUpdate("INSERT INTO product_flavors (pID, fID) VALUES (?, ?)")
                            .bind(0, productId)
                            .bind(1, flavorId)
                            .execute();
                }

                for (Variant variant : variants) {
                    Integer variantId = handle.createQuery(
                                    "SELECT id FROM variants WHERE size = ? AND price = ? LIMIT 1")
                            .bind(0, variant.getSize())
                            .bind(1, variant.getPrice())
                            .mapTo(Integer.class)
                            .findOne()
                            .orElse(null);

                    if (variantId == null) {
                        variantId = handle.createUpdate(
                                        "INSERT INTO variants (size, price) VALUES (?, ?)")
                                .bind(0, variant.getSize())
                                .bind(1, variant.getPrice())
                                .executeAndReturnGeneratedKeys("id")
                                .mapTo(Integer.class)
                                .one();
                    }

                    handle.createUpdate("INSERT INTO product_variants (pID, vID) VALUES (?, ?)")
                            .bind(0, productId)
                            .bind(1, variantId)
                            .execute();
                }

                handle.commit();
                return productId;
            } catch (Exception e) {
                handle.rollback();
                e.printStackTrace();
                return -1;
            }
        });
    }

    public boolean editProduct(Product product, List<Integer> flavorIds, List<Variant> variants) {
        return JDBIConnect.get().withHandle(handle -> {
            handle.begin();

            try {
                int updatedRows = handle.createUpdate(
                                "UPDATE products SET name = ?, cakeCode = ?, desc = ?, img = ?, category = ?, launchDate = ? WHERE id = ?")
                        .bind(0, product.getName())
                        .bind(1, product.getCakeCode())
                        .bind(2, product.getDesc())
                        .bind(3, product.getImg())
                        .bind(4, product.getCategory())
                        .bind(5, product.getLaunchDate())
                        .bind(6, product.getId())
                        .execute();

                handle.createUpdate("DELETE FROM product_flavors WHERE pID = ?")
                        .bind(0, product.getId())
                        .execute();

                for (Integer flavorId : flavorIds) {
                    handle.createUpdate("INSERT INTO product_flavors (pID, fID) VALUES (?, ?)")
                            .bind(0, product.getId())
                            .bind(1, flavorId)
                            .execute();
                }

                handle.createUpdate("DELETE FROM product_variants WHERE pID = ?")
                        .bind(0, product.getId())
                        .execute();

                for (Variant variant : variants) {
                    Integer variantId = handle.createQuery(
                                    "SELECT id FROM variants WHERE size = ? AND price = ? LIMIT 1")
                            .bind(0, variant.getSize())
                            .bind(1, variant.getPrice())
                            .mapTo(Integer.class)
                            .findOne()
                            .orElse(null);

                    if (variantId == null) {
                        variantId = handle.createUpdate(
                                        "INSERT INTO variants (size, price) VALUES (?, ?)")
                                .bind(0, variant.getSize())
                                .bind(1, variant.getPrice())
                                .executeAndReturnGeneratedKeys("id")
                                .mapTo(Integer.class)
                                .one();
                    }

                    handle.createUpdate("INSERT INTO product_variants (pID, vID) VALUES (?, ?)")
                            .bind(0, product.getId())
                            .bind(1, variantId)
                            .execute();
                }

                handle.commit();
                return updatedRows > 0;
            } catch (Exception e) {
                handle.rollback();
                e.printStackTrace();
                return false;
            }
        });
    }

    public boolean deleteProduct(int productId) {
        int deletedRows = JDBIConnect.get().withHandle(handle ->
                handle.createUpdate("DELETE FROM products WHERE id = ?")
                        .bind(0, productId)
                        .execute()
        );
        return deletedRows > 0;
    }
}
