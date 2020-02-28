<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form...!</title>
</head>
<body>
	<h1>Enter Student Details....!</h1>

	<form:form method="post" action="save">
		<table>
			<tr>
				<td>Student Id :</td>
				<td><form:input path="studId" /></td>
			</tr>
			<tr>
				<td>Student Name :</td>
				<td><form:input path="studName" /></td>
			</tr>
			<tr>
				<td>Student Age:</td>
				<td><form:input path="studAge" /></td>
			</tr>
			<tr>
				<td>Studnt Add :</td>
				<td><form:input path="studAdd" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>