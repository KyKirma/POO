package EstruturaRepetição;

import java.util.Scanner;

public class Ex3ER {
	
	public static void main(String[] args) {
		//Exercicio 3 // Estrutura de Repetição		
		Scanner sc = new Scanner(System.in);
		int senha;
		boolean x = false;
		
		System.out.print("Digite a senha: ");
		do {
			senha = sc.nextInt();
			if (senha == 2002) {
				x = true;
				System.out.print("Acesso permitido!");
			} else {
				System.out.print("Senha Invalida! Tente novamente: ");
			}
		} while (x == false);
		sc.close();
	}
}
