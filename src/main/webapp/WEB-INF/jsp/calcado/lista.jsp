<%@include file="../header.jsp" %>
<main class="container mt-3">
  <header style="display: flex; justify-content: space-between;">
    <h3>Listagem de Calçados:</h3>
  </header>
  <table class="table table-striped table-dark table-hover">
    <thead class="table-bordered">
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Nome</th>
        <th scope="col">Valor</th>
        <th scope="col">Código</th>
        <th scope="col">Tamanho</th>
        <th scope="col">Cor</th>
        <th scope="col">Tipo</th>
        <th scope="col"></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="c" items="${listaCalcados}">
        <tr>
          <td>${c.id}</td>
          <td>${c.nome}</td>
          <td>${c.valor}</td>
          <td>${c.codigo}</td>
          <td>${c.tamanho}</td>
          <td>${c.cor}</td>
          <td>${c.tipo}</td>
          <td><a class="btn btn-danger btn-sm" href="/calcado/${c.id}/excluir" title="Excluir"><i
                class="fa-solid fa-trash"></i></a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</main>
<%@include file="../footer.jsp" %>