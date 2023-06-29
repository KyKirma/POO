package Default;
public abstract class Contribuinte {
    protected String nome;
    protected double rendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract double calcularImposto();

    public String getNome() {
        return nome;
    }
}
