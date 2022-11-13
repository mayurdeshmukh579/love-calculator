<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>

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
<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById('yn').value;
		if (userName.length < 3) {
			alert("Need atleast 3 words")
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo" onSubmit="return validateUserName()">
		<div align="center">
			<p>
				<label for="yn">Your Name :</label>
				<form:input type="text" id="yn" path="userName" />
				<form:errors path="userName" cssClass="error" />
			</p>
			<p>
				<label for="cn">Crush Name :</label>
				<form:input type="text" id="cn" path="crushName" />
				<form:errors path="crushName" cssClass="error" />
			</p>
			<p>
			<form:checkbox path="termAndCondition" id="check"/>
			<label>I agree that this is for fun.</label>
			<form:errors path="termAndCondition" cssClass="error"></form:errors>
			</p>
			<input type="submit" value="Calculate">
		</div>
	</form:form>
</body>
</html>