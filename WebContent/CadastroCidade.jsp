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
<a href="Principal.jsp" >Voltar</a>
</body>
</html>