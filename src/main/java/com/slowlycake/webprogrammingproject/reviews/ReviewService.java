package com.slowlycake.webprogrammingproject.reviews;

import java.util.List;

public class ReviewService {

    private ReviewDao reviewDao;

    public ReviewService() {
        this.reviewDao = new ReviewDao();
    }

    // Lấy danh sách đánh giá của sản phẩm theo productId
    public List<Review> getReviewsByProductId(int productId) {
        try {
            return reviewDao.getReviewsByProduct(productId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    // Thêm một đánh giá mới
    public void addReview(Review review) {
        try {
            reviewDao.addReview(review); // Thêm đánh giá vào cơ sở dữ liệu
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Review> getAllReviews() {
        try {
            return reviewDao.getAllReviews();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
