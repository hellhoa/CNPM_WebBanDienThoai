<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <div class='snow-container'>
        <div class='snow foreground'></div>
        <div class='snow foreground layered'></div>
        <div class='snow middleground'></div>
        <div class='snow middleground layered'></div>
        <div class='snow background'></div>
        <div class='snow background layered'></div>
    </div>
  <header>
	<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
            <div class="container">
                <a href="${pageContext.request.contextPath}/home" class="navbar-branch">
                    <img src="./image/logo.jpg" height ="40">
                </a>
                <form method="POST" action="search?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                	<input type="text" placeholder="Bạn tìm gì ..." class="input" id="navbarResponsive" name="search">
                	<input type="submit" value="Tìm Kiếm" class="submit">
                </form>
                <a href="" class="cart" id="navbarResponsive">
                    <i class="fas fa-shopping-cart">  Giỏ hàng</i>
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" 
                data-target="#navbarResponsive">
                <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                <c:if test="${empty tenkhachhang}">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item button">
                            <a class="nav-link" href="${pageContext.request.contextPath}/DangKi">Đăng Kí</a>
                        </li>
                        <li class="nav-item button">
                            <a class="nav-link" href="${pageContext.request.contextPath}/DangNhap">Đăng Nhập</a>
                        </li>
                    </ul>
                </c:if>
                <c:if test="${not empty tenkhachhang}">
                	<span style="margin-left: 10px;">${tenkhachhang }</span>
                    <a href="${pageContext.request.contextPath}/DangXuat" style="margin-left:10px; color:black">Thoát</a>
                </c:if>
                </div>
            </div>
        </nav>
    </header>
    <!-- xử lí phần menu -->
    <div class="menuxanh">
        <div class="container">
            <ul class="menu">
                <li class="chung ">
                    <a href="DienThoaiList?tenkhachhang=${tenkhachhang}&tenTK=${tenTK}">
                        <i class="fas fa-mobile-alt">   Điện thoại</i> 
                    </a>
                </li>
                <li class=" chung">
                    <a href="LTList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                        <i class="fas fa-laptop">  LapTop</i>
                    </a>
                </li>
                <li class="chung">
                    <a href="TBList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                        <i class="fas fa-tablet-alt">  Tablet</i>
                    </a>
                </li>
                <li class="chung">
                    <a href="PKList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                        <i class="fas fa-headphones">  Phụ kiện</i>
                    </a>
                </li>
                <li class="chung">
                    <a href="DongHoList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                        <i class="fas fa-clock">   Đồng hồ</i>
                    </a>
                </li>
                <li class="chung">
                    <a href="PCList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                        <i class="fas fa-desktop">  PC,Máy in</i>
                    </a>
                </li>
            </ul>
        </div>
    </div>