package cursojava;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9_OO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("==================== MATRIZ ====================");
		System.out.print("Informe o número de linhas da sua matriz: ");
		int m = leia.nextInt();
		System.out.print("Informe o número de colunas da sua matriz: ");
		int n = leia.nextInt();
		int matriz[][] = new int[m][n];
		
		for(int l=0; l<matriz.length ; l++) {
			for(int c=0; c<matriz[1].length ; c++) {
				matriz[l][c] = leia.nextInt();
			}
		}
		
		System.out.print("Informe qual número que saber a(s) posição(ões): ");
		int x = leia.nextInt();
		
		for(int l=0; l<matriz.length ; l++) {
			for(int c=0; c<matriz[1].length ; c++) {
				if(matriz[l][c] == x) {
					System.out.println("Position " + l + "," + c + ": ");
					if(c > 0) {
						System.out.println("Left: " + matriz[l][c-1]);
					}
					if(c < matriz[l].length-1) {
						System.out.println("Right: " + matriz[l][c+1]);
					}
					if(l > 0) {
						System.out.println("Up: " + matriz[l-1][c]);
					}
					if(l < matriz.length-1) {
						System.out.println("Down: " + matriz[l+1][c]);
					}
				}
			}
		}
		
		
		leia.close();
	}

}
