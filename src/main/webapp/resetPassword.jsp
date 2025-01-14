<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Trang đặt lại mật khẩu cho hệ thống quản lý e-commerce">
    <title>Đặt lại mật khẩu - Slowly Cake</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/assets/css/login.css">
</head>
<body class="d-flex justify-content-center align-items-center">
<div class="login-container">
    <img src="<%= request.getContextPath() %>/assets/img/logo_bánh.png" alt="Logo" class="logo">
    <h2>Đặt lại mật khẩu</h2>
    <div id="resetPasswordForm">
        <% if(request.getAttribute("error") != null) { %>
        <div class="alert alert-danger" role="alert">
            <%= request.getAttribute("error") %>
        </div>
        <% } %>

        <form action="<%= request.getContextPath() %>/resetPassword" method="post">
            <!-- Email được truyền từ link quên mật khẩu -->
            <input type="hidden" name="email" value="<%= request.getParameter("email") %>" />

            <div class="form-group">
                <label for="password">Mật khẩu mới:</label>
                <input type="password" name="password" id="password" class="form-control" required placeholder="Nhập mật khẩu mới">
            </div>

            <div class="form-group">
                <label for="confirmPassword">Xác nhận mật khẩu:</label>
                <input type="password" name="confirmPassword" id="confirmPassword" class="form-control" required placeholder="Xác nhận mật khẩu mới">
            </div>

            <button type="submit" class="btn btn-custom" id="resetButton">Cập nhật mật khẩu</button>
            <p id="loadingMessage" style="display:none;">Đang cập nhật mật khẩu...</p>
        </form>
    </div>

    <div class="options">
        <p><a href="<%= request.getContextPath() %>/login.jsp">Quay lại trang đăng nhập</a></p>
    </div>
    <a href="<%= request.getContextPath() %>/index.jsp" class="back-arrow">
        <img src="<%= request.getContextPath() %>/assets/img/arrow-back.svg" alt="Quay về" />
    </a>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
