package com.slowlycake.webprogrammingproject.reviews;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/submitReview")
public class SubmitReviewServlet extends HttpServlet {

    private ReviewService reviewService;

    @Override
    public void init() throws ServletException {
        super.init();
        reviewService = new ReviewService(); // Khởi tạo ReviewService
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String productIdParam = request.getParameter("productId");
            if (productIdParam == null || productIdParam.isEmpty()) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing productId parameter");
                return;
            }

            int productId = Integer.parseInt(productIdParam); // Chuyển đổi sang số nguyên

            // Lấy các thông tin từ form
            String comment = request.getParameter("review-content");
            int rating = Integer.parseInt(request.getParameter("rating"));
            int userId = 1;  // Giả sử lấy từ session hoặc xác thực người dùng

            // Tạo đối tượng Review và thiết lập các trường
            Review review = new Review();
            review.setProductId(productId);
            review.setUserId(userId);
            review.setComment(comment);
            review.setRating(rating);
            review.setReviewDate(java.time.LocalDate.now().toString());  // Ngày đánh giá

            // Thêm đánh giá vào cơ sở dữ liệu thông qua ReviewService
            reviewService.addReview(review);

            // Sau khi thêm thành công, chuyển hướng lại trang chi tiết sản phẩm
            response.sendRedirect(request.getContextPath() + "/productdetail?id=" + productId);

        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error while submitting review");
        }
    }
}
