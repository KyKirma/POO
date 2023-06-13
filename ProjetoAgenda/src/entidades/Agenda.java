package entidades;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	private List<Contato> agenda;
	private Scanner sc;	
	
	public Agenda() {
		this.agenda = new ArrayList<>();
		this.sc = new Scanner(System.in);		
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		do {
			System.out.println("Menu da Agenda");
			System.out.println("1 - Adicionar Contato");
			System.out.println("2 - Buscar Contato");
			System.out.println("3 - Listar Contatos");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opcao: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				adicionaContato();
				break;
			case 2:
				buscarContatoMenu();
				break;
			case 3:
				listarAgenda();
				break;
			case 0:
				System.out.println("good bye");
				break;
			default:
				System.out.println("opção invalida");
				break;
			}
		} while (opcao != 0);
		sc.close();
	}

	private  void buscarContatoMenu() {
		List<Contato> contatos = buscarContato();
		System.out.println("1 - Editar Contato");
		System.out.println("2 - Remover Contato");
		System.out.println("3 - Bloquear o Contato");
		System.out.println("4 - Ligar para o contato");
		int op = this.sc.nextInt();
		this.sc.nextLine();
		if (op == 1) {
			editarContato(contatos);
		}else if(op == 2) {
			removeContato(contatos);
		}else if(op == 3) {
			bloquearContato(contatos);
		}else if(op == 4) {
			System.out.println("ligando para o contato");
		}
	}
	
	private void bloquearContato(List<Contato> contatos) {
		int id = escolherContatoPesquisado(contatos);
		Contato c = contatos.get(id-1);
		c.setEstaBloqueado(true);
		id = agenda.indexOf(c);
		agenda.set(id, c);		
	}

	private void removeContato(List<Contato> contatos) {
		int id = escolherContatoPesquisado(contatos);
		Contato c = contatos.get(id-1);
		agenda.remove(c);		
	}

	private void adicionaContato() {
		System.out.println("Adiciona Contato");
		System.out.println("1 - contato simples");
		System.out.println("2 - contato Completo");
		int op = this.sc.nextInt();
		this.sc.nextLine();
		if (op == 1) {
			Contato c = dadosContatoSimplificado();
			this.agenda.add(c);
		} else if (op == 2) {
			Contato c = dadosContatoCompleto();
			this.agenda.add(c);
		} else {
			System.out.println("opção invalida!");
		}
	}

	private void listarAgenda() {
		System.out.println("Lista de Contatos");
		for (Contato contato : this.agenda) {
			System.out.println(contato);
		}
	}

	private void editarContato(List<Contato> contatos) {		
		System.out.println("Editar Contato");
		int id = escolherContatoPesquisado(contatos);					
		Contato contatoEdicao = dadosContatoCompleto();
		Contato c = contatos.get(id - 1);
		int indice = this.agenda.indexOf(c);
		this.agenda.set(indice, contatoEdicao);
	}

	private int escolherContatoPesquisado(List<Contato> contatos) {
		int cont = 1;
		for (Contato contato : contatos) {
			System.out.println("id: " + cont);
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Tel: " + contato.getTelefone());
			cont++;
		}
		System.out.println("Qual contato deseja remover(informar id)");
		int id = this.sc.nextInt();
		this.sc.nextLine();
		return id;
	}

	public List<Contato> buscarContato() {
		int op;
		List<Contato> contatos = new ArrayList<>();
		System.out.println("Buscar Contato");
		System.out.println("1 - buscar por nome");
		System.out.println("2 - buscar por telefone");
		op = this.sc.nextInt();
		this.sc.nextLine();
		if (op == 1) {
			System.out.println("Digite nome do contato:");
			String nome = sc.nextLine();
			for (Contato contato : this.agenda) {
				// contato.getNome().equals(nome) == true
				if (contato.getNome().equals(nome)) {
					System.out.println(contato);
					contatos.add(contato);
				}

			}
		} else if (op == 2) {
			System.out.println("Digite telefone do contato:");
			String tel = this.sc.nextLine();
			for (Contato contato : this.agenda) {
				// contato.getTelefone().equals(tel) == true
				if (contato.getTelefone().equals(tel)) {
					System.out.println(contato);
					contatos.add(contato);
				}
			}
		}
		return contatos;
	}

	private Contato dadosContatoCompleto() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Endereco: ");
		String endereco = sc.nextLine();
		System.out.println("Data Nascimento");
		System.out.println("Digite o dia, mes e ano: ");
		int dia = this.sc.nextInt();
		int mes = this.sc.nextInt();
		int ano = this.sc.nextInt();
		// Date dataNasc = new Date(ano, mes, dia);
		GregorianCalendar dataNasc = new GregorianCalendar(ano, mes, dia);

		Contato c = new Contato(nome, telefone, email, dataNasc, endereco);
		return c;
	}

	private Contato dadosContatoSimplificado() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		Contato c = new Contato(nome, telefone);
		return c;
	}
}
