package Default;

public class Lobo extends Mamifero {
	@Override
	public void emitirSom() {
		System.out.println("Auuuuuuu!");
	}
	@Override
	public void alimentar() {
		System.out.println("Presas");
	}
	@Override
	public void acao() {
		System.out.println("Caçar");
	}
}