<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="vi">

<head>
    <meta charset="UTF-8">
    <title>Slowly Cake</title>
    <link rel="stylesheet" href="assets/css/header.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"
          integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link href="assets/img/favicon.ico" rel="icon">
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
                    <img src="assets/img/logo.png" alt="Logo" height="60" width="60" class="logo-img"/>
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
                        <input type="text" class="dropdown-item" placeholder="Tìm kiếm sản phẩm...">
                        <i class="fa-solid fa-magnifying-glass"></i>
                    </div>
                </li>

                <!-- Icon for Cart -->
                <li class="icon-item">
                    <a href="<c:url value="shoppingCart.jsp"/>"><i class="fa-solid fa-cart-shopping"></i></a>
                </li>

                <!-- Icon for User Login/Register -->
<%--                <li class="icon-item dropdown">--%>
<%--                    <i class="fa-solid fa-bars" data-bs-toggle="dropdown" aria-expanded="false"></i>--%>
<%--                    <div class="dropdown-menu login-signin">--%>
<%--                        <a href="signUp.jsp">--%>
<%--                            <button class="setbutton signin">--%>
<%--                                <i class="fa-solid fa-person"></i>--%>
<%--                                <span class="btn-content">Đăng ký </span>--%>
<%--                            </button>--%>
<%--                        </a>--%>
<%--                        <a href="login.jsp">--%>
<%--                            <button class="setbutton login">--%>
<%--                                <i class="fa-solid fa-right-to-bracket"></i>--%>
<%--                                <span class="btn-content">Đăng nhập</span>--%>
<%--                            </button>--%>
<%--                        </a>--%>
<%--                    </div>--%>
<%--                </li>--%>
                <li class="icon-item dropdown">
                    <i class="fa-solid fa-bars" data-bs-toggle="dropdown" aria-expanded="false"></i>
                    <div class="dropdown-menu login-signin">
                        <c:choose>
                            <!-- If user is logged in, show logout option -->
                            <c:when test="${not empty sessionScope.userName}">
                                <span>Chào, ${sessionScope.userName}</span>
                                <a href="logout.jsp">
                                    <button class="setbutton logout">
                                        <i class="fa-solid fa-right-from-bracket"></i>
                                        <span class="btn-content">Đăng xuất</span>
                                    </button>
                                </a>
                            </c:when>
                            <!-- If user is not logged in, show login and signup options -->
                            <c:otherwise>
                                <a href="signUp.jsp">
                                    <button class="setbutton signin">
                                        <i class="fa-solid fa-person"></i>
                                        <span class="btn-content">Đăng ký</span>
                                    </button>
                                </a>
                                <a href="login.jsp">
                                    <button class="setbutton login">
                                        <i class="fa-solid fa-right-to-bracket"></i>
                                        <span class="btn-content">Đăng nhập</span>
                                    </button>
                                </a>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js"
        integrity="sha512-2rNj2KJ+D8s1ceNasTIex6z4HWyOnEYLVC3FigGOmyQCZc2eBXKgOxQmo3oKLHyfcj53uz4QMsRCWNbLd32Q1g=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</body>

</html>