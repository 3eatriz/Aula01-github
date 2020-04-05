package cursojava;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee_2_OO;

public class Exercicio5_2_OO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Employee_2_OO employee = new Employee_2_OO();
		System.out.print("Name: ");
		employee.name = leia.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = leia.nextDouble();
		System.out.print("Tax: ");
		employee.tax = leia.nextDouble();
		System.out.println("");
		
		System.out.println("Employee: " + employee);
		System.out.println("");
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = leia.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("");
		
		System.out.println("Update data: " + employee);
		
		
		leia.close();
	}

}
