package cursojava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.LevelDeTrabalho;

public class Exercicio10_OO {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		SimpleDateFormat fData1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite o nome do departamento ");
		String nomeDep = leia.nextLine();
		System.out.println("Digite os dados do trabalhador:");
		System.out.print("Nome: ");
		String nomeTrab = leia.nextLine();
		System.out.print("Level: ");
		String levelTrab = leia.nextLine();
		System.out.print("Salário Base: ");
		Double salBase = leia.nextDouble();
		Trabalhador trab = new Trabalhador(nomeTrab, LevelDeTrabalho.valueOf(levelTrab), salBase, new Departamento(nomeDep));
		System.out.print("Quantos contratos para esse trabalhador? ");
		Integer quantContratos = leia.nextInt();
		
		for(int c=1; c<=quantContratos; c++) {
			System.out.printf("Digite os dados do contrato nº %d: \n", c);
			System.out.print("Data (DD/MM/AAAA): ");
			Date data1 = fData1.parse(leia.next());
			System.out.print("Valor por hora: ");
			Double valorHora = leia.nextDouble();
			System.out.print("Duração (horas): ");
			Integer duracao = leia.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(data1, valorHora, duracao);
			trab.AdicionarContrato(contrato);
		}
		System.out.println("");
		System.out.print("Digite o mês e o ano para calcular a renda (MM/AAAA): ");
		String data2 = leia.next();
		int mes = Integer.parseInt(data2.substring(0, 2));
		int ano = Integer.parseInt(data2.substring(3, 7));
		System.out.printf("Nome: %s\n",trab.getNome());
		System.out.printf("Departamento: %s\n", trab.getDepartamento().getNome());
		System.out.printf("Renda para %s: %.2f", data2, trab.Renda(ano, mes));
		leia.close();
	}

}
