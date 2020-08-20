<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
	@font-face {font-family: 'S-CoreDream-4Regular'; src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/S-CoreDream-4Regular.woff') format('woff'); font-weight: normal; font-style: normal;}
            
	* {margin:0; padding:0; font-family:'S-CoreDream-4Regular'}
	h1 {text-align:center; font-size:40px; margin:60px 0;}
	form {width:400px; margin:0 auto; text-align:center;}
	ul li {width:100%; overflow:hidden; margin-bottom:5px; text-align:left;}
	ul li > label {float:left; width:100px; line-height:35px;}
	.input_text {width:300px; height:35px; border:1px solid #9c9c9c; box-sizing:border-box; font-family:'S-CoreDream-4Regular'; padding:0 7px;}
	input[type="submit"], input[type="reset"] {display:inlnie-block; width:220px; height:40px; border:0; background:#ff0000; text-align:center; color:#fff; margin:70px auto 0; cursor:pointer;}
</style>

</head>
<body>
	
	<h1>로그인</h1>
	<form method="get" action="../LoginServlet">
		<ul>
			<li>
				<label for="userid">아이디</label>
				<input type="text" name="id" id="userid" class="input_text">
			</li>
			<li>
				<label for="userpwd">암호</label>
				<input type="password" name="pwd" id="userpwd" class="input_text">
			</li>
		</ul>
		<input type="submit" value="로그인">
	</form>

</body>
</html>