<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head><title>Luyen tap</title>
    <%@ taglib prefix="pr" uri="http://www.springframework.org/tags/form" %>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
<script src="/js/SPBan.js"></script>
    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css"></head>
<body>
<div class="container">
    <div class="text-center"><h1 class="text-center text-info">Vòng VIP</h1></div>

    <div class="row">
        <div class="offset-4 col-md-4">
            <div class="card">
                <pr:form method="post" action="">
                <div class="card-header text-center" id="tensp1" name="tenSP">Móc khóa</div>
                <div class="card-body"><img src="/images/vongtay3.jpeg" style="width: 97%" alt=""></div>
                <div class="card-footer w-auto text-center">
                    <button type="button" class="text-info" onclick="sp1giam()">-</button> <small id="sp1" name="soLuong">1</small> <button type="button" onclick="sp1tang()" class="text-success">+</button>
                    <br>
                    <small id="thanhTien" name="soTien">582000</small>
                    <br>
                    <button type="submit" class="text-lowercase btn btn-success" >Thêm vào giỏ hàng</button>
                    </pr:form>
                <!-- Button trigger modal -->
                <button type="button" class="btn btn-primary" onclick="a()" data-bs-toggle="modal" data-bs-target="#exampleModal">
                   Mua hàng
                </button>

                <!-- Modal -->
                    <pr:form action="/sp/store" method="post" modelAttribute="xn">
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Vui lòng xác nhận!</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <div class="container">
                                    <pr:input type="text" class="form-control mt-2" path="Email" placeholder="Nhập email" />
                                    <pr:errors path="Email" cssClass="text-danger"></pr:errors>
                                    <div>
                                        <pr:input type="text" path="diaChi" class="form-control mt-2" placeholder="Nhập địa chỉ" id="diachi"  />
                                        <pr:errors path="DiaChi" cssClass="text-danger"></pr:errors>
                                    </div>
                                    <div>
                                        <pr:input type="number" path="sdt" class="form-control mt-2" placeholder="Nhập số điện thoại" id="diachi"  />
                                        <pr:errors path="Sdt" cssClass="text-danger"></pr:errors>
                                    </div>

                                    <div>Tên SP: <pr:input type="text" path="tenSP" id="tenspmd1" style="color: #084298" readonly="true" /></div>
                                    <div>Số lượng: <pr:input path="soLuong" id="soluongmd1" style="color: #084298" readonly="true"></pr:input></div>
                                    <div>Số tiền: <pr:input path="soTien" id="sotienmd1" style="color: #084298"  readonly="true"></pr:input></div>
                                </div>

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Không</button>
                                <button type="submit" class="btn btn-primary">Có</button>
                            </div>
                            </pr:form>
                        </div>
                    </div>
                </div>
            </div>
            </div>
        </div>

<%--        <div class=" col-md-4">--%>
<%--            <div class="card">--%>
<%--                <pr:form>--%>
<%--                <div class="card-header text-center" id="tensp1" name="TenSP">Vòng tay</div>--%>
<%--                <div class="card-body"><img src="/images/BMW_logo_blue.png" style="width: 97%" alt=""></div>--%>
<%--                <div class="card-footer w-auto text-center">--%>
<%--                    <button type="button" class="text-info" onclick="sp2giam()">-</button> <small id="sp2" name="soLuong">1</small> <button type="button" onclick="sp2tang()" class="text-success">+</button>--%>
<%--                    <br>--%>
<%--                    <small id="thanhTien2" name="soTien">1730000</small>--%>
<%--                    <br>--%>
<%--                    <button type="submit" class="text-lowercase btn btn-success" >Thêm vào giỏ hàng</button>--%>
<%--                    </pr:form>--%>
<%--                    <!-- Button trigger modal -->--%>
<%--                    <button type="button" class="btn btn-primary" onclick="bb()" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
<%--                        Mua hàng--%>
<%--                    </button>--%>

