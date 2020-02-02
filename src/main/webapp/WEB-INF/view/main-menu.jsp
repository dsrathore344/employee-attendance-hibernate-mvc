<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Management</h1>
	<hr>
	<a href="enterDetails">Click to Add Employee</a>
	<br><br>
	<a href="listDetails">See the list of Employee</a>
	<br><br>
	
	<h5>Or</h5>
	<form action="empById" method="get">
		Enter Employee ID: <input type="text" name="empId">
		<input type="submit" value="Submit">
	</form>
</body>
</html>