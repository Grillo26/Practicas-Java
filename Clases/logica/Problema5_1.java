package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Problema: Una tienda de electrónica necesita un programa para registrar las ventas del día en una caja registradora.
    El programa debe pedir consecutivamente el precio de cada producto vendido (números decimales mayores a cero).
    El programa solo debe terminar cuando se introduzca exactamente el número -1 (que simula el cierre de caja).
    Validaciones de negocio:
    Si el usuario introduce el número 0 o cualquier número negativo (excepto el -1), el programa debe decir "Precio inválido" y continuar pidiendo productos sin sumar nada.
    Si el usuario introduce letras o texto, el programa debe capturar el error con un try-catch, mostrar un mensaje de advertencia ("Entrada no válida, use números") y continuar pidiendo precios sin romperse (¡acordate de limpiar el buffer!).
    Al finalizar (cuando digiten -1), el programa debe mostrar:
    El total de dinero recaudado en el día.
    La cantidad de productos vendidos.
    El precio promedio de los productos vendidos (controlando que no rompa si no se vendió nada).
* */
public class Problema5_1 {
    public static void main(String[] args) {
        System.out.println("==== Punto de Venta (POS) ====");
        double precio = 0;
        double totalRecaudado = 0;
        int cantidadVendidos = 0;

        try(Scanner scanner = new Scanner(System.in)){
            do {
                try{
                    System.out.print("Ingrese del producto: ");
                    precio = scanner.nextDouble();
                    if (precio == -1){
                        System.out.println("Cierre de caja");
                    }else if (precio <=0){
                        System.out.println("Precio inválido");
                    }else {
                        totalRecaudado += precio;
                        cantidadVendidos++;
                    }
                }catch (InputMismatchException e) {
                    System.out.println("Entrada no válida, use números");
                    scanner.next();
                    precio = -2;
                }
            }while (precio != -1);

            System.out.println("Total del dinero recaudado: " + totalRecaudado);
            System.out.println("Cantidad de productos vendidos: " + cantidadVendidos);
            if( cantidadVendidos == 0) {
                System.out.println("Promedio de vendidos: 0.0 Bs (No se registraron ventas)");
            }else{
                double precioPromedio = totalRecaudado/cantidadVendidos;
                System.out.println("Promedio productos vendidos: " + precioPromedio);
            }
        }


    }
}
