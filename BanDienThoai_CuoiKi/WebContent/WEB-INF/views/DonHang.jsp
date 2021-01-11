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
 	<div class="container" style="text-align:center !important;">
        <div class="giohang">
        <h1>Đơn Hàng</h1>
        <c:forEach items="${dsdonhang}" var="dh">
            <ul class="dsgiohang">
                <li class="tensp">
                	Mã Đơn Hàng: ${dh.maDonHang}
                </li>
                <li class="slmua">
                    Tên Sản Phẩm: <strong>${dh.tenSP}</strong>
                </li>
                <li style="margin-left:2%">
                   Đơn Giá: <strong>${dh.dongia} VND/SP</strong> 
                </li>
                <li>
                	Số Lượng: <strong>${dh.slmua}</strong> 
                </li>
                <li>
                	Ngày Mua:<strong>${dh.ngayMua }</strong> 
               	</li>
               	<li>
               		Tình Trạng:<strong>${dh.tinhtrang}</strong> 
               	</li>
                
            </ul>
            
        </c:forEach>
        </div>
        </div>
    <jsp:include page="_footer.jsp"></jsp:include>
    </body>
    </html>