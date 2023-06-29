package Entidades;

public class Cliente {
	private String nome;
	private String endereco;
	private String email;
	private String cpf;
	private Carrinho carrinho_cliente;
	
	public Cliente(String nome, String endereco, String cpf, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.email = email;
		this.carrinho_cliente = new Carrinho();
	}
	
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public Carrinho getCarrinho() {
		return carrinho_cliente;
	}

	@Override
	public String toString() {
		return "=-=-=-=-=-=-=-=-=-=-=-=\nCliente \nNome = " + nome + "\nEndereco = " + endereco + "\nEmail = " + email;
	}
}
