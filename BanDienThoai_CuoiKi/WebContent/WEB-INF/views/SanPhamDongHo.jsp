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
        <div class="sanpham">
            <h2 style="margin-top:20px">${dongho.ten}</h2>
            <ul class="sanphamchinh" >
                <li>
                <form method="POST" action="GioHang?tenTK=${tenTK}&maDH=${dongho.maDH}">
                    <ul class="hinhanh_gia" >
                        <li style="width:100%; text-align: center;">
                            <img src="data:image/png;base64,${dongho.hinhanh }" alt="" width="400px" height="400px">

                        </li >
                        <li style="width:100%; text-align: center; margin-top: 20px; color: red;">
                            <span style="font-size: 2rem;">${dongho.dongia}  đ</span>
                        </li>
                        <li style="width:100%; text-align: center; margin-top: 20px; color: red;">
                            <span style="font-size: 2rem;">Số Lượng: </span>
                            <input type="number" name="soluong" min="1" max="20"  value="1"/>
                        </li>
                        <li style="width:100%; text-align: center; margin-top: 20px;">
                            <input type="submit" class="btn" value="Thêm Giỏ Hàng" style="border:solid;background-color:green;" id="themgiohang">
                        </li>
                    </ul>
                    </form>
                </li>
                <li>
                    <ul style="height: 100%; width: 100%;" class="ul_phai">
                        <li style="width:100%;">
                            <h2>Thông Số Kỹ Thuật</h2>
                        </li>
                        <li>Công Nghệ Màn Hình: ${dongho.congnghemanhinh }</li>
                        <li>Kích thước màn hinh: ${dongho.kichthuocmanhinh }</li>
                        <li>Thời gian sử dụng: ${dongho.thoigiansudung}</li>
                        <li>Hệ điều hành: ${dongho.hedieuhanh }</li>
                        <li>Chất liệu mặt: ${dongho.chatlieumat }</li>
                        <li>Đường kính mặt : ${dongho.duongkinhmat }</li>
                        <li>Kết nối: ${dongho.ketnoi}</li>
                        <li>Ngôn ngữ : ${dongho.ngonngu }</li>
                        <li>Theo dõi sức khỏe: ${dongho.theodoisuckhoe}</li>
                    </ul>
                </li>
            </ul>
            <h3 style="margin-top:20px">
                ${baiviet.tieude}
            </h3>
            <h5>
                ${baiviet.noidung1}
            </h5>
            
            <div id="thea">
                <center>
                    <input type="button" id="btn2" value="Xem Thêm" style="color: white; background-color: green;"/>
                </center>
            </div>
            <div id="boxnoidung" style="display:none;">
                <div class=" ">
                    <p>Nội dung hiện thị !</p>
                </div>
            </div>
            <script language="javascript">
                document.getElementById("btn2").onclick = function(){
                    document.getElementById("thea").style.display = 'none';
                    document.getElementById("boxnoidung").style.display='block';
                };
            </script>
        </div>
    </div>
    <jsp:include page="_footer.jsp"></jsp:include>
        <c:if test="${not empty kiemtra }">
    <script>
    	document.getElementById("themgiohang").style.display='none';
    	document.getElementById("soluong").style.display='none';
    	document.getElementById("btn2").style.display='none';
    </script>
    </c:if>
    </body>
</html>