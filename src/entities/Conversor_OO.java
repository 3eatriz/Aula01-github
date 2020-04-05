package entities;

public class Conversor_OO {
	
	public static final double IOF = 0.06;
	
	public static double calcDolar(double cotacao, double compraD){
		return cotacao * compraD * (1.0 + IOF);
	}
	
}
