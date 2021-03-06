package br.com.projescola.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projescola.DB.AlunoDB;
import br.com.projescola.model.Aluno;
import br.com.projescola.model.Cidade;

@WebServlet("/ControllerAluno")
public class ControllerAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ControllerAluno() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idcidade = Integer.parseInt(request.getParameter("SelectCidade"));
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		int nota = Integer.parseInt(request.getParameter("nota"));
		
		Aluno a = new Aluno();
		a.setCidade(new Cidade(idcidade));
		a.setNome(nome);
		a.setTelefone(telefone);
		a.setNota(nota);
		
		if (new AlunoDB().insert(a)) {

			request.setAttribute("msg", "Registro inserido com sucesso.");
			request.getRequestDispatcher("CadastroAluno.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Erro ao inserir registro.");
			request.getRequestDispatcher("CadastroAluno.jsp").forward(request, response);
		}
			
		}	

}
