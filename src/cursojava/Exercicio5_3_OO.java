package cursojava;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno_3_OO;

public class Exercicio5_3_OO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Aluno_3_OO aluno = new Aluno_3_OO();
		System.out.print("NAME: ");
		aluno.nome = leia.nextLine();
		System.out.print("NOTE: ");
		aluno.nota1 = leia.nextDouble();
		System.out.print("NOTE: ");
		aluno.nota2 = leia.nextDouble();
		System.out.print("NOTE: ");
		aluno.nota3 = leia.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.notaFinal());
		if (aluno.notaFinal() < 60.0) {  
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
			}   
		else {
			System.out.println("PASS");
			}
		leia.close();
	}

}
