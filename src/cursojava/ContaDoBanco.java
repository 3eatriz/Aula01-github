package cursojava;

import java.util.Locale;
import java.util.Scanner;

import entities.OperBancaria;

public class ContaDoBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.print("Digite o número da conta: ");
		int numConta = leia.nextInt();
		System.out.print("Digite o titular da conta: ");
		leia.nextLine();
		String titular = leia.nextLine();
		System.out.print("Existe um depósito inicial (s / n)? ");
		char depInicial = leia.next().charAt(0);
		System.out.println("");
		
		OperBancaria oper;
		
		if (depInicial == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double valorDep = leia.nextDouble();
			oper = new OperBancaria(numConta, titular, valorDep);

		} else {
			oper = new OperBancaria(numConta, titular);
		}
				
		System.out.println("Dados da conta:");
		System.out.println(oper);
		System.out.println("");

		System.out.print("Digite um valor de depósito: ");
		double valor = leia.nextDouble();
		oper.deposito(valor);
		System.out.println("Dados atualizados da conta:");
		System.out.println(oper);
		System.out.println("");

		System.out.print("Digite um valor de retirada: ");
		valor = leia.nextDouble();
		oper.saque(valor);
		System.out.println("Dados atualizados da conta:");
		System.out.println(oper);
		System.out.println("");

		leia.close();
	}

}
