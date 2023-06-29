package entidades;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
		
	private List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void finalizarCompra() {
        double valorTotal = calcularValorTotal();
        System.out.println("\nCompra finalizada! Valor total: R$" + valorTotal);
        produtos.clear();
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
