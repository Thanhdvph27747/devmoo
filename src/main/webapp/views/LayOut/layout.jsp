<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/2d1/23
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet" type="text/css" href="/css/layout.css">
    <title>Java5_Thanhdvph27747</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/CSS/bootstrap.min.css">
    <!--GOOGLE FONTS-->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Fredoka+One&family=Play&display=swap" rel="stylesheet">
    <%--    css--%>
    <link rel="stylesheet"
          href="/src/main/webapp/css/bootstrap.min.css"/>

    <link rel="shortcut icon"
          href="/images/BMW_logo_blue.png" type="image/x-icon">
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">

</head>
<body>
<div class="row l bg-black">
    <div class="col-md-7 col-12 mt-2">
        <div class="row">
            <div class="col-md-4">
                <h2 class="a text-info offset-3">innisfree</h2>
            </div>

            <div class="col-md-8">
                <input
                        placeholder=""
                        type="search"
                        placeholder="Phiên bản giới hạn mùa lễ Green holidays"
                />
                <button class="btn btn-outline-success" onclick="searchs()">
                    Search
                </button>
            </div>
        </div>
    </div>
    <div class="col-md-5 col-12 mt-3 text-dark">

        <a href="/login" class="b offset-1" style="text-decoration-color: #0f5132 ">Đăng nhập</a>
        <a href="#" class=" b offset-2" style="text-decoration-color: #0f5132">Giỏ hàng</a>
        <a href="" class="glyphicon glyphicon-comment offset-1"></a>
    </div>
</div>
<nav class="navbar navbar-expand-lg text-bg-secondary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">IT17321</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active bl" aria-current="page" href="#">Trang chủ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/khachhang/index">Khách hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/sanpham/index">Sản phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/nhanvien/index">Nhân viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/cuahang/index">Cửa hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/chitietsp/index">Chi tiết SP</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/nsx/index">NSX</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/chucvu/index">Chức vụ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/mausac/index">Màu sắc</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/dongsp/index">Dòng SP</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="row mt-2" style="min-height: 500px;">
    <div class="col-3 text-bg-secondary"><h3 class="text-center text-primary"></h3>
        <div class="list-group">
            <a href="#" class="list-group-item">Nội dung</a>
            <a href="#" class="list-group-item">Yêu cầu</a>
            <a href="#" class="list-group-item">Kết quả</a>
            <a href="/sp" class="list-group-item"><i class="bi bi-box2-heart-fill">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box2-heart-fill" viewBox="0 0 16 16">
                    <path d="M3.75 0a1 1 0 0 0-.8.4L.1 4.2a.5.5 0 0 0-.1.3V15a1 1 0 0 0 1 1h14a1 1 0 0 0 1-1V4.5a.5.5 0 0 0-.1-.3L13.05.4a1 1 0 0 0-.8-.4h-8.5ZM8.5 4h6l.5.667V5H1v-.333L1.5 4h6V1h1v3ZM8 7.993c1.664-1.711 5.825 1.283 0 5.132-5.825-3.85-1.664-6.843 0-5.132Z"/>
                </svg>
            </i>Mua hàng</a>
        </div>
    </div>
    <div class="col-9">
        <jsp:include page="${ view }"/>
    </div>
</div>


<footer>
    <div class="footer">
        <div class="row">
            <ul>
                <li><a href="https://www.facebook.com/duy.thanh.35977897"><i class="fa fa-facebook"></i></a></li>
                <li><a href="#"><i class="fa fa-instagram offset-1"></i></a></li>
                <li><a href="#"><i class="fa fa-youtube offset-1"></i></a></li>
                <li><a href="#"><i class="fa fa-twitter offset-1"></i></a></li>
            </ul>
        </div>

        <div class="row">
            <ul>
                <li><a href="#">Contact us</a></li>
                <li><a href="#">Our Services</a></li>
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms & Conditions</a></li>
                <li><a href="#">Career</a></li>
            </ul>
        </div>

        <div class="row text-center">
            <label class="text-center">INFERNO Copyright © 2021 Inferno - All rights reserved || Designed By:
                @Thanhdvph27747</label>
        </div>
    </div>
</footer>

<script src="/SP23B2_SOF3011_IT17321_war_exploded/js/bootstrap.min.js"></script>
</body>
</html>