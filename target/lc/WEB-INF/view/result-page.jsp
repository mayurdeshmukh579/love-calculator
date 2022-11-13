<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
	<br> ${userInfo.userName } and ${userInfo.crushName } are
	</br> Friend
	<br />

	<a href="/lc/sendEmail/${userInfo.userName}">Send Result to your Email<a />
</body>
</html>