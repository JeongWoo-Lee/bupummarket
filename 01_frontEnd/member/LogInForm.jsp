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
	<div class="booking-info">
		<h3>
			<a href="../view/main.do"><img class="border-effect"
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
					<li><input type="checkbox" id="brand" value=""> <label
						for="brand"><span></span> Remember</label></li>
				</ul>
				<div class="clear"></div>
			</div>
			<input type="submit" value="로그인">
		</form>
		<a href="#">아이디 찾기</a>/<a href="#">비밀번호 찾기</a>
	</div>
	<div class="booking-info">
		<h3>
			<a href="#"><span>↓</span>회원가입<span>↓</span></a>
		</h3>
	</div>
	<div class="login-form signup-form">
		<form action="#" method="post">
			<p>E-Mail</p>
			<input type="text" name="Id" required="" />
			<p>Phone Number</p>
			<input type="text" name="PNo" required="" />
			<p>Password</p>
			<input type="password" name="Password" placeholder="" required="" />
			<p>소유차량</p>
			<select class="carCompany" name="Company">
				<option value="">제조사</option>
				<option value="01">차량 없음</option>
			</select> <select class="carModel" name="Model">
				<option value="">모델</option>
				<option value="01">차량 없음</option>
			</select> <input type="submit" value="이용약관 동의 후 회원가입"> <a href="#">이용약관</a>
			<p>협력업체는 가입 후 별도 문의</p>
		</form>
	</div>
	<div class="clearfix"></div>
	<script src="../js/jquery.nicescroll.js"></script>
	<script src="../js/scripts.js"></script>
	</div>
</body>

</html>
