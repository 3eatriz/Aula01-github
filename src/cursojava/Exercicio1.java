package cursojava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int escolha;
		// MENU DE ESCOLHA
		System.out.println("**MENU**");
		System.out.println("TERRENO  [1]");
		System.out.println("SOMA2    [2]");
		System.out.println("CIRCULO  [3]");
		System.out.println("SOMA4    [4]");
		System.out.println("SALARIO  [5]");
		System.out.println("PEÇAS    [6]");
		System.out.println("FORMULAS [7]");
		System.out.print("Escolha: ");
		escolha = leia.nextInt();

		if (escolha == 1) { // TERRENO //

			double larg, comp, metroQ, areaT, precoT;
			//Colhendo dados do usuário:
			System.out.println("**Leitura de terreno**");
			System.out.print("Informe a largura desse terreno: ");
			larg = leia.nextDouble();
			System.out.print("Informe o comprimento desse terrno: ");
			comp = leia.nextDouble();
			System.out.printf("Informe o valor do metro quadrado: R$");
			metroQ = leia.nextDouble();
			//Informando usuário:
			areaT = larg * comp; //Calculo da área do terreno
			precoT = areaT * metroQ; //Calculo do preço do terreno

			System.out.printf("A área desse terreno é: %.2f%n", areaT);
			System.out.printf("O preço desse terreno é: R$%.2f%n", precoT);
		} else if (escolha == 2) { // SOMA2 //

			int num1, num2, soma;
			//Colhendo dados do usuário:
			System.out.println("**Soma de dois números**");
			System.out.print("Informe o primeiro número: ");
			num1 = leia.nextInt();
			System.out.print("Informe o segundo número: ");
			num2 = leia.nextInt();

			soma = num1 + num2; //Calculo da soma
			//Informando usuário:
			if (num2 < 0) {

				System.out.println("A soma de " + num1 + num2 + " = " + soma);
			} else {
				System.out.println("A soma de " + num1 + "+" + num2 + " = " + soma);
			}

		} else if (escolha == 3) { // CIRCULO //

			double raio, area;
			double pi = 3.14159;
			//Colhendo dados do usuário:
			System.out.println("**CIRCULO**");
			System.out.print("Informe o valor do raio: ");
			raio = leia.nextDouble();

			area = pi * Math.pow(raio, 2.0);//Calculo da área
			//Informando usuário:
			System.out.printf("A área desse circulo é = %.4f%n", area);

		} else if (escolha == 4) { // SOMA4 //

			int a, b, c, d, diferenca;
			//Colhendo dados do usuário:
			System.out.println("**Soma entre 4 números**");
			System.out.print("Informe o valor de A: ");
			a = leia.nextInt();
			System.out.print("Informe o valor de B: ");
			b = leia.nextInt();
			System.out.print("Informe o valor de C: ");
			c = leia.nextInt();
			System.out.print("Informe o valor de D: ");
			d = leia.nextInt();

			diferenca = (a * b - c * d); //Calculo da diferença entre produtos
			//Informando usuário:
			System.out.println("A diferença entre o produto de A e B pelo produto de C e D é = " + diferenca);

		} else if (escolha == 5) { // SALARIO //

			float numF, numHT, valorT, salario;
			//Colhendo dados do usuário:
			System.out.println("**Calculo do salário**");
			System.out.print("Informe seu ID de funcionário: ");
			numF = leia.nextFloat();
			System.out.print("Informe seu o número de horas trabalhadas: ");
			numHT = leia.nextFloat();
			System.out.print("Informe o valor que recebe por horas trabalhadas: ");
			valorT = leia.nextFloat();
			
			salario = numHT * valorT; //Calculo de salário
			//Informando usuário:
			System.out.println("O funcionário: " + numF);
			System.out.printf("Salário: R$%.2f%n", salario);

		} else if (escolha == 6) { // PEÇAS //
			
			float peca1, peca2, numP1, numP2, valorP1, valorP2, total, tot1, tot2;
			//Colhendo dados do usúario:
			System.out.println("**Calculando o valor de uma compra de peças**");
			System.out.print("Informe o código, a quantidade e o valor unitário da primeira peça: ");
			peca1 = leia.nextFloat();
			numP1 = leia.nextFloat();
			valorP1 = leia.nextFloat();
			System.out.print("Informe o código, a quantidade e o valor unitário da segunda peça: ");
			peca2 = leia.nextFloat();
			numP2 = leia.nextFloat();
			valorP2 = leia.nextFloat();
			
			tot1 = numP1*valorP1;//Calculo do valor da primeira peça
			tot2 = numP2*valorP2;//Calculo do valor da segunda peça
			total = tot1+tot2;//Calculo do valor total
			//Informando usuário:
			System.out.println("");
			System.out.println("Código do Produto: " + peca1);
			System.out.println("Quantidade: " + numP1);
			System.out.printf("Valor: %.2f%n", tot1);
			System.out.println("");
			System.out.println("Código do Produto: " + peca2);
			System.out.println("Quantidade: " + numP2);
			System.out.printf("Valor: %.2f%n", tot2);
			System.out.println("");
			System.out.printf("Valor total: %.2f%n", total);
			
		} else if (escolha == 7) { // FORMULAS GEOMÉTRICAS //
			
			double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
			double pi = 3.14159;
			//Colhendo dados do usuário:
			System.out.println("**Calculando formulas geométricas**");
			System.out.print("Informe o valor de A: ");
			A = leia.nextDouble();
			System.out.print("Informe o valor de B: ");
			B = leia.nextDouble();
			System.out.print("Informe o valor de C: ");
			C = leia.nextDouble();
			
			triangulo = (A*C)/2;//Calculando a área do triangulo
			circulo = pi*Math.pow(C,2);//Calculando a área do circulo
			trapezio = ((A+B)*C)/2;//Calculando a área do trapezio
			quadrado = Math.pow(B,2);//Calculando a área do quadrado
			retangulo = A*B;//Calculando a área do retangulo
			//Informando usuário:
			System.out.printf("TRIANGULO: %.3f%n" , triangulo);
			System.out.printf("CIRCULO: %.3f%n" , circulo);
			System.out.printf("TRAPEZIO: %.3f%n" , trapezio);
			System.out.printf("QUADRADO: %.3f%n" , quadrado);
			System.out.printf("RETRANGULO: %.3f%n" , retangulo);
			
		}

		leia.close();
	}

}
