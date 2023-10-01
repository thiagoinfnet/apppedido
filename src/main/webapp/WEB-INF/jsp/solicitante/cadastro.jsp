<%@include file="../header.jsp" %>

  <div class="container mt-3">
  	<h3>Cadastramento de Solicitantes</h3>
  	<form action="/solicitante/incluir" method="post">
      <div class="form-floating">
        <input type="text" class="form-control bg-dark text-light" value="Duke Nukem" id="nome" placeholder="Entre com o seu nome" name="nome">
        <label for="floatingInput">Nome</label>
      </div>
      <div class="form-floating">
        <input type="text" class="form-control bg-dark text-light" value="546.486.897.12" id="cpf" placeholder="Entre com o seu CPF" name="cpf">
        <label for="floatingInput">CPF</label>
      </div>
      <div class="form-floating">
        <input type="email" class="form-control bg-dark text-light" value="duke@nukem.com" id="floatingInput" placeholder="name@example.com" name="email">
        <label for="floatingInput">E-mail</label>
      </div>

      <button type="submit" class="btn btn-secondary">Cadastrar</button>
  	</form>
  </div>