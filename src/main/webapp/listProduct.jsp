<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Liên kết với Bootstrap CSS qua CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <!-- Dòng sản phẩm, sử dụng lưới Bootstrap -->
    <div class="row">
        <!-- Sản phẩm 1 -->
        <c:forEach var="p" items="${data}">
            <div class="col-md-3 mb-3">
                <div class="card">
                    <img src="${p.img}"  style="width: 80px; height: 80px;" class="card-img-top" alt="Bánh">
                    <div class="card-body">
                        <h5 class="card-title">${p.name}</h5>
                        <p class="card-text">Mã sản phẩm: ${p.id}</p>
                        <p class="card-text">Đã bán: ${p.quantityOrdered}</p>
                        <div class="d-flex justify-content-between">
                            <a href="product?pid=${p.id}" class="btn btn-primary">CHI TIẾT</a>
                            <a href="add-cart?pid=${p.id}" class="btn btn-secondary">THÊM GIỎ HÀNG</a>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>


<!-- Liên kết với Bootstrap JS và Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>

</body>
</html>
