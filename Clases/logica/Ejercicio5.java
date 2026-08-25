package logica;

import java.util.Scanner;

/* Crear un programa que nos pida capturar números positivos
y calcular la media o promedio de esos números
* */
public class Ejercicio5 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        int cantidadNumeros = 0;
        double media = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número posiivo");
        num = scanner.nextInt();
        while(num > 0){
            sum = sum + num;
            cantidadNumeros++;
            System.out.println("Introduzca otro número");
            num = scanner.nextInt();
        }
        if(cantidadNumeros == 0){
            System.out.println("No se puede calcular la media");
        }else{
            media = (double) sum /cantidadNumeros;
            System.out.println("La media es: " + media);
        }
    }
}
