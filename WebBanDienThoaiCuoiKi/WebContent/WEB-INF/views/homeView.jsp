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
    <title>Thế Giới Điện Thoại</title>
  </head>
  <body>
 
     <jsp:include page="_header.jsp"></jsp:include>
     <div class="container">
        <div id="slides" class="carousel slide" data-ride="carousel">
            <ul class="carousel-indicators">
                <li data-target="#slides" data-slide-to="0" class="active"></li>
                <li data-target="#slides" data-slide-to="1"></li>
                <li data-target="#slides" data-slide-to="2"></li>
                <li data-target="#slides" data-slide-to="3"></li>
                <li data-target="#slides" data-slide-to="4"></li>
                <li data-target="#slides" data-slide-to="5"></li>
                <li data-target="#slides" data-slide-to="6"></li>
                <li data-target="#slides" data-slide-to="7"></li>
            </ul>
            <div class="carousel-inner">
                <div class="carousel-item active">
                 	<img src="./image/800-300-800x300-15.png" />
                </div>
                <div class="carousel-item">
                    <img src="./image/800-300-800x300-17.png">
                </div>
                <div class="carousel-item">
                    <img src="./image/big-pk-800-300-800x300-1.png">
                </div>
                <div class="carousel-item">
                    <img src="./image/iphone-12-800-300-800x300-3.png">
                </div>
                <div class="carousel-item">
                    <img src="./image/M51-800-300-800x300.png">
                </div>
                <div class="carousel-item">
                    <img src="./image/Note10plus-800-300-800x300.png">
                </div>
                <div class="carousel-item">
                    <img src="./image/Note9Series-800-300-800x300.png">
                </div>
                <div class="carousel-item">
                    <img src="./image/reno4-800-300-800x300-1.png">
                </div>
            </div>
        </div>

    </div>
    <!-- Điện thoại nổi bật -->
    <div class="container">
        <div class="dienthoainoibat">
            <h1 class="tieudetrai">ĐIỆN THOẠI
                <a href="DienThoaiList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">Xem tất cả</a>
            </h1>
            <ul class="dsdienthoai">
            	<%int i =1; int j=1; %>
				<c:forEach items="${listDienThoai}" var="dt">
                <li class="thunhatdienthoai">
                    <ul>
                        <li class="img">
                            <a href="DienThoai?maDT=${dt.maDT}&tenkhachang=${tenkhachhang}&tenTK=${tenTK}">
                                <img class="hinhanh" src="data:image/png;base64,${dt.hinhanh }" alt="" width="180px" height="180px">
                                <h4>${dt.ten}</h4>
                            </a>
                        </li>
                        <li class="button">
                            <span></span>
                        </li>
                        <li class="money">
                            <strong>${dt.dongia }  đ</strong>
                        </li>
                    </ul>
                </li>
                <%if(i ==4){
				i=0;
				j=j+1;
				out.print("</ul>");
				out.print("<ul class='dsdienthoai'>");
				}
                if(j ==3 )
                	break;
				%>
				<%i =i+1;%>
				</c:forEach>
				</ul>
        </div>
    </div>
    <!-- laptop nổi bật -->
    <div class="container">
        <div class="laptopnoibat">
            <h1 class="tieudetrai">LAPTOP
                <a href="LTList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">Xem tất cả</a>
            </h1>
            <ul class="dsphukien">
            <%int lt =1; %>
            <c:forEach items="${ listLT}" var="laptop">
                <li class="thunhat">
                    <ul>
                        <li class="img">
                            <a href="LapTop?maLT=${laptop.maLT}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                <img class="hinhanh" src="data:image/png;base64,${laptop.hinhanh }" alt="" width="180px" height="120px">
                                <h4>${laptop.ten }</h4>
                            </a>
                        </li>
                        <li class="button" style="margin-top:50px">
                            <span>${laptop.dacdiem1}</span>
                            <span>${laptop.dacdiem2 }</span>
                        </li>
                        <li class="money">
                            <strong>${laptop.dongia}</strong>
                        </li>
                    </ul>
                </li>
                <%if(lt ==4){
				out.print("</ul>");
				break;
				}%>
				<%lt =lt+1;%>
				</c:forEach>
			</ul>
        </div>
    </div>
    <!-- tablet nổi bật -->
    <div class="container">
        <div class="tabletnoibat">
            <h1 class="tieudetrai">TABLET
                <a href="TBList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">Xem tất cả</a>
            </h1>
            <ul class="dsphukien">
            <%int tb =1; %>
			<c:forEach items="${TBList}" var="tb">
                <li class="thunhat">
                    <ul>
                        <li class="img">
                            <a href="Tablet?maTB=${tb.maTB}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                <img class="hinhanh" src="data:image/png;base64,${tb.hinhanh }" alt="" width="180px" height="180px">
                                <h4>${tb.ten }</h4>
                            </a>
                        </li>
                        <li class="button">
                            <span></span>
                            <span></span>
                        </li>
                        <li class="money">
                            <strong>${tb.dongia } đ</strong>
                        </li>
                    </ul>
                </li>
                <%if(tb ==4){
				out.print("</ul>");
				break;
				}%>
				<%tb =tb+1;%>
				</c:forEach>
            </ul>
        </div>
    </div>
    <div class="container">
        <div class="phukiengiare">
            <h1 class="tieudetrai">PHỤ KIỆN
                <a href="PKList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">Xem tất cả</a>
            </h1>
            <ul class="dsphukien">
            <%int pk =1; %>
			<c:forEach items="${PKList}" var="pk">
                <li class="thunhat">
                    <ul>
                        <li class="img">
                            <a href="PhuKien?maPK=${pk.maPK}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                <img class="hinhanh" src="data:image/png;base64,${pk.hinhanh }" alt="" width="180px" height="180px">
                                <h4>${pk.ten}</h4>
                            </a>
                        </li>
                        <li class="button">
                            <span>${pk.dacdiem1}</span>
                    		<span>${pk.dacdiem2}</span>
                        </li>
                        <li class="money">
                            <strong>${pk.dongia} đ</strong>
                        </li>
                    </ul>
                </li>
                <%if(pk ==4){
				out.print("</ul>");
				break;
				}%>
				<%pk =pk+1;%>
				</c:forEach>
            </ul>
        </div>
    </div>
    <div class="container">
        <div class="donghothongminh">
            <h1 class="tieudetrai">ĐỒNG HỒ
                <a href="DongHoList?tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">Xem tất cả</a>
            </h1>
            <ul class="dsphukien">
            <%int dh =1; %>
			<c:forEach items="${DHList}" var="dh">
                <li class="thunhat">
                    <ul>
                        <li class="img">
                            <a href="DongHo?maDH=${dh.maDH}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                <img class="hinhanh" src="data:image/png;base64,${dh.hinhanh }" alt="" width="180px" height="180px">
                                <h4>${dh.ten}</h4>
                            </a>
                        </li>
                        <li class="button" style="margin-top:50px">
                            <span>${dh.dacdiem1 }</span>
                    		<span>${dh.dacdiem2 }</span>
                        </li>
                        <li class="money">
                            <strong>${dh.dongia} đ</strong>
                        </li>
                    </ul>
                </li>
                <%if(dh ==4){
				out.print("</ul>");
				break;
				}%>
				<%dh =dh+1;%>
				</c:forEach>
            </ul>
        </div>
    </div>
    <c:if test="${not empty message }">
    	<script>
    		alert("Thêm giỏ hàng thành công")
    	</script>
    </c:if>
     <jsp:include page="_footer.jsp"></jsp:include> 
  </body>
</html>