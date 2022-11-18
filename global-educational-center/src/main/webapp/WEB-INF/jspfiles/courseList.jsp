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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>GLOBAL EDUCATIONAL CENTER</h1>
	<a href="/new">Add New Course</a><br>
	
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
		<tbody>
		<c:forEach var="course" items="${course}">
		<tr>
			<td>${course.courseId}</td>
			<td>${course.courseName}</td>
			<td>${course.fees}</td>
			<td>${course.duration}</td>
			<td>
			
			<a href="editCourse?id=${course.courseId}"
                            class="btn btn-sm btn-dark">Edit</a>
			<a href="/delete" class="btn btn-danger">delete</a>
			</tr>
		</c:forEach>
	</tbody>
	</table>


</body>
</html>