<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <div class="row chungtatca">
  			<img class="col-md-12" src="./image/1200-350-1200x350-3.png" alt="" width="100%">
  			<img class="col-md-12" src="./image/1200-350-1200x350-18.png" alt="" width="100%">
    		<img class="col-md-12" src="./image/1200-350-1200x350-20.png " alt="" width="100%">
    		<h1>ĐỒNG HỒ</h1>
			<ul class="col-md-12 dschung">
				<%int i =1; %>
				<c:forEach items="${DHList}" var="dh">
				<li class="lichung">
        			<ul>
            			<li class="img">
                			<a href="DongHo?maDH=${dh.maDH}&tenkhachhang=${tenkhachhang}&tenTK=${tenTK}&soluong=${soluong}">
                    			<img class="col-md-8 hinhanh" src="data:image/png;base64,${dh.hinhanh }" alt="" width="180px" height="180px">
                       			<h4>${dh.ten}</h4>
                    		</a>
                		</li>
                		<li class="button">
                    		<span>${dh.dacdiem1 }</span>
                    		<span>${dh.dacdiem2 }</span>
               			</li>
                		<li class="money">
                    		<strong><fmt:formatNumber type="number" groupingUsed="true" value="${dh.dongia }"/>  VND</strong>
                		</li>
            		</ul>
         		</li>
				<%if(i ==4){
				i=0;
				out.print("</ul>");
				out.print("<ul class='col-md-12 dschung'>");
				}%>
				<%i =i+1;%>
				</c:forEach>
			</ul>
		</div>
	</div>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>