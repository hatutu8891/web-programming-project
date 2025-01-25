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

    <!-- Libraries Stylesheet -->
    <link href="assets/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="assets/css/style.css" rel="stylesheet">
</head>
<body>

<%--<div id="shopping-cart">--%>
<%--    &lt;%&ndash;  header cart&ndash;%&gt;--%>
<%--    <div class="header">--%>
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
<%--    </div>--%>


<%--    <div class="cart-items container">--%>
<%--        <table class="cart-table">--%>
<%--            <thead>--%>
<%--            <tr>--%>
<%--                <th><input type="checkbox" class="click-all-checkbox"></th>--%>
<%--                <th>Sản Phẩm</th>--%>
<%--                <th>Đơn Giá</th>--%>
<%--                <th>Số Lượng</th>--%>
<%--                <th>Số Tiền</th>--%>
<%--                <th>Thao Tác</th>--%>
<%--            </tr>--%>
<%--            </thead>--%>
<%--            <tbody>--%>
<%--            <c:forEach var="cp" items="${sessionScope.cart.list}"></c:forEach>--%>
<%--            <tr class="product-row">--%>
<%--                <td><input type="checkbox"></td>--%>
<%--                <td>--%>
<%--                    <img src="${cp.img}" alt="Product" class="product-image">--%>
<%--                    <div class="product-info">--%>
<%--                        <p class="product-name">${cp.name}</p>--%>
<%--                    </div>--%>
<%--                </td>--%>
<%--                <td>--%>
<%--                    <span class="original-price">${cp.price} VND</span>--%>
<%--                    <!--                    <span class="discounted-price">₫25.000</span>-->--%>
<%--                </td>--%>
<%--                <td>--%>
<%--                    <div class="quantity-control">--%>
<%--                        <button class="quantity-btn" id="decrease">-</button>--%>
<%--                        <input type="number" value="${cp.quantity}" class="quantity-input" id="quantity" min="1">--%>
<%--                        <button class="quantity-btn" id="increase">+</button>--%>
<%--                    </div>--%>
<%--                </td>--%>
<%--                <td>${cp.quantity*cp.price}</td>--%>
<%--                <td>--%>
<%--                    <a href="del-cart?pid=${cp.id}">--%>
<%--                        <button class="btn btn-danger">Xóa</button>--%>
<%--                    </a>--%>
<%--                    <a href="#" class="similar-link">Tìm sản phẩm tương tự</a>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            </tbody>--%>
<%--        </table>--%>
<%--    </div>--%>

<%--&lt;%&ndash;    <div class="d-flex justify-content-between" style="background-color: #fff; width: 1200px ; height: 100px;box-shadow: 0 -2px 10px rgba(0, 0, 0, 0.1); z-index: 999;position: sticky;&ndash;%&gt;--%>
<%--&lt;%&ndash;      bottom: 0;">&ndash;%&gt;--%>
<%--        <div class="d-flex justify-content-between align-items-center fixed-bottom p-3" style="background-color: #fff; box-shadow: 0 -2px 10px rgba(0, 0, 0, 0.1); width: 100%; bottom: 0;">--%>
<%--        <div>--%>
<%--            <h4>Tổng tiền: <span id="total">${sessionScope.cart.total} VND</span></h4>--%>
<%--        </div>--%>
<%--        <div>--%>
<%--            <button class="btn btn-warning">Tiếp tục mua sắm</button>--%>
<%--            <button class="btn btn-success">Tiến hành thanh toán</button>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    &lt;%&ndash;  <div class="cart-summary">&ndash;%&gt;--%>
<%--    &lt;%&ndash;    <div class="total-price">&ndash;%&gt;--%>
<%--    &lt;%&ndash;      <p>Tổng tiền</p>&ndash;%&gt;--%>
<%--    &lt;%&ndash;      <p class="price">₫ 350.000</p>&ndash;%&gt;--%>
<%--    &lt;%&ndash;    </div>&ndash;%&gt;--%>
<%--    &lt;%&ndash;    <button class="checkout-btn">Tiến hành thanh toán</button>&ndash;%&gt;--%>
<%--    &lt;%&ndash;  </div>&ndash;%&gt;--%>

<%--</div>--%>

