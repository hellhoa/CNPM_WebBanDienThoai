<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation" id="navbar">
            <!-- navbar-header -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>

        </nav>
        <nav class="navbar-default navbar-static-side" role="navigation">
            <!-- sidebar-collapse -->
            <div class="sidebar-collapse">
                <!-- side-menu -->
                <ul class="nav" id="side-menu">
                    <li>
                            <div class="user-info">
                                <div><strong>${tenAdmin}</strong>
                                </div>
                                <div class="user-text-online">
                                    <span class="user-circle-online btn btn-success btn-circle "></span>&nbsp;Online
                                </div>
                            </div>
                    </li>
                    <li class="selected">
                        <a href="#"><i class="fa fa-dashboard fa-fw"></i>Dashboard</a>
                    </li>

                     <li id="sanpham">
                        <a href="sanphamadmin?tenAdmin=${tenAdmin }&maAD=${maAD}&phanquyen=${phanquyen}"><i class="fab fa-product-hunt"></i>  Sản Phẩm</a>
                    </li>
                    <li id="baiviet">
                        <a href="baivietadmin?tenAdmin=${tenAdmin }&maAD=${maAD}&phanquyen=${phanquyen}"><i class="far fa-file-word"></i>  Bài Viết</a>
                    </li>
                    <li id="donhang">
                        <a href="donhangadmin?tenAdmin=${tenAdmin }&maAD=${maAD}&phanquyen=${phanquyen}"><i class="far fa-file-alt"></i>   Đơn Hàng</a>
                    </li>
					<li id="taikhoan">
                        <a href="taikhoan?tenAdmin=${tenAdmin }&maAD=${maAD}&phanquyen=${phanquyen}"><i class="far fa-user-circle"></i>   Tài Khoản</a>
                    </li>
                    <li id="thoat">
                        <a href="thoat?"><i class="far fa-times-circle"></i>   Thoát</a>
                    </li>
                </ul>
            </div>
        </nav>