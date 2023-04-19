package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex6EC {

	public static void main(String[] args) {
		//Exercicio 6 // Estrutura Condicional
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glic;
		
		System.out.print("Digite a medida da glicose: ");
		glic = sc.nextDouble();
		
		if (glic < 100) {
			System.out.println("Classificacao: normal");
		} else if ( 100 > glic && glic < 140) {
			System.out.println("Classificacao: elevado");
		} else {
			System.out.println("Classificacao: diabetes");
		}
		sc.close();
	}
}
