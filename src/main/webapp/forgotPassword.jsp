<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quên Mật Khẩu</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/login.css">
</head>
<body class="d-flex justify-content-center align-items-center">
<div class="login-container">
    <h2>Quên Mật Khẩu</h2>
    <form action="forgotPassword" method="POST" id="forgotPasswordForm">
        <div class="form-group">
            <label for="email">Email của bạn:</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="Nhập email của bạn" required>
        </div>
        <button type="submit" class="btn btn-custom">Lấy lại mật khẩu</button>
    </form>
    <div class="options">
        <a href="login.jsp">Quay lại đăng nhập</a>
    </div>
</div>
</body>
</html>
