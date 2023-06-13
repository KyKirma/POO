package EX1;

import java.util.Locale;
import java.util.Scanner;

class Banco {
		public void show() {
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		Cliente pessoa = new Cliente();
		
		cadastro(pessoa);
		int choice = 0;
		
		do {
			System.out.printf("-=-=-=-=-=Banco IFTM=-=-=-=-=-\n"
					+ "Ola, %s!\n"
					+ "Selecione sua opção.\n\n"
					+ "[1] - Verificar situação do Cadastro\n"
					+ "[2] - Sair do programa\n"
					+ "Opção: ", pessoa.getNome());
			
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					pessoa.validaCPF();
					break;
				case 2:
					System.out.println("Até mais!");
					break;
				default:
					System.out.println("Opção inválida, tente novamente.");
					break;
			}
		} while (choice != 3);
		
		sc.close();
	}

	private void cadastro(Cliente pessoa) {
		Scanner sc1= new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		pessoa.setNome(sc1.nextLine());
		System.out.print("Insira seu endereço: ");
		pessoa.setEndereco(sc1.nextLine());
		System.out.print("Insira seu CPF: ");
		pessoa.setCpf(sc1.nextLine());
		System.out.print("Insira sua idade: ");
		pessoa.setIdade(sc1.nextInt());
		
		System.out.println("Cadastro concluido com sucesso.\n");
		sc1.close();
	}
}



