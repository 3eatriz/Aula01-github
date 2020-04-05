package cursojava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int escolha;
		
		do {
		System.out.println("**EXERCÍCIO 4**");
		System.out.println("CONTADOR/IMPAR [1]");
		System.out.println("IN/OUT         [2]");
		System.out.println("TESTES         [3]");
		System.out.println("DIVISOR/PAR    [4]");
		System.out.println("FATORIAL       [5]");
		System.out.println("DIVIDORES      [6]");
		System.out.println("LINHAS         [7]");
		System.out.print("Escolha: ");
		escolha = leia.nextInt();
		
		}while((escolha < 0)||(escolha > 7));
		
		switch(escolha) {
		
		case 1: 
			
			int x;
			System.out.print("Informe um número de 1 a 1000: ");
			x = leia.nextInt();
						
			while((x < 1)||(x > 1000)) {

				System.out.print("Escolha um número de 1 a 1000!:");
				x = leia.nextInt();
				
			}
				
				for(int i = 0; i <= x; i++) {
					
					if(i%2 == 1) {
						
						System.out.println(i);
						
					}
					
				}	
				
			break;
			
		case 2:
			
			int X, n, in = 0, out = 0;
			
			System.out.println("** In/Out **");
			System.out.print("Informe a quantidade de números: ");
			n = leia.nextInt();
			
			for(int i = 1; i <= n; i++) {
				
				System.out.print("Informe o º" + i + " número: ");
				X = leia.nextInt();
				
				if((X >= 10)&&(X <= 20)) {
					
					in++;
					
				} else {
					
					out++;
					
				}
				
			}
			
			System.out.println(in + " in");
			System.out.println(out + " out");
			
			break;
			
		case 3:
			
			double val1, val2, val3, peso;
			
			System.out.println("** Contador de Testes **");
			System.out.print("Quantos testes deseja fazer?: ");
			int testes = leia.nextInt();
			
			for(int i = 1; i <= testes; i++) {
				
				System.out.println(i + "º teste:");
				System.out.print("Informe o 1º, 2º e 3º valor: ");
				val1 = leia.nextDouble();
				val2 = leia.nextDouble();
				val3 = leia.nextDouble();
				
				peso = ((val1*2) + (val2*3) + (val3*5))/10;
				
				System.out.printf("%.1f%n", peso);
				
			}
			
			break;
			
		case 4:
			
			double num1, num2, divi;
			
			System.out.println("** Divisores de pares **");
			System.out.print("Quantas divisões você quer fazer?: ");
			int quant = leia.nextInt();
			
			for(int i = 1; i <= quant; i++)	{
				
				System.out.println(i + "º divisão:");
				System.out.print("Informe o 1º e 2º número: ");
				num1 = leia.nextInt();
				num2 = leia.nextInt();
				
				if(num2 == 0) {
					
					System.out.println("Impossível dividir por 0!");
					
				} else { 
					
					divi = num1 / num2;
					
					System.out.printf("%.1f%n", divi = (divi == 0) ? Math.abs(divi):divi);
					
				}
				
			}
			
			break;
			
		case 5:
			
			int conta = 1, dimi;
			
			System.out.println("** Calculando fatorial **");
			System.out.print("Qual núemro você quer fatorar?: ");
			int num = leia.nextInt();
			dimi = num;
			
			for(int i = 0; i < dimi; i++) {
					
				conta = conta*(num);
				num--;
				
			}
			System.out.println(conta);
			
			break;
			
		case 6:
			
			System.out.println("** Saber os divisores do número **");
			System.out.print("Informe o núemro: ");
			int numero = leia.nextInt();
			
			for(int i = 1; i <= numero; i++) {
				
				if(numero%i == 0) {
					
					System.out.println(i);
					
				}
								
			}
			
			break;
			
		case 7:
			
			System.out.println("** Contador de Linhas **");
			System.out.print("Informe o número de linhas que você deseja: ");
			int linhas = leia.nextInt();
			
			for(int i = 1; i <= linhas; i++) {
				
				System.out.print(i + "- ");
				System.out.printf("%.0f ", Math.pow(i, 2));
				System.out.println((int)Math.pow(i, 3));
								
			}
			
			break;
			
		default: 
			
			System.out.println("Escolha inválida!");
			break;
			
		}

		leia.close();
	}

}
