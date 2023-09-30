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
  	<h3>Cadastramento de Usuários</h3>
  	<form action="/usuario/incluir" method="post">
      <div class="form-floating">
        <input type="text" class="form-control bg-dark text-light" value="Thiago" id="nome" placeholder="Entre com o seu nome" name="nome">
        <label for="floatingInput">Nome</label>
      </div>
      <div class="form-floating">
        <input type="email" class="form-control bg-dark text-light" value="thiago@example.com" id="floatingInput" placeholder="name@example.com" name="email">
        <label for="floatingInput">E-mail</label>
      </div>
      <div class="form-floating">
        <input type="password" class="form-control bg-dark text-light" value="123456" id="pwd" placeholder="Entre com a sua senha" name="senha">
        <label for="floatingInput">Senha</label>
      </div>
      
      <button type="submit" class="btn btn-secondary">Cadastrar</button>
  	</form>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>