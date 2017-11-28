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
	<jsp:useBean id="jogo" class="br.senai.sp.dao.JogoDao"
		scope="page" />

	<table border="1">
		<tr>
			<td>Nome</td>
			<td>Gênero</td>
			<td>Desenvolvedor</td>
		</tr>
		<c:forEach var="jogo" items="${jogo.lista}">
			<tr>
				<td>${jogo.nome }</td>
				<td>${jogo.genero }</td>
				<td>${jogo.desenvolvedor}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>