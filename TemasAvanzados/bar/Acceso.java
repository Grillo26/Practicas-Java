package bar;

public class Acceso {

    private static final int EDAD_MINIMA = 18;

    public static void validarEdad(int edad) {
        if(edad < EDAD_MINIMA){
            throw new RuntimeException("Acceso denegado: tienes "+edad+" años.");
        }
        System.out.println("Bienvenido puedes pasar.");
    }
}
