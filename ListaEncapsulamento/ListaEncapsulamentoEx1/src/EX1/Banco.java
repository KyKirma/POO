package src.EX1;

import java.util.Locale;
import java.util.Scanner;

class Banco {
		public void show() {
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		Cliente pessoa = new Cliente();
		
		cadastro(pessoa);

		System.out.printf("-=-=-=-=-=Banco IFTM=-=-=-=-=-\n"
		+ "Ola, %s!\n"
		+ "Verificando a situação do seu cadastro...\n\n", pessoa.getNome());
		
		pessoa.validaCPF();
		sc.close();
	}

	private void cadastro(Cliente pessoa) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira seu nome: ");
		pessoa.setNome(sc.nextLine());
		System.out.print("Insira seu endereço: ");
		pessoa.setEndereco(sc.nextLine());
		System.out.print("Insira seu CPF: ");
		pessoa.setCpf(sc.nextLine());
		System.out.print("Insira sua idade: ");
		pessoa.setIdade(sc.nextInt());
		
		System.out.println("Cadastro concluido com sucesso.\n");
		sc.close();
	}
}



