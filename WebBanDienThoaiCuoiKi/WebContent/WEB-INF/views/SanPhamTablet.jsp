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
            <h2 style="margin-top:20px">${tablet.ten}</h2>
            <ul class="sanphamchinh">
                <li>
                <form method="POST" action="GioHang?tenTK=${tenTK}&maTB=${tablet.maTB}">
                    <ul class="hinhanh_gia">
                        <li style="width:100%; text-align: center;">
                            <img src="data:image/png;base64,${tablet.hinhanh }" alt="" width="400px" height="460px">

                        </li >
                        <li style="width:100%; text-align: center; margin-top: 20px; color: red;">
                            <span style="font-size: 2rem;">${tablet.dongia}  đ</span>
                        </li>
                        <li style="width:100%; text-align: center; margin-top: 20px; color: red;" id="soluong">
                            <span style="font-size: 2rem;">Số Lượng: </span>
                            <input type="number" name="soluong" min="1" max="20" value="1" />
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
                        <li>Màn hình: ${tablet.manhinh }</li>
                        <li>Hệ Điều Hành: ${tablet.hedieuhanh }</li>
                        <li>CPU: ${tablet.cpu}</li>
                        <li>RAM: ${tablet.ram }</li>
                        <li>Bộ nhớ trong: ${tablet.bonhotrong }</li>
                        <li>Camera Sau: ${tablet.camerasau }</li>
                        <li>Camera Trước: ${tablet.cameratruoc}</li>
                        <li>Đàm thoại: ${tablet.damthoai }</li>
                        <li>Trọng Lượng: ${tablet.trongluong}</li>
                        <li>Mức Năng Lượng Tiêu Thụ: ${tablet.mucNLtieuthu}</li>
                    </ul>
                </li>
            </ul>
            <h3 style="margin-top:20px">
                ${baiviet.tieude}
            </h3>
            <h5>
                ${baiviet.noidung1}
            </h5>
            
            <img src="data:image/png;base64,${baiviet.hinhanh1 }" alt="" width="100%" height="460px">
            <h5>
                ${baiviet.noidung2}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh2 }" alt="" width="100%" height="460px">
            <h5>
                ${baiviet.noidung3}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh3 }" alt="" width="100%" height="460px">
            <h5>
                ${baiviet.noidung4}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh4 }" alt="" width="100%" height="460px">
            <h5>
                ${baiviet.noidung5}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh5 }" alt="" width="100%" height="460px">
            <h5>
                ${baiviet.noidung6}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh6 }" alt="" width="100%" height="460px">
            <h5>
                ${baiviet.noidung7}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh7 }" alt="" width="100%" height="460px">
            <h5>
                ${baiviet.noidung8}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh8 }" alt="" width="100%" height="460px">
            
        </div>
    </div>
    <jsp:include page="_footer.jsp"></jsp:include>
    <c:if test ="${not empty chuadangnhap}">
    <script>
    	document.getElementById("themgiohang").style.display ='none';
    	document.getElementById("soluong").style.display='none';
    </script>
    </c:if>
    <c:if test="${not empty kiemtra }">
    <script>
    	document.getElementById("themgiohang").style.display='none';
    	document.getElementById("soluong").style.display='none';
    	document.getElementById("btn2").style.display='none';
    </script>
    </c:if>
    </body>
</html>