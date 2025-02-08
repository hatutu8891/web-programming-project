<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="vi">

<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/logo.png">
    <link rel="icon" type="image/png" href="assets/img/favicon.ico">
    <title>
        Quản lý kho
    </title>
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Oswald:wght@500;600;700&family=Pacifico&display=swap"
          rel="stylesheet">
    <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.6/css/jquery.dataTables.min.css">
    <!-- Nucleo Icons -->
    <link href="assets/css/nucleo-icons.css" rel="stylesheet"/>
    <!-- CSS Files -->
    <link href="assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>

<body data-bs-theme="dark">
<div class="wrapper">
    <div class="sidebar">
        <div class="sidebar-wrapper">
            <div class="logo">
                <a href="userInfo.jsp" class="simple-text logo-normal">
                    Xin chào <%= session.getAttribute("handle") %>
                </a>
            </div>
            <ul class="nav">
                <li>
                    <a href="adminDashboard.jsp">
                        <i class="tim-icons icon-chart-pie-36"></i>
                        <p>Bảng Điều khiển</p>
                    </a>
                </li>
                <li>
                    <a href="userManagement.jsp">
                        <i class="tim-icons icon-badge"></i>
                        <p>Quản lý người dùng</p>
                    </a>
                </li>
                <li>
                    <a href="orderManagement.jsp">
                        <i class="tim-icons icon-cart"></i>
                        <p>Quản lý đơn hàng</p>
                    </a>
                </li>
                <li class="active ">
                    <a href="storageManagement.jsp">
                        <i class="tim-icons icon-app"></i>
                        <p>Quản lý kho</p>
                    </a>
                </li>
                <li>
                    <a href="productManagement.jsp">
                        <i class="tim-icons icon-paper"></i>
                        <p>Quản lý sản phẩm</p>
                    </a>
                </li>
                <li>
                    <a href="reviewManagement.jsp">
                        <i class="tim-icons icon-pencil"></i>
                        <p>Đánh giá</p>
                    </a>
                </li>
                <li>
                    <a href="contactManagement.jsp">
                        <i class="tim-icons icon-send"></i>
                        <p>Hòm thư góp ý</p>
                    </a>
                </li>
                <li>
                    <a href="mailSubManagement.jsp">
                        <i class="tim-icons icon-email-85"></i>
                        <p>Người nhận khuyến mãi</p>
                    </a>
                </li>

            </ul>
        </div>
    </div>
    <div class="main-panel">
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-absolute navbar-transparent">
            <div class="container-fluid">
                <div class="navbar-wrapper">
                    <div class="navbar-toggle d-inline">
                        <button type="button" class="navbar-toggler">
                            <span class="navbar-toggler-bar bar1"></span>
                            <span class="navbar-toggler-bar bar2"></span>
                            <span class="navbar-toggler-bar bar3"></span>
                        </button>
                    </div>
                    <a class="navbar-brand" href="javascript:void(0)">Slowly Cake Admin</a>
                </div>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-bar navbar-kebab"></span>
                    <span class="navbar-toggler-bar navbar-kebab"></span>
                    <span class="navbar-toggler-bar navbar-kebab"></span>
                </button>
                <div class="collapse navbar-collapse" id="navigation">
                    <ul class="navbar-nav ml-auto">
                        <li class="dropdown nav-item">
                            <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                                <div class="photo">
                                    <img src="assets/img/review2.png" alt="Profile Photo">
                                </div>
                                <b class="caret d-none d-lg-block d-xl-block"></b>
                                <p class="d-lg-none">
                                    Log out
                                </p>
                            </a>
                            <ul class="dropdown-menu dropdown-navbar">
                                <li class="nav-link">
                                    <a href="userInfo.jsp" class="nav-item dropdown-item">Profile
                                    </a>
                                </li>
                                <li class="dropdown-divider"></li>
                                <li class="nav-link">
                                    <a href="<c:url value='/logout'/>" class="nav-item dropdown-item">Đăng xuất
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="separator d-lg-none"></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- End Navbar -->
        <div class="content bg-dark text-white">
            <div class="row">
                <div class="col-md-12">
                    <div class="card ">
                        <div class="card-header d-flex justify-content-between align-items-center">
                            <h4 class="card-title"> Quản lý kho</h4>
                            <button id="addBtn" class="btn btn-success">
                                <i class="tim-icons icon-simple-add"></i>
                            </button>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table id="storageTable" class="display">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Tên nguyên liệu</th>
                                        <th>Số lượng hiện tại</th>
                                        <th>Số lượng tối thiểu</th>
                                        <th>Thao tác</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!--   Core JS Files   -->
