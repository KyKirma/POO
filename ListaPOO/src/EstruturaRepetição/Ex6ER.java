package EstruturaRepetição;

import java.util.Scanner;

public class Ex6ER {

	public static void main(String[] args) {
		//Exercicio 4 // Estrutura de Repetição	
		Scanner sc = new Scanner(System.in);
		int al = 0, gas = 0, die = 0, x;
		boolean i = false;
		
		while (i == false) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para sair: ");
			x = sc.nextInt();
			
			if (x == 1) {
				al++;
			} else if (x == 2) {
				gas++;
			} else if (x == 3) {
				die++;
			} else if (x == 4) {
				i = true;
			}
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", al, gas, die);
		sc.close();
		
	}

}
