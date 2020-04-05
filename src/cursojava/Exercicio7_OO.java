package cursojava;

import java.util.Locale;
import java.util.Scanner;
import entities.Quartos;

public class Exercicio7_OO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int quantQuartos = leia.nextInt();
		System.out.println("");
		
		Quartos[] aluguel = new Quartos[10];
				
		for (int i=1; i<=quantQuartos; i++) {
			System.out.println("Aluguel "+ i + "#: ");
			System.out.print("Nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.print("Email: ");
			String email =leia.next();
			System.out.print("Quarto: ");
			int quarto = leia.nextInt();
			System.out.println("");
			
			aluguel[quarto] = new Quartos(nome, email);	
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i=0; i<aluguel.length; i++) {
			if (aluguel[i] != null ) {
				System.out.println(i + ": " + aluguel[i]);
			}
		}
		
		leia.close();
	}

}
