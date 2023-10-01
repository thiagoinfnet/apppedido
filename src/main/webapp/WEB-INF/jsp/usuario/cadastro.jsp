<%@include file="../header.jsp" %>

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