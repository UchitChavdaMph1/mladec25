<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Logged In Successfully :)</h1>
	
	<%
		String usr = (String)session.getAttribute("info");
		String dt = (String)application.getAttribute("userInfo");
		
		out.println("Session Object Data : " + usr);
		out.println("<br><br>Context Object Data : " + dt);
	%>
</body>
</html>