package practicas.ejercicio2;

import java.util.Scanner;


/**
 * https://discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
 * */
public class EjecutablePersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola");

        System.out.println("Introduce el nombre");
        String nombre =  sc.nextLine();

        System.out.println("Introduce la edad");
        int edad = sc.nextInt();

        System.out.println("Introduce el sexo");
        String sexo = sc.nextLine();

        System.out.println("Introduce el peso");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura en cm");
        double altura = sc.nextDouble();

    }
}
