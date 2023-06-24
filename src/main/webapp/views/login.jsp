<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="pr" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>SD17321</title>
    <link rel="shortcut icon" href="/static/images/BMW_logo_blue.png" type="image/x-icon">
    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css">
    <link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="all-classes-container">
        <div class="login-page">
            <div class="form">
                <div class="login">
                    <div class="login-header">
                        <h3>LOGIN</h3>
                        <p class="text-warning">Please enter your credentials to login.</p>
                    </div>
                </div>
                <pr:form class="login-form" action="/login/store" method="post" modelAttribute="form">

                    <input type="text" placeholder="Email" name="email"/>
                    <pr:errors path="Email" cssClass="text-danger"></pr:errors>
                    <input type="password" placeholder="password" name="pass"/>
                    <pr:errors path="Pass" cssClass="text-danger"></pr:errors>
                    <button class="btn btn-primary">login</button>
                    <p class="message">Not registered? <a href="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp">Create an account</a></p>
                </pr:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
