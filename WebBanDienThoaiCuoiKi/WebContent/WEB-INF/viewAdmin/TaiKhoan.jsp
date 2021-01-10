<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin</title>
    
    <link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <link href="assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
    <link href="assets/css/main-style.css" rel="stylesheet" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <!-- Page-Level CSS -->
    <link href="assets/plugins/morris/morris-0.4.3.min.css" rel="stylesheet" />
   </head>
<body>
    <div id="wrapper">
        <jsp:include page="header.jsp"></jsp:include>
        <div id="page-wrapper">

            <div class="row">
                <div class="col-lg-12">
						<table border="1" cellpadding="30" cellspacing="3" width="100%">
       						<tr  align="center">
          						<th >Mã Admin</th>
          						<th >Tên Tài Khoản</th>
          						<th >Mật Khẩu</th>
          						<th >Tên Admin</th>
          						<th >Tuổi</th>
          						<th>Phân Quyền</th>
          						<th >Chỉnh Sửa Thông Tin</th>
          						<th >Xóa Tài Khoản Admin</th>
       						</tr>
       						<c:forEach items="${danhsachtaikhoan}" var="tk" >
          					<tr align="center">
             					<td>${tk.maAD}   </td>
             					<td>${tk.tenTK}   </td>
             					<td>${tk.matkhau}  </td>
             					<td>${tk.tenAdmin}   </td>
             					<td>${tk.tuoi}   </td>
             					<td>${tk.phanquyen}</td>
             					<td>
                					<a href="suaadmin?tenAdmin=${tenAdmin }&maAD=${maAD}&maAdmin=${tk.maAD}">Sửa   </a>
             					</td>
             					<td>
                					<a href="xoaadmin?tenAdmin=${tenAdmin }&maAD=${maAD}&maAdmin=${tk.maAD}">Xóa  </a>
             					</td>
          					</tr>
       						</c:forEach>
    					</table>
    					<a href="themadmin?tenAdmin=${tenAdmin }&maAD=${maAD}">Thêm Tài Khoản  </a>
    					<table border="1" cellpadding="30" cellspacing="3" width="100%" style="margin-top:20%">
       						<tr  align="center">
          						<th width="14%">Mã Khách Hàng</th>
          						<th width="14%">Tên Tài Khoản</th>
          						<th width="14%">Mật Khẩu</th>
          						<th width="14%">Địa Chỉ Giao Hàng</th>
          						<th width="14%">Tên Khách Hàng</th>
       						</tr>
       						<c:forEach items="${danhsachtaikhoanKH}" var="kh" >
          					<tr align="center">
             					<td>${kh.maKH}   </td>
             					<td>${kh.tenTK}   </td>
             					<td>${kh.matkhau}  </td>
             					<td>${kh.diachigiaohang}   </td>
             					<td>${kh.tenkhachhang}   </td>
          					</tr>
       						</c:forEach>
    					</table>
						
                </div>
            </div>

        </div>
    </div>
</body>

</html>