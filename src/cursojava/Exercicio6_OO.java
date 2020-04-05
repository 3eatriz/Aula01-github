package cursojava;

import java.util.Locale;
import java.util.Scanner;
import entities.Conversor_OO;

public class Exercicio6_OO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double cotacao = leia.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double compraD = leia.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", Conversor_OO.calcDolar(cotacao,compraD));
		
		leia.close();
	}

}
