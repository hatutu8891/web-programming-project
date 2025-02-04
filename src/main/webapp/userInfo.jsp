<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Thông tin người dùng</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Oswald:wght@500;600;700&family=Pacifico&display=swap"
        rel="stylesheet">
  <style>
    body {
      margin: 0;
      padding: 0;
      color: #333;
      background-color: #f8f1e9;
    }
    .container-info {
      max-width: 900px;
      margin: 50px auto;
      background: #fff;
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }
    h1 {
      text-align: center;
      color: #2c3e50;
      font-size: 28px;
    }
    .message, .error {
      text-align: center;
      margin-top: 20px;
      font-size: 16px;
    }
    .message {
      color: #28a745;
    }
    .error {
      color: #dc3545;
    }
  </style>
</head>
<body>
<%@ include file="shared/header.jsp" %>
<%@ include file="shared/nav.jsp" %>
<div class="container-info">
  <h1>Thông tin tài khoản: ${sessionScope.auth.getHandle()}</h1>

  <div class="row">
    <!-- Cập nhật thông tin người dùng -->
    <div class="col-md-6">
      <div class="card mt-3">
        <div class="card-body">
          <h2 class="card-title">Cập nhật thông tin</h2>
          <form method="POST" action="${pageContext.request.contextPath}/updateProfile">
            <div class="form-group">
              <label for="name">Tên người dùng:</label>
              <input type="text" id="name" name="name" class="form-control" value="${sessionScope.auth.getName()}" required>
            </div>
            <div class="form-group">
              <label for="email">Email:</label>
              <input type="email" id="email" name="email" class="form-control" value="${sessionScope.auth.getEmail()}" required>
            </div>
            <div class="form-group">
              <label for="phone">Số điện thoại:</label>
              <input type="text" id="phone" name="phone" class="form-control" value="${sessionScope.auth.getPhoneNum()}" required>
            </div>
            <div class="form-group">
              <label for="address">Địa chỉ:</label>
              <input type="text" id="address" name="address" class="form-control" value="${sessionScope.auth.getAddress()}" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Lưu thay đổi</button>
          </form>
        </div>
      </div>
    </div>

    <!-- Đổi mật khẩu -->
    <div class="col-md-6">
      <div class="card mt-3">
        <div class="card-body">
          <h2 class="card-title">Đổi mật khẩu</h2>
          <form method="POST" action="${pageContext.request.contextPath}/changePassword">
            <div class="form-group">
              <label for="currentPassword">Mật khẩu hiện tại:</label>
              <input type="password" id="currentPassword" name="currentPassword" class="form-control" required>
            </div>
            <div class="form-group">
              <label for="newPassword">Mật khẩu mới:</label>
              <input type="password" id="newPassword" name="newPassword" class="form-control" required>
            </div>
            <div class="form-group">
              <label for="confirmPassword">Xác nhận mật khẩu mới:</label>
              <input type="password" id="confirmPassword" name="confirmPassword" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-danger btn-block">Đổi mật khẩu</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <!-- Nút đăng xuất -->
  <div class="form-container logout-form text-center mt-4">
    <form action="${pageContext.request.contextPath}/logout" method="GET">
      <button type="submit" class="btn btn-secondary btn-block">Đăng xuất</button>
    </form>
  </div>

  <div class="message">
    ${message != null ? message : ""}
  </div>
  <div class="error">
    ${error != null ? error : ""}
  </div>

</div>
<%@ include file="shared/footer.jsp" %>
</body>
</html>
