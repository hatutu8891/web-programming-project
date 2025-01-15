package com.slowlycake.webprogrammingproject.products;

import java.util.List;

public class ProductService {

    private ProductDao productDao;

    public ProductService() {
        this.productDao = new ProductDao(); // Khởi tạo ProductDao
    }

    // Lấy sản phẩm theo ID
    public Product getProductById(int productId) {
        try {
            return productDao.findProductById(productId); // Gọi ProductDao để lấy sản phẩm
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
