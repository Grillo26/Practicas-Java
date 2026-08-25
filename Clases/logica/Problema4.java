package logica;

import java.util.Scanner;

/*
El Problema:
Una pequeña tienda necesita un programa para cerrar su caja al final del día.
El programa debe pedir al usuario que ingrese el monto de una venta (usa double para permitir decimales).
Si el usuario ingresa un valor negativo, debe mostrar un mensaje: "Error: El monto no puede ser negativo" y volver a pedir el número.
El programa debe seguir pidiendo montos de venta hasta que el usuario ingrese 0 (el cero significa "cerrar caja").
Al final, muestra:
La suma total de las ventas del día.
La cantidad de ventas realizadas (cuántas veces ingresó un número distinto de 0).
* */
public class Problema4 {
    public static void main(String[] args) {
        System.out.println("==== SISTEMA DE TIENDA ====");
        double precioVenta = 0;
        double totalVenta = 0;
        int countVentas = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ingrese un monto: ");
            precioVenta = scanner.nextDouble();

            if(precioVenta < 0 ){
                System.out.println("Error: el monto no puede ser negativo, ");
            } else if(precioVenta > 0){ // Aquí agregamos otro if porque cuenta cuando ponemos el 0
                totalVenta += precioVenta;
                countVentas++;
            }

        }while (precioVenta != 0);
        System.out.println("Caja cerrada");
        System.out.println("Total de ventas: " + totalVenta);
        System.out.println("Cantidad de ventas: " + countVentas);

    }
}
