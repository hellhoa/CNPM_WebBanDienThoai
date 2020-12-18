<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <style><%@include file="css/dkidnhap.css"%></style> 
  </head>
  <body style="background:url(./image/bg.jpg) no-repeat;background-size: cover;">
  
	<div class="login-box">
	<form method="POST" action="${pageContext.request.contextPath}/DangNhap">
  		<h1>Đăng Nhập</h1>
  		<div class="textbox">
    		<i class="fas fa-user"></i>
    		<input type="text" placeholder="Tên Tài Khoản" name="tenTK">
  		</div>

  		<div class="textbox">
    		<i class="fas fa-lock"></i>
    		<input type="password" placeholder="Mật khẩu" name="matkhau">
  		</div>

  		<input type="submit" class="btn" value="Đăng Nhập">
	</form>
	</div>
	<c:if test="${not empty message }">
	<script>
		alert("Thông tin đăng nhập sai");
	</script>
	</c:if>
  </body>
</html>