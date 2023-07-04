import java.io.CharConversionException;

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

}
