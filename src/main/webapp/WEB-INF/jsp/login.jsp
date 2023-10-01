<%@include file="header.jsp" %>
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
<%@include file="footer.jsp" %>