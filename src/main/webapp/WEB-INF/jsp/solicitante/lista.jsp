<%@include file="../header.jsp" %>
<main class="container mt-3">
  <header style="display: flex; justify-content: space-between;">
    <h3>Listagem de solicitantes:</h3>
    <div>
      <a class="btn btn-secondary" href="/solicitante/cadastro"><i class="fa-solid fa-plus"></i> Novo</a>
    </div>
  </header>
  <table class="table table-striped table-dark table-hover">
    <thead class="table-bordered">
      <tr>
        <th scope="col">ID</th>
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
          <td>${s.id}</td>
          <td>${s.nome}</td>
          <td>${s.cpf}</td>
          <td>${s.email}</td>
          <td>${s.usuario.nome}</td>
          <td><a class="btn btn-danger btn-sm" href="/solicitante/${s.id}/excluir" title="Excluir"><i
                class="fa-solid fa-trash"></i></a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</main>
<%@include file="../footer.jsp" %>