package cursojava;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle_1_OO;

public class Exercicio5_1_OO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
				
		Rectangle_1_OO rectangle = new Rectangle_1_OO();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = leia.nextDouble();
		rectangle.height = leia.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

		
		leia.close();
	}

}
