package sistema_medico;

public class Medico extends Persona{
    private String especialidad;

    public Medico(int id, String nombre, String apellido, String especialidad) {
        super(id, nombre, apellido);
        this.especialidad = especialidad;
    }
    @Override
    public String getDescripcion() {
        return "Médico: "+ nombre + "- Especialidad: "+ especialidad;
    }
}
