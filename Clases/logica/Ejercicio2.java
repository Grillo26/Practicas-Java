package logica;

import java.util.Scanner;

// Ejercicio para saber cuál es el mayor de un arreglo
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] array = new int [5];
        int mayor = array[0];
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese los 5 numero: ");
        for (int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
            if(array[i]> mayor){
                mayor= array[i];
            }
        }
        System.out.println("El número mayo es: " + mayor);
    }
}
