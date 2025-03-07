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
    <link href="assets/css/header.css" rel="stylesheet">
</head>
<body>
<%@ include file="shared/header.jsp" %>
<%@ include file="shared/nav.jsp" %>

<!-- Hero Start -->
<div class="container-fluid bg-primary py-5 mb-5 hero-header">
    <div class="container py-5">
        <div class="row justify-content-start">
            <div class="col-lg-8 text-center text-lg-start">
                <h1 class="font-secondary text-primary mb-4">Siêu hấp dẫn</h1>
                <h1 class="display-1 text-uppercase text-white mb-4">SlowlyCake</h1>
                <h1 class="text-uppercase text-white">Top 1 server Thủ Đức</h1>
                <div class="d-flex align-items-center justify-content-center justify-content-lg-start pt-5">
                    <a href="about.html" class="btn btn-primary border-inner py-3 px-5 me-5">Xem Thêm</a>
                    <button type="button" class="btn-play" data-bs-toggle="modal"
                            data-src="https://www.youtube.com/embed/HTXB6flODww" data-bs-target="#videoModal">
                        <span></span>
                    </button>
                    <h5 class="font-weight-normal text-white m-0 ms-4 d-none d-sm-block">Xem Video</h5>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Hero End -->

<!-- Video Modal Start -->
<div class="modal fade" id="videoModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content rounded-0">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Video YouTube</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <!-- 16:9 aspect ratio -->
                <div class="ratio ratio-16x9">
                    <iframe class="embed-responsive-item" src="" id="video" allowfullscreen
                            allowscriptaccess="always" allow="autoplay"></iframe>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Video Modal End -->

<!-- About Start -->
<div class="container-fluid pt-5">
    <div class="container">
        <div class="section-title position-relative text-center mx-auto mb-5 pb-3" style="max-width: 600px;">
            <h2 class="text-primary font-secondary">Về Chúng tôi</h2>
            <h1 class="display-4 text-uppercase">Chào mừng đến với SlowlyCake</h1>
        </div>
        <div class="row gx-5">
            <div class="col-lg-5 mb-5 mb-lg-0" style="min-height: 400px;">
                <div class="position-relative h-100">
                    <img class="position-absolute w-100 h-100" src="assets/img/about.jpg"
                         style="object-fit: cover;" alt="">
                </div>
            </div>
            <div class="col-lg-6 pb-5">
                <h4 class="mb-4">Nơi sự kiên nhẫn và chú ý đến từng chi tiết nhỏ sẽ mang lại những sản phẩm tuyệt
                    vời nhất
                </h4>
                <p class="mb-5">Bằng việc dành thời gian chăm chút cho từng sản phẩm, chúng tôi đảm bảo mỗi chiếc
                    bánh đều là sự bùng nổ về vị giác, khiến bạn phải sống chậm lại và thưởng thức từng miếng.
                </p>
                <div class="row g-5">
                    <div class="col-sm-6">
                        <div class="d-flex align-items-center justify-content-center bg-primary border-inner mb-4"
                             style="width: 90px; height: 90px;">
                            <i class="fa fa-heartbeat fa-2x text-white"></i>
                        </div>
                        <h4 class="text-uppercase">100% Lành mạnh</h4>
                        <p class="mb-0">Chúng tôi luôn lựa chọn cẩn thận các nguyên liệu tự nhiên và tươi nhất
                            để tạo ra những chiếc bánh mà bạn có thể thưởng thức thoải mái.
                        </p>
                    </div>
                    <div class="col-sm-6">
                        <div class="d-flex align-items-center justify-content-center bg-primary border-inner mb-4"
                             style="width: 90px; height: 90px;">
                            <i class="fa fa-award fa-2x text-white"></i>
                        </div>
                        <h4 class="text-uppercase">Chất lượng</h4>
                        <p class="mb-0">Chất lượng là trong tâm của chúng tôi. Mỗi chiếc bánh đều được làm theo tiêu
                            chuẩn nghiêm ngặt để đảm bảo đáp ứng các tiêu chuẩn cao nhất.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- About End -->

<!-- Offer Start -->
<div class="container-fluid bg-offer my-5 py-5">
    <div class="container py-5">
        <div class="row gx-5 justify-content-center">
            <div class="col-lg-7 text-center">
                <div class="section-title position-relative text-center mx-auto mb-4 pb-3"
                     style="max-width: 600px;">
                    <h2 class="text-primary font-secondary">Món mới ra mắt</h2>
                    <h1 class="display-4 text-uppercase text-white">Bánh muffin chocolate</h1>
                </div>
                <p class="text-white mb-4">Được làm với Chocolate cao cấp, những chiếc bánh muffin này sẽ thỏa mãn vị
                    giác của bạn, kể cả người khó tính nhất.</p>
                <a href="" class="btn btn-primary border-inner py-3 px-5 me-3">Mua Ngay</a>
                <a href="" class="btn btn-dark border-inner py-3 px-5">Đọc Thêm</a>
            </div>
        </div>
    </div>
