<%@include file="../header.jsp" %>
<main class="container mt-3">
  <header style="display: flex; justify-content: space-between;">
    <h3>Listagem de Pedidos:</h3>
    <div>
      <a class="btn btn-secondary" href="/solicitante/cadastro"><i class="fa-solid fa-plus"></i> Novo</a>
    </div>
  </header>
  <table class="table table-striped table-dark table-hover">
    <thead class="table-bordered">
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Descrição</th>
        <th scope="col">Data</th>
        <th scope="col">Web</th>
        <th scope="col">Solicitante</th>
        <th scope="col">Produtos</th>
        <th scope="col"></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="p" items="${listaPedidos}">
        <tr>
          <td>${p.id}</td>
          <td>${p.descricao}</td>
          <td>${p.data}</td>
          <td>${p.web}</td>
          <td>${p.solicitante}</td>
          <td>${p.produtos}</td>
          <td><a class="btn btn-danger btn-sm" href="/pedido/${p.id}/excluir" title="Excluir"><i
                class="fa-solid fa-trash"></i></a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</main>
<%@include file="../footer.jsp" %>