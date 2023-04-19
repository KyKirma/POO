package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex3EC {

	public static void main(String[] args) {
		//Exercicio 3 // Estrutura Condicional
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Primeiro valor: ");
		x = sc.nextInt();
		System.out.print("Segundo valor: ");
		y = sc.nextInt();
		System.out.print("Treceiro valor: ");
		z = sc.nextInt();
		
		if (z < x && z < y) {
			System.out.printf("MENOR = %d", z);
		} else if (y < x && y < z) {
			System.out.printf("MENOR = %d", y);
		} else {
		System.out.printf("MENOR = %d", x);
		}
		sc.close();
	}
}
