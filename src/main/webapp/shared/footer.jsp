<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="<c:url value='/assets/css/footer.css'/>">
    <link rel="stylesheet" href="<c:url value='/assets/css/style.css'/>">
    <link href="<c:url value='/assets/img/favicon.ico'/>" rel="icon">
    <title>Slowly Cake</title>
</head>
<body>
    <div class="container-fluid bg-img text-secondary" style="margin-top: 90px">
        <div class="container">
            <div class="row gx-5">
                <div class="col-lg-4 col-md-6 mb-lg-n5">
                    <div class="d-flex flex-column align-items-center justify-content-center text-center h-100 bg-primary border-inner p-4">
                        <a href="<c:url value='/index.jsp'/>" class="navbar-brand">

                            <h1 class="m-0 text-uppercase text-white"><i class="fa fa-birthday-cake fs-1 text-dark me-3"></i>SlowlyCake</h1>
                        </a>
                        <p class="mt-3">Chào mừng đến với SlowlyCake! <br></br>
                            Với tôn chỉ "Chậm mà chắc", chúng tôi hứa hẹn sẽ tạo ra những chiếc bánh kem ngon và đẹp mắt cho mọi dịp lễ.
                            <br></br> Hãy ghé thăm cửa hàng của chúng tôi để có những kỷ niệm khó quên.</p>
                    </div>
                </div>
                <div class="col-lg-8 col-md-6">
                    <div class="row gx-5">
                        <div class="col-lg-4 col-md-12 pt-5 mb-5">
                            <h4 class="text-primary text-uppercase mb-4">Thông tin liên hệ</h4>
                            <div class="d-flex mb-2">
                                <i class="bi bi-geo-alt text-primary me-2"></i>
                                <p class="mb-0">Khu phố 6, Phường Linh Trung, TP Thủ Đức, TP. HCM</p>
                            </div>
                            <div class="d-flex mb-2">
                                <i class="bi bi-envelope-open text-primary me-2"></i>
                                <p class="mb-0">aurora80160@gmail.com</p>
                            </div>
                            <div class="d-flex mb-2">
                                <i class="bi bi-telephone text-primary me-2"></i>
                                <p class="mb-0">+84 0343 249 104</p>
                            </div>
                            <div class="d-flex mt-4">
                                <a class="btn btn-lg btn-primary btn-lg-square border-inner rounded-0 me-2" href="https://facebook.com"><i class="fab fa-facebook-f fw-normal"></i></a>
                                <a class="btn btn-lg btn-primary btn-lg-square border-inner rounded-0 me-2" href="https://instagram.com"><i class="fab fa-instagram fw-normal"></i></a>
                                <a class="btn btn-lg btn-primary btn-lg-square border-inner rounded-0 me-2" href="https://x.com"><i class="fab fa-x-twitter fw-normal"></i></a>
                                <a class="btn btn-lg btn-primary btn-lg-square border-inner rounded-0 me-2" href="https://github.com/hatutu8891/web-programming-project"><i class="fab fa-github fw-normal"></i></a>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-12 pt-0 pt-lg-5 mb-5">
                            <h4 class="text-primary text-uppercase mb-4">Links</h4>
                            <div class="d-flex flex-column justify-content-start">
                                <a class="text-secondary mb-2" href="<c:url value='/index.jsp'/>"><i class="bi bi-arrow-right text-primary me-2"></i>Trang chủ</a>
                                <a class="text-secondary mb-2" href="#"><i class="bi bi-arrow-right text-primary me-2"></i>Về Chúng tôi</a>
                                <a class="text-secondary mb-2" href="<c:url value='/service.jsp'/>"><i class="bi bi-arrow-right text-primary me-2"></i>Dịch vụ</a>
                                <a class="text-secondary" href="<c:url value='/contact.jsp'/>"><i class="bi bi-arrow-right text-primary me-2"></i>Liên hệ</a>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-12 pt-0 pt-lg-5 mb-5">
                            <h4 class="text-primary text-uppercase mb-4">Thông báo</h4>
                            <p>Đăng ký để nhận được thông báo khi có khuyến mãi</p>
                            <form action="">
                                <div class="input-group">
                                    <input type="text" class="form-control border-white p-3" placeholder="Email của bạn">
                                    <button class="btn btn-primary">Đăng ký</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container-fluid text-secondary py-4" style="background: #111111;">
        <div class="container text-center">
            <p class="mb-0">&copy; <a class="text-white" href="#">SlowlyCake</a>
			
        </div>
    </div>
    <!-- Footer End -->
</body>
</html>