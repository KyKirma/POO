import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Produto;

public class Carrinho {

    private List<Cliente> usuario;
    
    public void show() {
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			System.out.printf("-=-=-=-=-=| compreaqui.com |=-=-=-=-=-\n"
            + "SoftwareBox™\n\n"
			+ "Ola, usuário!\n"
			+ "Selecione sua opção.\n\n"
			+ "[1] - Cadastro de cliente\n"
			+ "[2] - Cadastro de produto\n"
			+ "[3] - Buscar cliente\n"
            + "[4] - Selecionar cliente\n"
            + "[5] - Add produto no carrinho de compras\n"
            + "[6] - Excluir produto do carrinho\n"
            + "[7] - Nota fiscal\n"
			+ "Opção: ");
			
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				default:
					System.out.println("Opção inválida, tente novamente.");
					break;
	
			}
		} while (choice != 7);
		
		sc.close();
	}
}
