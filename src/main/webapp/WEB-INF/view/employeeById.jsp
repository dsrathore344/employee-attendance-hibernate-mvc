<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty employee}">
	<table  border="1">
	<tr>
		<th width="80">Employee ID</th>
		<th width="120">First Name</th>
		<th width="120">Last Name</th>
		<th width="60">DOB</th>
		<th width="60">City</th>
		<th width="100">State</th>
	</tr>
	</c:if>
	
	<tr>
			<td>${employee.empId}</td>
			<td>${employee.firstName}</td>
			<td>${employee.lastName}</td>
			<td>${employee.dob}</td>
			<td>${employee.city}</td>
			<td>${employee.state}</td>
		</tr>


</body>
</html>