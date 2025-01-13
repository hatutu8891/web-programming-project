<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Trang đăng nhập cho hệ thống quản lý e-commerce">
    <title>Đăng nhập - Slowly Cake</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/assets/css/login.css">
</head>
<body class="d-flex justify-content-center align-items-center">
<div class="login-container">
    <img src="<%= request.getContextPath() %>/assets/images/logo_bánh.png" alt="Logo" class="logo">
    <h2>Đăng Nhập</h2>
    <div id="loginForm">
        <% if(request.getAttribute("error") != null) { %>
        <div class="alert alert-danger" role="alert">
            <%= request.getAttribute("error") %>
        </div>
        <% } %>

        <form action="<%= request.getContextPath() %>/login" method="post">
            <div class="form-group">
                <label for="username">Tên đăng nhập:</label>
                <input type="text" name="username" id="username" class="form-control" required placeholder="Nhập tên đăng nhập" autofocus>
            </div>

            <div class="form-group">
                <label for="password">Mật khẩu:</label>
                <input type="password" name="password" id="password" class="form-control" required placeholder="Nhập mật khẩu">
            </div>

            <div class="form-check">
                <input type="checkbox" class="form-check-input" name="rememberMe" id="rememberMe">
                <label class="form-check-label" for="rememberMe">Ghi nhớ đăng nhập</label>
            </div>

            <button type="submit" class="btn btn-custom" id="loginButton">Đăng nhập</button>
            <p id="loadingMessage" style="display:none;">Đang đăng nhập...</p>
        </form>
    </div>

    <div class="options">
        <p>Chưa có tài khoản? <a href="<%= request.getContextPath() %>/signUp.jsp">Đăng ký ngay!</a></p>
        <p><a href="<%= request.getContextPath() %>/forgotPassword.jsp">Quên mật khẩu?</a></p>
    </div>
    <a href="<%= request.getContextPath() %>/index.jsp" class="back-arrow">
        <img src="<%= request.getContextPath() %>/assets/images/arrow-back.svg" alt="Quay về" />
    </a>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</body>
</html>
