package sistema_medico;

public class Cita {
    private final int idCita;
    private static int contadorCita = 0;
    private Medico medico;
    private Paciente paciente;
    private String fechaHora;

    public Cita(Medico medico, Paciente paciente, String fechaHora){
        this.idCita = ++Cita.contadorCita;
        this.medico = medico;
        this.paciente = paciente;
        this.fechaHora =fechaHora;
    }

    public int getIdCita(){
        return this.idCita;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "idCita=" + idCita +
                ", medico=" + medico +
                ", paciente=" + paciente +
                ", fechaHora='" + fechaHora + '\'' +
                '}';
    }
}
