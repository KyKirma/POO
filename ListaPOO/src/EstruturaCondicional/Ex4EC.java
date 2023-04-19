package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex4EC {

	public static void main(String[] args) {
		//Exercicio 4 // Estrutura Condicional
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int min, total;
		System.out.print("Digite a quantidade de minutos: ");
		min = sc.nextInt();
		
		if (min > 100){
			total = 50 + ((min - 100) * 2);
		} else {
			total = 50;
		}
		System.out.printf("Valor a pagar: R$ %d.00", total);
		sc.close();
	}

}
