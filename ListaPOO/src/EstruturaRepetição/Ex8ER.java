package EstruturaRepetição;

import java.util.Scanner;

public class Ex8ER {

	public static void main(String[] args) {
		// Exercicio 2 // Estrutura de Repetição
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		System.out.print("Deseja a tabuada para qual valor? : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			x = n * i;
			System.out.printf("%d x %2d = %d\n", n, i, x);
		}
		sc.close();
	}

}


