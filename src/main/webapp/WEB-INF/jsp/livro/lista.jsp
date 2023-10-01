<%@include file="../header.jsp" %>
<main class="container mt-3">
  <header style="display: flex; justify-content: space-between;">
    <h3>Listagem de Livros:</h3>
  </header>
  <table class="table table-striped table-dark table-hover">
    <thead class="table-bordered">
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Nome</th>
        <th scope="col">Valor</th>
        <th scope="col">Código</th>
        <th scope="col">Gênero</th>
        <th scope="col">Autor</th>
        <th scope="col">Editora</th>
        <th scope="col"></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="l" items="${listaLivros}">
        <tr>
          <td>${l.id}</td>
          <td>${l.nome}</td>
          <td>${l.valor}</td>
          <td>${l.codigo}</td>
          <td>${l.genero}</td>
          <td>${l.autor}</td>
          <td>${l.editora}</td>
          <td><a class="btn btn-danger btn-sm" href="/livro/${l.id}/excluir" title="Excluir"><i
                class="fa-solid fa-trash"></i></a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</main>
<%@include file="../footer.jsp" %>