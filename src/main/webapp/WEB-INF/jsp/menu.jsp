<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
  String currentURL = request.getAttribute("javax.servlet.forward.request_uri").toString();
  System.out.println(currentURL);


%>

  <nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="/">AppPedido</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
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
        </ul>
      </div>
    </div>
  </nav>
