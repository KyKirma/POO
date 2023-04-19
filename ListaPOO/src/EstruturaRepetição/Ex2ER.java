package EstruturaRepetição;

import java.util.Locale;
import java.util.Scanner;

public class Ex2ER {

	public static void main(String[] args) {
		// Exercicio 2 // Estrutura de Repetição
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int z = 0;
		double media, total = 0, id;
		
		System.out.println("Digite as idades:");
		id = sc.nextDouble();

		if (id < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			while (id > 0) {
				total = total + id;
				z = z + 1;
				id = sc.nextDouble();
			}
			media = total / z;
			System.out.printf("MEDIA = %.2f", media);
		}
		sc.close();
	}

}
