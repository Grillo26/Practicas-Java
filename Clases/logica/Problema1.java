package logica;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {

        double computadoras [] = new double[5];
        Scanner sc = new Scanner(System.in);
        double promedio = 0;
        int cantidad = 0;
        double precioMayor = 0;

        System.out.println("*** CONTROL DE INVENTARIO DE COMPUTADORAS ***");
        System.out.println("Ingrese 5 precios de computadoras");

        for (int i=0; i < 5; i++){
            System.out.print("Computadora " + (i+1) + ":");
            computadoras[i] = sc.nextDouble();

            // sumando para promedio
            promedio = computadoras[i] + promedio;

            // sumando para cantidad
            if(computadoras[i] >= 1000){
                cantidad++;
            }

            // calculado en mayor
            if(computadoras[i] > precioMayor){
                precioMayor = computadoras[i];
            }
        }


        System.out.println("El promedio de las computadoras es: " + promedio/5);
        System.out.println("La cantidad de computadoras que cuestas más de 1000 son: " + cantidad);
        System.out.println("El precio mayor es: " + precioMayor);


    }
}
