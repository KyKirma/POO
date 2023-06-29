package Default;
public class PessoaJuridica extends Contribuinte {
    private int numeroFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calcularImposto() {
        double imposto;
        if (numeroFuncionarios > 10) {
            imposto = rendaAnual * 0.14;
        } else {
            imposto = rendaAnual * 0.16;
        }
        return imposto;
    }
}
