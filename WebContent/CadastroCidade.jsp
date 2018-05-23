<%@page import="br.com.projescola.DB.CidadeDB"%>
<%@page import="br.com.projescola.model.Cidade"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Cidades</title>
<link rel="stylesheet" href="Bootstrap/bootstrap.css"/>
</head>
<body>

<h1>Cadastro de Cidades</h1>

<form action="ControllerCidade" method="post">
<dir class="col-sm-6">
<%if (request.getAttribute("msg") != null){%>
<div class="alert alert-primary" role="alert">
  <%=request.getAttribute("msg")%>
</div>
<%} %>
</dir>

<dir class="col-sm-3">
<div>
<label>Nome:</label>
<input type="text" class="form-control" id="nome" name="nome"><br>
</div>
<div>
<label>Habitantes:</label>
<input type="number" class="form-control" id="qnthabitante" name="qnthabitante"><br>
</div>

<input type="submit" class="btn btn-primary" value="Salvar"><br>
</dir>
</form>
<br>


<table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nome</th>
      <th scope="col">Qtd_Habitantes</th>
    </tr>
  </thead>
  <tbody>
  
  <%for(Cidade cidade : new CidadeDB().all()) {%>
    <tr>
      <td><%=cidade.getId() %></td>
      <td><%=cidade.getNome() %></td>
      <td><%=cidade.getQntabitante() %></td>
    </tr>
    <%} %>
  </tbody>
</table>

<br>
<a href="Principal.jsp" class="btn btn-primary" >Voltar</a>
</body>
</html>