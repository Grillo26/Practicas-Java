package sistema_medico;

import java.io.Serializable;
import java.util.Objects;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract String getDescripcion();
}
