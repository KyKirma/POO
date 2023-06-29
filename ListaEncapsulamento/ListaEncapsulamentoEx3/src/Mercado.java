import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Produto;

public class Mercado {
		public void show() {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			List<Cliente> clientes = new ArrayList<Cliente>();
			List<Produto> produtos = new ArrayList<Produto>();
			boolean sair = false;
			String CPF = null;
			while (!sair) {
				System.out.println("-=-=-=-= compreaqui.com =-=-=-=-");
				System.out.println("Escolha uma opção");
				System.out.println("1- Cadastrar Cliente");
				System.out.println("2- Cadastrar Produto");
				System.out.println("3- Buscar Cliente");
				System.out.println("4- Adicionar Produto ao Carrinho");
				System.out.println("5- Remover Produto do Carrinho");
				System.out.println("6- Emitir Nota Fiscal");
				System.out.println("7- Fechar Programa");
				System.out.print("Digite o número da opção: ");
				int escolha = sc.nextInt();
				sc.nextLine();
				switch (escolha) {
					case 1:
						System.out.print("Digite o nome do Cliente: ");
						String nome = sc.nextLine();
						System.out.print("Digite o endereço do Cliente: ");
						String endereco = sc.nextLine();
						System.out.print("Digite o cpf do Cliente: ");
						String cpf = sc.nextLine();
						System.out.print("Digite a email do Cliente: ");
						String email = sc.nextLine();
						boolean cpfCadastrado = false;
						if (clientes.size() > 0) {
							for (Cliente cliente : clientes) {
								if (cliente.getCpf().equals(cpf)) {
									System.out.println("CPF já cadastrado. Cliente não foi cadastrado novamente.");
									cpfCadastrado = true;
									break;
								}
							}
						}
						if (!cpfCadastrado) {
							clientes.add(new Cliente(nome, endereco, cpf, email));
							System.out.println("Cliente cadastrado com sucesso.");
						}
						break;
					case 2:
						System.out.print("Digite o nome do Produto: ");
						String nomeProd = sc.nextLine();
						System.out.print("Digite a quantidade de estoque do Produto: ");
						int quantProd = sc.nextInt();
						System.out.print("Digite o preco do Produto: ");
						double precoProd = sc.nextDouble();
						boolean produtoCadastrado = false;
						if (produtos.size() > 0) {
							for (Produto produto : produtos) {
								if (produto.getNome().equals(nomeProd)) {
									System.out.println("Produto já cadastrado. Produto não foi cadastrado novamente.");
									produtoCadastrado = true;
									break;
								}
							}
						}
						if (!produtoCadastrado) {
							produtos.add(new Produto(nomeProd, precoProd, quantProd));
							System.out.println("Produto cadastrado com sucesso.");
						}
						break;
					case 3:
						System.out.print("Digite o CPF do Cliente a buscar: ");
						CPF = sc.nextLine();
						for (Cliente cliente : clientes) {
							if (cliente.getCpf().equals(CPF)) {
								System.out.println("Cliente encontrado");
								System.out.println(cliente);
							}
						}
						break;
					case 4:
						System.out.print("Digite o CPF do Cliente: ");
						CPF = sc.nextLine();
						for (Cliente cliente : clientes) {
							if (cliente.getCpf().equals(CPF)) {
								System.out.println("Cliente encontrado");
								System.out.println("Digite o nome do produto: ");
								nomeProd = sc.nextLine();
								for (Produto produto : produtos) {
									if (produto.getNome().equals(nomeProd)) {
										cliente.getCarrinho().adicionarProduto(produto);
										System.out.println("Produto adicionado com sucesso ao carrinho!");
									}
								}
							}
						}
						break;
					case 5:
						System.out.print("Digite o CPF do Cliente: ");
						CPF = sc.nextLine();
						for (Cliente cliente : clientes) {
							if (cliente.getCpf().equals(CPF)) {
								System.out.println("Cliente encontrado");
								List<Produto> produtosCarrinho = cliente.getCarrinho().getProdutos();
								if (produtosCarrinho.isEmpty()) {
									System.out.println("O carrinho está vazio.");
								} else {
									System.out.println("Produtos no carrinho:");
									int i = 0;
									for (Produto produto : produtosCarrinho) {
										i++;
										System.out.println(i + " - "+produto.getNome());
									}
								}
								System.out.print("Digite o número do produto: ");
								int numeroProduto = sc.nextInt();
								sc.nextLine();
								if (numeroProduto >= 1 && numeroProduto <= produtosCarrinho.size()) {
									Produto produtoRemover = produtosCarrinho.get(numeroProduto - 1);
									cliente.getCarrinho().removerProduto(produtoRemover);
									System.out.println("Produto removido com sucesso do carrinho!");
								} else {
									System.out.println("Número de produto inválido.");
								}
							}
						}
						break;
					case 6:
						System.out.print("Digite o CPF do Cliente: ");
						CPF = sc.nextLine();
						for (Cliente cliente : clientes) {
							double total_pagar = 0;
							if (cliente.getCpf().equals(CPF)) {
								System.out.println("Cliente encontrado");
								System.out.println(cliente);
								List<Produto> produtosCarrinho = cliente.getCarrinho().getProdutos();
								if (produtosCarrinho.isEmpty()) {
									System.out.println("O carrinho está vazio.");
								} else {
									System.out.println("Produtos no carrinho:");
									int i = 0;
									for (Produto produto : produtosCarrinho) {
										i++;
										System.out.println(i + " - "+produto.getNome());
										total_pagar = total_pagar + produto.getPreco();
									}
									System.out.printf("Total a pagar: R$%.2f\n", total_pagar);
								}
							}
						}
						break;
					case 7:
						sair = true;
						break;
					default:
						System.out.println("Opção Inválida");
						break;
				}
			}
			sc.close();
		}
	}

