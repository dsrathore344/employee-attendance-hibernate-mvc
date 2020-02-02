<%@page import="java.util.List"%>
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
	<c:if test="${!empty empList}">
	<table  border="1">
	<tr>
		<th width="80">Employee ID</th>
		<th width="120">First Name</th>
		<th width="120">Last Name</th>
		<th width="60">DOB</th>
		<th width="60">City</th>
		<th width="100">State</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${empList}" var="employeeVar">
		<tr>
			<td>${employeeVar.empId}</td>
			<td>${employeeVar.firstName}</td>
			<td>${employeeVar.lastName}</td>
			<td>${employeeVar.dob}</td>
			<td>${employeeVar.city}</td>
			<td>${employeeVar.state}</td>
			<td><a href="<c:url value='/edit/${employeeVar.empId}'/>" >Edit</a></td>
			<td><a href="<c:url value='/remove/${employeeVar.empId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>