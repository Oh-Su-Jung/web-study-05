<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie & Session</title>
</head>
<body>

<%
	session.setAttribute("id", "pinksung");
	session.setAttribute("pwd", "test1234");
	session.setAttribute("age", 20);
%>

<h3>세션 설정</h3>
<a href="05_getSession.jsp">세션 설정 확인하기</a>
<br>
<form action="SessionServlet">
	<input type="submit" value="서블릿 확인">
</form>

</body>
</html>