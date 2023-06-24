<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head><title>Luyen tap</title>
    <%@ taglib prefix="pr" uri="http://www.springframework.org/tags/form" %>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">

    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css"></head>
<body>
<div class="container">
    <h2 class="text-center text-secondary">Create</h2>
    <pr:form action="${action}" method="post" modelAttribute="nv">

        <div class="row">
            <div class="col-5">Mã nhân viên:</div>
            <div class="col-5"><pr:input type="text" id="1" placeholder="Mã"  path="ma"/><span><pr:errors path="Ma" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Tên nhân viên:</div>
            <div class="col-5"><pr:input type="text" id="2" placeholder="Tên" path="ten"/><span><pr:errors path="Ten" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Họ:</div>
            <div class="col-5"><pr:input type="text" id="3" placeholder="Họ" path="ho"/><span><pr:errors path="Ho" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Giới tính:</div>
            <div class="col-5"><pr:input type="text" id="4" placeholder="Giới tính" path="gioiTinh"/><span><pr:errors path="GioiTinh" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Ngày sinh:</div>
            <div class="col-5"><pr:input type="date" id="5" placeholder="Ngày sinh" path="ngaySinh"/><span><pr:errors path="NgaySinh" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Địa chỉ:</div>
            <div class="col-5"><pr:input type="text" id="6" placeholder="Địa chỉ" path="diaChi"/><span><pr:errors path="DiaChi" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">SĐT:</div>
            <div class="col-5"><pr:input type="number" id="7" placeholder="SĐT" path="sdt"/><span><pr:errors path="Sdt" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Password:</div>
            <div class="col-5"><pr:input type="password" id="8" placeholder="Password" path="matKhau"/><span><pr:errors path="MatKhau" cssClass="text-danger"/></span></div>
        </div>
        <hr>
        <div >
            <button type="submit" class="btn btn-primary" onclick="b()">Thêm mới</button></div>

    </pr:form>
    <div>
        <button type="submit" class="btn btn-dark" onclick="clear2()">Clear</button>
    </div>
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