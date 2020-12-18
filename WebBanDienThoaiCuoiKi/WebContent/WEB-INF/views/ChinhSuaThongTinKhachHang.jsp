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
    <title>Thế Giới Điện Thoại</title>
  </head>
    <body>
 
     <jsp:include page="_header.jsp"></jsp:include>
     <div class="container">
        <div class="thongtinkhachhang" style="text-align:center">
        <form method="POST" action="${pageContext.request.contextPath}/SuaThongTin?tenTK=${tenTK}">
            <h2>Thông Tin Khách Hàng</h2>
            <h4>Tên khách hàng: 
                <input type="text" value="${tenkhachhang }" style="margin-left: 10%; margin-top: 10%;" name="tenkhachhang">
            </h4>
            <br>
            <h4>Địa chỉ giao hàng:
                <input type="text" value="${diachigiaohang}" style="margin-left: 10%;" name="diachigiaohang">

            </h4>
            <input type="submit" value="Cập nhập thông tin" style="margin-top: 2%;">
            </form>
        </div>
    </div>
    <jsp:include page="_footer.jsp"></jsp:include> 
    </body>
    </html>