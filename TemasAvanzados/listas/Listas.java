package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        for(String elemento: miLista){
            System.out.println("Dia de la semana:" + elemento);
        }

        // Funciones lambda (Función anónima de un código muy compacto
        miLista.forEach( elemento -> {
            System.out.println("Elemento: " + elemento);
        });

        miLista.forEach(System.out::println);

        List<String> nombre = Arrays.asList("Pedro", "Ivon", "Noemi");
        System.out.println("\nLista de nombres: ");
        nombre.forEach(System.out::println);
    }
}
