<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"/>    
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet"/>   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <style><%@include file="css/main.css"%></style>
    <style><%@include file="css/style.css"%></style>  
    <title>Thế Giới Điện Thoại</title>
  </head>
  <body>
  <jsp:include page="_header.jsp"></jsp:include>
  <div class="container">
  	<div class="camon" style="height:500px;text-align:center;">
	  <h2>Cảm ơn quí khách đã mua hàng</h2>
	  <button>
	  	<a href="home?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}&soluong=${soluong}">Quay lại trang chủ</a>
	  </button>
	 </div>
  </div>
  <jsp:include page="_footer.jsp"></jsp:include> 
  </body>
  </html>
  