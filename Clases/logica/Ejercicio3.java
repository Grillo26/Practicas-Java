package logica;

import java.util.Scanner;

/* Cada pieza de pan tiene un precio de $5, si el cliente compra más de 50 piezas, le costará $4.50, si el cliente compra más de 100 piezas, le costará
$4. Programa que pida capturar la cantidad de piezas que el cliente compró
* */
public class Ejercicio3 {
    public static void main(String[] args) {

        int cantidadPiezas = 0;
        double totalPago = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de piezas de pan a comprar: ");
        cantidadPiezas = scanner.nextInt();

        if(cantidadPiezas >= 50 && cantidadPiezas < 100){
            totalPago = cantidadPiezas * 4.5;
        } else if (cantidadPiezas >= 100) {
            totalPago = cantidadPiezas * 4;
        }else {
            totalPago = cantidadPiezas * 5;
        }

        System.out.println("Cantidad de panes: " + cantidadPiezas);
        System.out.println("Total a pagar: " + totalPago);
    }

}
