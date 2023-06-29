package Default;

public class ProdutoImportado extends Produto {
    private double taxaImportacao;

    public ProdutoImportado(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public double precoTotal() {
        return getPreco() + taxaImportacao;
    }

    @Override
    public String etiquetaPreco() {
        return getNome() + " - R$" + String.format("%.2f", precoTotal()) + " (Taxa de importação: R$" + String.format("%.2f", taxaImportacao) + ")";
    }
}