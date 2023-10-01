<%@include file="../header.jsp" %>
<main class="container mt-3">
  <header style="display: flex; justify-content: space-between;">
    <h3>Listagem de Roupas:</h3>
    <div>
      <a class="btn btn-secondary" href="/solicitante/cadastro"><i class="fa-solid fa-plus"></i> Novo</a>
    </div>
  </header>
  <table class="table table-striped table-dark table-hover">
    <thead class="table-bordered">
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Nome</th>
        <th scope="col">Valor</th>
        <th scope="col">C�digo</th>
        <th scope="col">Sexo</th>
        <th scope="col">Categoria</th>
        <th scope="col">Tamanho</th>
        <th scope="col"></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="r" items="${listaRoupas}">
        <tr>
          <td>${r.id}</td>
          <td>${r.nome}</td>
          <td>${r.valor}</td>
          <td>${r.codigo}</td>
          <td>${r.sexo}</td>
          <td>${r.categoria}</td>
          <td>${r.tamanho}</td>
          <td><a class="btn btn-danger btn-sm" href="/roupa/${r.id}/excluir" title="Excluir"><i
                class="fa-solid fa-trash"></i></a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</main>
<%@include file="../footer.jsp" %>