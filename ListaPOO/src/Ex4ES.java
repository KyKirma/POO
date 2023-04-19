import java.util.Scanner;

public class Ex4ES {

	public static void main(String[] args) {
		//Exercicio 4 // Estrutura Sequencial
		Scanner sc = new Scanner(System.in);
		int x, y, res;
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		y = sc.nextInt();
		
		res = x + y;
		
		System.out.printf("SOMA: %d", res);
		sc.close();
	}

}
