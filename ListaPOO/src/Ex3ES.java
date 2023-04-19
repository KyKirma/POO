import java.util.Scanner;

public class Ex3ES {

	public static void main(String[] args) {
		//Exercicio 3 // Estrutura Sequencial
		Scanner sc = new Scanner(System.in);
		String pessoa, pessoadois;
		int id, id1;
		double media;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		pessoa = sc.nextLine();
		System.out.print("Idade: ");
		id = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		pessoadois = sc.nextLine();
		System.out.print("Idade: ");
		id1 = sc.nextInt();
		
		media = (id + id1) / 2;
		
		System.out.printf("A idade media de %s e %s e de %.1f anos", pessoa, pessoadois, media);
		sc.close();
	}

}
