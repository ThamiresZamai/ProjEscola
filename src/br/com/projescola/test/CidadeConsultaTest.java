package br.com.projescola.test;

import br.com.projescola.DB.CidadeDB;
import br.com.projescola.model.Cidade;

public class CidadeConsultaTest {

	public static void main(String[] args) {
		
		for (Cidade cidade : new CidadeDB().all()) {
			
			System.out.println("Id: "+ cidade.getId());
			System.out.println("Nome: "+ cidade.getNome());
			System.out.println("qtd_habitante: "+ cidade.getQntabitante());
			
		}
	}
}
