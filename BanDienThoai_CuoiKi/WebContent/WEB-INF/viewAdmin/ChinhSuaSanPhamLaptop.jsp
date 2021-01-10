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
						<form method="POST" action="${pageContext.request.contextPath}/chinhsuasanpham?tenAdmin=${tenAdmin }&maAD=${maAD}&maSP=${laptop.maLT}">
						<h2>Mã Sản Phẩm : ${laptop.maLT}</h2>
  								
								<div class="textbox" style="margin-top:2%">
									<h5>Tên Sản Phẩm</h5>
    								<input type="text" placeholder="Tên Sản Phẩm" name="ten"  value="${laptop.ten }" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đơn Giá</h5>
    								<input type="text"  name="dongia" value="${laptop.dongia }" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Số Lượng</h5>
    								<input type="text"  name="soluong" value="${laptop.soluong }" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Hình Ảnh</h5>
    								<img class="hinhanh" src="data:image/png;base64,${laptop.hinhanh }" alt="" width="180px" height="180px">
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đường dẫn tới hình ảnh mới:</h5>
    								<input type="text"  name="hinhanhnew" placeholder="C:\" value="">
  								</div>
  								<div class="textbox" style="margin-top:2%;" id="manhinh">
    								<h5>Màn Hình:</h5>
    								<input type="text"  name="manhinh" id="manhinh" value="${laptop.manhinh }" >
  								</div>
  								<div class="textbox" style="margin-top:2%;" id="hedieuhanh">
    								<h5>Hệ Điều Hành:</h5>
    								<input type="text"  name="hedieuhanh" id="hedieuhanh" value="${laptop.hedieuhanh }" >
  								</div>
  							
  								<div class="textbox" style="margin-top:2%;" id="cpu">
    								<h5>CPU:</h5>
    								<input type="text"  name="cpu"  id="cpu"value="${laptop.cpu }" >
  								</div>
  								<div class="textbox" style="margin-top:2%;" id="ram">
    								<h5>RAM:</h5>
    								<input type="text"  name="ram" id="ram" value="${laptop.ram }" >
  								</div>
  								
  								
  								<div class="textbox" id="ocung" style="margin-top:2%;">
    								<h5>Ổ cứng:</h5>
    								<input type="text"  name="ocung" id="ocung" value="${laptop.ocung }" >
  								</div>
  								<div class="textbox" id="cardmanhinh" style="margin-top:2%;">
    								<h5>Card màn hình:</h5>
    								<input type="text"  name="cardmanhinh" id="cardmanhinh" value="${laptop.cardmanhinh }" >
  								</div>
  								<div class="textbox" id="congketnoi" style="margin-top:2%;">
    								<h5>Cổng kết nối:</h5>
    								<input type="text"  name="congketnoi" id="congketnoi" value="${laptop.congketnoi }" >
  								</div>
  								<div class="textbox" id="thietke" style="margin-top:2%;">
    								<h5>Thiết Kế:</h5>
    								<input type="text"  name="thietke" id="thietke" value="${laptop.thietke }" >
  								</div>
  								<div class="textbox" id="kichthuoc" style="margin-top:2%;">
    								<h5>Kích thước:</h5>
    								<input type="text"  name="kichthuoc" id="kichthuoc" value="${laptop.kichthuoc }" >
  								</div>
  								<div class="textbox" id="thoidiemramat" style="margin-top:2%;">
    								<h5>Thời điểm ra mắt:</h5>
    								<input type="text"  name="thoidiemramat" id="thoidiemramat" value="${laptop.thoidiemramat}" >
  								</div>
  							<input type="submit" class="btn" value="Cập Nhập" style="margin-top:5%">
						</form>
						
                </div>
            </div>

        </div>
    </div>
</body>

</html>