package Interface;

import java.util.Scanner;

import entidades.Carrinho;
import entidades.Cliente;
import entidades.Produto;

public class Mercado {
	Scanner scanner = new Scanner(System.in);
	public void show() {

	        System.out.println("-=-= Cadastro do Cliente =-=-");
	        System.out.print("Nome: ");
	        String nomeCliente = scanner.nextLine();
	        System.out.print("Endereço: ");
	        String enderecoCliente = scanner.nextLine();
	        System.out.print("Telefone: ");
	        String telefoneCliente = scanner.nextLine();
	        System.out.print("Email: ");
	        String emailCliente = scanner.nextLine();

	        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente, emailCliente);

	        Produto produto1 = new Produto("Camiseta", "Camiseta de algodão", 30.00, "Roupa");
	        Produto produto2 = new Produto("Smartphone", "Smartphone modelo X", 1500.00, "Eletrônico");
	        Produto produto3 = new Produto("Geladeira", "Geladeira modelo Y", 2000.0, "Eletrodoméstico");

	        Carrinho carrinho = new Carrinho();

	        String opcao;
	        do {
	            System.out.println("\n-=-= Produtos Disponíveis =-=-");
	            System.out.println("1. " + produto1.getNome() + " - R$" + produto1.getPreco());
	            System.out.println("2. " + produto2.getNome() + " - R$" + produto2.getPreco());
	            System.out.println("3. " + produto3.getNome() + " - R$" + produto3.getPreco());
	            System.out.println("4. Exibir Produtos Selecionados");
	            System.out.println("0. Finalizar Compra");

	            System.out.print("Selecione uma opção: ");
	            opcao = scanner.nextLine();

	            switch (opcao) {
	                case "1":
	                    carrinho.adicionarProduto(produto1);
	                    System.out.println(produto1.getNome() + " adicionado ao carrinho!");
	                    break;
	                case "2":
	                    carrinho.adicionarProduto(produto2);
	                    System.out.println(produto2.getNome() + " adicionado ao carrinho!");
	                    break;
	                case "3":
	                    carrinho.adicionarProduto(produto3);
	                    System.out.println(produto3.getNome() + " adicionado ao carrinho!");
	                    break;
	                case "4":
	                    System.out.println("\n=== Produtos Selecionados ===");
	                    if (carrinho.getProdutos().isEmpty()) {
	                        System.out.println("Nenhum produto selecionado.");
	                    } else {
	                        for (Produto produto : carrinho.getProdutos()) {
	                            System.out.println("- " + produto.getNome() + " - R$" + produto.getPreco());
	                        }
	                    }
	                    break;
	                case "0":
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        } while (!opcao.equals("0"));

	        System.out.println("\n-=-= Recibo =-=-");
	        System.out.println("Cliente: " + cliente.getNome());
	        System.out.println("Produtos no Carrinho:");
	        for (Produto produto : carrinho.getProdutos()) {
	            System.out.println("- " + produto.getNome() + " - R$" + produto.getPreco());
	        }

	        carrinho.finalizarCompra();
	    }
	}
