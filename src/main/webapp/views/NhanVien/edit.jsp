<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head><title>Luyen tap</title>
    <%@ taglib prefix="pr" uri="http://www.springframework.org/tags/form" %>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">v

    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css"></head>
<body>
<div class="container">
    <h2 class="text-center text-secondary">Create</h2>
    <form action="/nhanvien/update/${nv.ma}" method="post">

        <div class="row">
            <div class="col-5">Mã nhân viên:</div>
            <div class="col-5"><input type="text" id="1" placeholder="Mã" disabled value="${nv.ma}" name="ma"/><span><pr:errors path="Ma" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Tên nhân viên:</div>
            <div class="col-5"><input type="text" id="2" placeholder="Tên" value="${nv.ten}" name="ten"/><span><pr:errors path="Ten" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Họ:</div>
            <div class="col-5"><input type="text" id="3" placeholder="Họ" value="${nv.ho}" name="ho"/><span><pr:errors path="Ten" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Giới tính:</div>
            <div class="col-5"><pinput type="text" id="4" placeholder="Giới tính" value="${nv.gioiTinh}" name="gioiTinh"/><span><pr:errors path="Ten" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Ngày sinh:</div>
            <div class="col-5"><input type="date" id="5" placeholder="Ngày sinh" value="${nv.ngaySinh}" name="ngaySinh"/><span><pr:errors path="Ten" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Địa chỉ:</div>
            <div class="col-5"><input type="text" id="6" placeholder="Địa chỉ" value="${nv.diaChi}" name="diaChi"/><span id="loi3"></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">SĐT:</div>
            <div class="col-5"><input type="number" id="7" placeholder="SĐT" value="${nv.sdt}" name="sdt"/><span id="loi4"></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Password:</div>
            <div class="col-5"><input type="text" id="8" placeholder="Password" value="${nv.matKhau}" name="matKhau"/><span id="loi4"></span></div>
        </div>
        <hr>
        <div >
            <button type="submit" class="btn btn-primary" onclick="b()">Submid</button></div>

    </form>

</div>


<script type="text/javascript">
    function clear2(){
        let a = document.getElementById("1");
        let b = document.getElementById("2");
        let c = document.getElementById("3");
        let d = document.getElementById("4");
        let h = document.getElementById("5");
        let j = document.getElementById("6");
        let k = document.getElementById("7");
        let l = document.getElementById("8");
        h.value="";
        a.value= "";
        b.value= "";
        c.value= "";
        d.value= "";
        j.value= "";
        k.value= "";
        l.value= "";
        if(a.value.trim().length<=0||
            b.value.trim().length<=0||
            c.value.trim().length<=0||
            d.value.trim().length<=0){
            //alert("Vui long khong de trong!")

        }
    }
    function b(){
        let a = document.getElementById("loi");
        let b = document.getElementById("loi2");
        let c = document.getElementById("loi3");
        let d = document.getElementById("loi4");
        if(a.value.trim().length<=0||
            b.value.trim().length<=0||
            c.value.trim().length<=0||
            d.value.trim().length<=0){
            a.style.color="red";
            b.style.color="red";
            c.style.color="red";
            d.style.color="red";
            a.innerText="*Vui lòng không để trống ở đây";

        }

    }
</script>
</body>
</html>