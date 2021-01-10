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
        <div class="row sanpham">
            <h2 style="margin-top:20px">${phukien.ten}</h2>
            <ul class="col-md-12 sanphamchinh" >
                <li style="width:100%;text-align:center">
                <form method="POST" action="GioHang?tenTK=${tenTK}&maPK=${phukien.maPK}">
                    <ul class="col-md-12 hinhanh_gia" >
                        <li style="width:100%; text-align: center;">
                            <img src="data:image/png;base64,${phukien.hinhanh }" alt="" width="400px" height="auto">

                        </li >
                        <li style="width:100%; text-align: center; margin-top: 20px; color: red;">
                            <span style="font-size: 2rem;"><fmt:formatNumber type="number" groupingUsed="true" value="${phukien.dongia }"/>  VND</span>
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
            </ul>
            <h3 style="margin-top:20px" id="tieude">
                ${baiviet.tieude}
            </h3>
            <h5 id="noidung1">
                ${baiviet.noidung1}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh1 }" alt="" width="100%" height="460px" id="hinhanh1">
            <h5 id="noidung2">
                ${baiviet.noidung2}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh2 }" alt="" width="100%" height="460px" id="hinhanh2">
            <h5 id="noidung3">
                ${baiviet.noidung3}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh3 }" alt="" width="100%" height="460px" id="hinhanh3">
            <h5 id="noidung4">
                ${baiviet.noidung4}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh4 }" alt="" width="100%" height="460px" id="hinhanh4">
            <h5 id="noidung5">
                ${baiviet.noidung5}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh5 }" alt="" width="100%" height="460px" id="hinhanh5">
            <h5 id="noidung6">
                ${baiviet.noidung6}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh6 }" alt="" width="100%" height="460px" id="hinhanh6">
            <h5 id="noidung7">
                ${baiviet.noidung7}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh7 }" alt="" width="100%" height="460px" id="hinhanh7">
            <h5 id="noidung8">
                ${baiviet.noidung8}
            </h5>
            <img src="data:image/png;base64,${baiviet.hinhanh8 }" alt="" width="100%" height="460px" id="hinhanh8">
             
        </div>
    </div>
    <jsp:include page="_footer.jsp"></jsp:include>
        <c:if test="${not empty kiemtra }">
    <script>
    	document.getElementById("themgiohang").style.display='none';
    	document.getElementById("soluong").style.display='none';
    	document.getElementById("tieude").style.display='none';
    	document.getElementById("noidung1").style.display='none';
    	document.getElementById("noidung2").style.display='none';
    	document.getElementById("noidung3").style.display='none';
    	document.getElementById("noidung4").style.display='none';
    	document.getElementById("noidung5").style.display='none';
    	document.getElementById("noidung6").style.display='none';
    	document.getElementById("noidung7").style.display='none';
    	document.getElementById("noidung8").style.display='none';
    	document.getElementById("hinhanh1").style.display='none';
    	document.getElementById("hinhanh2").style.display='none';
    	document.getElementById("hinhanh3").style.display='none';
    	document.getElementById("hinhanh4").style.display='none';
    	document.getElementById("hinhanh5").style.display='none';
    	document.getElementById("hinhanh6").style.display='none';
    	document.getElementById("hinhanh7").style.display='none';
    	document.getElementById("hinhanh8").style.display='none';
    </script>
    </c:if>
    </body>
</html>