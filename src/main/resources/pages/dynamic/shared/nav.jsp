<!DOCTYPE html>
<html lang="vi">

<head>
  <meta charset="UTF-8">
  <title>Slowly Cake</title>
  <style>
    #nav {
      position: sticky;
      top: 0;
      /* Giữ thanh điều hướng ở trên cùng */
      z-index: 99;
      /* Đảm bảo thanh điều hướng luôn nổi lên trên các phần tử khác */
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }
  </style>
  <link rel="stylesheet" href="assets/css/style.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"
    integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link href="assets/images/favicon.ico" rel="icon">
</head>

<body>
  <div id="nav">
    <div class="nav-bar">
      <nav class="navbar navbar-expand-lg bg-dark navbar-dark shadow-sm py-3 py-lg-0 px-3 px-lg-0">
        <a href="index.html" class="navbar-brand d-block d-lg-none">
          <h1 class="m-0 text-uppercase text-white"><i class="fa fa-birthday-cake fs-1 text-primary me-3"></i>CakeZone
          </h1>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
          <div class="navbar-nav ms-auto mx-lg-auto py-0">
            <a id="index" href="index.html" class="nav-item nav-link">Trang Chủ</a>
            <a id="menu" href="menu.html" class="nav-item nav-link">Sản Phẩm</a>
            <a id="service" href="service.html" class="nav-item nav-link">Dịch vụ</a>
            <a id="contact" href="contact.html" class="nav-item nav-link">Liên Hệ</a>
          </div>
        </div>
      </nav>
    </div>
  </div>
</body>

</html>