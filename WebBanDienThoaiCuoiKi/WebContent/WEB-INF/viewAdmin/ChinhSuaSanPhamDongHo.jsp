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
                <div class="col-lg-12" style="text-align:center;">
						<form method="POST" action="${pageContext.request.contextPath}/chinhsuasanpham?tenAdmin=${tenAdmin }&maAD=${maAD}&maSP=${dongho.maDH}">
						<h2>Mã Sản Phẩm : ${dongho.maDH}</h2>
  								
								<div class="textbox" style="margin-top:2%">
									<h5>Tên Sản Phẩm</h5>
    								<input type="text" placeholder="Tên Sản Phẩm" name="ten"  value="${dongho.ten }">
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đơn Giá</h5>
    								<input type="text"  name="dongia" value="${dongho.dongia }" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Số Lượng</h5>
    								<input type="text"  name="soluong" value="${dongho.soluong }" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Hình ảnh</h5>
    								<img class="hinhanh" src="data:image/png;base64,${dongho.hinhanh }" alt="" width="180px" height="180px">
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đường dẫn tới hình ảnh mới:</h5>
    								<input type="text"  name="dongia" placeholder="C:\" value="">
  								</div>
  								
  								<div class="textbox" style="margin-top:2%;" id="manhinh">
    								<h5>Màn Hình:</h5>
    								<input type="text"  name="congnghemanhinh" id="manhinh" value="${dongho.congnghemanhinh }" >
  								</div>
  								<div class="textbox" style="margin-top:2%;" id="hedieuhanh">
    								<h5>Hệ Điều Hành:</h5>
    								<input type="text"  name="hedieuhanh" id="hedieuhanh" value="${dongho.hedieuhanh }" >
  								</div>
  								
  								<div class="textbox" id="kichthuocmanhinh" style="margin-top:2%;">
    								<h5>Kích Thước Màn Hình:</h5>
    								<input type="text"  name="kichthuocmanhinh" id="kichthuocmanhinh" value="${dongho.kichthuocmanhinh }" >
  								</div>
  								<div class="textbox" id="thoigiansudung" style="margin-top:2%;">
    								<h5>Thời gian sử dụng:</h5>
    								<input type="text"  name="thoigiansudung" id="thoigiansudung" value="${dongho.thoigiansudung }" >
  								</div>
  								<div class="textbox" id="chatlieumat" style="margin-top:2%;">
    								<h5>Chất Liệu Mặt:</h5>
    								<input type="text"  name="chatlieumat" id="chatlieumat" value="${dongho.chatlieumat }" >
  								</div>
  								<div class="textbox" id="duongkinhmat" style="margin-top:2%;">
    								<h5>Đường Kính Mặt:</h5>
    								<input type="text"  name="duongkinhmat" id="duongkinhmat" value="${dongho.duongkinhmat }" >
  								</div>
  								<div class="textbox" id="ketnoi" style="margin-top:2%;">
    								<h5>Kết nối:</h5>
    								<input type="text"  name="ketnoi" id="ketnoi" value="${dongho.ketnoi }" >
  								</div>
  								<div class="textbox" id="ngonngu" style="margin-top:2%;">
    								<h5>Ngôn Ngữ :</h5>
    								<input type="text"  name="ngonngu" id="ngonngu" value="${dongho.ngonngu }" >
  								</div>
  								<div class="textbox" id="theodoisuckhoe" style="margin-top:2%;">
    								<h5>Theo Dõi Sức Khỏe:</h5>
    								<input type="text"  name="theodoisuckhoe" id="theodoisuckhoe" value="${dongho.theodoisuckhoe }" >
  								</div>
  								
  							<input type="submit" class="btn" value="Cập Nhập" style="margin-top:5%">
						</form>
						
                </div>
            </div>

        </div>
    </div>
</body>

</html>