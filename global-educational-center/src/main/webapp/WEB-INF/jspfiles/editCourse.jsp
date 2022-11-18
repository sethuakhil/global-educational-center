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
<form action="update" method="post">  
        Enter Course Number:  
        <input type="text" name="Number" size="20" value=${course.courseId }>  
        <br> <br>  
        Enter Course Name:  
        <input type="text" name="Name" size="20" value=${course.courseName }>
        <br> <br>
        Enter Fees:  
        <input type="number" name="Fees" size="20" value=${course.fees }>
        <br> <br>  
        Enter Duration:  
        <input type="text" name="Duration" size="20" value=${course.duration }>
        <input type="submit" />
    </form>  




</body>
</html>