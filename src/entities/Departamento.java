package entities;

public class Departamento {
//ATRIBUTOS	
	private String nome;
//CONSTRUTORES	
	public Departamento() {
		
	}
	public Departamento(String nome) {
		this.nome = nome;
	}
//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
