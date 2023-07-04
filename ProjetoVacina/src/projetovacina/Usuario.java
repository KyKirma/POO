package projetovacina;

public class Usuario {
    private String nome;
    private String endereco;
    private int idade;
    private String tipoSanguineo;
    private String alergia;

    public Usuario(String nome, String endereco, int idade, String tipoSanguineo, String alergia) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.tipoSanguineo = tipoSanguineo;
        this.alergia = alergia;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public String getAlergia() {
        return alergia;
    }
}
