public abstract class Pessoa {

    protected String nome;
    protected String endereco;
    protected int idade;
    protected String tipoSanguineo;
    protected String alergia;

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

    public void Info(Pessoa usuario){
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Endereço: " + usuario.getEndereco());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Tipo Sanguíneo: " + usuario.getTipoSanguineo());
        System.out.println("Alergia: " + usuario.getAlergia());
        System.out.println("---------------------------");
    }

}
