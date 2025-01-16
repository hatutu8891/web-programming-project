<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">


    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Oswald:wght@500;600;700&family=Pacifico&display=swap"
          rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link rel="stylesheet" href="<c:url value='/assets/css/bootstrap.min.css'/>">

    <!-- Template Stylesheet -->
    <link rel="stylesheet" href="<c:url value='/assets/css/style.css'/>">
    <link rel="stylesheet" href="<c:url value='/assets/css/menu.css'/>">

</head>
<body>
<div class="tab-class text-center">
    <ul class="nav nav-pills d-inline-flex justify-content-center bg-dark text-uppercase border-inner p-4 mb-5">
        <li class="nav-item">
            <a class="nav-link text-white active" data-bs-toggle="pill" href="#tab-1">Bánh gato</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" data-bs-toggle="pill" href="#tab-2">Bánh Tiramisu</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" data-bs-toggle="pill" href="#tab-3">Bánh Mousse</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" data-bs-toggle="pill" href="#tab-4">Bánh chủ đề</a>
        </li>
    </ul>
    <div class="show-product">
        <aside class="sidebar border-inner text-uppercase p-4">
            <h4 class="sidebar-title pb-2">Gợi ý cho bạn</h4>
            <ul class="text-uppercase">
                <li class="nav-item"><a href="#tab-5" class="nav-link">Phổ biến</a></li>
                <li class="nav-item"><a href="#tab-6" class="nav-link">Sản phẩm mới</a></li>
                <li class="nav-item"><a href="#tab-7" class="nav-link">Bán chạy</a></li>
            </ul>
        </aside>
        <form class="search-container" action="search">
            <input type="text" class="search-input" placeholder="Bạn muốn tìm bánh gì?">
            <button class="search-button">
                <i class="fa-solid fa-magnifying-glass"></i>
            </button>
        </form>
        <%@ include file="listProduct.jsp" %>
    </div>

<%--<div class="container" style="max-width: 1200px;">--%>
<%--    <div class="row">--%>
<%--        <!-- Cột trái (2/3 chiều rộng cho danh sách sản phẩm) -->--%>
<%--        <div class="col-md-8">--%>
<%--            <!-- Nhúng list.jsp vào đây -->--%>
<%--            <jsp:include page="listProduct.jsp" />--%>
<%--        </div>--%>

<%--        <!-- Cột phải (1/3 chiều rộng cho khung lọc sản phẩm) -->--%>
<%--        <div class="col-md-4">--%>
<%--            <div class="card">--%>
<%--                <div class="card-body">--%>
<%--                    <h5 class="card-title">Lọc Sản Phẩm</h5>--%>
<%--                    <!-- Các bộ lọc có thể nằm ở đây -->--%>
<%--                    <form>--%>
<%--                        <div class="mb-3">--%>
<%--                            <label for="category" class="form-label">Danh mục</label>--%>
<%--                            <select class="form-select" id="category" name="category">--%>
<%--                                <option value="">Tất cả</option>--%>
<%--                                <option value="banh-gato">Bánh Gato</option>--%>
<%--                                <option value="banh-tiramisu">Bánh Tiramisu</option>--%>
<%--                                <option value="banh-mousse">Bánh Mousse</option>--%>
<%--                            </select>--%>
<%--                        </div>--%>
<%--                        <div class="mb-3">--%>
<%--                            <label for="price" class="form-label">Giá</label>--%>
<%--                            <input type="range" class="form-range" id="price" name="price" min="0" max="100000" step="1000">--%>
<%--                        </div>--%>
<%--                        <button type="submit" class="btn btn-primary">Lọc</button>--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

<!-- Thêm liên kết đến JS của Bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
