<%@include file="../header.jsp" %>
<main class="container mt-3">
  <header style="display: flex; justify-content: space-between;">
    <h3>Listagem de Produtos:</h3>
  </header>
  <table class="table table-striped table-dark table-hover">
    <thead class="table-bordered">
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Nome</th>
        <th scope="col">Valor</th>
        <th scope="col">Código</th>
        <th scope="col">Pedidos</th>
        <th scope="col"></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="p" items="${listaProdutos}">
        <tr>
          <td>${p.id}</td>
          <td>${p.nome}</td>
          <td>${p.valor}</td>
          <td>${p.codigo}</td>
          <td>${p.pedidos.size()}</td>
          <td><a class="btn btn-danger btn-sm" href="/produto/${p.id}/excluir" title="Excluir"><i
                class="fa-solid fa-trash"></i></a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</main>
<%@include file="../footer.jsp" %>