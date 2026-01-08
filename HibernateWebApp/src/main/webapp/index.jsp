<html>
<body>
<h2 align="center"><%= "Add Customer" %> <a href = "customer.jsp">add customer</a></h2>
<h2 align="center"><a href = "viewcustomer.jsp">View All Customers </a></h2>
<center>
	<h3>SEARCH CUSTOMER BASED ON ID</h3>
	
	<form action="data.jsp" method = "post">
		Enter CustomerID : <input type = "text" name="id"><br><br>
		<input type = "submit" value = "fetch">
	</form>
	
	<form action="delete.jsp" method = "post">
		Enter CustomerID : <input type = "text" name="id"><br><br>
		<input type = "submit" value = "delete">
	</form>
</center>
</body>
</html>
