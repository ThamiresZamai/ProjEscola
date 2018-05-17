package br.com.projescola.test;

import br.com.projescola.DB.AlunoDB;
import br.com.projescola.DB.CidadeDB;
import br.com.projescola.model.Aluno;
import br.com.projescola.model.Cidade;

public class Alunotest {

public static void main(String[]args) {
		
		Aluno a = new Aluno();
		a.setNome("Thamires");
		a.setTelefone("33333333");
		a.setNota(9);
		a.setCidade(new Cidade(2));
		
		if(new AlunoDB().insert(a)) {
			System.out.println("Registro inserido");
		}else {
			System.out.println("Erro ao inserir registro");
		}
	}
}
