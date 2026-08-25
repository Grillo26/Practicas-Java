package persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona(){}
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;

        //Creado id para cada objeto según el contador variable estática
        this.idPersona = ++Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{ " + "idPersona=" + idPersona + ", nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + " }";
    }
}
