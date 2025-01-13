<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi">

<head>
    <meta charset="UTF-8">
    <title>Slowly Cake</title>
<%--    <link rel="stylesheet" href="../assets/css/header.css">--%>
    <link href="<c:url value='/assets/css/header.css'/>" rel="stylesheet">
<%--    <link rel="stylesheet" href="../assets/css/style.css">--%>
    <link href="<c:url value='/assets/css/style.css'/>" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"
          integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="<c:url value='/assets/css/bootstrap.min.css'/>">
    <link href="<c:url value='/assets/img/favicon.ico'/>" rel="icon">
    <!--    <link rel="stylesheet" href="../scss/bootstrap.scss">-->

</head>

<body>
<div id="header">
    <div class="container">
        <div class="frame-left-header">
            <div class="content-frame-left">
                <div class="social-net-name"><a href="https://facebook.com" target="facebook.com">Facebook</a></div>
                <div class="social-net-name"><a href="https://instagram.com" target="instagram.com">Instagram</a></div>
                <div class="social-net-name"><a href="https://x.com" target="x.com">Twitter</a></div>
            </div>
        </div>
        <div class="frame-logo">
            <div class="border-frame-logo">
                <div class="logo">
                    <img src="<c:url value='/assets/img/logo_cake.png'/>" alt="Logo" height="60" width="60" class="logo-img"/>
                    <h1 class="logo-title">SlowlyCake</h1>
                </div>
            </div>
        </div>


        <div class="frame-right-header">
            <ul class="icon-function-frame">
                <!-- Icon for Search -->
                <li class="icon-item dropdown">
                    <i class="fa-solid fa-magnifying-glass" data-bs-toggle="dropdown" aria-expanded="false"></i>
                    <div class="dropdown-menu search-box">
                        <input type="text" id="searchQuery" class="dropdown-item" placeholder="Tìm kiếm sản phẩm...">
                        <i onclick="search()" class="fa-solid fa-magnifying-glass"></i>
                    </div>
                </li>

                <!-- Icon for Cart -->
                <li class="icon-item">
                    <i class="fa-solid fa-cart-shopping"></i>
                </li>

                <!-- Icon for User Login/Register -->
                <li class="icon-item dropdown">
                    <i class="fa-solid fa-bars" data-bs-toggle="dropdown" aria-expanded="false"></i>
                    <div class="dropdown-menu login-signin">
                        <a href="<c:url value='/dynamic/auth/signUp.html'/>">
                            <button class="setbutton signin">
                                <i class="fa-solid fa-person"></i>
                                <span class="btn-content">Đăng ký</span>
                            </button>
                        </a>
                        <a href="<c:url value='/dynamic/auth/login.html'/>">
                            <button class="setbutton login">
                                <i class="fa-solid fa-right-to-bracket"></i>
                                <span class="btn-content">Đăng nhập</span>
                            </button>
                        </a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js"
        integrity="sha512-2rNj2KJ+D8s1ceNasTIex6z4HWyOnEYLVC3FigGOmyQCZc2eBXKgOxQmo3oKLHyfcj53uz4QMsRCWNbLd32Q1g=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script>
    function search() {
        var query = document.getElementById("searchQuery").value;
        if(query) {
            window.location.href = "/search?query=" + encodeURIComponent(query);
        }
    }
</script>

</body>

</html>