package Ingresso;

public class Ingresso {
	  protected double valor;

	    public Ingresso(double valor) {
	        this.valor = valor;
	    }

	    public void imprimeValor() {
	        System.out.println("Valor do Ingresso: R$" + valor);
	    }
}
