<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<title>AppPedido</title>
</head>
<body class="bg-dark text-light">
  <c:import url="/WEB-INF/jsp/menu.jsp"/>
  <div class="container mt-3">
    <h3>Listagem de solicitantes:</h3>
        <table class="table table-striped table-dark table-hover">
          <thead class="table-bordered">
            <tr>
              <th scope="col">Nome</th>
              <th scope="col">CPF</th>
              <th scope="col">E-mail</th>
              <th scope="col">Usuario</th>
              <th scope="col"></th>
            </tr>
          </thead>
          <tbody>
          	<c:forEach var="s" items="${listaSolicitantes}">
            <tr>
              <td>${s.nome}</td>
              <td>${s.cpf}</td>
              <td>${s.email}</td>
              <td>${s.usuario.nome}</td>
              <td><a class="btn btn-danger btn-sm" href="/solicitante/${s.cpf}/excluir" title="Excluir"><i class="fa-solid fa-trash"></i></a></td>
            </tr>
            </c:forEach>
    	</tbody>
  	</table>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>