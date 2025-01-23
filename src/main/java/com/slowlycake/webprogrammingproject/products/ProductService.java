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
    public List<Product> getProductsByCakeCode(String cakecode) {
        return productDao.findProductsByCakeCode(cakecode);
    }
    // Thêm sản phẩm mới
    public void addProduct(Product product) {
        try {
            productDao.addProduct(product); // Gọi phương thức addProduct từ ProductDao
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Cập nhật thông tin sản phẩm
    public void updateProduct(Product product) {
        try {
            productDao.updateProduct(product); // Gọi phương thức updateProduct từ ProductDao
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Xóa sản phẩm theo ID
    public void deleteProductById(int productId) {
        try {
            productDao.deleteProductById(productId); // Gọi phương thức deleteProductById từ ProductDao
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Lấy tất cả sản phẩm
    public List<Product> getAllProducts() {
        try {
            return productDao.getAllProducts(); // Gọi phương thức getAllProducts từ ProductDao
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
