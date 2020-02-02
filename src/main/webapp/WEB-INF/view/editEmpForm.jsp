<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Detail</title>
</head>
<body>
	<h2>Enter Employee Details</h2>
	<form:form action="editSave"  modelAttribute="employee" method="post">
		Id: <form:input path="empId" /><br><br>
		First Name: <form:input path="firstName"  /><br><br>
		Last Name: <form:input path="lastName" placeholder="enter lastName"/><br><br>
		DOB: <form:input path="dob" placeholder="enter dob"/><br><br>
		City: <form:input path="city" placeholder="enter city"/><br><br>
		State: <form:select path="state" placeholder="select state"><br><br>
				<form:options items="${employee.stateNames}"/>
			</form:select><br><br>
		
		<input type="submit" value="Save">
	</form:form>
	
	
	
	
	
	
	<%-- <form action="addEmployee" method="get">
	
		Id: <input type="text" name="empId" placeholder="enter id" />
		First Name: <input type="text" name="firstName" placeholder="enter first name" />
		Last Name: <input type="text" name="lastName" placeholder="enter last name " />
		
		DOB: <input type="text" name="dob" placeholder="enter dob" />
		City: <input type="text" name="city" placeholder="enter city" />
		State: <input type="text" name="state" placeholder="enter state" />
		
		<input type="submit" value="Submit"/>
	</form> --%>

</body>
</html>