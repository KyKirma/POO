package Cabine;

import java.util.Scanner;

import Ingresso.CamaroteInferior;
import Ingresso.CamaroteSuperior;
import Ingresso.Normal;

public class Cabine {
	Scanner scanner = new Scanner(System.in);
	public void show() {
        System.out.printf("Escolha sua opção:\n"
        		+ "[1] - Ingresso Normal\n"
        		+ "[2] - Ingresso VIP\n"
        		+ "Opção: ");
        int opcaoIngresso = scanner.nextInt();

        if (opcaoIngresso == 1) {
            Normal ingressoNormal = new Normal(50.0);
            ingressoNormal.imprimeTipoIngresso();
            ingressoNormal.imprimeValor();
        } else if (opcaoIngresso == 2) {
        	System.out.printf("Escolha sua opção:\n"
            		+ "[1] - Camarote Superior\n"
            		+ "[2] - Camarote Inferior\n"
            		+ "Opção: ");
            int opcaoCamarote = scanner.nextInt();

            if (opcaoCamarote == 1) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 30.0);
                System.out.println("VIP - Camarote Superior");
                System.out.println("Valor do Ingresso VIP: R$" + camaroteSuperior.getValorIngresso());
            } else if (opcaoCamarote == 2) {
                scanner.nextLine();
                System.out.print("Digite a localização do Camarote Inferior: ");
                String localizacao = scanner.nextLine();

                CamaroteInferior camaroteInferior = new CamaroteInferior(80.0, 20.0, localizacao);
                System.out.println("VIP - Camarote Inferior");
                camaroteInferior.imprimeLocalizacao();
                System.out.println("Valor do Ingresso VIP: R$" + camaroteInferior.getValorIngressoVIP());
            } else {
                System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }
}

