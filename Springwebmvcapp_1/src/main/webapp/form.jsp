<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/create" modelAttribute="stu" >

Student First Name :  <form:input path="firstname" /><br>
Student Last Name : <form:input path="lasttname"/><br>
Student Surname : <form:input path="surname"/><br>
Student Date of Birth : <form:input path="dateofbirth"/><br>
Student Address : <form:input path="address"/><br>
<input type="submit" value="ClickMe">
</form:form>
</body>
</html>