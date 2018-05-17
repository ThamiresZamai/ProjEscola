package br.com.projescola.test;

import br.com.projescola.DB.CidadeDB;
import br.com.projescola.model.Cidade;

public class Cidadetest {

	public static void main(String[]args) {
		
		Cidade c = new Cidade();
		c.setNome("Araraquara");
		c.setQntabitante(3000000);
		c.setNome("Campinas");
		c.setQntabitante(80000000);
		
		if(new CidadeDB().insert(c)) {
			System.out.println("Registro inserido");
		}else {
			System.out.println("Erro ao inserir registro");
		}
	}
}
