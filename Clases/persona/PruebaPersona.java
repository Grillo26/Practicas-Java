package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** PRUEBA DE PERSONAS ****");
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        var persona1 = new Persona("Carlos Enrique", "Mamani Torrez");
        System.out.println(persona1);

        System.out.println();
        var persona2 = new Persona("Alejandra", "Mamani Torrez");
        System.out.println(persona2);

    }
}
