package cursojava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("**EXERCÍCIO 3**");
		System.out.println("SENHA       [1]");
		System.out.println("COORDENADAS [2]");
		System.out.println("POSTO       [3]");
		int escolha;
		System.out.print("Escolha: ");
		escolha = leia.nextInt();

		switch (escolha) {

		case 1:

			int senha;
			System.out.println("**Reconhece se a senha está correta**");
			System.out.print("Digite dua senha: ");
			senha = leia.nextInt();
			while (senha != 2002) {

				System.out.println("Senha incorreta!");
				System.out.println("Digite a senha novamete: ");
				senha = leia.nextInt();

			}

			System.out.println("Acesso permitido!");
			break;

		case 2:

			double x, y;
			System.out.println("**Reconhece o plano cartesiano**");
			System.out.print("Informe x e y: ");
			x = leia.nextDouble();
			y = leia.nextDouble();

			if ((x > 0) && (y > 0)) {

				System.out.println("Primeiro Quadrante");

			} else if ((x < 0) && (y > 0)) {

				System.out.println("Segundo Quadrante");

			} else if ((x < 0) && (y < 0)) {

				System.out.println("Terceiro Quadrante");

			} else if ((x > 0) && (y < 0)) {

				System.out.println("Quarto Quadrante");

			} else if ((x == 0) || (y == 0)) {

				break;

			}

			break;

		case 3:

			int disel = 0, alcool = 0, gasolina = 0, combustivel;

			System.out.println("**Bem vindo ao nosso posto**");
			System.out.println("Alcool   [1]");
			System.out.println("Gasolina [2]");
			System.out.println("Disel    [3]");
			System.out.println("Fim      [4]");
			System.out.print("Qual combustivel você deseja abastecer?: ");
			combustivel = leia.nextInt();

			while (combustivel != 4) {

				if (combustivel == 1) {

					alcool += 1;

				} else if (combustivel == 2) {

					gasolina += 1;

				} else if (combustivel == 3) {

					disel += 1;

				} else {
					
					System.out.println("Opção inválida, escolha outra:");
					
				}
				
				System.out.println("Alcool   [1]");
				System.out.println("Gasolina [2]");
				System.out.println("Disel    [3]");
				System.out.println("Fim      [4]");
				System.out.print("Qual combustivel você deseja abastecer?: ");
				combustivel = leia.nextInt();

			}
			
			System.out.println("MUITO OBRIGADA!");
			System.out.println("ALCOOL: " + alcool);
			System.out.println("GASOLINA: " + gasolina);
			System.out.println("DISEL: " + disel);

		}

		leia.close();
	}

}
