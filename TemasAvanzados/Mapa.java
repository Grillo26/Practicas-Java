import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre", "Diego");
        persona.put("Apellido", "Flores");
        persona.put("Edad", "23");

        System.out.println("Valores del mapa o diccionario");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach( (llave, valor) -> System.out.println("llave:" +llave+ ", Valor: " +valor));

    }
}