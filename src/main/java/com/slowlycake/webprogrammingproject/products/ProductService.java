package com.slowlycake.webprogrammingproject.products;

import java.util.List;

public class ProductService {

    private ProductDao productDao;

    public ProductService() {
        this.productDao = new ProductDao(); // Khởi tạo ProductDao
    }

    // Lấy sản phẩm theo ID
    public Product getProductById(int productId) {
    return null;
    }

    public Product getDetail(String in) {
        try {
            int id = Integer.parseInt(in);
            return productDao.findProductById(id);// Gọi ProductDao để lấy sản phẩm
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Product> getProductsByCakeCode(String cakecode) {
        return productDao.findProductsByCakeCode(cakecode);
    }

}
