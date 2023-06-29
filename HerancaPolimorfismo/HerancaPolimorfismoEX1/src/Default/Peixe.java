package Default;

public class Peixe extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substâncias");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
	@Override
	public void acao() {
		System.out.println("Soltando Bolha");
	}
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
