import java.util.Locale;
import java.util.Scanner;

public class Ex5ES {

	public static void main(String[] args) {
		//Exercicio 5 // Estrutura Sequencial
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
		System.out.printf("TROCO = R$ %.2f", troco);
		sc.close();
	}
}