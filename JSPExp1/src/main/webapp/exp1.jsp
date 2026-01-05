
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>JSP Tags Example</h1>
	
	<!--  Description Tag  -->
	<%!
		int x = 30;
		int y = 50;
		public int add() {
			return x+y;
		}
		String str = "Java";
	%>
	
	
	<!-- Expression Tag -->
	<%= add() %>
	
	
	<!-- Scriplet Tag -->
	<%
 		out.println("Current Date : " + new Date());
	%>
	<br>
	<%
		out.print("Test");
	%>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>