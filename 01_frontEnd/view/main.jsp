<!--
부품마켓(bupummarket) 모바일
Summary: login
Author: Jeongwoo Lee
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html lang="ko">

<head>
<title>모든 자동차 부품 마켓</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="korea,자동차,car,중고,used,부품,parts,자가,diy,마켓,markets,타이어,tire,라이트,light,
    범퍼,bumper,창문,window" />
<script type="application/x-javascript">
	
	
	
	
	
	
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }

    





</script>
<!--font-awsome-css-->
<link rel="stylesheet" href="../css/font-awesome.min.css">
<!-- bxSlider CSS file -->
<link rel="stylesheet" href="../css/jquery.bxslider.css" />
<!--bootstrap-->
<!-- Latest compiled and minified CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css">
<!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">-->

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!--custom css-->
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<!--component-css-->
<!-- jQuery library (served from Google) -->
<script src="../js/jquery-2.1.4.min.js"></script>
<!--<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>-->
<!--script-->
<script src="../js/jquery.bxslider.min.js"></script>
<script src="../js/modernizr.custom.js"></script>
<script src="../js/bigSlide.js"></script>
<script src="../js/jquery.magnific-popup.js" type="text/javascript"></script>
<script src="../js/main.js"></script>

<script>
	$(document).ready(function() {

	});
</script>
</head>

