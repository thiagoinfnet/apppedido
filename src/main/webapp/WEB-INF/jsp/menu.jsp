<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
  String currentURL = request.getAttribute("javax.servlet.forward.request_uri").toString();
%>

  <nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container">
      <a class="navbar-brand" href="/">AppPedido</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link <%= currentURL.endsWith("/") ? "active" : "" %>" aria-current="page" href="/">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link <%= currentURL.endsWith("/usuario/lista") ? "active" : "" %>" aria-current="page" href="/usuario/lista">Usuarios</a>
          </li>
          <c:if test="${not empty user}">
          <li class="nav-item">
            <a class="nav-link <%= currentURL.endsWith("/solicitante/lista") ? "active" : "" %>" aria-current="page" href="/solicitante/lista">Solicitantes</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="#">Produtos</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="#">Livros</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="#">Roupas</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="#">Eletrônicos</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" aria-current="page" href="#">Pedidos</a>
          </li>
          </c:if>
        </ul>
        <ul class="nav navbar-nav navbar-right">
		  <c:if test="${empty user}">
		    <li class="nav-item">
		        <a class="nav-link" href="/usuario/cadastro"><i class="fa-solid fa-user-plus"></i> Sign Up</a>
		    </li>
        	<li class="nav-item">
        		<a class="nav-link" href="/login"><i class="fa-solid fa-right-to-bracket"></i> Log in</a>
        	</li>
        	</c:if>
        	<c:if test="${not empty user}">
	      	 <li><a class="nav-link"  href="/logout"><i class="fa-solid fa-right-from-bracket"></i> Logout ${user.email}</a></li>
        	</c:if>
        </ul>
      </div>
    </div>
  </nav>
