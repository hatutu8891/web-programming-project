package com.slowlycake.webprogrammingproject.reviews;

import com.slowlycake.webprogrammingproject.auth.JDBIConnect;;

import java.util.List;

public class ReviewDao {
    private static final String SELECT_ALL_REVIEWS_SQL =
            "select r.id, r.uID, r.pID, r.rating, r.comment, " +
            "u.handle, " +
            "p.name as pName " +
            "from reviews r " +
            "join users u on r.uID = u.id " +
            "join products p on r.pID = p.id;";
    private static final String INSERT_REVIEW_SQL = "INSERT INTO reviews (uID, pID, rating, comment) VALUES (?, ?, ?, ?)";
//    private static final String SELECT_REVIEWS_BY_PRODUCT_SQL = "SELECT * FROM reviews WHERE pID = ?";

    private static final String SELECT_REVIEWS_BY_PRODUCT_SQL =
            "SELECT r.*, u.handle FROM reviews r " +
                    "JOIN users u ON r.uID = u.id " +
                    "WHERE r.pID = ?";

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

    //    public List<Review> getReviewsByProduct(int productId) {
//        return JDBIConnect.get().withHandle(handle ->
//                handle.createQuery(SELECT_REVIEWS_BY_PRODUCT_SQL)
//                        .bind(0, productId)
//                        .mapToBean(Review.class)
//                        .list()
//        );
//    }
    public List<Review> getReviewsByProduct(int productId) {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery(SELECT_REVIEWS_BY_PRODUCT_SQL)
                        .bind(0, productId)
                        .map((rs, ctx) -> {
                            Review review = new Review();
                            review.setId(rs.getInt("id"));
                            review.setuID(rs.getInt("uID"));
                            review.setpID(rs.getInt("pID"));
                            review.setRating(rs.getInt("rating"));
                            review.setComment(rs.getString("comment"));
                            review.setHandle(rs.getString("handle")); // Lấy handle từ kết quả truy vấn
                            return review;
                        })
                        .list()
        );
    }

    public List<Review> getAllReviews() {
        return JDBIConnect.get().withHandle(handle ->
                handle.createQuery(SELECT_ALL_REVIEWS_SQL)
                        .map((rs, ctx) -> {
                            Review review = new Review();
                            review.setId(rs.getInt("id"));
                            review.setuID(rs.getInt("uID"));
                            review.setpID(rs.getInt("pID"));
                            review.setRating(rs.getInt("rating"));
                            review.setComment(rs.getString("comment"));
                            review.setHandle(rs.getString("handle"));
                            review.setPName(rs.getString("pName"));
                            return review;
                        })
                        .list()  // Return the list of reviews
        );
    }
}
