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
 	<div class="container" style="text-align:center !important;">
        <div class="giohang">
        <h1>Giỏ Hàng</h1>
        <c:if test="${ not empty tenSP_HetHang }">
        	<h4>Sản Phẩm ${tenSP_HetHang} đã hết hàng</h4>
        </c:if>
        <c:forEach items="${listGioHang}" var="gh">
            <ul class="dsgiohang">
                <li class="tensp">
                	<a href="SearchSPGioHang?maSP=${gh.maSP }&tenkhachhang=${tenkhachhang}&tenTK=${tenTK}&soluong=${soluong}">
                    	${gh.tenSP } 
                    </a>
                </li>
                <li class="slmua">
                    ${gh.slmua } sản phẩm
                </li>
                <li class="dongia">
                    <fmt:formatNumber type="number" groupingUsed="true" value="${gh.dongia }"/>  VND/SP
                </li>
                <li>
                	<c:set var="them" value="1"></c:set>
                	<c:set var="bot" value="1"></c:set>
                	<button style="margin-right:10px;border-radius:5px" onmouseover="hienthi()" onmouseout="tat()">
                		<a href="ThemGioHang?maKH=${gh.maKH }&maSP=${gh.maSP}&tenkhachhang=${tenkhachhang}&add=${them}&tenTK=${tenTK}">+</a>
                	</button>
                	<button style="margin-right:10px;border-radius:5px" onmouseover="hienthi1()" onmouseout="tat1()">
                		<a href="XoaSPGioHang?maKH=${gh.maKH }&maSP=${gh.maSP}&tenkhachhang=${tenkhachhang}&sub=${bot}&tenTK=${tenTK}">-</a>
                	</button>
                	<button style="margin-right:10px;border-radius:5px" onmouseover="hienthi2()" onmouseout="tat2()">
                		<a href="XoaGioHang?maKH=${gh.maKH }&maSP=${gh.maSP}&tenkhachhang=${tenkhachhang}&tenTK=${tenTK}">X</a>
                	</button>
                </li>
            </ul>
            
        </c:forEach>
        </div>
        <ul>
                <li style="text-align:right">
                    <span id="themsp" style="display:none;">Thêm 1 sản phẩm</span>
                    <span id="giamsp" style="display:none;">Xóa 1 sản phẩm</span>
                    <span id="xoasp" style="display:none;">Xóa sản phẩm</span>
                </li>
            </ul>
        <button style="font-size:1.2rem;" id="thanhtoan">
                <a href="ThanhToan?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">Thanh Toán</a>
        </button>
    </div>
    <jsp:include page="_footer.jsp"></jsp:include>
    <script>
        function hienthi(){
            document.getElementById("themsp").style.display='block';
        }
        function hienthi1()
        {
            document.getElementById("giamsp").style.display='block';
        }
        function hienthi2(){
            document.getElementById("xoasp").style.display='block';
        }
        function tat(){
            document.getElementById("themsp").style.display='none';
        }
        function tat1(){
            document.getElementById("giamsp").style.display='none';
        }
        function tat2(){
            document.getElementById("xoasp").style.display='none';
            
        }
    </script>
    <c:if test="${soluong == '0' }">
    	<script>
    		document.getElementById("thanhtoan").style.display = 'none';
    	</script>
    </c:if>
    </body>
    </html>