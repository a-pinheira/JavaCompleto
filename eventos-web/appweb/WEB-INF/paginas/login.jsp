<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>.: Eventos | Log :.</title>

<spring:url value="/process" var="process"></spring:url>
<spring:url value="#{usuario}"> </spring:url>
<spring:url value="singUpView"></spring:url>
</head>
<body>

	<form:form action="${process}">
		<input type="text" name="username" id="login" class="fadeIn second"
			placeholder="e-mail" />
		<input type="text" name="password" id="password" class="fadeIn third"
			placeholder="senha" />
		<input type="submit" class="fadeIn fourth" value="Entrar" />
		<p>
			<br /> <a href="${signUpView}" class="btn btn-success">Cadastrar-se</a>
		</p>
	</form:form>

</body>
</html>