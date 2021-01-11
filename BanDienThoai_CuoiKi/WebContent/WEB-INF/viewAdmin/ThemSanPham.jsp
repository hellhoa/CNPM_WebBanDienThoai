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
						<form method="POST" action="${pageContext.request.contextPath}/themsanpham?tenAdmin=${tenAdmin }&maAD=${maAD}&maSP=${maSP}">
						<h2>Mã Sản Phẩm : ${maSP}</h2>

  								<div class="textbox" style="margin-top:2%">
  									<h5>Loại Sản Phẩm:</h5>
    								<select id="myselect" name="theloai" onchange="select(this)">
    									<option value="1" selected>Thể Loại</option>
        								<option value="2">Điện Thoại</option>
        								<option value="3">LapTop</option>
        								<option value="4">Tablet</option>
        								<option value="5">Đồng Hồ</option>
        								<option value="7">Phụ Kiện</option>
        								<option value="6">PC</option>
    								</select>
  								</div>
  								
								<div class="textbox" style="margin-top:2%">
									<h5>Tên Sản Phẩm</h5>
    								<input type="text" placeholder="Tên Sản Phẩm" name="ten" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đơn Giá</h5>
    								<input type="text"  name="dongia" value="100000" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Số Lượng</h5>
    								<input type="text"  name="soluong" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đường dẫn tới hình ảnh:</h5>
    								<input type="text"  name="hinhanhnew" placeholder="C:\" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đặc Điểm 1:</h5>
    								<input type="text"  name="dacdiem1" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đặc Điểm 2:</h5>
    								<input type="text"  name="dacdiem2" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="manhinh">
    								<h5>Màn Hình:</h5>
    								<input type="text"  name="manhinh" id="manhinh" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="hedieuhanh">
    								<h5>Hệ Điều Hành:</h5>
    								<input type="text"  name="hedieuhanh" id="hedieuhanh" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="camerasau">
    								<h5>Camera Sau:</h5>
    								<input type="text"  name="camerasau" id="camerasau" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="cameratruoc">
    								<h5>Camera trước:</h5>
    								<input type="text"  name="cameratruoc" id="cameratruoc" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="cpu">
    								<h5>CPU:</h5>
    								<input type="text"  name="cpu"  id="cpu"value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="ram">
    								<h5>RAM:</h5>
    								<input type="text"  name="ram" id="ram" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="bonhotrong">
    								<h5>Bộ Nhớ Trong:</h5>
    								<input type="text"  name="bonhotrong" id="bonhotrong" value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="thenho">
    								<h5>Thẻ Nhớ:</h5>
    								<input type="text"  name="thenho"  id="thenho"value="" >
  								</div>
  								<div class="textbox" style="margin-top:2%;display: none;" id="thesim">
    								<h5>Thẻ Sim:</h5>
    								<input type="text"  name="thesim" id="thesim" value="" >
  								</div>
  								<div class="textbox" id="dungluongpin" style="margin-top:2%;display: none;">
    								<h5>Dung Lượng Pin:</h5>
    								<input type="text"  name="dungluongpin" id="dungluongpin" value="" >
  								</div>
  								<div class="textbox" id="ocung" style="margin-top:2%;display: none;">
    								<h5>Ổ cứng:</h5>
    								<input type="text"  name="ocung" id="ocung" value="" >
  								</div>
  								<div class="textbox" id="cardmanhinh" style="margin-top:2%;display: none;">
    								<h5>Card màn hình:</h5>
    								<input type="text"  name="cardmanhinh" id="cardmanhinh" value="" >
  								</div>
  								<div class="textbox" id="congketnoi" style="margin-top:2%;display: none;">
    								<h5>Cổng kết nối:</h5>
    								<input type="text"  name="congketnoi" id="congketnoi" value="" >
  								</div>
  								<div class="textbox" id="thietke" style="margin-top:2%;display: none;">
    								<h5>Thiết Kế:</h5>
    								<input type="text"  name="thietke" id="thietke" value="" >
  								</div>
  								<div class="textbox" id="kichthuoc" style="margin-top:2%;display: none;">
    								<h5>Kích thước:</h5>
    								<input type="text"  name="kichthuoc" id="kichthuoc" value="" >
  								</div>
  								<div class="textbox" id="thoidiemramat" style="margin-top:2%;display: none;">
    								<h5>Thời điểm ra mắt:</h5>
    								<input type="text"  name="thoidiemramat" id="thoidiemramat" value="" >
  								</div>
  								<div class="textbox" id="damthoai" style="margin-top:2%;display: none;">
    								<h5>Đàm Thoại:</h5>
    								<input type="text"  name="damthoai" id="damthoai" value="" >
  								</div>
  								<div class="textbox" id="trongluong" style="margin-top:2%;display: none;">
    								<h5>Trọng Lượng:</h5>
    								<input type="text"  name="trongluong" id="trongluong" value="" >
  								</div>
  								<div class="textbox" id="mucNltieuthu" style="margin-top:2%;display: none;">
    								<h5>Mức Năng Lượng Tiêu Thụ:</h5>
    								<input type="text"  name="mucNLtieuthu" id="mucNltieuthu" value="" >
  								</div>
  								<div class="textbox" id="kichthuocmanhinh" style="margin-top:2%;display: none;">
    								<h5>Kích Thước Màn Hình:</h5>
    								<input type="text"  name="kichthuocmanhinh" id="kichthuocmanhinh" value="" >
  								</div>
  								<div class="textbox" id="thoigiansudung" style="margin-top:2%;display: none;">
    								<h5>Thời gian sử dụng:</h5>
    								<input type="text"  name="thoigiansudung" id="thoigiansudung" value="" >
  								</div>
  								<div class="textbox" id="chatlieumat" style="margin-top:2%;display: none;">
    								<h5>Chất Liệu Mặt:</h5>
    								<input type="text"  name="chatlieumat" id="chatlieumat" value="" >
  								</div>
  								<div class="textbox" id="duongkinhmat" style="margin-top:2%;display: none;">
    								<h5>Đường Kính Mặt:</h5>
    								<input type="text"  name="duongkinhmat" id="duongkinhmat" value="" >
  								</div>
  								<div class="textbox" id="ketnoi" style="margin-top:2%;display: none;">
    								<h5>Kết nối:</h5>
    								<input type="text"  name="ketnoi" id="ketnoi" value="" >
  								</div>
  								<div class="textbox" id="ngonngu" style="margin-top:2%;display: none;">
    								<h5>Ngôn Ngữ :</h5>
    								<input type="text"  name="ngonngu" id="ngonngu" value="" >
  								</div>
  								<div class="textbox" id="theodoisuckhoe" style="margin-top:2%;display: none;">
    								<h5>Theo Dõi Sức Khỏe:</h5>
    								<input type="text"  name="theodoisuckhoe" id="theodoisuckhoe" value="" >
  								</div>
  								<div class="textbox" id="dophangiai" style="margin-top:2%;display: none;">
    								<h5>Độ Phân Giải:</h5>
    								<input type="text"  name="dophangiai" id="dophangiai" value="" >
  								</div>
  								<div class="textbox" id="congnghemanhinh" style="margin-top:2%;display: none;">
    								<h5>Công Nghệ Màn Hình:</h5>
    								<input type="text"  name="congnghemanhinh" id="congnghemanhinh" value="" >
  								</div>
  								<div class="textbox" id="dotuongphan" style="margin-top:2%;display: none;">
    								<h5>Độ tương Phản:</h5>
    								<input type="text"  name="dotuongphan" id="dotuongphan" value="" >
  								</div>
  								<div class="textbox" id="thoigiandapung" style="margin-top:2%;display: none;">
    								<h5>Thời Gian Đáp Ứng:</h5>
    								<input type="text"  name="thoigiandapung" id="thoigiandapung" value="" >
  								</div>
  								<div class="textbox" id="gocnhin" style="margin-top:2%;display: none;">
    								<h5>Góc Nhìn:</h5>
    								<input type="text"  name="gocnhin" id="gocnhin" value="" >
  								</div>
  							<input type="submit" class="btn" value="Thêm Sản Phẩm" style="margin-top:5%">
						</form>
						
                </div>
            </div>

        </div>
     <script>
    function select(obj)
    {

        var options = obj.children;
        for (var i = 0; i < options.length; i++){
        	if (options[i].selected && i==0){
            	document.getElementById("manhinh").style.display = "none";
                document.getElementById("hedieuhanh").style.display = "none";
                document.getElementById("camerasau").style.display = "none";
                document.getElementById("cameratruoc").style.display = "none";
                document.getElementById("cpu").style.display = "none";
                document.getElementById("ram").style.display = "none";
                document.getElementById("bonhotrong").style.display = "none";
                document.getElementById("thenho").style.display = "none";
                document.getElementById("thesim").style.display = "none";
                document.getElementById("dungluongpin").style.display = "none";
                document.getElementById("ocung").style.display = "none";
                document.getElementById("cardmanhinh").style.display = "none";
                document.getElementById("congketnoi").style.display = "none";
                document.getElementById("thietke").style.display = "none";
                document.getElementById("kichthuoc").style.display = "none";
                document.getElementById("thoidiemramat").style.display = "none";
                document.getElementById("damthoai").style.display = "none";
                document.getElementById("trongluong").style.display = "none";
                document.getElementById("mucNltieuthu").style.display = "none";
                document.getElementById("kichthuocmanhinh").style.display = "none";
                document.getElementById("thoigiansudung").style.display = "none";
                document.getElementById("chatlieumat").style.display = "none";
                document.getElementById("duongkinhmat").style.display = "none";
                document.getElementById("ketnoi").style.display = "none";
                document.getElementById("ngonngu").style.display = "none";
                document.getElementById("theodoisuckhoe").style.display = "none";
                document.getElementById("dophangiai").style.display = "none";
                document.getElementById("congnghemanhinh").style.display = "none";
                document.getElementById("dotuongphan").style.display = "none";
                document.getElementById("thoigiandapung").style.display = "none";
                document.getElementById("gocnhin").style.display = "none";
            }
                   	 
                    if (options[i].selected && i==1){
                    	document.getElementById("manhinh").style.display = "block";
                        document.getElementById("hedieuhanh").style.display = "block";
                        document.getElementById("camerasau").style.display = "block";
                        document.getElementById("cameratruoc").style.display = "block";
                        document.getElementById("cpu").style.display = "block";
                        document.getElementById("ram").style.display = "block";
                        document.getElementById("bonhotrong").style.display = "block";
                        document.getElementById("thenho").style.display = "block";
                        document.getElementById("thesim").style.display = "block";
                        document.getElementById("dungluongpin").style.display = "block";
                        document.getElementById("ocung").style.display = "none";
                        document.getElementById("cardmanhinh").style.display = "none";
                        document.getElementById("congketnoi").style.display = "none";
                        document.getElementById("thietke").style.display = "none";
                        document.getElementById("kichthuoc").style.display = "none";
                        document.getElementById("thoidiemramat").style.display = "none";
                        document.getElementById("damthoai").style.display = "none";
                        document.getElementById("trongluong").style.display = "none";
                        document.getElementById("mucNltieuthu").style.display = "none";
                        document.getElementById("kichthuocmanhinh").style.display = "none";
                        document.getElementById("thoigiansudung").style.display = "none";
                        document.getElementById("chatlieumat").style.display = "none";
                        document.getElementById("duongkinhmat").style.display = "none";
                        document.getElementById("ketnoi").style.display = "none";
                        document.getElementById("ngonngu").style.display = "none";
                        document.getElementById("theodoisuckhoe").style.display = "none";
                        document.getElementById("dophangiai").style.display = "none";
                        document.getElementById("congnghemanhinh").style.display = "none";
                        document.getElementById("dotuongphan").style.display = "none";
                        document.getElementById("thoigiandapung").style.display = "none";
                        document.getElementById("gocnhin").style.display = "none";
                    }
                    if (options[i].selected && i==2){
                    	document.getElementById("manhinh").style.display = "block";
                        document.getElementById("hedieuhanh").style.display = "block";
                        document.getElementById("camerasau").style.display = "none";
                        document.getElementById("cameratruoc").style.display = "none";
                        document.getElementById("cpu").style.display = "block";
                        document.getElementById("ram").style.display = "block";
                        document.getElementById("bonhotrong").style.display = "none";
                        document.getElementById("thenho").style.display = "none";
                        document.getElementById("thesim").style.display = "none";
                        document.getElementById("dungluongpin").style.display = "none";
                        document.getElementById("ocung").style.display = "block";
                        document.getElementById("cardmanhinh").style.display = "block";
                        document.getElementById("congketnoi").style.display = "block";
                        document.getElementById("thietke").style.display = "block";
                        document.getElementById("kichthuoc").style.display = "block";
                        document.getElementById("thoidiemramat").style.display = "block";
                        document.getElementById("damthoai").style.display = "none";
                        document.getElementById("trongluong").style.display = "none";
                        document.getElementById("mucNltieuthu").style.display = "none";
                        document.getElementById("kichthuocmanhinh").style.display = "none";
                        document.getElementById("thoigiansudung").style.display = "none";
                        document.getElementById("chatlieumat").style.display = "none";
                        document.getElementById("duongkinhmat").style.display = "none";
                        document.getElementById("ketnoi").style.display = "none";
                        document.getElementById("ngonngu").style.display = "none";
                        document.getElementById("theodoisuckhoe").style.display = "none";
                        document.getElementById("dophangiai").style.display = "none";
                        document.getElementById("congnghemanhinh").style.display = "none";
                        document.getElementById("dotuongphan").style.display = "none";
                        document.getElementById("thoigiandapung").style.display = "none";
                        document.getElementById("gocnhin").style.display = "none";
                    }
                    if (options[i].selected && i==3){
                    	document.getElementById("manhinh").style.display = "block";
                        document.getElementById("hedieuhanh").style.display = "block";
                        document.getElementById("camerasau").style.display = "block";
                        document.getElementById("cameratruoc").style.display = "block";
                        document.getElementById("cpu").style.display = "block";
                        document.getElementById("ram").style.display = "block";
                        document.getElementById("bonhotrong").style.display = "block";
                        document.getElementById("thenho").style.display = "none";
                        document.getElementById("thesim").style.display = "none";
                        document.getElementById("dungluongpin").style.display = "none";
                        document.getElementById("ocung").style.display = "none";
                        document.getElementById("cardmanhinh").style.display = "none";
                        document.getElementById("congketnoi").style.display = "none";
                        document.getElementById("thietke").style.display = "none";
                        document.getElementById("kichthuoc").style.display = "none";
                        document.getElementById("thoidiemramat").style.display = "none";
                        document.getElementById("damthoai").style.display = "block";
                        document.getElementById("trongluong").style.display = "block";
                        document.getElementById("mucNltieuthu").style.display = "block";
                        document.getElementById("kichthuocmanhinh").style.display = "none";
                        document.getElementById("thoigiansudung").style.display = "none";
                        document.getElementById("chatlieumat").style.display = "none";
                        document.getElementById("duongkinhmat").style.display = "none";
                        document.getElementById("ketnoi").style.display = "none";
                        document.getElementById("ngonngu").style.display = "none";
                        document.getElementById("theodoisuckhoe").style.display = "none";
                        document.getElementById("dophangiai").style.display = "none";
                        document.getElementById("congnghemanhinh").style.display = "none";
                        document.getElementById("dotuongphan").style.display = "none";
                        document.getElementById("thoigiandapung").style.display = "none";
                        document.getElementById("gocnhin").style.display = "none";
                    }
                    if (options[i].selected && i==4){
                    	document.getElementById("manhinh").style.display = "block";
                        document.getElementById("hedieuhanh").style.display = "block";
                        document.getElementById("camerasau").style.display = "none";
                        document.getElementById("cameratruoc").style.display = "none";
                        document.getElementById("cpu").style.display = "none";
                        document.getElementById("ram").style.display = "none";
                        document.getElementById("bonhotrong").style.display = "none";
                        document.getElementById("thenho").style.display = "none";
                        document.getElementById("thesim").style.display = "none";
                        document.getElementById("dungluongpin").style.display = "none";
                        document.getElementById("ocung").style.display = "none";
                        document.getElementById("cardmanhinh").style.display = "none";
                        document.getElementById("congketnoi").style.display = "none";
                        document.getElementById("thietke").style.display = "none";
                        document.getElementById("kichthuoc").style.display = "none";
                        document.getElementById("thoidiemramat").style.display = "none";
                        document.getElementById("damthoai").style.display = "none";
                        document.getElementById("trongluong").style.display = "none";
                        document.getElementById("mucNltieuthu").style.display = "none";
                        document.getElementById("kichthuocmanhinh").style.display = "block";
                        document.getElementById("thoigiansudung").style.display = "block";
                        document.getElementById("chatlieumat").style.display = "block";
                        document.getElementById("duongkinhmat").style.display = "block";
                        document.getElementById("ketnoi").style.display = "block";
                        document.getElementById("ngonngu").style.display = "block";
                        document.getElementById("theodoisuckhoe").style.display = "block";
                        document.getElementById("dophangiai").style.display = "none";
                        document.getElementById("congnghemanhinh").style.display = "none";
                        document.getElementById("dotuongphan").style.display = "none";
                        document.getElementById("thoigiandapung").style.display = "none";
                        document.getElementById("gocnhin").style.display = "none";
                    }
                    if (options[i].selected && i==5){
                    	document.getElementById("manhinh").style.display = "none";
                        document.getElementById("hedieuhanh").style.display = "none";
                        document.getElementById("camerasau").style.display = "none";
                        document.getElementById("cameratruoc").style.display = "none";
                        document.getElementById("cpu").style.display = "none";
                        document.getElementById("ram").style.display = "none";
                        document.getElementById("bonhotrong").style.display = "none";
                        document.getElementById("thenho").style.display = "none";
                        document.getElementById("thesim").style.display = "none";
                        document.getElementById("dungluongpin").style.display = "none";
                        document.getElementById("ocung").style.display = "none";
                        document.getElementById("cardmanhinh").style.display = "none";
                        document.getElementById("congketnoi").style.display = "none";
                        document.getElementById("thietke").style.display = "none";
                        document.getElementById("kichthuoc").style.display = "none";
                        document.getElementById("thoidiemramat").style.display = "none";
                        document.getElementById("damthoai").style.display = "none";
                        document.getElementById("trongluong").style.display = "none";
                        document.getElementById("mucNltieuthu").style.display = "none";
                        document.getElementById("kichthuocmanhinh").style.display = "none";
                        document.getElementById("thoigiansudung").style.display = "none";
                        document.getElementById("chatlieumat").style.display = "none";
                        document.getElementById("duongkinhmat").style.display = "none";
                        document.getElementById("ketnoi").style.display = "none";
                        document.getElementById("ngonngu").style.display = "none";
                        document.getElementById("theodoisuckhoe").style.display = "none";
                        document.getElementById("dophangiai").style.display = "none";
                        document.getElementById("congnghemanhinh").style.display = "none";
                        document.getElementById("dotuongphan").style.display = "none";
                        document.getElementById("thoigiandapung").style.display = "none";
                        document.getElementById("gocnhin").style.display = "none";
                    }
                    if (options[i].selected && i==6){
                    	document.getElementById("manhinh").style.display = "none";
                        document.getElementById("hedieuhanh").style.display = "none";
                        document.getElementById("camerasau").style.display = "none";
                        document.getElementById("cameratruoc").style.display = "none";
                        document.getElementById("cpu").style.display = "none";
                        document.getElementById("ram").style.display = "none";
                        document.getElementById("bonhotrong").style.display = "none";
                        document.getElementById("thenho").style.display = "none";
                        document.getElementById("thesim").style.display = "none";
                        document.getElementById("dungluongpin").style.display = "none";
                        document.getElementById("ocung").style.display = "none";
                        document.getElementById("cardmanhinh").style.display = "none";
                        document.getElementById("congketnoi").style.display = "none";
                        document.getElementById("thietke").style.display = "none";
                        document.getElementById("kichthuoc").style.display = "none";
                        document.getElementById("thoidiemramat").style.display = "none";
                        document.getElementById("damthoai").style.display = "none";
                        document.getElementById("trongluong").style.display = "none";
                        document.getElementById("mucNltieuthu").style.display = "none";
                        document.getElementById("kichthuocmanhinh").style.display = "block";
                        document.getElementById("thoigiansudung").style.display = "none";
                        document.getElementById("chatlieumat").style.display = "none";
                        document.getElementById("duongkinhmat").style.display = "none";
                        document.getElementById("ketnoi").style.display = "none";
                        document.getElementById("ngonngu").style.display = "none";
                        document.getElementById("theodoisuckhoe").style.display = "none";
                        document.getElementById("dophangiai").style.display = "block";
                        document.getElementById("congnghemanhinh").style.display = "block";
                        document.getElementById("dotuongphan").style.display = "block";
                        document.getElementById("thoigiandapung").style.display = "block";
                        document.getElementById("gocnhin").style.display = "block";
                    }
                }
    }
    </script>
    </div>
</body>

</html>