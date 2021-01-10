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
        <div class="thongtinkhachhang" style="margin-left: 20%; margin-right: 20%;">
            <h2>Khách hàng: ${tenkhachhang }</h2>
            <h3>Địa chỉ giao hàng: ${diachi} </h3>
            <a href="SuaThongTin?tenTK=${tenTK }">Chỉnh sửa thông tin</a>
            <hr>
        </div>
        <div class="phuongthucthanhtoan" style="margin-left: 20%; margin-right: 20%;">
            <h4><strong>Phương thức thanh toán:</strong>     ------ Thanh toán tại khi nhận hàng ------ </h4>
            <img src="./image/don-vi-van-chuyen-cua-lazada44.png" alt="" style="width:100px;height:50px;">
            <span style="margin-left: 5%;font-size: 1.2rem;">Đơn vị vận chuyển Ninja sẽ hỗ trợ bạn</span>
            <hr>
        </div>
        <div class="thanhtoan" style="text-align:right;margin-left: 20%; margin-right: 20%;">
            <h5>Giá tạm tính:<fmt:formatNumber type="number" groupingUsed="true" value="${giatamtinh}"/>  VND</h5>
            <h5>Phí giao và chuyển hàng: 22.000 VND</h5>
            <h5><strong>Tổng tiền:<fmt:formatNumber type="number" groupingUsed="true" value="${tongtien}"/>  VND</strong></h5>
        </div>
        <div class="xacnhan" style="text-align:right;">
        <button>
            <a href="XacNhanDonHang?tenTK=${tenTK }">Xác nhận đơn hàng</a>
        </button>
        </div>
    </div>
    <jsp:include page="_footer.jsp"></jsp:include> 
    </body>
    </html>