package com.slowlycake.webprogrammingproject.reviews;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;

import java.util.List;

public class ReviewDao {

    private static final String INSERT_REVIEW_SQL = "INSERT INTO reviews (uID, pID, rating, comment) VALUES (?, ?, ?, ?)";
    private static final String SELECT_REVIEWS_BY_PRODUCT_SQL = "SELECT * FROM reviews WHERE pID = ?";

    // Phương thức thêm đánh giá mới
    public void addReview(Review review) {
        JDBIConnect.get().useHandle(handle ->
                handle.createUpdate(INSERT_REVIEW_SQL)
                        .bind(0, review.getuID())
                        .bind(1, review.getpID())
                        .bind(2, review.getRating())
                        .bind(3, review.getComment())
                        .execute()
        );
    }

    public List<Review> getReviewsByProduct(int productId) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery(SELECT_REVIEWS_BY_PRODUCT_SQL)
                        .bind(0, productId)
                        .mapToBean(Review.class)
                        .list()
        );
    }
}
