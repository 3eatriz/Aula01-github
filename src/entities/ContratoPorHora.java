package entities;

import java.util.Date;

public class ContratoPorHora {
//ATRIBUTOS
	private Date data;
	private Double valorPorHora;
	private Integer horas;
//CONSTRUTORES	
	public ContratoPorHora() {
		
	}
	public ContratoPorHora(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}
//GETTERS E SETTERS
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
//METODOS
	public Double valorTotal() {
		return getValorPorHora()*getHoras();
	}
}
