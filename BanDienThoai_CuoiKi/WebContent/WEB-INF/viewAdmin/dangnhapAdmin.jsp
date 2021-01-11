<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Đăng nhập Admin</title>
    <link href="assets/css/dkidnhap.css" rel="stylesheet" /> 
  </head>
  <body style="background:url(./image/Background-dep-vector.jpg) no-repeat;background-size: cover;">
  
	<div class="login-box">
	<form method="POST" action="${pageContext.request.contextPath}/admin">
  		<h1>Đăng Nhập Admin</h1>
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