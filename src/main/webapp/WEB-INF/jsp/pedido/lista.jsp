<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@include file="../header.jsp" %>
<main class="container mt-3">
  <header style="display: flex; justify-content: space-between;">
    <h3>Listagem de Pedidos:</h3>
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
      <c:if test="${empty p.produtos}">
        <tr>
          <td>${p.id}</td>
          <td>${p.descricao}</td>
          <td>${p.data}</td>
          <td>${p.web}</td>
          <td>${p.solicitante}</td>
          <td></td>
          <td></td>
        </tr>
      </c:if>
        <c:set var="firstIteration" value="true" scope="page" />
     	<c:forEach var="pr" items="${p.produtos}">
        <tr>
        <c:choose>
          <c:when test="${pageScope.firstIteration}">
          <c:set var="firstIteration" value="false" scope="page" />
          <% System.out.println("Entrou"); %>
          <td rowspan="${fn:length(p.produtos)}">${p.id}</td>
          <td rowspan="${fn:length(p.produtos)}">${p.descricao}</td>
          <td rowspan="${fn:length(p.produtos)}">${p.data}</td>
          <td rowspan="${fn:length(p.produtos)}">${p.web}</td>
          <td rowspan="${fn:length(p.produtos)}">${p.solicitante}</td>
          <td>${pr.nome}</td>
          <td><a class="btn btn-danger btn-sm" href="/pedido/${p.id}/excluir" title="Excluir"><i
                class="fa-solid fa-trash"></i></a></td>
          </c:when>
          <c:otherwise>
          <td>${pr.nome}</td>
          <td><a class="btn btn-danger btn-sm" href="/pedido/${p.id}/excluir" title="Excluir"><i
                class="fa-solid fa-trash"></i></a></td>
          </c:otherwise>
        </c:choose>
        </tr>
        </c:forEach>
      </c:forEach>
    </tbody>
  </table>
</main>
<%@include file="../footer.jsp" %>