package Default;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EtiquetaPreco {
    public void show() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o número de produtos: ");
        int quantidadeProdutos = scanner.nextInt();

        List<Produto> produtos = new ArrayList<>();

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.println("\nProduto #" + i + " data:");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char tipoProduto = scanner.next().charAt(0);
            scanner.nextLine(); // Limpar o buffer do teclado

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            if (tipoProduto == 'i') {
                System.out.print("Taxa de importação: ");
                double taxaImportacao = scanner.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, taxaImportacao));
            } else if (tipoProduto == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                String dataFabricacao = scanner.next();
                produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
            } else {
                produtos.add(new Produto(nome, preco));
            }
        }

        System.out.println("\nETIQUETAS DE PREÇO:");
        for (Produto produto : produtos) {
            System.out.println(produto.etiquetaPreco());
        }

        scanner.close();
    }
}