</div>
<!-- Offer End -->

<!-- Products Start -->
<div class="container-fluid about py-5">
    <div class="container">
        <div class="section-title position-relative text-center mx-auto mb-5 pb-3" style="max-width: 600px;">
            <h2 class="text-primary font-secondary">Sản Phẩm</h2>
            <h1 class="display-4 text-uppercase">Khám phá các loại bánh khác nhau</h1>
        </div>
        <div class="tab-class text-center">
            <ul class="nav nav-pills d-inline-flex justify-content-center bg-dark text-uppercase border-inner p-4 mb-5">
                <li class="nav-item">
                    <a class="nav-link text-white active" data-bs-toggle="pill" href="#tab-1">Bánh kem</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" data-bs-toggle="pill" href="#tab-2">Bánh Cưới</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" data-bs-toggle="pill" href="#tab-3">Bánh đặt riêng</a>
                </li>
            </ul>
            <div class="tab-content">
                <div id="tab-1" class="tab-pane fade show p-0 active">
                    <div class="row g-3">
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/cake1.jpg"
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">120k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh kem 15cm</h5>
                                    <span>Hoàn hảo cho một buổi họp mặt thân mật với người thân từ 2 đến 3
                                            người</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/cake2.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">200k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh kem 18cm</h5>
                                    <span>Lý tưởng cho một bữa tiệc ấm cúng với bạn bè thân thiết từ 3 đến 4
                                            người</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/cake3.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">300k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh kem 20cm</h5>
                                    <span>Được thiết kế cho một bữa tiệc nhỏ cùng người thân từ 4 đến 6 người thưởng
                                            thức</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/cake4.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">500k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh kem 25cm</h5>
                                    <span>Hoàn hảo cho buổi tiệc lớn, có thể dễ dàng phục vụ từ 8 đến 10
                                            người</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/cake5.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">600k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh kem 30cm</h5>
                                    <span>Phù hợp cho những buổi tiệc từ 10 đến 12 người, đảm bảo tất cả người dự
                                            tiệc đều có phần</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/cake6.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">1200k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh kem hai tầng</h5>
                                    <span>Điểm nhấn tuyệt đẹp cho sinh nhật, đám cưới hoặc bất kỳ dịp đặc biệt
                                            nào</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div id="tab-2" class="tab-pane fade show p-0">
                    <div class="row g-3">
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/wedding_cake1.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">3500k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh cổ điển</h5>
                                    <span>Lựa chọn phổ biến nhất với thiết kế luôn hợp thời, thường được trang trí
                                            với hoa tươi</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/wedding_cake2.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">3200k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh trần</h5>
                                    <span>Mộc mạc và tối giản với nhiều lớp bánh lộ ra ngoài, được bao phủ bởi đường
                                            bột và trái cây tươi</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/wedding_cake3.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">4000k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh kem bơ</h5>
                                    <span>Mềm mịn và béo ngậy, dành cho các cặp đôi thích nhiều chi tiết và màu sắc
                                            sặc sỡ</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/wedding_cake4.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">Liên hệ</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh Fondant</h5>
                                    <span>Lớp kem phủ sang trọng được làm tỉ mỉ và kỳ công, có thể tạo thành nhiều
                                            kiểu dáng khác nhau</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/wedding_cake5.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">4200k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh thảo mộc</h5>
                                    <span>Được trang trí với hoa tươi hoặc hoa ăn được, dành cho các cặp đôi yêu
                                            thiên nhiên</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/wedding_cake6.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">5000k</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh Chocolate</h5>
                                    <span>Dành cho cặp đôi yêu thích Chocolate, thường đi kèm với dâu tây hoặc vàng
                                            lá</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div id="tab-3" class="tab-pane fade show p-0">
                    <div class="row g-3">
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/custom_cake1.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">Liên hệ</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh tinh thể</h5>
                                    <span>Mô phỏng theo hình dạng đặc biệt của tinh thể đá quý, tạo sự độc đáo và
                                            bắt mắt</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/custom_cake2.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">Liên hệ</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Drip Cake</h5>
                                    <span>Có hiệu ứng kem nhỏ giọt bóng bẩy, thường được phủ kẹo hoặc hoa
                                            tươi</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/custom_cake3.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">Liên hệ</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh điêu khắc</h5>
                                    <span>Được tạo thành nhiều hình dạng khác nhau như động vật, đồ vật hay nhân
                                            vật</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/custom_cake4.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">Liên hệ</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh màu nước</h5>
                                    <span>Hiệu ứng màu nước của bánh mang đến nét mềm mại và nghệ thuật cho bữa
                                            tiệc</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/custom_cake5.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">Liên hệ</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh ombre</h5>
                                    <span>Có nhiều lớp màu chuyển tiếp, tạo nên vẻ ngoài bắt mắt cho bánh</span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="d-flex h-100">
                                <div class="flex-shrink-0">
                                    <img class="img-fluid" src="assets/img/custom_cake6.png" alt=""
                                         style="width: 150px; height: 85px;">
                                    <h4 class="bg-dark text-primary p-2 m-0">Liên hệ</h4>
                                </div>
                                <div
                                        class="d-flex flex-column justify-content-center text-start bg-secondary border-inner px-4">
                                    <h5 class="text-uppercase">Bánh ánh kim</h5>
                                    <span>Được trang trí bằng chi tiết kim loại như vàng lá, tạo thêm nét sang trọng
                                            và tinh tế</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="container-fluid service position-relative px-5 mt-5" style="margin-bottom: 135px;">
    <div class="container">
        <div class="row g-5">
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <h4 class="text-uppercase mb-3">Bánh Kem</h4>
                    <p>Lựa chọn tuyệt vời cho bất kỳ bữa tiệc nào của bạn</p>
                    <a class="text-uppercase text-dark" href="">Đặt ngay <i class="bi bi-arrow-right"></i></a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <h4 class="text-uppercase mb-3">Bánh cưới</h4>
                    <p>Tạo thêm điểm nhấn cho ngày trọng đại của bạn</p>
                    <a class="text-uppercase text-dark" href="">Đặt ngay <i class="bi bi-arrow-right"></i></a>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="bg-primary border-inner text-center text-white p-5">
                    <h4 class="text-uppercase mb-3">Bánh đặt riêng</h4>
                    <p>Tùy chỉnh theo đúng yêu cầu và sở thích cụ thể của bạn</p>
                    <a class="text-uppercase text-dark" href="">Đặt ngay <i class="bi bi-arrow-right"></i></a>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="container-fluid py-5">
    <div class="container">
        <div class="section-title position-relative text-center mx-auto mb-5 pb-3" style="max-width: 600px;">
            <h2 class="text-primary font-secondary">Đánh giá</h2>
            <h1 class="display-4 text-uppercase">Khách hàng của chúng tôi nói gì!!!</h1>
        </div>
        <div class="testimonial-item bg-dark text-white border-inner p-4">
            <div class="d-flex align-items-center mb-3">
                <img class="img-fluid flex-shrink-0" src="assets/img/review1.jpg"
                     style="width: 60px; height: 60px;">
                <div class="ps-3">
                    <h4 class="text-primary text-uppercase mb-1">hatutu8891</h4>
                    <span>Youtuber ẩm thực</span>
                </div>
            </div>
            <p class="mb-0">Bánh ở đây thực sự tuyệt vời! Cách trình bày cũng rất đẹp mắt. Mọi người nên thử bánh
                muffin chocolate mới ra mắt
            </p>
        </div>
        <div class="testimonial-item bg-dark text-white border-inner p-4">
            <div class="d-flex align-items-center mb-3">
                <img class="img-fluid flex-shrink-0" src="assets/img/review2.png"
                     style="width: 60px; height: 60px;">
                <div class="ps-3">
                    <h4 class="text-primary text-uppercase mb-1">aigoo404</h4>
                    <span>Streamer</span>
                </div>
            </div>
            <p class="mb-0">Tôi đã đặt 1 bánh cho sinh nhật của bạn gái và nó vượt ngoài mong đợi của tôi. Thiết kế
                đỉnh của chóp và hương vị rất ảo ma!
            </p>
        </div>
        <div class="testimonial-item bg-dark text-white border-inner p-4">
            <div class="d-flex align-items-center mb-3">
                <img class="img-fluid flex-shrink-0" src="assets/img/review3.png"
                     style="width: 60px; height: 60px;">
                <div class="ps-3">
                    <h4 class="text-primary text-uppercase mb-1">Tranthanhhai104</h4>
                    <span>Nhiếp ảnh gia</span>
                </div>
            </div>
            <p class="mb-0">Bánh của họ chưa bao giờ làm tôi thất vọng. Nhân viên rất thân thiện và hiếu khách.
                10/10
            </p>
        </div>
        <div class="testimonial-item bg-dark text-white border-inner p-4">
            <div class="d-flex align-items-center mb-3">
                <img class="img-fluid flex-shrink-0" src="assets/img/review4.jpg"
                     style="width: 60px; height: 60px;">
                <div class="ps-3">
                    <h4 class="text-primary text-uppercase mb-1">Th4iTh00ng</h4>
                    <span>Nhân viên văn phòng</span>
                </div>
            </div>
            <p class="mb-0">Cả tôi và bạn gái tôi đều thích chỗ này. Bánh rất ngon và không gian quán cũng rất đẹp.
                Rất phù hợp cho các buổi hẹn hò
            </p>
        </div>
    </div>
</div>


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
<script src="assets/js/header.js"></script>
<script src="assets/js/loadFooter.js"></script>
<script src="assets/js/loadNav.js"></script>
<script src="assets/js/main.js"></script>
</body>
</html>