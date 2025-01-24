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
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- Template Stylesheet -->
    <link href="assets/css/style.css" rel="stylesheet">
</head>
<body>
<%@ include file="/shared/header.jsp" %>
<%@ include file="/shared/nav.jsp" %>
<div class="container-fluid bg-dark bg-img p-5 mb-5">
    <div class="row">
        <div class="col-12 text-center">
            <h1 class="display-4 text-uppercase text-white">Liên hệ</h1>
            <a href="index.jsp">Trang chủ</a>
            <i class="fa-solid fa-arrow-right text-primary px-2"></i>
            <a href="contact.jsp">Liên hệ</a>
        </div>
    </div>
</div>
<!-- Page Header End -->
<div>
    <center>
        <h1>Liên hệ với chúng tôi để đặt hàng</h1>
    </center>
</div>
<!-- Contact Start -->
<div class="container-fluid contact position-relative px-5" style="margin-top: 90px;">
    <div class="container">
        <div class="row g-5 mb-5">
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <i class="bi bi-geo fs-1 text-white"></i>
                    <h6 class="text-uppercase my-2">Địa chỉ cửa hàng</h6>
                    <span>Khu phố 6, Phường Linh Trung, TP Thủ Đức</span>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <i class="bi bi-envelope-open fs-1 text-white"></i>
                    <h6 class="text-uppercase my-2">Email</h6>
                    <span>aurora80160@gmail.com</span>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <i class="bi bi-phone-vibrate fs-1 text-white"></i>
                    <h6 class="text-uppercase my-2">Điện thoại đặt hàng</h6>
                    <span>+84 0343 249 104</span>
                </div>
            </div>
        </div>
        <hr style="border: 1px solid white;">
        <div>
            <h2 style="color: white;">
                <center>
                    Bạn cũng có thể góp ý với chúng tôi qua email
                </center>
            </h2>
            <br>
        </div>
        <div class="row justify-content-center">
            <div class="col-lg-6">
                <form id="contactForm" onsubmit="showConfirmation(event)" action="${pageContext.request.contextPath}/contact" method="post">
                    <div class="row g-3">
                        <div class="col-sm-6"><input type="text" class="form-control bg-light border-0 px-4"
                                                     placeholder="Tên của bạn" name="name" style="height: 55px;"
                                                     required></div>
                        <div class="col-sm-6"><input type="email" class="form-control bg-light border-0 px-4"
                                                     placeholder="Email của bạn" name="email" style="height: 55px;"
                                                     required></div>
                        <div class="col-sm-12"><input type="text" class="form-control bg-light border-0 px-4"
                                                      placeholder="Tiêu đề" name="subject" style="height: 55px;"
                                                      required></div>
                        <div class="col-sm-12"><textarea class="form-control bg-light border-0 px-4 py-3" rows="4"
                                                         placeholder="Nội dung" name="message" required></textarea>
                        </div>
                        <div class="col-sm-12">
                            <button class="btn btn-primary border-inner w-100 py-3" type="submit">Gửi tin nhắn</button>
                        </div>
                    </div>
            </div>
        </div>
    </div>
</div>
<!-- Contact End -->
<%@ include file="shared/footer.jsp" %>

<a href="#" class="btn btn-primary border-inner py-3 fs-4 back-to-top"><i class="bi bi-arrow-up"></i></a>

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="assets/lib/easing/easing.min.js"></script>
<script src="assets/lib/waypoints/waypoints.min.js"></script>
<script src="assets/lib/counterup/counterup.min.js"></script>
<script src="assets/lib/owlcarousel/owl.carousel.min.js"></script>

<!-- Template Javascript -->
<script src="assets/js/header.js"></script>
<script src="assets/js/loadFooter.js"></script>
<script src="assets/js/loadNav.js"></script>
<script src="assets/js/main.js"></script>
<!--simple form script-->
<script>
    function showConfirmation(event) {
        event.preventDefault();

        // Collect form data
        const formData = new FormData(document.getElementById('contactForm'));

        // Send the data using fetch (AJAX)
        fetch('/${contextPath}/contact', {
            method: 'POST',
            body: formData
        })
            .then(response => response.json())
            .then(data => {
                if (data.status === "Cảm ơn bạn đã góp ý!") {
                    alert(data.message); // Show confirmation message
                } else {
                    alert("Đã có lỗi xảy ra.");
                }
            })
            .catch(error => {
                console.error('Error:', error);
                alert("Vui lòng thử lại sau");
            });
    }
</script>

</body>
</html>
