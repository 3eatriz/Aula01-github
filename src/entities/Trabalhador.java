package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.LevelDeTrabalho;

public class Trabalhador {
//ATRIBUTOS:
	private String nome;
	private LevelDeTrabalho level;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoPorHora> contrato = new ArrayList<>();
//CONSTRUTORES:	
	public Trabalhador() {
		
	}
	
public Trabalhador(String nome, LevelDeTrabalho level, Double salarioBase, Departamento departamento) {
	this.nome = nome;
	this.level = level;
	this.salarioBase = salarioBase;
	this.departamento = departamento;
}

//GETTERS E SETTERS:	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LevelDeTrabalho getLevel() {
		return level;
	}

	public void setLevel(LevelDeTrabalho level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContrato() {
		return contrato;
	}

//METODOS:	
	public void AdicionarContrato(ContratoPorHora contrato) {
		this.contrato.add(contrato);
	}

	public void RemoverContrato(ContratoPorHora contrato) {
		this.contrato.remove(contrato);
	}
	public Double Renda(int ano, int mes) {
		double soma = getSalarioBase();
		Calendar calendario = Calendar.getInstance();
		for (ContratoPorHora c: contrato) {
			calendario.setTime(c.getData());
			int c_ano = calendario.get(Calendar.YEAR);
			int c_mes = 1 + calendario.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes){
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
}
