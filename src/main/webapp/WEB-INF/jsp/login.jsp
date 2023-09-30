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
<style>
  .form-signin {
    max-width: 330px;
    padding: 1rem;
  }
  .m-auto {
    margin: auto!important;
    }
  .w-100 {
    width: 100%!important;
  }
</style>
<body class="bg-dark text-light">
  <c:import url="/WEB-INF/jsp/menu.jsp"/>
  <div class="container-fluid mt-3">
    <main class="form-signin w-100 m-auto">
      <form action="/valida" method="post">
        <h1 class="h3 mb-3 fw-normal">Autenticação</h1>

        <div class="form-floating">
          <input type="email" class="form-control bg-dark text-light" value="john@doe.com" id="floatingInput" placeholder="name@example.com" name="email">
          <label for="floatingInput">E-mail</label>
        </div>
        <div class="form-floating">
          <input type="password" class="form-control bg-dark text-light" value="123456" id="floatingPassword" placeholder="Password" name="senha">
          <label for="floatingPassword">Senha</label>
        </div>

        <div class="form-check text-start my-3">
          <input class="form-check-input" type="checkbox" value="remember-me" id="flexCheckDefault">
          <label class="form-check-label" for="flexCheckDefault">
            Lembre-me
          </label>
        </div>
        <button class="btn btn-secondary w-100 py-2" type="submit"><i class="fa-solid fa-right-to-bracket"></i> Acessar</button>
      </form>
    </main>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>