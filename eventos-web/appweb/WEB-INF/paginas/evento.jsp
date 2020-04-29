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
<title>.: Cadastro Evento :.</title>
</head>
<body>
	<h2>Tela Cadastro dos Eventos</h2>
	<hr />
	<form:form action="salva" modelAttibute="evento">
		<form:hidden path="codEvento" />
		<label>Nome Do Evento: </label>
		<form:input path="nome"/>
		<br />
		
		<label>Local </label>
		<form:input path="local"/>
		
		<label>Data </label>
		<form:input path="data"/>
		
		<label>Horario </label>
		<form:input path="horario"/>
		
		<br />
		<br />
		
		<form:button>Cadastrar</form:button>
		<hr />
		
		<c:forEach var="evento" items="${eventos}"> </c:forEach>


	</form:form>

</body>
</html>