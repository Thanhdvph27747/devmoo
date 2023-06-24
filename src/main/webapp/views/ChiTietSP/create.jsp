<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head><title>Luyen tap</title>
    <%@ taglib prefix="pr" uri="http://www.springframework.org/tags/form" %>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">

    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css"></head>
<body>
<div class="container">
    <h2 class="text-center text-secondary">ChiTietSP</h2>
    <pr:form action="${action}" method="post" modelAttribute="ctsp">
        <div class="row">
            <div class="col-5">Năm BH:</div>
            <div class="col-5"><pr:input type="number" id="1" placeholder="Năm bảo hành"  path="namBH"/><span><pr:errors path="NamBH" cssClass="text-danger"/></span></div>
        </div>
        <div class="row">
            <div class="col-5">Mô tả:</div>
            <div class="col-5"><pr:input type="text" id="1" placeholder="Mô tả"  path="moTa"/><span><pr:errors path="MoTa" cssClass="text-danger"/></span></div>
        </div>
        <div class="row">
            <div class="col-5">Số lượng tồn:</div>
            <div class="col-5"><pr:input type="number" id="1" placeholder="Số lượng tồn"  path="soLuongTon"/><span><pr:errors path="SoLuongTon" cssClass="text-danger"/></span></div>
        </div>
        <div class="row">
            <div class="col-5">Giá nhập:</div>
            <div class="col-5"><pr:input type="number" id="1" placeholder="Giá nhập"  path="giaNhap"/><span><pr:errors path="GiaNhap" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Giá bán:</div>
            <div class="col-5"><pr:input type="number" id="2" placeholder="Giá bán" path="giaBan"/><span><pr:errors path="GiaBan" cssClass="text-danger"/></span></div>
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

        h.value="";
        a.value= "";
        b.value= "";
        c.value= "";

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