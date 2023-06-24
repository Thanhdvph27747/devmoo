<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>index</title>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css">
</head>
<body>
<h2 class="text-center text-info">Index</h2>
<div>
    <table class="table table-striped" border="1">
        <tr class="bg-success">
            <th>ID</th>
            <th>Mã</th>
            <th>Tên</th>
            <th>Họ</th>
            <th>Ngày sinh</th>
            <th>Sdt</th>
            <th>Địa chỉ</th>
            <th>Quốc gia</th>
            <th colspan="2">Action</th>
        </tr>
        <c:forEach items="${list}" var="ch" varStatus="stt">
            <tr>
                <td>${ch.id}</td>
                <td>${ch.ma}</td>
                <td>${ch.ten}</td>
                <td>${ch.ho}</td>
                <td>${ch.ngaySinh}</td>
                <td>${ch.sdt}</td>
                <td>${ch.diaChi}</td>
                <td>${ch.quocGia}</td>
                <td><a href="/khachhang/edit/${ch.id}" class="btn btn-success">Update</a></td>
                <td><a href="/khachhang/delete/${ch.id}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <div><a href="/khachhang/create" class="btn btn-primary">Thêm mới</a></div>
</div>
</body>
</html>