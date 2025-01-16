package com.slowlycake.webprogrammingproject.products;

import com.slowlycake.webprogrammingproject.reviews.Review;
import com.slowlycake.webprogrammingproject.reviews.ReviewService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/productdetail")
public class ProductDetailServlet extends HttpServlet {

    private ProductService productService;
    private ReviewService reviewService;

    @Override
    public void init() throws ServletException {
        super.init();
        productService = new ProductService(); // Khởi tạo ProductService
        reviewService = new ReviewService(); // Khởi tạo ReviewService
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String productIdParam = request.getParameter("id");
            if (productIdParam == null || productIdParam.isEmpty()) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing productId parameter");
                return;
            }

            int productId = Integer.parseInt(productIdParam); // Chuyển đổi sang số nguyên

            // Lấy thông tin sản phẩm từ ProductService
            Product product = productService.getProductById(productId);
            if (product == null) {
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Product not found");
                return;
            }

            // Lấy danh sách đánh giá của sản phẩm
            List<Review> reviews = reviewService.getReviewsByProductId(productId);

            // Tính điểm đánh giá trung bình
            double avgRating = reviewService.calculateAverageRating(productId);

            // Lấy danh sách sản phẩm theo cakecode (cùng loại bánh nhưng các kích thước khác nhau)
            List<Product> productsByCakeCode = productService.getProductsByCakeCode(product.getCakecode());

            // Gửi dữ liệu đến JSP
            request.setAttribute("product", product);
            request.setAttribute("reviews", reviews);
            request.setAttribute("avgRating", avgRating);
            request.setAttribute("productsByCakeCode", productsByCakeCode); // Truyền danh sách sản phẩm có cùng cakecode

            // Chuyển hướng đến trang productDetail.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("/productDetail.jsp");
            dispatcher.forward(request, response);
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid productId parameter");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Internal server error");
        }
    }
}
