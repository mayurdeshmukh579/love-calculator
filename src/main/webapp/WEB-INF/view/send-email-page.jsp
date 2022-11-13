<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send Email</title>
</head>
<body>
<h1>Hi ${userName}</h1>
<h2>Send Email to your email address</h2>
<form:form action="process-email" method="GET" modelAttribute="emailDTO">
<label>Enter your email</label>
<form:input path="userName"/>
<input type="submit" value="send">
</form:form>
</body>
</html>