<%--                    <!-- Modal -->--%>
<%--                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--                        <div class="modal-dialog">--%>
<%--                            <div class="modal-content">--%>
<%--                                <div class="modal-header">--%>
<%--                                    <h5 class="modal-title" id="exampleModalLabel">Vui lòng xác nhận!</h5>--%>
<%--                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                                </div>--%>
<%--                                <div class="modal-body">--%>
<%--                                    <div class="container">--%>
<%--                                        <input type="text" class="form-control mt-2" placeholder="Nhập email" />--%>
<%--                                        <pr:errors path="Email" cssClass="text-danger"></pr:errors>--%>
<%--                                        <div>--%>
<%--                                            <input type="text" class="form-control mt-2" value="" placeholder="Nhập địa chỉ" id="diachi"  >--%>
<%--                                            <pr:errors path="DiaChi" cssClass="text-danger"></pr:errors>--%>
<%--                                        </div>--%>
<%--                                        <div>Tên SP: <span id="tenspmd2" style="color: #084298"></span></div>--%>
<%--                                        <div>Số lượng: <span id="soluongmd2" style="color: #084298"></span></div>--%>
<%--                                        <div>Số tiền: <span id="sotienmd2" style="color: #084298"></span></div>--%>
<%--                                    </div>--%>

<%--                                </div>--%>
<%--                                <div class="modal-footer">--%>
<%--                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Không</button>--%>
<%--                                    <button type="submit" class="btn btn-primary">Có</button>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>

<%--        <div class=" col-md-4">--%>
<%--            <div class="card">--%>
<%--                <pr:form>--%>
<%--                <div class="card-header text-center" id="tensp1" name="TenSP">Ốp lưng</div>--%>
<%--                <div class="card-body"><img src="/images/vang-nau-vang-4.jpg" style="width: 97%" alt=""></div>--%>
<%--                <div class="card-footer w-auto text-center">--%>
<%--                    <button type="button" class="text-info" onclick="sp3giam()">-</button> <small id="sp3" name="soLuong">1</small> <button type="button" onclick="sp3tang()" class="text-success">+</button>--%>
<%--                    <br>--%>
<%--                    <small id="thanhTien3" name="soTien">150000</small>--%>
<%--                    <br>--%>
<%--                    <button type="submit" class="text-lowercase btn btn-success" >Thêm vào giỏ hàng</button>--%>
<%--                    </pr:form>--%>
<%--                    <!-- Button trigger modal -->--%>
<%--                    <button type="button" class="btn btn-primary" onclick="a()" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
<%--                        Mua hàng--%>
<%--                    </button>--%>

<%--                    <!-- Modal -->--%>
<%--                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--                        <div class="modal-dialog">--%>
<%--                            <div class="modal-content">--%>
<%--                                <div class="modal-header">--%>
<%--                                    <h5 class="modal-title" id="exampleModalLabel">Vui lòng xác nhận!</h5>--%>
<%--                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                                </div>--%>
<%--                                <div class="modal-body">--%>
<%--                                    <div class="container">--%>
<%--                                        <input type="text" class="form-control mt-2" placeholder="Nhập email" />--%>
<%--                                        <pr:errors path="Email" cssClass="text-danger"></pr:errors>--%>

<%--                                        <div>--%>
<%--                                            <input type="text" class="form-control mt-2" value="" placeholder="Nhập địa chỉ" id="diachi"  >--%>
<%--                                            <pr:errors path="DiaChi" cssClass="text-danger"></pr:errors>--%>
<%--                                        </div>--%>
<%--                                        <div>Tên SP: <span id="tenspmd3" style="color: #084298"></span></div>--%>
<%--                                        <div>Số lượng: <span id="soluongmd3" style="color: #084298"></span></div>--%>
<%--                                        <div>Số tiền: <span id="sotienmd3" style="color: #084298"></span></div>--%>
<%--                                    </div>--%>

<%--                                </div>--%>
<%--                                <div class="modal-footer">--%>
<%--                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Không</button>--%>
<%--                                    <button type="submit" class="btn btn-primary">Có</button>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>



    </div>
</div>

</body>
</html>