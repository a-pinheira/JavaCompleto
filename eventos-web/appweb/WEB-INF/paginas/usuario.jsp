<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>.:Cadastro Usuario :.</title>
</head>
<body>
	<h2>Tela Cadastro Usuário</h2>
	<hr />

	<form:form action="salva" modelAttribute="usuario">
		<form:hidden path="codEvento" />
		<label>Nome Completo: </label>
		<form:input path="nomeUser" />
		<br />

		<label>Email </label>
		<form:input path="email" />

		<label>CPF </label>
		<form:input path="cpf" />

		<label>Telefone </label>
		<form:input path="telefone" />

		<br />
			<form:button>Cadastrar Usuario</form:button>
		<hr />

		<c:forEach var="evento" items="${usuario}">
		</c:forEach>

	</form:form>
</body>
</html>