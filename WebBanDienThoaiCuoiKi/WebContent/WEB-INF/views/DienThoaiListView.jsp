<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList"  %>
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
        <div class="chungtatca">
  			<img src="./image/800-170-800x170-39.png" alt="" width="100%">
  			<img src="./image/800-170-800x170-56.png" alt="" width="100%">
    		<h1>ĐIỆN THOẠI</h1>
			<ul class="dschung">
				<%int i =1; %>
				<c:forEach items="${listDienThoai}" var="dt">
				<li class="lichung" style="height:342px">
        			<ul>
            			<li class="img">
                			<a href="DienThoai?maDT=${dt.maDT }&tenkhachhang=${tenkhachhang}&tenTK=${tenTK}">
                    			<img class="hinhanh" src="data:image/png;base64,${dt.hinhanh }" alt="" width="180px" height="180px">
                       			<h3>${dt.ten}</h3>
                    		</a>
                		</li>
                		<li class="button">
                    		<br>
               			</li>
                		<li class="money">
                    		<strong>${dt.dongia} đ</strong>
                		</li>
            		</ul>
         		</li>
				<%if(i ==4){
				i=0;
				out.print("</ul>");
				out.print("<ul class='dschung'>");
				}%>
				<%i =i+1;%>
				</c:forEach>
			</ul>
		</div>
	</div>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>