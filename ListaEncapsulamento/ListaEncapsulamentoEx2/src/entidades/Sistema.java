package src.entidades;

import java.util.Locale;
import java.util.Scanner;

public class Sistema {

	public void show() {
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			System.out.printf("-=-=-=-=-=Banco IFTM=-=-=-=-=-\n"
					+ "Ola, usuário!\n"
					+ "Selecione sua opção.\n\n"
					+ "[1] - Fazer Cadastro\n"
					+ "[2] - Verificar situação do Cadastro\n"
					+ "[3] - Sair do programa\n"
					+ "Opção: ");
			
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					break;
					
				case 2:
					break;
					
				case 3:
					System.out.println("Até mais!");
					break;
					
				default:
					System.out.println("Opção inválida, tente novamente.");
					break;
	
			}
		} while (choice != 3);
		
		sc.close();
	}
}
