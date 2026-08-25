package sistema_medico;

public class CitaNoEncontradaException extends Exception{
    public CitaNoEncontradaException(String mensaje){
        super(mensaje);
    }
}
