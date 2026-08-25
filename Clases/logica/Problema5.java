package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Problema: Una aerolínea necesita un programa para registrar el peso de las maletas de un vuelo.
    El programa debe pedir el peso (en kg) de cada maleta (números decimales mayores que cero).
    En lugar de terminar con cualquier número negativo, el programa solo debe terminar cuando se introduzca exactamente el número 0.
    Si el usuario introduce un número negativo, el programa debe mostrar un mensaje de error ("Peso inválido") y continuar pidiendo más maletas sin sumarlo ni contarlo.
    Al finalizar (cuando pongan 0), el programa debe mostrar:
    El peso total acumulado.
    El promedio de peso de las maletas.
    La cantidad total de maletas procesadas
* */
public class Problema5 {
    public static void main(String[] args) {

        double pesoMaleta = 0;
        double pesoAcumulado = 0;
        int cantidadMaletas = 0;

        System.out.println("===== SISTEMA DE AEROLÍNEA =====");

        try(Scanner scanner = new Scanner(System.in)){
            do{
                try{
                    System.out.print("Ingrese peso de la maleta: ");
                    pesoMaleta = scanner.nextDouble();
                    if(pesoMaleta < 0) {
                        System.out.println("Peso inválido, debe ser mayor a 0: " + pesoMaleta);
                    }else if(pesoMaleta > 0){
                        pesoAcumulado += pesoMaleta;
                        cantidadMaletas++;
                    }
                }catch (InputMismatchException e) {
                    System.out.println("Error: ¡Debes ingresar un número válido");
                    scanner.next(); // LIMPIEZA: borra las letras del buffer
                    pesoMaleta = -2; // Forzamos un valor para que el bucle no termine
                }

            }while (pesoMaleta != 0);

            System.out.println("Peso total acumulado: " + pesoAcumulado);
            if (cantidadMaletas == 0){
                System.out.println("Promedio de peso: 0.0 Kg (No se registraron maletas)");
            }else{
                double promedioPesoMaletas = pesoAcumulado/cantidadMaletas;
                System.out.println("Promedio de peso: " + promedioPesoMaletas + "Kg");
            }
            System.out.println("Cantidad de maletas procesadas: " + cantidadMaletas + " maletas");
        }

    }

    /*
    *   Usar tryCatch para el Scanner:
    *       try (Scanner scanner = new Scanner(System.in)) {
    *           ... code ...
    *       } // El scanner se cierra automáticamente aquí
    *
    * */
}
