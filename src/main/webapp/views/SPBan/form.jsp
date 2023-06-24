<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head><title>Form</title>
    <%@ taglib prefix="pr" uri="http://www.springframework.org/tags/form" %>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css"></head>
<body>
<pr:form action="/form/store" method="post" modelAttribute="xn">
<div class="container">
    <div class="mt-3 text-center text-success">Form Xác Nhận</div>
    <input type="text" class="form-control mt-2" placeholder="Nhập email" />
    <pr:errors path="Email" cssClass="text-danger"></pr:errors>

    <div>
        <label>Địa chỉ</label>
        <input type="text" class="form-control mt-2" value="" placeholder="Nhập địa chỉ" id="diachi"  >
        <pr:errors path="DiaChi" cssClass="text-danger"></pr:errors>
    </div>
    <div>
        <label>Tên SP: </label>
        <input type="text" class="form-control mt-2" value="${sp.tenSP}" id="ten" name="tenSP" disabled>
    </div>
    <div>
        <label>Số lượng: </label>
        <input type="text" class="form-control mt-2" value="${sp.soLuong}" id="soluong" name="soLuong" disabled>
    </div>
    <div>
        <label>Số tiền: </label>
        <input type="text" class="form-control mt-2" value="${sp.soTien}" id="sotien" name="soTien" disabled>
    </div>
    <!-- Button trigger modal -->
    <button type="button" class="btn btn-primary mt-3" data-bs-toggle="modal" data-bs-target="#exampleModal">
        Xác nhận
    </button>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">(❁´◡`❁)</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    Vui lòng xác nhận
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Không</button>
                    <button type="submit" class="btn btn-primary">Có</button>
                </div>
            </div>
        </div>
    </div>
    <p class="message">Not registered? <a href="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp">Create an account</a></p>
</div>
</pr:form>
</body>
</html>