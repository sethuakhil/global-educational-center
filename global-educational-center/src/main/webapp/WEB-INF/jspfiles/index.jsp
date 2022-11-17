<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.demo.entity.Course"%>


<!DOCTYPE html>
<html>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>GLOBAL EDUCATIONAL CENTER</h1>
	<form action="/new">
		<input type="submit" value="CREATE NEW COURSE" />
	</form>
	<br>

	<table style="width: 100%">
		<thead>
			<tr>
				<th>COURSE CODE</th>
				<th>NAME</th>
				<th>FEES</th>
				<th>DURATION</th>
				<th>ACTION</th>
			</tr>
		</thead>
		<c:forEach var="course" items="${courses}">
			<td>${course.courseId}</td>
			<td>${course.courseName}</td>
			<td>${course.fees}</td>
			<td>${course.duration}</td>
		</c:forEach>

	</table>


</body>
</html>