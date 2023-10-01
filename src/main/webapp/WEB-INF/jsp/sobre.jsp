<%@include file="header.jsp" %>
  <main class="container mt-3">
    <header><h3>${projeto.nome} - ${projeto.descricao}</h3></header>
    <c:forEach var="c" items="${projeto.classes}">
    <article class="mt-4 mb-5">
      <header><h4>${c.nome}</h4></header>
      <table class="table table-striped table-dark table-hover mt-3">
        <thead class="table-bordered">
          <tr>
            <th scope="col">Campo</th>
            <th scope="col">Tipo</th>
            <th scope="col">Observação</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach var="a" items="${c.atributos}">
          <tr>
            <td>${a.nome}</td>
            <td>${a.tipo}</td>
            <td>${a.descricao}</td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </article>
    </c:forEach>
  </main>
<%@include file="footer.jsp" %>