<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Congrats !!!!! Registration is successful</h1>
	<hr />
	<h2>Following are the details entered by you :-</h2>
	Name : ${userReg.name}
	<br /> Username : ${userReg.userName}
	<br /> Countryname : ${userReg.countryName}
	<br /> Hobbies :
	<br /> Age : ${userReg.age}
	<br /> Email : ${userReg.communicationDTO.email}
	<br /> Phone : ${userReg.communicationDTO.phone }
	<c:forEach var="temp" items="${userReg.hobbies}">
	${temp}
	</c:forEach>
</body>
</html>