package cursojava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("**EXERCICIO 2**");
		System.out.println("==MENU==");
		System.out.println("POSITIVO/NEGATIVO [1]");
		System.out.println("PAR/IMPAR         [2]");
		System.out.println("MULTIPLOS         [3]");
		System.out.println("TEMPOGAME         [4]");
		System.out.println("CAIXA             [5]");
		System.out.println("INTERVALOS        [6]");
		System.out.println("EIXOS             [7]");
		System.out.println("IMPOSTOS          [8]");
		System.out.print("ESCOLHA: ");
		int escolha = leia.nextInt();
		
		if (escolha == 1) {
			
			double num;
			
			System.out.println("**Descubra se o n�mero � positivo ou negativo**");
			System.out.print("Informe um n�emro: ");
			num = leia.nextDouble();
			
			if (num > 0) {
				
				System.out.println(num + " � positivo!");
				
			} else if (num == 0) {
				
				System.out.println(num + " � neutro!");
				
			} else { 
				
				System.out.println(num + " � negativo!");
				
			}
			
		} else if (escolha == 2){
			
			int num;
			
			System.out.println("**Descubra se o n�mero � par ou impar**");
			System.out.print("Informe o n�emro: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				
				System.out.println(num + " � par!");
				
			} else {
				
				System.out.println(num + " � impar!");
				
			}
		
		} else if (escolha == 3) {
			
			int A, B;
			
			System.out.println("**Descubra se os n�meros s�o multiplos**");
			System.out.print("Informe o valor de A e B: ");
			A = leia.nextInt();
			B = leia.nextInt();
			
			if (A > B) {
				
				if (A % B == 0) {
					System.out.println(A + " e " + B + " s�o multiplos!");
				} else { 
					System.out.println(A + " e " + B + " n�o s�o multiplos!");
				}
				
			} else if (A < B){
				
				if (B % A == 0) {
					System.out.println(A + " e " + B + " s�o multiplos!");
				} else { 
					System.out.println(A + " e " + B + " n�o s�o multiplos!");
				}
				
			}
		
		} else if (escolha == 4){	
			
			int horaInicial, horaFinal;
			int tempoJogo;
			
			System.out.println("**Quanto tempo voc� passou jogando**");
			System.out.print("Informe a hora que voc� come�ou e a hora que voc� terminou de jogar: ");
			horaInicial = leia.nextInt();
			horaFinal = leia.nextInt();
			
			if (horaInicial < horaFinal) {

				tempoJogo = horaFinal - horaInicial;

			}

			else {

				tempoJogo = 24 - horaInicial + horaFinal;

			}
			
			System.out.println("Voc� jogou por " + tempoJogo + " horas!");
		} else if (escolha == 5){
			
			double codigo, quantidade, preco = 0;
			
			System.out.println("**Caixa de restaurante**");
			System.out.print("Informe o c�digo do protudo e a quantidade: ");
			codigo = leia.nextDouble();
			quantidade = leia.nextDouble();
			
			if (codigo == 1) {
				
				preco = quantidade * 4.00;
				
			} else if (codigo == 2) {
				
				preco = quantidade * 4.50;
				
			} else if (codigo == 3) {
				
				preco = quantidade * 5.00;
				
			} else if (codigo == 4) {
				
				preco = quantidade * 2.00;
				
			} else if (codigo == 5) {
				
				preco = quantidade * 1.50;
				
			}
			
			System.out.printf("Total: R$%.2f%n", preco);
			
		} else if(escolha == 6) {
			
			double num;
			
			System.out.println("**Intervalo de n�emros**");
			System.out.print("Informe um n�mero: ");
			num = leia.nextDouble();
			
			if ((num>0)&&(num<=25)) {
				
				System.out.println("Intervalo [0,25]");
				
			} else if((num>25)&&(num<=50)) {
				
				System.out.println("Intervalo [25,50]");
				
			} else if((num>50)&&(num<=75)) {
				
				System.out.println("Intervalo [50,75]");
								
			} else if((num>75)&&(num<=100)) {
				
				System.out.println("Intervalo [75,100]");
				
			} else {
				
				System.out.println("Fora de intervalo");
				
			}
			
		} else if (escolha == 7) {
			
			double x, y;
			
			System.out.println("**Eixos e quadrantes**");
			System.out.print("Informe x e y: ");
			x = leia.nextDouble();
			y = leia.nextDouble();
			
			if((x == 0.0)&&(y == 0.0)) {
				
				System.out.println("Origem");
								
			} else if(x == 0.0) {
				
				System.out.println("Eixo Y");
				
			} else if(y == 0.0) {
				
				System.out.println("Eixo X");
				
			} else if((x > 0.0)&&(y > 0.0)) {
				
				System.out.println("Q1");
				
			} else if((x < 0.0)&&(y > 0.0)) {
				
				System.out.println("Q2");
				
			} else if((x < 0.0)&&(y < 0.0)) {
				
				System.out.println("Q3");
				
			} else if((x > 0.0)&&(y < 0.0)) {
				
				System.out.println("Q4");
				
			}
			
		} else if(escolha == 8){
			
			double salario, imposto;
			
			System.out.println("**IMPOSTOS**");
			System.out.print("Informe seu sal�rio: ");
			salario = leia.nextDouble();
			
			if(salario <= 2000) {
				
				System.out.println("Isento");
				
			} else if(salario <= 3000) {
				
				imposto = (salario - 2000)*0.08;				
				System.out.printf("R$%.2f%n", imposto);
				
			} else if(salario <= 4500) {
				
				imposto = (salario - 3000)*0.18 + 1000 * 0.08;
				System.out.printf("R$%.2f%n", imposto);
				
			} else if(salario > 4500) {
				
				imposto = (salario - 4500)*0.28 + 1500 * 0.18 + 1000 *0.08;
				System.out.printf("R$%.2f%n", imposto);
				
			}
			
		}
		
		else {
		
			System.out.println("==Escolha inv�lida==");
			
		}

		leia.close();
	}

}
