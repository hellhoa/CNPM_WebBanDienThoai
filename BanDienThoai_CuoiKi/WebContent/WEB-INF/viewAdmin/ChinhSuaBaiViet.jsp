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
                <form method="POST" action="${pageContext.request.contextPath}/chinhsuabaiviet?masp=${baiviet.masp}&tenAdmin=${tenAdmin }&maAD=${maAD}">
				<h1>Mã Bài Viết:${baiviet.masp }</h1>
				<h1>Mã Sản Phẩm:${baiviet.masp }</h1>
				
				<h3>${baiviet.tieude }</h3><br>
				<textarea name="noidung1" cols="100" rows="5" >${baiviet.noidung1 }</textarea><br>
				<img class="hinhanh" src="data:image/png;base64,${baiviet.hinhanh1 }" alt="" width="180px" height="180px">
				<span>Đường dẫn hình ảnh thay thế:</span> <input type="text" placeholder="C:\" name="hinhanh1" value=""><br>
				<textarea name="noidung2" cols="100" rows="5" >${baiviet.noidung2 }</textarea><br>
				<img class="hinhanh" src="data:image/png;base64,${baiviet.hinhanh2 }" alt="" width="180px" height="180px">
				<span>Đường dẫn hình ảnh thay thế:</span> <input type="text" placeholder="C:\" name="hinhanh2"><br>
				<textarea name="noidung3" cols="100" rows="5" >${baiviet.noidung3 }</textarea><br>
				<img class="hinhanh" src="data:image/png;base64,${baiviet.hinhanh3 }" alt="" width="180px" height="180px">
				<span>Đường dẫn hình ảnh thay thế:</span> <input type="text" placeholder="C:\" name="hinhanh3"><br>
				<textarea name="noidung4" cols="100" rows="5" >${baiviet.noidung4 }</textarea><br>
				<img class="hinhanh" src="data:image/png;base64,${baiviet.hinhanh4 }" alt="" width="180px" height="180px">
				<span>Đường dẫn hình ảnh thay thế:</span> <input type="text" placeholder="C:\" name="hinhanh4"><br>
				<textarea name="noidung5" cols="100" rows="5" >${baiviet.noidung5 }</textarea><br>
				<img class="hinhanh" src="data:image/png;base64,${baiviet.hinhanh5 }" alt="" width="180px" height="180px">
				<span>Đường dẫn hình ảnh thay thế:</span> <input type="text" placeholder="C:\" name="hinhanh5"><br>
				<textarea name="noidung6" cols="100" rows="5" >${baiviet.noidung6 }</textarea><br>
				<img class="hinhanh" src="data:image/png;base64,${baiviet.hinhanh6 }" alt="" width="180px" height="180px">
				<span>Đường dẫn hình ảnh thay thế:</span> <input type="text" placeholder="C:\" name="hinhanh6"><br>
				<textarea name="noidung7" cols="100" rows="5" >${baiviet.noidung7 }</textarea><br>
				<img class="hinhanh" src="data:image/png;base64,${baiviet.hinhanh7 }" alt="" width="180px" height="180px">
				<span>Đường dẫn hình ảnh thay thế:</span> <input type="text" placeholder="C:\" name="hinhanh7"><br>
				<textarea name="noidung8" cols="100" rows="5" >${baiviet.noidung8 }</textarea><br>
				<img class="hinhanh" src="data:image/png;base64,${baiviet.hinhanh8 }" alt="" width="180px" height="180px">
				<span>Đường dẫn hình ảnh thay thế:</span> <input type="text" placeholder="C:\" name="hinhanh8"><br>
				<input type="submit" class="btn" value="Cập Nhập" style="margin-top:2%;background-color:red;color:white">
				</form>
            </div>

        </div>
    </div>
    </div>
    <script>
    function fileSelect(id, e){
        var file=e.target.files[0].name;
        alert(file);
    }
    </script>
</body>

</html>