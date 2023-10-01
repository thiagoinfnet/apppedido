<%@include file="../header.jsp" %>
  <main class="container mt-3">
    <h3>Listagem de usuarios:</h3>
        <table class="table table-striped table-dark table-hover">
          <thead class="table-bordered">
            <tr>
              <th scope="col">ID</th>
              <th scope="col">Nome</th>
              <th scope="col">E-mail</th>
              <th scope="col"></th>
            </tr>
          </thead>
          <tbody>
          	<c:forEach var="u" items="${listaUsuarios}">
            <tr>
              <td>${u.id}</td>
              <td>${u.nome}</td>
              <td>${u.email}</td>
              <td><a class="btn btn-danger btn-sm" href="/usuario/${u.id}/excluir" title="Excluir"><i class="fa-solid fa-trash"></i></a></td>
            </tr>
            </c:forEach>
    	</tbody>
  	</table>
  </main>
<%@include file="../footer.jsp" %>