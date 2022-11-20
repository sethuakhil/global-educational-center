<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.demo.entity.Course"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/save" method="post">  
        Enter Course Number:  
        <input type="text" name="courseId" size="20" value=${course.courseId } readonly="readonly">  
        <br> <br>  
        Enter Course Name:  
        <input type="text" name="courseName" size="20" value=${course.courseName } readonly="readonly">
        <br> <br>
        Enter Fees:  
        <input type="number" name="fees" size="20" value=${course.fees }>
        <br> <br>  
        Enter Duration:  
        <input type="text" name="duration" size="20" value=${course.duration }>
        <input type="submit" name="update">
    </form>  




</body>
</html>