package com.slowlycake.webprogrammingproject.reviews;

import com.slowlycake.webprogrammingproject.auth.User;
import com.slowlycake.webprogrammingproject.auth.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/submitReview")
public class SubmitReviewServlet extends HttpServlet {

    private ReviewService reviewService;
    private UserService userService;

    @Override
    public void init() throws ServletException {
        super.init();
        reviewService = new ReviewService();
        userService = new UserService(); // Khởi tạo UserService
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String productIdParam = request.getParameter("productId");
            if (productIdParam == null || productIdParam.isEmpty()) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing productId parameter");
                return;
            }

            int productId = Integer.parseInt(productIdParam);

            // Lấy các thông tin từ form
            String comment = request.getParameter("review-content");
            int rating = Integer.parseInt(request.getParameter("rating"));

            // Lấy đối tượng User từ session
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("auth");  // Lấy đối tượng User từ session

            if (user == null) {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "User not logged in");
                return;
            }

            // Lấy handle từ đối tượng User
            String handle = user.getHandle();

            // Tạo đối tượng Review và thiết lập các trường
            Review review = new Review();
            review.setpID(productId);
            review.setuID(user.getId());  // Sử dụng user.getId() thay vì userId
            review.setComment(comment);
            review.setRating(rating);
            review.setHandle(handle);  // Lưu handle vào Review

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
