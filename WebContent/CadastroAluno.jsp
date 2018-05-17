<%@page import="br.com.projescola.DB.AlunoDB"%>
<%@page import="br.com.projescola.model.Aluno"%>
<%@page import="br.com.projescola.DB.CidadeDB"%>
<%@page import="br.com.projescola.model.Cidade"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Alunos</title>
<link rel="stylesheet" href="Bootstrap/bootstrap.css"/>
</head>
<body>
<h1>Cadastro de Alunos</h1>

<form action="ControllerCidade" method="post">
<dir class="col-sm-3">
<div>
<label>Nome:</label>
<input type="text" class="form-control" id="nome" name="nome"><br>
</div>
<div>
<label>Telefone:</label>
<input type="text" class="form-control" id="telefone" name="telefone"><br>
</div>

<div class="form-group">
    <label for="SelectCidade">Cidade</label>
    <select class="form-control" id="SelectCidade" name="SelectCidade">
    
    <option>Selecione</option>
    <% for(Cidade cidade : new CidadeDB().all()){%>
      <option value="<%=cidade.getId() %>"> <%=cidade.getNome() %></option>
      <%} %>
    </select>
  </div>

<div>
<label>Nota:</label>
<input type="number" class="form-control" id="nota" name="nota"><br>
</div>


<input type="submit" class="btn btn-primary" value="Salvar"><br>
</dir>
</form>
<table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Nome</th>
      <th scope="col">telefone</th>
      <th scope="col">Nota</th>
      <th scope="col">Cidade</th>
    </tr>
  </thead>
  <tbody>
  
  <%for(Aluno aluno : new AlunoDB().all()) {%>
    <tr>
      <td><%=aluno.getNome() %></td>
      <td><%=aluno.getTelefone() %></td>
      <td><%=aluno.getNota() %></td>
      <td><%=aluno.getCidade().getNome() %></td>
    </tr>
    <%} %>
  </tbody>
</table>


<br>
<a href="Principal.jsp" class="btn btn-primary">Voltar</a>
</body>
</html>