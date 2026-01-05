<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String usr = request.getParameter("user");
		String pas = request.getParameter("pwd");
		
		session.setAttribute("info", usr);
		
		application.setAttribute("userInfo", usr);
		
		if (usr.equals("admin") && pas.equals("java")) {
			%>
			<jsp:forward page="success.jsp"></jsp:forward>
			<%
		} else {
//			out.print("Invalid Credentials !!!");
			%>
			<h1 color="red">Invalid Credentials </h1>
			<jsp:include page="login.jsp"></jsp:include>
			<%
		}
	%>
</body>
</html>