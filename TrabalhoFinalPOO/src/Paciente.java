public class Paciente extends Pessoa{

    protected Boolean convenio = false;

    public Paciente(String nome, String endereco, int idade, String tipoSanguineo, String alergia, Boolean convenio) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.tipoSanguineo = tipoSanguineo;
        this.alergia = alergia;
        this.convenio = convenio;
    }

    public Boolean getConvenio() {
        return convenio;
    }

    public void setConvenio(Boolean convenio) {
        this.convenio = convenio;
    }

    @Override
    public void Info(Pessoa usuario) {
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Endereço: " + usuario.getEndereco());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Tipo Sanguíneo: " + usuario.getTipoSanguineo());
        System.out.println("Alergia: " + usuario.getAlergia());
        System.out.println("Convenio: " + ((Paciente) usuario).getConvenio());
        System.out.println("---------------------------");
    }

    
}
