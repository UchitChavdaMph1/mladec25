<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.test.Customer"%>
    
    <%
    	List<Customer> ct = Customer.viewAllCustomers();
    	
	    System.out.println("viewcustomer.jsp scene: ");
		System.out.println("Customers count: " + ct.size());
		for (Customer c : ct) {
		    System.out.println(c.getFirstName());
		}
    
    	
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Customer</title>
</head>
<body>
	<h1 align="center">Customer List</h1>
	<table border='1' align='center'>
		<thead>
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Location</th>
			</tr>
		</thead>
		
		<tbody>
			<% for (Customer c : ct) { %>
			  <tr>
			      <td><%= c.getId() %></td>
			      <td><%= c.getFirstName() %></td>
			      <td><%= c.getLastName() %></td>
			      <td><%= c.getLocation() %></td>
			  </tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>