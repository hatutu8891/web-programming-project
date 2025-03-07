<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Slowly Cake</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon -->
    <link href="assets/img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Oswald:wght@500;600;700&family=Pacifico&display=swap"
          rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="assets/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <!-- Template Stylesheet -->
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/menu.css">
    <link href="assets/css/header.css" rel="stylesheet">
</head>
<body>
<jsp:include page="shared/header.jsp"/>
<%--<%@ include file="shared/header.jsp" %>--%>
<%@ include file="shared/nav.jsp" %>
<%--<%@ include file="shared/header.jsp" %>--%>
<%--<%@ include file="shared/nav.jsp" %>--%>


<!-- Page Header Start -->
<div class="container-fluid bg-dark bg-img p-5 mb-5">
    <div class="row">
        <div class="col-12 text-center">
            <h1 class="display-4 text-uppercase text-white">Sản phẩm</h1>
            <a href="index.html">Trang chủ</a>
            <i class="fa-solid fa-arrow-right text-primary px-2"></i>
            <a href="menu.html">Sản phẩm</a>
        </div>
    </div>
</div>
<!-- Page Header End -->


<!-- Products Start -->
<div class="container-fluid about py-5">
    <div class="container">
        <div class="section-title position-relative text-center mx-auto mb-5 pb-3" style="max-width: 600px;">
            <h2 class="text-primary font-secondary">Hãy cùng nhau</h2>
            <h1 class="display-4 text-uppercase">Khám phá bánh của chúng tôi</h1>
        </div>
        <div class="tab-class text-center">
            <div class="frame-product-container">
                <!-- Shop Start -->
                <div class="container-fluid pt-5">
                    <div class="row px-xl-5">
                                                    <!-- Shop Sidebar Start -->
                        <div class="col-lg-3 col-md-12">
                            <!-- Price Start -->
                            <div class="border-bottom mb-4 pb-4">
                                <h5 class="font-weight-semi-bold mb-4">Giá</h5>
                                <form>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" checked id="price-all">
                                        <label class="custom-control-label" for="price-all">All Price</label>
                                        <span class="badge border font-weight-normal">1000</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="price-1">
                                        <label class="custom-control-label" for="price-1">100000-140000</label>
                                        <span class="badge border font-weight-normal">150</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="price-2">
                                        <label class="custom-control-label" for="price-2">150000-240000</label>
                                        <span class="badge border font-weight-normal">295</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="price-3">
                                        <label class="custom-control-label" for="price-3">250000-340000</label>
                                        <span class="badge border font-weight-normal">246</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="price-4">
                                        <label class="custom-control-label" for="price-4">>350000</label>
                                        <span class="badge border font-weight-normal">145</span>
                                    </div>
                                </form>
                            </div>
                            <!-- Price End -->

                            <!-- Color Start -->
                            <div class="border-bottom mb-4 pb-4">
                                <h5 class="font-weight-semi-bold mb-4">Loại bánh</h5>
                                <form>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" checked id="color-all">
                                        <label class="custom-control-label" for="price-all">Tất cả bánh</label>
                                        <span class="badge border font-weight-normal">1000</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="color-1">
                                        <label class="custom-control-label" for="color-1">Gato</label>
                                        <span class="badge border font-weight-normal">150</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="color-2">
                                        <label class="custom-control-label" for="color-2">Mousse</label>
                                        <span class="badge border font-weight-normal">295</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="color-3">
                                        <label class="custom-control-label" for="color-3">Tiramisu</label>
                                        <span class="badge border font-weight-normal">246</span>
                                    </div>
                                </form>
                            </div>
                            <!-- Category End -->

                            <!-- Size Start -->
                            <div class="mb-5">
                                <h5 class="font-weight-semi-bold mb-4">Lọc bởi vị bánh</h5>
                                <form>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" checked id="size-all">
                                        <label class="custom-control-label" for="size-all">Tất cả vị</label>
                                        <span class="badge border font-weight-normal">1000</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="size-1">
                                        <label class="custom-control-label" for="size-1">Socola</label>
                                        <span class="badge border font-weight-normal">150</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="size-2">
                                        <label class="custom-control-label" for="size-2">Trái Cây</label>
                                        <span class="badge border font-weight-normal">295</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="size-3">
                                        <label class="custom-control-label" for="size-3">Dâu</label>
                                        <span class="badge border font-weight-normal">246</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                        <input type="checkbox" class="custom-control-input" id="size-4">
                                        <label class="custom-control-label" for="size-4">Dứa</label>
                                        <span class="badge border font-weight-normal">145</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-control-input" id="size-5">
                                        <label class="custom-control-label" for="size-5">Dừa</label>
                                        <span class="badge border font-weight-normal">168</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-control-input" id="size-6">
                                        <label class="custom-control-label" for="size-5">Mâm Xôi</label>
                                        <span class="badge border font-weight-normal">168</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-control-input" id="size-7">
                                        <label class="custom-control-label" for="size-5">Matcha</label>
                                        <span class="badge border font-weight-normal">168</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-control-input" id="size-8">
                                        <label class="custom-control-label" for="size-5">Cam</label>
                                        <span class="badge border font-weight-normal">168</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-control-input" id="size-9">
                                        <label class="custom-control-label" for="size-5">Chanh</label>
                                        <span class="badge border font-weight-normal">168</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-control-input" id="size-10">
                                        <label class="custom-control-label" for="size-5">Cà Phê</label>
                                        <span class="badge border font-weight-normal">168</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-control-input" id="size-11">
                                        <label class="custom-control-label" for="size-5">Caramel</label>
                                        <span class="badge border font-weight-normal">168</span>
                                    </div>
                                    <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                        <input type="checkbox" class="custom-control-input" id="size-12">
                                        <label class="custom-control-label" for="size-5">Vanilla</label>
                                        <span class="badge border font-weight-normal">168</span>
                                    </div>
                                </form>
                            </div>
                            <!-- Size End -->
                        </div>
                        <!-- Shop Sidebar End -->


                        <!-- Shop Product Start -->
                        <div class="col-lg-9 col-md-12">
                            <div class="row pb-3">
                                <div class="col-12 pb-1">
                                    <div class="d-flex align-items-center justify-content-between mb-4">
                                        <form action="">
                                            <div class="input-group">
                                                <input type="text" class="form-control"
                                                       placeholder="Search by name">
                                                <div class="input-group-append">
                                                <span class="input-group-text bg-transparent text-primary">
                                                    <i class="fa fa-search"></i>
                                                </span>
                                                </div>
                                            </div>
                                        </form>
                                        <div class="dropdown ml-4">
                                            <button class="btn border dropdown-toggle" type="button" id="triggerId"
                                                    data-toggle="dropdown" aria-haspopup="true"
                                                    aria-expanded="false">
                                                Lọc
                                            </button>
                                            <div class="dropdown-menu dropdown-menu-right"
                                                 aria-labelledby="triggerId">
                                                <a class="dropdown-item" href="#">Mới nhất</a>
                                                <a class="dropdown-item" href="#">Phổ biến</a>
                                                <a class="dropdown-item" href="#">Đắt hàng</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%--                                    <!-- Sản phẩm 1 -->--%>
                        <c:forEach var="p" items="${data}">
                            <div class="col-lg-4 col-md-6 col-sm-12 pb-1">
                                <div class="card product-item border-0 mb-4">
                                    <div class="card-header product-img position-relative overflow-hidden bg-transparent border p-0">
                                        <img class="img-fluid w-100" src=${p.img} alt="">
                                    </div>
                                    <div class="card-body border-left border-right text-center p-0 pt-4 pb-3">
                                        <h6 class="text-truncate mb-3">${p.title}</h6>
                                        <div class="d-flex justify-content-center">
                                            <h6>${p.piece}VND</h6>
                                            <h6 class="text-muted ml-2">
                                                <del>${p.piece}VND</del>
                                            </h6>
                                        </div>
                                    </div>
                                    <div class="card-footer d-flex justify-content-between bg-light border">
                                        <a href="" class="btn btn-sm text-dark p-0"><i
                                                class="fas fa-eye text-primary mr-1"></i>Chi tiết</a>
                                        <a href="" class="btn btn-sm text-dark p-0"><i
                                                class="fas fa-shopping-cart text-primary mr-1"></i>Thêm vào giỏ hàng</a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                        <div class="col-12 pb-1">
                            <nav aria-label="Page navigation">
                                <ul class="pagination justify-content-center mb-3">
                                    <li class="page-item disabled">
                                        <a class="page-link" href="#" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                    </li>
                                    <li class="page-item active"><a class="page-link" href="#">1</a></li>
                                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <li class="page-item">
                                        <a class="page-link" href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Products End -->


<%@ include file="shared/footer.jsp" %>

<div class="container-fluid text-secondary py-4" style="background: #111111;">
    <div class="container text-center">
        <p class="mb-0">&copy; <a class="text-white border-bottom" href="#">Your Site Name</a>. All
            Rights Reserved.

            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". Thank you for your support. ***/-->
            Designed by <a class="text-white border-bottom" href="https://htmlcodex.com">HTML Codex</a>
        </p>
    </div>
</div>
<!-- Footer End -->

<!-- Back to Top -->
<a href="#" class="btn btn-primary border-inner py-3 fs-4 back-to-top"><i
        class="bi bi-arrow-up"></i></a>


<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="assets/lib/easing/easing.min.js"></script>
<script src="assets/lib/waypoints/waypoints.min.js"></script>
<script src="assets/lib/counterup/counterup.min.js"></script>
<script src="assets/lib/owlcarousel/owl.carousel.min.js"></script>

<!-- Template Javascript -->
<script src="assets/js/main.js"></script>
<script src="assets/js/menu.js"></script>
</body>
</html>
