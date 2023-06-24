<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head><title>Luyen tap</title>
    <script src="/src/main/webapp/views/CuaHang/clear.js"></script>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">v

    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css"></head>
<body>
<div class="container">
    <form action="/cuahang/update/${ch.ma}" method="post">

        <div class="row">
            <div class="col-5">Mã cửa hàng:</div>
            <div class="col-5"><input type="text" placeholder="Mã" name="ma" value="${ch.ma}"></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Tên cửa hàng:</div>
            <div class="col-5"><input type="text" placeholder="Tên" name="ten" value="${ch.ten}"></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Địa chỉ:</div>
            <div class="col-5"><input type="text" placeholder="Địa chỉ" name="diaChi" value="${ch.diaChi}"></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Thành phố:</div>
            <div class="col-5"><input type="text" placeholder="Thành phố" name="thanhPho" value="${ch.thanhPho}"></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Quốc gia:</div>
            <div class="col-5">
                <select name="quocGia" value="${ch.quocGia}" id="">
                    <option selected disabled value="">Mời chọn quốc gia</option>
                    <option value="Việt Nam" ${ch.quocGia=="Việt Nam"?"selected":""}>Việt Nam</option>
                    <option value="Mỹ" ${ch.quocGia=="Mỹ"?"selected":""}>Mỹ</option>
                    <option value="Trung Quốc" ${ch.quocGia=="Trung Quốc"?"selected":""}>Trung Quốc</option>
                </select>
            </div>
        </div>
        <hr>
        <div >
            <button type="submit" class="btn btn-primary">Submib</button></div>

    </form>

</div>
</body>
</html>