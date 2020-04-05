package entities;

public class OperBancaria {
	
	//atributos
	private int numConta;
	private String titular;
	private double saldo;
	
	//construtores
	public OperBancaria(int numConta, String titular){
		this.numConta = numConta;
		this.titular = titular;
	}
	
	public OperBancaria(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	//getters e setters
	public int getNumConta(){
		return numConta;
	}
	public String getTitular(){
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular; 
	}

	public double getSaldo() {
		return saldo;
	}
	
	//métodos
	public void deposito(double valorDep) {
		saldo += valorDep;
	}
	public void saque(double valSaq) {
		saldo -= valSaq + 5;
	}
	
	public String toString() {
		return "Conta " 
				+ numConta 
				+ ", Titular: " 
				+ titular 
				+ ", Saldo: R$ "
				+ String.format("%.2f", saldo);
	}
	
	
}
