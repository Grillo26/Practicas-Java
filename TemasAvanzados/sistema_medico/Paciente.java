package sistema_medico;

public class Paciente extends Persona{
    private String historialMedico;

    public Paciente(int id, String nombre, String apellido, String historialMedico) {
        super(id, nombre, apellido);
        this.historialMedico = historialMedico;
    }

    @Override
    public String getDescripcion() {
        return "Paciente: "+this.nombre+"- Historial: "+this.historialMedico;
    }
}