<body>
	<div class="body-back">
		<div class="masthead pdng-stn1">
			<div id="menu" class="panel" role="navigation">
				<div class="wrap-content">
					<div class="profile-menu text-center">
						<img class="border-effect" src="../images/logo.png" alt=" ">
						<a href="../view/main.do"><h3>HOME</h3></a>
						<div class="pro-menu">
							<div class="logo">
								<li><a class="link menu-link" href="main.html">등화장치</a> <strong
									class="verticalBar">|</strong> <a class="link menu-link"
									href="main.html">순정부품</a></li>
								<li><a class="link menu-link" href="about.html">실내 튜닝</a> <strong
									class="verticalBar">|</strong> <a class="link menu-link"
									href="about.html">실외 튜닝</a></li>
								<li><a class="link menu-link" href="short-codes.html">휠/타이어</a>
								</li>
								<li><a class="link menu-link" href="destination.html">루프/캐리어</a>
								</li>
								<li><a class="link menu-link" href="contact.html">블박/네비게이션</a>
								</li>
								<li><a class="link menu-link" href="contact.html">세차/청소용품</a>
								</li>
								<li><a class="link menu-link" href="contact.html">악세서리/기타용품</a>
								</li> 자유게시판 / Q&A / 공지사항 / 협력업체
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="phone-box wrap push" id="home">
				<div class="menu-notify">
					<div class="profile-left">
						<a href="#menu" class="menu-link"><i class="fa fa-list-ul"></i></a>
					</div>
					<div class="Profile-mid">
						<h5 class="pro-link">
							<a href="../view/main.do"><img src="../images/logo_top.png" /></a>
						</h5>
					</div>

					<div class="Profile-right">
						<a href="../member/LogInForm.jsp"> <i class="fa fa-user"></i></a>
						<!-- modal -->
						<div id="small-dialog" class="mfp-hide">
							<div class="login-modal">
								<div class="booking-info">
									<h3>
										<a href="/view/main.do"><img class="border-effect"
											src="../images/logo_60.png" alt=" "> 부<span>품</span>마<span>켓</span></a>
									</h3>
								</div>
								<div class="login-form">
									<form action="#" method="post">
										<p>E-Mail</p>
										<input type="text" name="Id" required="" />
										<p>Password</p>
										<input type="password" name="Password" required="" />
										<div class="wthree-text">
											<ul>
												<li><input type="checkbox" id="brand" value="">
													<label for="brand"><span></span> Remember</label></li>
											</ul>
											<div class="clear"></div>
										</div>
										<input type="submit" value="로그인">
									</form>
									<p>
										아이디가 없으시나요 ? <a href="#small-dialog1"
											class="sign-in popup-top-anim">회원가입</a>
									</p>
									<a href="#">아이디 찾기</a>/<a href="#">비밀번호 찾기</a>
								</div>
							</div>
						</div>
						<!-- //modal -->
						<!-- modal-two -->
						<div id="small-dialog1" class="mfp-hide">
							<div class="login-modal">
								<div class="booking-info">
									<h3>
										<a href="main.html"><img class="border-effect"
											src="../images/logo_60.png" alt=" "> 부<span>품</span>마<span>켓</span></a>
									</h3>
								</div>
								<div class="login-form signup-form">
									<form action="#" method="post">
										<p>E-Mail</p>
										<input type="text" name="Id" required="" />
										<p>Phone Number</p>
										<input type="text" name="PNo" required="" />
										<p>Password</p>
										<input type="password" name="Password" placeholder=""
											required="" />
										<p>소유차량</p>
										<select class="carCompany" name="Company">
											<option value="">제조사</option>
											<option value="01">차량 없음</option>
										</select> <select class="carModel" name="Model">
											<option value="">모델</option>
											<option value="01">차량 없음</option>
										</select> <input type="submit" value="이용약관 동의 후 회원가입"> <a
											href="#">이용약관</a>
										<p>협력업체는 가입 후 별도 문의</p>
									</form>
								</div>
							</div>
						</div>
						<!-- //modal-two -->
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- slider -->
				<div class="slider">
					<ul class="bxslider">
						<li><img src="../images/11.jpg" title="Funky roots" /></li>
						<li><img src="../images/22.jpg"
							title="The long and winding road " /></li>
						<li><img src="../images/33.jpg" title="Happy trees" /></li>
					</ul>
				</div>
				<!-- //slider -->
				<!-- banner -->
				<div class="w3agile banner-bottom">
					<ul>
						<li><a href="flight.html" class="hvr-radial-out"><i
								class="fa fa-plane" aria-hidden="true"></i></a>
							<h6>판매하기</h6></li>
						<li><a href="train.html" class="hvr-radial-out"><i
								class="fa fa-train" aria-hidden="true"></i></a>
							<h6>추천상품</h6></li>
						<li><a href="bus.html" class="hvr-radial-out"><i
								class="fa fa-bus" aria-hidden="true"></i></a>
							<h6>HOT!딜</h6></li>
						<li><a href="hotel.html" class="hvr-radial-out"><i
								class="fa fa-bed" aria-hidden="true"></i></a>
							<h6>동호회</h6></li>
					</ul>
				</div>
				<div class="carSelectBox">
					<select class="carCompany col-xs-4" name="Company">
						<option value="">제조사</option>
						<option value="01">차량 없음</option>
					</select> <select class="carModel col-xs-4" name="Model">
						<option value="">모델</option>
						<option value="01">차량 없음</option>
					</select> <select class="carPart col-xs-4" name="Model">
						<option value="">부품</option>
						<option value="01">차량 없음</option>
					</select>
				</div>
				<!-- //banner -->

				<!--/welcome-->
				<div class="w3agile welcome">
					<table border="1">
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>조회수</th>
							<th>게시일</th>
							<th>수정일</th>
							<th></th>
						</tr>
						<c:forEach var="article" items="${article}">
							<tr>
								<td>${article.no}</td>
								<td><a href='update.do?no=${article.no}'>${article.title}</a></td>
								<td>${article.read_cnt}</td>
								<td>${article.regDate}</td>
								<td>${article.modDate}</td>
								<td><a href='delete.do?no=${article.no}'>[삭제]</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
			<!--//welcome-->
			<!--/footer-->
			<div class="w3agile footer">
				<div class="col-md-3 w3agile_footer_grid">
					<h3>About Us</h3>
					<p>Itaque earum rerum hic tenetur a sapiente delectus, ut aut
						reiciendis voluptatibus.</p>
					<h3 class="logo">
						<a href="main.html">T<span>r</span>a<span>v</span>e<span>l</span>
							<span>H</span>u<span>n</span>t
						</a>
					</h3>
				</div>
				<div class="col-md-2 w3agile_footer_grid">
					<h3>Links</h3>
					<ul>
						<li><a href="main.html">Home</a></li>
						<li><a href="short-codes.html">Services</a></li>
						<li><a href="about.html">About</a></li>
						<li><a href="contact.html">Mail Us</a></li>
					</ul>
				</div>
				<div class="col-md-4 w3agile_footer_grid">
					<h3>Twitter Posts</h3>
					<ul class="w3agile_footer_grid_list">
						<li>Ut aut reiciendis voluptatibus maiores alias, ut aut
							reiciendis. <span><i class="fa fa-twitter"
								aria-hidden="true"></i> 02 days ago</span>
						</li>
						<li>Itaque earum rerum hic tenetur a sapiente delectus, ut
							aut reiciendis voluptatibus. <span><i
								class="fa fa-twitter" aria-hidden="true"></i> 03 days ago</span>
						</li>
					</ul>
				</div>
				<div class="col-md-3 w3agile_footer_grid">
					<h3>Newsletter</h3>
					<p>Itaque earum rerum hic tenetur a sapiente delectus, ut aut
						reiciendis voluptatibus.</p>
					<ul class="social">
						<form action="#" method="post">
							<input type="text" name="Email" placeholder="Enter Email..."
								required=""> <input type="submit" value="Submit">
							<div class="clearfix"></div>
						</form>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="w3agile agileinfo_copy_right">
				<div class="agileinfo_copy_right_left">
					<p>
						© 2016 Travel Hunt. All rights reserved | Design by <a
							href="http://w3layouts.com/">W3layouts</a>
					</p>
				</div>
				<div class="agileinfo_copy_right_right">
					<ul class="social">
						<li><a class="social-linkedin" href="#"> <i></i>
								<div class="tooltip">
									<span>Facebook</span>
								</div>
						</a></li>
						<li><a class="social-twitter" href="#"> <i></i>
								<div class="tooltip">
									<span>Twitter</span>
								</div>
						</a></li>
						<li><a class="social-google" href="#"> <i></i>
								<div class="tooltip">
									<span>Google+</span>
								</div>
						</a></li>
						<li><a class="social-facebook" href="#"> <i></i>
								<div class="tooltip">
									<span>Pinterest</span>
								</div>
						</a></li>
						<li><a class="social-instagram" href="#"> <i></i>
								<div class="tooltip">
									<span>Instagram</span>
								</div>
						</a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			<!--/footer-->

		</div>
	</div>
	<script src="../js/jquery.nicescroll.js"></script>
	<script src="../js/scripts.js"></script>
</body>

</html>
