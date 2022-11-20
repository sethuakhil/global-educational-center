<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Course</h1><br>

<form action="/save" method=post>  
        Enter Course Number:  
        <input type="text" name="courseId" size="20">  
        <br> <br>  
        Enter Course Name:  
        <input type="text" name="courseName" size="20">
        <br> <br>
        Enter Fees:  
        <input type="number" name="fees" size="20">
        <br> <br>  
        Enter Duration:  
        <input type="text" name="duration" size="20">
        <input type="submit" value="submit">
    </form>  

</body>
</html>