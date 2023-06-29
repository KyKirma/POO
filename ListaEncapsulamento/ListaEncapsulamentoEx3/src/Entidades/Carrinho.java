package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Produto> produtos_carrinho;


	public List<Produto> getProdutos() {
		return produtos_carrinho;
	}
	
	public Carrinho() {
		this.produtos_carrinho = new ArrayList<>();
	}

	public void adicionarProduto(Produto produto) {
		produtos_carrinho.add(produto);
		if (produto.getQuantidade() > 0) {
			int quantidade = produto.getQuantidade();
			quantidade = quantidade-1;
			produto.setQuantidade(quantidade);
		} else {
			System.out.println("Produto com estoque vazio");
		}
	}

	public void removerProduto(Produto produto) {
		if (produtos_carrinho.contains(produto)) {
			produtos_carrinho.remove(produto);
			produto.setQuantidade(produto.getQuantidade() + 1);
		} else {
			System.out.println("Produto não encontrado no carrinho.");
		}
	}


}
