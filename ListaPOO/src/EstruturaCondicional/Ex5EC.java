package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5EC {

	public static void main(String[] args) {
		//Exercicio 5 // Estrutura Condicional
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double price, rec, troco;
		int qnt;
		
		System.out.print("Preço unitário do produto: ");
		price = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qnt = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		rec = sc.nextDouble();
		
		troco = rec - (price * qnt);
		
		if (troco < 0) {
			troco = (price* qnt) - rec;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f", troco);
		} else {
		System.out.printf("TROCO = R$ %.2f", troco);
		}
		sc.close();

	}

}
