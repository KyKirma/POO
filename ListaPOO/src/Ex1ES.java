import java.util.Scanner;

public class Ex1ES {

	public static void main(String[] args) {
		//Exercicio 1 // Estrutura Sequencial
		Scanner sc = new Scanner(System.in);
		double larg, comp, val, area, price;
		
		System.out.print("Digite a largura do terreno: ");
		larg = sc.nextDouble();
		
		System.out.print("Digite a comprimento do terreno: ");
		comp = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadro: ");
		val = sc.nextDouble();
		
		area = larg * comp;
		price = area * val;
		
		System.out.printf("Area do terreno = %.02f m %nPreco do terreno = R$ %.02f", area, price);
		sc.close();
		
		
	}
}
