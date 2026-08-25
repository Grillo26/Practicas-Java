package logica;

import java.util.Scanner;

/* El Problema:
Una estación meteorológica registra la temperatura cada hora durante un turno de 6 horas. Necesitas desarrollar un programa que:
Pida al usuario ingresar 6 temperaturas (enteros).
    1.- Almacene las temperaturas en un arreglo.
    2.- Calcule cuál fue la temperatura más baja registrada
    3.- Calcule cuál fue la temperatura más alta registrada.
* */
public class Problema2 {
    public static void main(String[] args) {
        double[] temperaturas = new double[6];
        double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 6 temperaturas que desee almacenar");
        for (int i=0; i < temperaturas.length; i++){
            temperaturas[i] = scanner.nextDouble();

            // Aquí hacemos la verificación
            if(temperaturas[i] > mayor) mayor = temperaturas[i];
            if(temperaturas[i] < menor) menor = temperaturas[i];

        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
