<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Jogos</title>
</head>
<body>

	<h1>Lista de Jogos</h1>
	<!-- criou um objeto da classe JogosBean -->
	<jsp:useBean id="usuario" class="br.senai.sp.dao.UsuarioDAO"
		scope="page" />
		
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Usuário</td>
		</tr>
		<c:forEach var="usuario" items="${usuario.lista}">
			<tr>
				<td>${usuario.id }</td>
				<td>${usuario.usuario }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>