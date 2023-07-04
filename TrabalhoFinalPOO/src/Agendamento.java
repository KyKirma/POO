
public class Agendamento {
    private Paciente usuario;
    private String data;
    private String horario;
    private Vacina vacina;

    public Agendamento(Paciente usuario, String data, String horario, Vacina vacina) {
        this.usuario = usuario;
        this.data = data;
        this.horario = horario;
        this.vacina = vacina;
    }

    public Paciente getUsuario() {
        return usuario;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public Vacina getVacina() {
        return vacina;
    }
}

