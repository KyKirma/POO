package Default;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imposto {
    public void show() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o número de contribuintes: ");
        int quantidadeContribuintes = scanner.nextInt();

        List<Contribuinte> contribuintes = new ArrayList<>();

        for (int i = 1; i <= quantidadeContribuintes; i++) {
            System.out.println("\nContribuinte #" + i + " data:");
            System.out.print("Individual ou empresa (i/c)? ");
            char tipoContribuinte = scanner.next().charAt(0);
            scanner.nextLine(); 

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Renda anual: ");
            double rendaAnual = scanner.nextDouble();

            if (tipoContribuinte == 'i') {
                System.out.print("Despesas com saúde: ");
                double gastosSaude = scanner.nextDouble();
                contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else if (tipoContribuinte == 'c') {
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = scanner.nextInt();
                contribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

        System.out.println("\nIMPOSTOS PAGOS:");
        double totalImpostos = 0;
        for (Contribuinte contribuinte : contribuintes) {
            double imposto = contribuinte.calcularImposto();
            totalImpostos += imposto;
            System.out.println(contribuinte.getNome() + ": R$ " + String.format("%.2f", imposto));
        }

        System.out.println("IMPOSTOS TOTAIS: R$ " + String.format("%.2f", totalImpostos));

        scanner.close();
    }
}
