<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style><%@include file="css/dkidnhap.css"%></style> 
  </head>
  <body style="background:url(./image/bg.jpg) no-repeat;background-size: cover;">
<div class="login-box">
	<form method="POST" action="${pageContext.request.contextPath}/DangKi">
  	<h1>Đăng kí</h1>
  	<div class="textbox">
    	<i class="fas fa-user"></i>
    	<input type="text" placeholder="Tên người dùng" name="tenkhachhang">
  	</div>
	<div class="textbox">
    	<i class="fas fa-user"></i>
    	<input type="text" placeholder="Tên tài khoản" name="tenTK">
  	</div>
  	<div class="textbox">
    	<i class="fas fa-lock"></i>
    	<input type="password" placeholder="Mật khẩu" name="matkhau">
  	</div>
  	<div class="textbox">
    	<i class="fas fa-lock"></i>
    	<input type="password" placeholder="Nhập lại mật khẩu">
  	</div>
	<div class="textbox">
    	<i class="fas fa-user"></i>
    	<input type="text" placeholder="Địa chỉ giao hàng" name="diachigiaohang">
  	</div>
  	<input type="submit" class="btn" value="Đăng kí">
  	</form>
</div>
  </body>
</html>