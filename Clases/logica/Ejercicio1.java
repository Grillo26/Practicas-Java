package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Ejercicio para ingresar 30 ventas (3)
public class Ejercicio1 {
    public static void main(String[] args) {
        double ventas[] = new double[3];
        List<Double> mayores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int total = 0, contador = 0;
        System.out.println("Ingrese las 30 ventas del mes:");
        for (int i = 0; i<ventas.length; i++){
            System.out.print("Venta "+ (i+1) +":");
            ventas[i] = scanner.nextDouble();
        }

        while(contador < 3){
            if(ventas[contador] >= 200){
                mayores.add(ventas[contador]);
                total++;
            }
            contador++;
        }
        System.out.println("El total de ventas mayores a 200 son: " + total + " y son las siguientes: ");
        for (Double venta : mayores){
            System.out.println(venta);
        }
    }
}
