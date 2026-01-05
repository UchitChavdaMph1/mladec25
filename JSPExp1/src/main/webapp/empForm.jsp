<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">

	body {
		content: normal;
		align-content: center;
		background-color : black;
		font-style: oblique;
		font : cursive;
		color: white;
		text-align: center;
		border: 0;
	}
	
	input {
		background : transparent;
		color: white;
	}
	
	:root {
  --rando: Math.floor((Math.random() * 20) + 1);
}
#subbtn {
  position: relative;
  background-color : red;
}

#subbtn:hover {
  position: relative;
  animation-name: box;
  animation-duration: 10s;
  animation-iteration-count: infinite;
}

@keyframes box {
  0%   {background-color:red; left: rando px; top: rando px;}
  25%  {background-color:red; left: rando px; top: rando px;}
  50%  {background-color:red; left: rando px; top: rando px;}
  75%  {background-color:red; left: rando px; top: rando px;}
  100% {background-color:red; left: rando px; top: rando px;}
}

</style>
<body>
	<h1>Employee Form</h1>
	<form action="empdata.jsp">
		Enter ID : <input type="number" name="id"><br><br>
		Enter name : <input type = "text" name = "name"><br><br>
		Enter Company name : <input typr = "text" name = "cmp"><br><br>
		
		<input type = "submit" value = "Submit" id="subbtn">
	</form>
</body>
</html>