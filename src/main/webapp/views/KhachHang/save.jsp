<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head><title>Luyen tap</title>
    <%@ taglib prefix="pr" uri="http://www.springframework.org/tags/form" %>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css"></head>
<body>
<div class="container">
    <h2 class="text-center text-secondary">Create</h2>
    <pr:form action="${action}" method="post" modelAttribute="kh">

        <div class="row">
            <div class="col-5">Mã khách hàng:</div>
            <div class="col-5"><pr:input type="text" id="1" placeholder="Mã"  path="ma"/><span><pr:errors path="Ma" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Tên khách hàng:</div>
            <div class="col-5"><pr:input type="text" id="2" placeholder="Tên" path="ten"/><span><pr:errors path="Ten" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Họ:</div>
            <div class="col-5"><pr:input type="text" id="3" placeholder="Họ" path="ho"/><span><pr:errors path="Ho" cssClass="text-danger"/></span>></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Ngày sinh:</div>
            <div class="col-5"><pr:input type="date" id="4" placeholder="Thành phố" path="ngaySinh"/><span><pr:errors path="Ho" cssClass="text-danger"/></span>></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Số điện thoại:</div>
            <div class="col-5">
                <pr:input type="number" id="5" placeholder="Số điện thoại" path="sdt"/><span><pr:errors path="Sdt" cssClass="text-danger"/></span>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Địa chỉ:</div>
            <div class="col-5"><pr:input type="text" id="6" placeholder="Thành phố" path="diaChi"/><span><pr:errors path="DiaChi" cssClass="text-danger"/></span></div>
        </div>
        <div class="row mt-3">
            <div class="col-5">Quốc gia:</div>
            <div class="col-5">
                <pr:select path="quocGia" id="7">
                    <option selected disabled value="1">Mời bạn chọn quốc gia</option>
                    <option value="Việt Nam">Việt Nam</option>
                    <option value="Mỹ">Mỹ</option>
                    <option value="Trung Quốc">Trung Quốc</option>
                </pr:select>
            </div>
        </div>
        <hr>
        <div>
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
        let g = document.getElementById("5");
        let i = document.getElementById("6");
        let k = document.getElementById("7");
        k.value="1";
        a.value= "";
        b.value= "";
        c.value= "";d.value= "";
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