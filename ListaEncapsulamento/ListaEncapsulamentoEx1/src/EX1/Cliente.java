package src.EX1;

class Cliente {
	
	String nome;
	String endereco;
	String cpf;
	Integer idade;
	
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getEndereco() {
		return endereco;
	}
	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	String getCpf() {
		return cpf;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	Integer getIdade() {
		return idade;
	}
	void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	boolean validaCPF() {
		if(cpf.length() == 11) {
			System.out.println("CPF válido.");
			return true;
		} else {
			System.out.println("CPF inválido.");
			return false;
		}
	}
	
	
	
	
}


