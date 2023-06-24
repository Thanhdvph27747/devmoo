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
            <th>Id</th>
            <th>Mã</th>
            <th>Tên</th>

            <th colspan="2">Action</th>
        </tr>
        <c:forEach items="${list}" var="nv" varStatus="stt">
            <tr>
                <td>${nv.id}</td>
                <td>${nv.ma}</td>
                <td>${nv.ten}</td>

                <td><a href="/sanpham/edit/${nv.id}" class="btn btn-success">Update</a></td>
                <td><a href="/sanpham/delete/${nv.id}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <div><a href="/sanpham/create" class="btn btn-primary">Thêm mới</a></div>
</div>
</body>
</html>