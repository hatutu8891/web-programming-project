package com.slowlycake.webprogrammingproject.products;

import java.util.List;

public class ProductService {

    private final ProductDAO productDAO;

    public ProductService() {
        this.productDAO = new ProductDAO(); // Khởi tạo ProductDAO
    }

    // Lấy thông tin chi tiết sản phẩm theo ID
    public Product getProductById(int productId) {
        try {
            return productDAO.getProductById(productId); // Gọi ProductDAO để lấy sản phẩm theo ID
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Lấy danh sách các biến thể theo mã bánh
    public List<Variant> getVariantsByCakeCode(String cakeCode) {
        try {
            return productDAO.getVariantsByCakeCode(cakeCode); // Gọi ProductDAO để lấy danh sách biến thể
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Lấy danh sách sản phẩm cùng danh mục
    public List<Product> getProductsInSameCategory(String category) {
        try {
            return productDAO.getProductsInSameCategory(category); // Gọi ProductDAO để lấy danh sách sản phẩm cùng danh mục
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
