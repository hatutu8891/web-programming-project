<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Slowly Cake</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="assets/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/shoppingCart.css" rel="stylesheet">
</head>
<body>

<div id="shopping-cart">
    <%--  header cart--%>
    <div class="header">
        <h1 class="text-center mb-4">Giỏ Hàng Của Bạn</h1>
<%--        <div class="container">--%>
<%--            <div class="frame-cart">--%>
<%--                <div class="logo">--%>
<%--                    <img src="<c:url value='/assets/img/logo_cake.png'/>" alt="Logo" height="60" width="60"--%>
<%--                         class="logo-img"/>--%>
<%--                    <h1 class="logo-title">SlowlyCake</h1>--%>
<%--                </div>--%>
<%--                <div class="cart-title">--%>
<%--                    <h1 class="">Giỏ hàng</h1>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
    </div>


    <div class="cart-items container">
        <table class="cart-table">
            <thead>
            <tr>
                <th><input type="checkbox" class="click-all-checkbox"></th>
                <th>Sản Phẩm</th>
                <th>Đơn Giá</th>
                <th>Số Lượng</th>
                <th>Số Tiền</th>
                <th>Thao Tác</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="cp" items="${sessionScope.cart.list}"></c:forEach>
            <tr class="product-row">
                <td><input type="checkbox"></td>
                <td>
                    <img src="${cp.img}" alt="Product" class="product-image">
                    <div class="product-info">
                        <p class="product-name">${cp.name}</p>
                    </div>
                </td>
                <td>
                    <span class="original-price">${cp.price} VND</span>
                    <!--                    <span class="discounted-price">₫25.000</span>-->
                </td>
                <td>
                    <div class="quantity-control">
                        <button class="quantity-btn" id="decrease">-</button>
                        <input type="number" value="${cp.quantity}" class="quantity-input" id="quantity" min="1">
                        <button class="quantity-btn" id="increase">+</button>
                    </div>
                </td>
                <td>${cp.quantity*cp.price}</td>
                <td>
                    <a href="del-cart?pid=${cp.id}">
                        <button class="btn btn-danger">Xóa</button>
                    </a>
                    <a href="#" class="similar-link">Tìm sản phẩm tương tự</a>
                </td>
            </tr>
            </tbody>
        </table>
    </div>

<%--    <div class="d-flex justify-content-between" style="background-color: #fff; width: 1200px ; height: 100px;box-shadow: 0 -2px 10px rgba(0, 0, 0, 0.1); z-index: 999;position: sticky;--%>
<%--      bottom: 0;">--%>
        <div class="d-flex justify-content-between align-items-center fixed-bottom p-3" style="background-color: #fff; box-shadow: 0 -2px 10px rgba(0, 0, 0, 0.1); width: 100%; bottom: 0;">
        <div>
            <h4>Tổng tiền: <span id="total">${sessionScope.cart.total} VND</span></h4>
        </div>
        <div>
            <button class="btn btn-warning">Tiếp tục mua sắm</button>
            <button class="btn btn-success">Tiến hành thanh toán</button>
        </div>
    </div>
</div>

<script src="assets/js/shoppingCart.js"></script>
</body>
</html>
