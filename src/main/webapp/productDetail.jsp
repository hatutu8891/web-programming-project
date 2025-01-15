<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/productDetail.css">
</head>

<body>
<!-- Header -->
<%@ include file="shared/header.jsp" %>
<%@ include file="shared/nav.jsp" %>

<div class="container mt-5">
    <!-- Breadcrumb -->
    <div class="page-title py-3">
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="index.jsp">Cửa hàng</a></li>
                <li class="breadcrumb-item"><a href="menu.jsp">Sản Phẩm</a></li>
                <li class="breadcrumb-item active" aria-current="page">${requestScope.product.category}</li>
            </ol>
        </nav>
    </div>

    <!-- Product Details -->
    <div class="row img">
        <div class="col-md-5">
            <div class="product-gallery">
                <div class="main-image">
                    <img src="${requestScope.product.img}" alt="${requestScope.product.name}" />
                </div>
            </div>
        </div>
        <div class="col-md-7">
            <div class="buy-section">
                <h1 class="title-product">${requestScope.product.name}</h1>
                <h1 class="title-product">${requestScope.product.cakecode}</h1>


                <!-- Hiển thị giá -->
                <div class="price-wrapper">
                    <p class="price">
                        <span>Giá: <ins id="price">${requestScope.product.price} đ</ins></span>
                    </p>
                </div>
                <div class="variations_form cart">
                    <div class="quantity buttons_added d-flex align-items-center mt-3">
                        <span>
                            Số lượng:
                        </span>

                        <input type="number" class="input-text qty text mx-2" step="1" min="1" max="${requestScope.product.quantityOrdered}" name="quantity" value="1" title="Số lượng">

                    </div>
                    <button type="button" class="single_add_to_cart_button btn btn-primary mt-3">Thêm vào giỏ hàng</button>
                    <button type="button" class="single_add_to_cart_button btn btn-primary mt-3">Thanh Toán</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Tabs -->
    <div class="product-details-tabs py-5 bg-light mt-5">
        <div class="container">
            <ul class="nav nav-tabs" id="product-details-tabs" role="tablist">
                <li class="nav-item">
                    <a class="nav-link active" id="description-tab" data-toggle="tab" href="#description" role="tab" aria-controls="description" aria-selected="true">Mô tả</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" id="reviews-tab" data-toggle="tab" href="#reviews" role="tab" aria-controls="reviews" aria-selected="false">Đánh giá</a>
                </li>
            </ul>
            <div class="tab-content" id="product-details-tabs-content">
                <div class="tab-pane fade show active" id="description" role="tabpanel" aria-labelledby="description-tab">
                    <div class="border p-3 mt-3">
                        <h5 class="text-uppercase">Thông tin sản phẩm</h5>
                        <p>${requestScope.product.description}</p>
                    </div>
                </div>

                <!-- Reviews Tab -->
                <div class="tab-pane fade" id="reviews" role="tabpanel" aria-labelledby="reviews-tab">
                    <div class="border p-3 mt-3">
                        <h5 class="text-uppercase">Đánh giá sản phẩm</h5>
                        <div class="rating ml-3">
                            <c:forEach var="i" begin="1" end="5">
                                <span class="fa fa-star ${i <= requestScope.product.favor ? 'checked' : ''}"></span>
                            </c:forEach>
                            <span>Đánh giá ${requestScope.product.favor}</span>
                        </div>
                        <div class="add-comment mt-4">
                            <h6 class="text-uppercase">Gửi bình luận của bạn</h6>
                            <form action="submitReview" method="post">
                                <!-- Product ID -->
                                <input type="hidden" name="productId" value="${requestScope.product.id}">

                                <!-- Reviewer Name -->
                                <div class="form-group">
                                    <label for="reviewer-name">Tên của bạn:</label>
                                    <input type="text" class="form-control" id="reviewer-name" name="reviewer-name" required>
                                </div>

                                <!-- Review Content -->
                                <div class="form-group">
                                    <label for="review-content">Bình luận của bạn:</label>
                                    <textarea class="form-control" id="review-content" name="review-content" rows="4" required></textarea>
                                </div>

                                <!-- Rating -->
                                <div class="form-group">
                                    <label for="rating">Đánh giá sao:</label>
                                    <select class="form-control" name="rating" id="rating" required>
                                        <option value="1">1 sao</option>
                                        <option value="2">2 sao</option>
                                        <option value="3">3 sao</option>
                                        <option value="4">4 sao</option>
                                        <option value="5">5 sao</option>
                                    </select>
                                </div>

                                <!-- Submit Review -->
                                <button type="submit" class="btn btn-primary">Gửi bình luận</button>
                            </form>
                        </div>

                        <!-- Display Reviews -->
                        <div class="reviews">
                            <c:forEach var="review" items="${requestScope.reviews}">
                                <div class="review">
                                    <div class="review-date">${review.reviewDate}</div>
                                    <div class="review-content">${review.comment}</div>
                                    <div class="review-rating">
                                        <span class="fa fa-star checked"></span> ${review.rating} / 5
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Footer -->
<%@ include file="shared/footer.jsp" %>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
