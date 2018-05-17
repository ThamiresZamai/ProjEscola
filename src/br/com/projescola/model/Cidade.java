package br.com.projescola.model;

public class Cidade {
	
	private int id;
	private String nome;
	private int qnthabitante;
	
	public Cidade() {}
	
	public Cidade(int id) {
		this.id =id;
	}
	public Cidade(String nome) {
		this.nome=nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQntabitante() {
		return qnthabitante;
	}
	public void setQntabitante(int qntabitante) {
		this.qnthabitante = qntabitante;
	}
	
	

}
