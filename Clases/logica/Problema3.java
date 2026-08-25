package logica;

import java.util.Scanner;

/*  El Problema: "Licencias de Software Premium"
    Una empresa vende licencias de software con los siguientes precios según la cantidad comprada:
        De 1 a 10 licencias: $100 cada una.
        De 11 a 50 licencias: $80 cada una.
        De 51 a 100 licencias: $65 cada una.
        Más de 100 licencias: $50 cada una.
    Tu misión:
    Pide al usuario la cantidad de licencias.
    Si el usuario ingresa un número menor o igual a 0, muestra un mensaje de error: "Cantidad no válida".
    Calcula el total a pagar y muéstralo.
* */
public class Problema3 {
    public static void main(String[] args) {
        int cantidadLicencias = 0;
        int totalPago = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de licencias a comprar: ");
        cantidadLicencias = scanner.nextInt();

        if(cantidadLicencias <= 0){
            System.out.println("Cantidad no válida");
        } else if (cantidadLicencias <= 10) {
            totalPago = cantidadLicencias * 100;
        } else if (cantidadLicencias <=50) {
            totalPago = cantidadLicencias * 80;
        } else if (cantidadLicencias <=100) {
            totalPago = cantidadLicencias * 65;
        } else {
            totalPago = cantidadLicencias * 50;
        }

        System.out.println("La cantidad a cancelar es: " + totalPago +", por " + cantidadLicencias + " licencias compradas.");

    }
}
