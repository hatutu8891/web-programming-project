<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Đăng ký tài khoản</title>
  <!-- Favicon -->
  <link href="assets/img/favicon.ico" rel="icon">
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="assets/css/login.css">
</head>
<body class="d-flex justify-content-center align-items-center">
<div class="signup-container">
  <img src="assets/img/logo.png" alt="Logo" class="logo">
  <h2>Trang Đăng Ký</h2>
  <form action="register" method="POST" id="signupForm">
    <div class="form-group">
      <label for="username">Tên đăng nhập:</label>
      <input type="text" name="username" class="form-control" id="username" required placeholder="Nhập tên tài khoản">
    </div>
    <div class="form-group">
      <label for="uname">Tên:</label>
      <input type="text" name="uname" class="form-control" id="uname" required placeholder="Nhập tên">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" name="email" class="form-control" id="email" required placeholder="Nhập email">
    </div>
    <div class="form-group">
      <label for="phoneNum">Số điện thoại:</label>
      <input type="text" name="phoneNum" class="form-control" id="phoneNum" required placeholder="Nhập số điện thoại">
    </div>
    <div class="form-group">
      <label for="address">Địa chỉ:</label>
      <input type="text" name="address" class="form-control" id="address" required placeholder="Nhập địa chỉ">
    </div>
    <div class="form-group">
      <label for="password">Mật khẩu:</label>
      <input type="password" name="password" class="form-control" id="password" required placeholder="Nhập mật khẩu">
    </div>
    <div class="form-group">
      <label for="confirmPassword">Xác nhận mật khẩu:</label>
      <input type="password" name="confirmPassword" class="form-control" id="confirmPassword" required placeholder="Nhập lại mật khẩu">
    </div>

    <button type="submit" class="btn btn-custom btn-block">Đăng ký</button>
  </form>
  <div id="errorMessage" class="alert alert-danger mt-3" style="display: none;"></div>
  <div class="text-center mt-3">
    <p>Đã có tài khoản? <a href="login.jsp">Đăng nhập</a></p>
  </div>
  <a href="index.jsp" class="back-arrow">
    <img src="assets/img/arrow-back.svg" alt="Quay về" />
  </a>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