<!-- Cart Start -->
<div class="container-fluid pt-5">
    <div class="row px-xl-5">
        <div class="col-lg-8 table-responsive mb-5">
            <table class="table table-bordered text-center mb-0">
                <thead class="bg-secondary text-dark">
                <tr>
                    <th>Products</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                    <th>Remove</th>
                </tr>
                </thead>
                <tbody class="align-middle">
                <tr>
                    <td class="align-middle"><img src="img/product-1.jpg" alt="" style="width: 50px;"> Colorful Stylish Shirt</td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle">
                        <div class="input-group quantity mx-auto" style="width: 100px;">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-minus" >
                                    <i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <input type="text" class="form-control form-control-sm bg-secondary text-center" value="1">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-plus">
                                    <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>
                    </td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle"><button class="btn btn-sm btn-primary"><i class="fa fa-times"></i></button></td>
                </tr>
                <tr>
                    <td class="align-middle"><img src="img/product-2.jpg" alt="" style="width: 50px;"> Colorful Stylish Shirt</td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle">
                        <div class="input-group quantity mx-auto" style="width: 100px;">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-minus" >
                                    <i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <input type="text" class="form-control form-control-sm bg-secondary text-center" value="1">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-plus">
                                    <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>
                    </td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle"><button class="btn btn-sm btn-primary"><i class="fa fa-times"></i></button></td>
                </tr>
                <tr>
                    <td class="align-middle"><img src="img/product-3.jpg" alt="" style="width: 50px;"> Colorful Stylish Shirt</td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle">
                        <div class="input-group quantity mx-auto" style="width: 100px;">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-minus" >
                                    <i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <input type="text" class="form-control form-control-sm bg-secondary text-center" value="1">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-plus">
                                    <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>
                    </td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle"><button class="btn btn-sm btn-primary"><i class="fa fa-times"></i></button></td>
                </tr>
                <tr>
                    <td class="align-middle"><img src="img/product-4.jpg" alt="" style="width: 50px;"> Colorful Stylish Shirt</td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle">
                        <div class="input-group quantity mx-auto" style="width: 100px;">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-minus" >
                                    <i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <input type="text" class="form-control form-control-sm bg-secondary text-center" value="1">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-plus">
                                    <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>
                    </td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle"><button class="btn btn-sm btn-primary"><i class="fa fa-times"></i></button></td>
                </tr>
                <tr>
                    <td class="align-middle"><img src="img/product-5.jpg" alt="" style="width: 50px;"> Colorful Stylish Shirt</td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle">
                        <div class="input-group quantity mx-auto" style="width: 100px;">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-minus" >
                                    <i class="fa fa-minus"></i>
                                </button>
                            </div>
                            <input type="text" class="form-control form-control-sm bg-secondary text-center" value="1">
                            <div class="input-group-btn">
                                <button class="btn btn-sm btn-primary btn-plus">
                                    <i class="fa fa-plus"></i>
                                </button>
                            </div>
                        </div>
                    </td>
                    <td class="align-middle">$150</td>
                    <td class="align-middle"><button class="btn btn-sm btn-primary"><i class="fa fa-times"></i></button></td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-lg-4">
            <form class="mb-5" action="">
                <div class="input-group">
                    <input type="text" class="form-control p-4" placeholder="Coupon Code">
                    <div class="input-group-append">
                        <button class="btn btn-primary">Apply Coupon</button>
                    </div>
                </div>
            </form>
            <div class="card border-secondary mb-5">
                <div class="card-header bg-secondary border-0">
                    <h4 class="font-weight-semi-bold m-0">Cart Summary</h4>
                </div>
                <div class="card-body">
                    <div class="d-flex justify-content-between mb-3 pt-1">
                        <h6 class="font-weight-medium">Subtotal</h6>
                        <h6 class="font-weight-medium">$150</h6>
                    </div>
                    <div class="d-flex justify-content-between">
                        <h6 class="font-weight-medium">Shipping</h6>
                        <h6 class="font-weight-medium">$10</h6>
                    </div>
                </div>
                <div class="card-footer border-secondary bg-transparent">
                    <div class="d-flex justify-content-between mt-2">
                        <h5 class="font-weight-bold">Total</h5>
                        <h5 class="font-weight-bold">$160</h5>
                    </div>
                    <button class="btn btn-block btn-primary my-3 py-3">Proceed To Checkout</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Cart End -->

<script src="assets/js/shoppingCart.js"></script>
</body>
</html>
