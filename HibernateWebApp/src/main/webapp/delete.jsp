<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.test.Customer"%>
    
<%
	String i = request.getParameter("id");


	
	System.out.println("YOUR ID for deletion is  : " + i);
	
	if (i.equals("")) {
		out.println("THE GIVEN ID ID NULL / YOU DIDN'T ENTER ID");
	}
	
	int id = Integer.parseInt(i);
	
	Customer.deleteCustomerById(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Customer Deleted Successfully...</h3>
</body>
</html>