import java.util.Locale;
import java.util.Scanner;

public class Ex6ES {

	public static void main(String[] args) {
		//Exercicio 6 // Estrutura Condicional
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double r, area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		r = sc.nextDouble();
		
		area = Math.PI * Math.pow(r, 2);
		
		System.out.printf("AREA = %.3f", area);
		sc.close();
	}

}
