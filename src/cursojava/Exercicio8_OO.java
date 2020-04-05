package cursojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Empregado;

public class Exercicio8_OO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Empregado> empregado = new ArrayList<>();
		
		int i = 1;
		
		System.out.print("How many employees will be registered? ");
		int quant = leia.nextInt();
		System.out.println("");
		
		do {
			System.out.println("Emplyoee #"+ i + ":");
			System.out.print("Id: ");
			int id = leia.nextInt();
			System.out.print("Name: ");
			leia.nextLine();
			String name = leia.nextLine();
			System.out.print("Salary: ");
			double salary = leia.nextDouble();			
			System.out.println("");
			empregado.add(new Empregado(id, name, salary));
			i++;			
		} while(i <= quant);
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = leia.nextInt();
		Empregado emp = empregado.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
			System.out.println("");
		}
		else {
			System.out.println("Enter the percentage: ");
			double porcentagem = leia.nextDouble();
			emp.aumentoSalario(porcentagem);
			System.out.println("");
		}
		
		System.out.println("List of employees: ");
		for(Empregado obj : empregado) {
			System.out.println(obj);
		}
		
		leia.close();
	}

}