<script src="assets/js/core/jquery.min.js"></script>
<script src="assets/js/core/popper.min.js"></script>
<script src="assets/js/core/bootstrap.min.js"></script>
<script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
<!-- Chart JS -->
<script src="assets/js/plugins/chartjs.min.js"></script>
<!--  Notifications Plugin    -->
<script src="assets/js/plugins/bootstrap-notify.js"></script>
<!-- Control Center for Black Dashboard: parallax effects, scripts for the example pages etc -->
<script src="assets/js/black-dashboard.min.js?v=1.0.0"></script>
<!-- Black Dashboard DEMO methods, don't include it in your project! -->
<script src="assets/demo/demo.js"></script>
<script>
    $(document).ready(function () {
        $().ready(function () {
            $sidebar = $('.sidebar');
            $navbar = $('.navbar');
            $main_panel = $('.main-panel');

            $full_page = $('.full-page');

            $sidebar_responsive = $('body > .navbar-collapse');
            sidebar_mini_active = true;
            white_color = false;

            window_width = $(window).width();

            fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();


            $('.fixed-plugin a').click(function (event) {
                if ($(this).hasClass('switch-trigger')) {
                    if (event.stopPropagation) {
                        event.stopPropagation();
                    } else if (window.event) {
                        window.event.cancelBubble = true;
                    }
                }
            });

            $('.fixed-plugin .background-color span').click(function () {
                $(this).siblings().removeClass('active');
                $(this).addClass('active');

                var new_color = $(this).data('color');

                if ($sidebar.length != 0) {
                    $sidebar.attr('data', new_color);
                }

                if ($main_panel.length != 0) {
                    $main_panel.attr('data', new_color);
                }

                if ($full_page.length != 0) {
                    $full_page.attr('filter-color', new_color);
                }

                if ($sidebar_responsive.length != 0) {
                    $sidebar_responsive.attr('data', new_color);
                }
            });

            $('.switch-sidebar-mini input').on("switchChange.bootstrapSwitch", function () {
                var $btn = $(this);

                if (sidebar_mini_active == true) {
                    $('body').removeClass('sidebar-mini');
                    sidebar_mini_active = false;
                    blackDashboard.showSidebarMessage('Sidebar mini deactivated...');
                } else {
                    $('body').addClass('sidebar-mini');
                    sidebar_mini_active = true;
                    blackDashboard.showSidebarMessage('Sidebar mini activated...');
                }

                // we simulate the window Resize so the charts will get updated in realtime.
                var simulateWindowResize = setInterval(function () {
                    window.dispatchEvent(new Event('resize'));
                }, 180);

                // we stop the simulation of Window Resize after the animations are completed
                setTimeout(function () {
                    clearInterval(simulateWindowResize);
                }, 1000);
            });

            $('.switch-change-color input').on("switchChange.bootstrapSwitch", function () {
                var $btn = $(this);

                if (white_color == true) {

                    $('body').addClass('change-background');
                    setTimeout(function () {
                        $('body').removeClass('change-background');
                        $('body').removeClass('white-content');
                    }, 900);
                    white_color = false;
                } else {

                    $('body').addClass('change-background');
                    setTimeout(function () {
                        $('body').removeClass('change-background');
                        $('body').addClass('white-content');
                    }, 900);

                    white_color = true;
                }


            });

            $('.light-badge').click(function () {
                $('body').addClass('white-content');
            });

            $('.dark-badge').click(function () {
                $('body').removeClass('white-content');
            });
        });
    });
</script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.datatables.net/1.13.6/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script>
    $(document).ready(function () {
        function loadIngredient() {
            $.get("storageManagementServlet", function (data) {
                let table = $('#storageTable').DataTable();
                table.clear();

                data.forEach(ingredient => {
                    let orderClass = ingredient.stockQuantity < ingredient.reqQuantity ? "btn-warning" : "btn-primary";

                    table.row.add([
                        ingredient.id,
                        ingredient.name,
                        ingredient.stockQuantity,
                        ingredient.reqQuantity,
                        `<button class="btn btn-success btn-sm edit-btn" data-id="${ingredient.id}" data-name="${ingredient.name}" data-stock="${ingredient.stockQuantity}" data-req="${ingredient.reqQuantity}">
                            <i class="tim-icons icon-pencil"></i>
                        </button>
                        <button class="btn ${orderClass} btn-sm order-btn">
                            <i class="tim-icons icon-cart"></i>
                        </button>
                        <button class="btn btn-danger btn-sm delete-btn" data-id="${ingredient.id}">
                            <i class="tim-icons icon-simple-delete"></i>
                        </button>`
                    ]).draw();
                });
            });
        }

        // Initialize DataTable
        $('#storageTable').DataTable();

        // Load initial data
        loadIngredient();

        // Add ingredient
        $('#addIngredientForm').submit(function (e) {
            e.preventDefault();
            $.post("storageManagementServlet", {
                action: "add",
                name: $('#ingredientName').val(),
                stockQuantity: $('#stockQuantity').val(),
                reqQuantity: $('#reqQuantity').val()
            }, function () {
                $('#addIngredientModal').modal('hide');
                loadIngredient();
            });
        });

        // Edit ingredient
        $(document).on('click', '.edit-btn', function () {
            let id = $(this).data('id');
            $('#editIngredientId').val(id);
            $('#editIngredientName').val($(this).data('name'));
            $('#editStockQuantity').val($(this).data('stock'));
            $('#editReqQuantity').val($(this).data('req'));
            $('#editIngredientModal').modal('show');
        });

        $('#editIngredientForm').submit(function (e) {
            e.preventDefault();
            $.post("storageManagementServlet", {
                action: "edit",
                id: $('#editIngredientId').val(),
                stockQuantity: $('#editStockQuantity').val(),
                reqQuantity: $('#editReqQuantity').val()
            }, function () {
                $('#editIngredientModal').modal('hide');
                loadIngredient();
            });
        });

        // Delete ingredient
        $(document).on('click', '.delete-btn', function () {
            let id = $(this).data('id');
            if (confirm("Are you sure you want to delete this ingredient?")) {
                $.post("storageManagementServlet", {
                    action: "delete",
                    id: id
                }, function () {
                    loadIngredient();
                });
            }
        });
    });
</script>


</body>

</html>