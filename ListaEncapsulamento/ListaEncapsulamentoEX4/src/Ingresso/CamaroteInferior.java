package Ingresso;

public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Camarote Inferior - Localização: " + localizacao);
    }

    public double getValorIngresso() {
        return super.getValorIngressoVIP();
    }
}


