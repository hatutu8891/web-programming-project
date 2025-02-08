<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>CakeZone - Cake Shop Website Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <!-- Favicon -->
    <link href="assets/img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Oswald:wght@500;600;700&family=Pacifico&display=swap" rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="assets/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="assets/css/style.css" rel="stylesheet">
</head>

<body>
<%@ include file="shared/header.jsp" %>
<%@ include file="shared/nav.jsp" %>

<!-- Page Header Start -->
<div class="container-fluid bg-dark bg-img p-5 mb-5">
    <div class="row">
        <div class="col-12 text-center">
            <h1 class="display-4 text-uppercase text-white">Services</h1>
            <a href="">Home</a>
            <i class="far fa-square text-primary px-2"></i>
            <a href="">Services</a>
        </div>
    </div>
</div>
<!-- Page Header End -->


<!-- Service Start -->
<div class="container-fluid service position-relative px-5" style="margin-top: 90px;">
    <div class="container">
        <div class="row g-5">
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <h4 class="text-uppercase mb-3">Birthday Cake</h4>
                    <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>
                    <a class="text-uppercase text-dark" href="">Read More <i class="bi bi-arrow-right"></i></a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <h4 class="text-uppercase mb-3">Wedding Cake</h4>
                    <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>
                    <a class="text-uppercase text-dark" href="">Read More <i class="bi bi-arrow-right"></i></a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <h4 class="text-uppercase mb-3">Custom Cake</h4>
                    <p>Ipsum ipsum clita erat amet dolor sit justo sea eirmod diam stet sit justo amet tempor amet kasd lorem dolor ipsum</p>
                    <a class="text-uppercase text-dark" href="">Read More <i class="bi bi-arrow-right"></i></a>
                </div>
            </div>
            <div class="col-lg-12 col-md-6 text-center">
                <h1 class="text-uppercase text-light mb-4">30% Discount For This Summer</h1>
                <a href="" class="btn btn-primary border-inner py-3 px-5">Order Now</a>
            </div>
        </div>
    </div>
</div>
<!-- Service Start -->
<%@ include file="shared/footer.jsp" %>
<!-- Back to Top -->
<a href="#" class="btn btn-primary border-inner py-3 fs-4 back-to-top"><i class="bi bi-arrow-up"></i></a>


<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="assets/lib/easing/easing.min.js"></script>
<script src="assets/lib/waypoints/waypoints.min.js"></script>
<script src="assets/lib/counterup/counterup.min.js"></script>
<script src="assets/lib/owlcarousel/owl.carousel.min.js"></script>

<!-- Template Javascript -->
<script src="assets/js/main.js"></script>
</body>
</html>
