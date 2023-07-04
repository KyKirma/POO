
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaVacina {
    private List<Paciente> usuarios;
    private List<Vacina> vacinas;
    private List<Agendamento> agendamentos;
    Scanner sc = new Scanner(System.in);

    public ProgramaVacina() {
        usuarios = new ArrayList<>();
        vacinas = new ArrayList<>();
        agendamentos = new ArrayList<>();
        inicializarVacinas();
    }

    private void inicializarVacinas() {
        vacinas.add(new Vacina("Gripe"));
        vacinas.add(new Vacina("Febre Amarela"));
        vacinas.add(new Vacina("HPV"));
        vacinas.add(new Vacina("Hepatite"));
        vacinas.add(new Vacina("Triplice Bacteriana"));
    }

    public void cadastrarUsuario() {
        System.out.println("----- Cadastro de Usuário -----");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        System.out.print("Tipo Sanguíneo: ");
        String tipoSanguineo = sc.nextLine();
        tipoSanguineo = confTipoSanguineo(tipoSanguineo);
        
        System.out.print("Alergia: ");
        String alergia = sc.nextLine();

        System.out.print("Tem convenio? (S/N): ");
        Boolean convenio = false;
        String choice = sc.nextLine();

        if(choice.equals("S") || choice.equals("s")){
            convenio = true;
        }

        Paciente usuario = new Paciente(nome, endereco, idade, tipoSanguineo, alergia, convenio);
        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!\n");
    }

    public void removerUsuario(){
        System.out.println("----- Cancelamento de Usuário -----");

        System.out.print("Nome do Paciente: ");
        String nomeUsuario = sc.nextLine();

        Paciente usuario = null;
        for (Paciente u : usuarios) {
            if (u.getNome().equals(nomeUsuario)) {
                usuario = u;
                break;
            }
        }

        if (usuario == null) {
            System.out.println("Paciente não encontrado.\n");
            return;
        }

        usuarios.remove(usuario);
        System.out.println("Cadastrado cancelado com sucesso!\n");
    }

    public void agendarVacina() {
        System.out.println("----- Agendamento de Vacina -----");

        System.out.print("Nome do Paciente: ");
        String nomeUsuario = sc.nextLine();

        Paciente usuario = null;
        for (Paciente u : usuarios) {
            if (u.getNome().equals(nomeUsuario)) {
                usuario = u;
                break;
            }
        }

        if (usuario == null) {
            System.out.println("Paciente não encontrado.\n");
            return;
        }

        System.out.print("Data: ");
        String data = sc.nextLine();

        System.out.print("Horário: ");
        String horario = sc.nextLine();

        System.out.println("Vacinas Disponíveis:");
        for (int i = 0; i < vacinas.size(); i++) {
            System.out.println((i + 1) + ". " + vacinas.get(i).getNome());
        }

        System.out.print("Selecione a vacina desejada: ");
        int opcaoVacina = Integer.parseInt(sc.nextLine());

        if (opcaoVacina < 1 || opcaoVacina > vacinas.size()) {
            System.out.println("Opção inválida.\n");
            return;
        }

        Vacina vacina = vacinas.get(opcaoVacina - 1);

        Agendamento agendamento = new Agendamento(usuario, data, horario, vacina);
        agendamentos.add(agendamento);

        System.out.println("Agendamento realizado com sucesso!\n");
    }

    public void listarUsuariosCadastrados() {
        System.out.println("----- Pacientes Cadastrados -----");
        for (Paciente usuario : usuarios) {
            usuario.Info(usuario);
        }
        System.out.println();
    }

    public void listarAgendamentos() {
        System.out.println("----- Agendamentos de Vacina -----");
        for (Agendamento agendamento : agendamentos) {
            System.out.println("Nome do Paciente: " + agendamento.getUsuario().getNome());
            System.out.println("Data: " + agendamento.getData());
            System.out.println("Horário: " + agendamento.getHorario());
            System.out.println("Vacina: " + agendamento.getVacina().getNome());
            System.out.println("---------------------------");
        }
        System.out.println();
    }

    public void executar() {
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("----- Programa de Gestão de Agendamento de Vacina -----");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Agendar Vacina");
            System.out.println("3. Listar Pacientes Cadastrados");
            System.out.println("4. Listar Agendamentos de Vacina");
            System.out.println("5. Cancelar Cadastro");
            System.out.println("6. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    agendarVacina();
                    break;
                case 3:
                    listarUsuariosCadastrados();
                    break;
                case 4:
                    listarAgendamentos();
                    break;
                case 5:
                    removerUsuario();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }
        }
    }

    public String confTipoSanguineo(String tipo) {
        String tipoSanguineoPadrao = tipo.toUpperCase();
        
        switch (tipoSanguineoPadrao) {
            case "A":
            case "A+":
            case "A-":
                return "A";
            
            case "B":
            case "B+":
            case "B-":
                return "B";
            
            case "AB":
            case "AB+":
            case "AB-":
                return "AB";
            
            case "O":
            case "O+":
            case "O-":
                return "O";
            
            default:
                return "Desconhecido";
    }
}
}
