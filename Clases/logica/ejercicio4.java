package logica;

import java.util.Scanner;

// Crear un programa que esté pidiendo números enteros.
// Cuando un cero se haya introducido, finalizará la captura de datos.
// Sumar los números y mostrar la suma en pantalla
public class ejercicio4 {
    public static void main(String[] args) {
        int num = 0;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce un número: ");
            num = scanner.nextInt();
            suma += num;
        }while(num!=0);

        System.out.println("La suma de todos los números es: " + suma);
    }
}
