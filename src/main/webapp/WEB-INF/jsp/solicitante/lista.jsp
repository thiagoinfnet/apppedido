<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>AppPedido</title>
</head>
<body>
  <c:import url="/WEB-INF/jsp/menu.jsp"/>
  <div class="container-fluid mt-3">
    <h1>Solicitante</h1>
    <p>Listagem de solicitantes</p>
        <table class="table table-striped">
          <thead>
            <tr>
              <th scope="col">Nome</th>
              <th scope="col">CPF</th>
              <th scope="col">E-mail</th>
            </tr>
          </thead>
          <tbody>
          	<c:forEach var="s" items="${listaSolicitante}">
            <tr>
              <td>${s.nome}</td>
              <td>${s.cpf}</td>
              <td>${s.email}</td>
            </tr>
            </c:forEach>
    	</tbody>
  	</table>
  </div>
</body>
</html>