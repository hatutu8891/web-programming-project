document.addEventListener("DOMContentLoaded", function () {
    // Tải nội dung của nav.html vào phần tử #nav trong trang HTML hiện tại
    fetch('nav.html')
        .then(response => response.text())  // Chuyển dữ liệu thành chuỗi văn bản
        .then(data => {
            // Chèn nội dung vào phần tử #nav
            document.getElementById('nav').innerHTML = data;

            // Xác định trang hiện tại bằng cách lấy tên file từ đường dẫn (path)
            const path = window.location.pathname; // Lấy đường dẫn của trang hiện tại
            const page = path.substring(path.lastIndexOf("/") + 1);  // Lấy tên file (ví dụ: index.html)

            // Tìm phần tử menu có ID trùng với tên trang và thêm lớp active
            const element = document.getElementById(page.replace('.html', ''));
            if (element) {
                element.classList.add('active');  // Thêm lớp active vào phần tử đó
            }
        })
        .catch(error => {
            console.error('Error loading nav:', error);
        });
});
