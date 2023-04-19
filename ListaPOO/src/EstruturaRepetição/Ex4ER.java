package EstruturaRepetição;

import java.util.Scanner;

public class Ex4ER {

	public static void main(String[] args) {
		//Exercicio 4 // Estrutura de Repetição	
		Scanner sc = new Scanner(System.in);
		int x, y;
		boolean i = false;
		
		while (i == false) {
			System.out.println("Digite os valores das coordenadas X e Y:");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			} else if (x < 0 && y > 0) {
				System.out.println("QUADRANTE Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("QUADRANTE Q3");
			} else if (x > 0 && y < 0) {
				System.out.println("QUADRANTE Q4");
			} else {
				i = true;
			}
		}
		sc.close();
	}

}
