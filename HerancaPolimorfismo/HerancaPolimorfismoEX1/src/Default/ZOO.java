package Default;

public class ZOO {
	public void show() {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
		Lobo l = new Lobo();
		
		
		System.out.println("Mamíferos:");
		System.out.println("Canguru:" );
		c.setIdade(10);
		c.setPeso(50);
		c.setMembros(4);
		c.setCorPelo("Castanho");
		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.acao();
		System.out.println("\nLobo:");
		l.setIdade(10);
		l.setPeso(50);
		l.setMembros(4);
		l.setCorPelo("Castanho");
		l.locomover();
		l.alimentar();
		l.emitirSom();
		l.acao();
		System.out.println("\nCachorro:");
		k.setIdade(10);
		k.setPeso(50);
		k.setMembros(4);
		k.setCorPelo("Castanho");
		k.locomover();
		k.alimentar();
		k.emitirSom();
		k.acao();
		System.out.println("\nRepteis:");
		System.out.println("\nCobra:");
		j.setIdade(3);
		j.setPeso(5);
		j.setMembros(0);
		j.setCorEscama("Castanha");
		j.locomover();
		j.alimentar();
		j.emitirSom();
		j.acao();
		
		System.out.println("\nTartaruga:");
		j.setIdade(5);
		j.setPeso(10);
		j.setMembros(4);
		j.setCorEscama("Marron");
		j.locomover();
		j.alimentar();
		j.emitirSom();
		j.acao();
		
		System.out.println("\nPeixe:");
		System.out.println("\nGoldefish:");
		g.setIdade(1);
		g.setPeso(2);
		g.setMembros(0);
		g.setCorEscama("Laranja");
		g.locomover();
		g.alimentar();
		g.emitirSom();
		g.acao();
		
		System.out.println("\nAve:");
		System.out.println("\nArara:");
		e.setIdade(2);
		e.setPeso(5);
		e.setMembros(2);
		e.setCorPena("Azul");
		e.locomover();
		e.alimentar();
		e.emitirSom();
		
		System.out.println("\n\nReações Cachorro:");
		System.out.print("Frase agradável: ");
		k.reagir("Toma Comida");
		System.out.print("Frase agressiva: ");
		k.reagir("Vai apanhar");
		System.out.print("Hora do dia 'manhã': ");
		k.reagir(10, 00);
		System.out.print("Hora do dia 'tarde': ");
		k.reagir(15, 30);
		System.out.print("Hora do dia 'noite': ");
		k.reagir(21, 00);
		System.out.print("Dono: ");
		k.reagir(true);
		System.out.print("Não Dono: ");
		k.reagir(false);
		System.out.print("Novo e Leve: ");
		k.reagir(2, 5.5f);
		System.out.print("Novo e Pesado: ");
		k.reagir(2, 30.5f);
		System.out.print("Velho e Leve: ");
		k.reagir(10, 8.5f);
		System.out.print("Velho e Pesado: ");
		k.reagir(10, 20.5f);
		
		/*
		k.emitirSom();
		l.emitirSom();
		k.acao();
		k.locomover();
		k.reagir(true);
		k.reagir(false);
		*/
	}
}
