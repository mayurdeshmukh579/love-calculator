<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
.no-background {
    background-image: url("image/lci.jpg");
}
</style>
</head>
<body>
	<h1 align="center">Please fill below registration form</h1>
	<hr />
	<div align="center">
		<form:form action="registration-success" method="get"
			modelAttribute="userReg">
			<label>User :</label>
			<form:input path="name" />
			<br />
			<label>User Name :</label>
			<form:input path="userName" />
			<br />
			<label>Password :</label>
			<form:password path="password" />
			<br />
			<label>Country :</label>
			<form:select path="countryName">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="UK" label="United Kingdom"></form:option>
				<form:option value="USA" label="United States"></form:option>
				<form:option value="FR" label="France"></form:option>
			</form:select>
			<br />
			<label>Hobbies :</label>
		Cricket : <form:checkbox path="hobbies" value="cricket" />
		Reading : <form:checkbox path="hobbies" value="reading" />
		Programming : <form:checkbox path="hobbies" value="programming" />
			<br />
			<label>Gender :</label>
		Male<form:radiobutton path="gender" value="male" />
		Female<form:radiobutton path="gender" value="female" />

			<br />
			<label>Age :</label>
			<form:input path = "age" />
			<form:errors path="age" cssClass="error"></form:errors>
			<br />

			<label>Email</label>
			<form:input path="communicationDTO.email" />
			
			<label>Phone</label>
			<form:input path="communicationDTO.phone"/>
			<br />

			<input type="submit" value="register" />
	</div>
	</form:form>
</body>
</html>