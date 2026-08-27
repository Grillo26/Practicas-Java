package CienEjercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 a 10: ");
        int num = sc.nextInt();

        System.out.println("Tabla del "+ num);

        for (int i = 1; i<= 10; i++){
            System.out.println(num + "X" + i + "=" + (num *i));
        }

        // Todas las tablas faltantes
        System.out.println();
        System.out.println("La tabla del "+ num +" ya no se mostrará");
        for(int i =1; i<= 10; i++){
            if( i == num){
            }else{
                for(int j = 1; j<= 10; j++){
                    System.out.println( i +"X" + j + "=" + (i*j));

                }
            }

            System.out.println();
        }
    }
}
 /*
    Código Refactorizado (Nivel Senior)
    Aquí tienes una versión mejorada aplicando buenas prácticas de Java:
  */
class Ejercicio3Mejorado{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = solicitarNumeroValido(sc);
            mostrarTablaEspecifica(num);
            mostrarRestoDeTablas(num);

        }catch (Exception e){
            System.out.println("Ocurrió un error inesperado en la entrada de datos");
        }
    }

    // solicita y valida que el número esté entre 1 y 10
    private static int solicitarNumeroValido(Scanner sc){
        int num;
        while(true){
            System.out.println("Ingrese un número entre 1 y 10:");
            if(sc.hasNextInt()){ // Devuelve true si es un número entero
                num = sc.nextInt();
                if(num >=1 && num <=10){ // Si está dentro del rango termina y retorna num
                    break;
                }
            }else{
                System.out.println("Error: Debe ingresar un número entero válido");
                sc.next(); //Limpiamos el buffer del scanner
            }
        }
        return num;
    }

    // Muestra la tabla de multiplicar de un número específico
    private static void mostrarTablaEspecifica(int num){
        System.out.println("\n ----- Tabla del "+num+" ------");
        for (int i = 1; i<=10; i++){
            System.out.println( num + "X" + i+ "=" +(num * i));
        }
    }

    // Muestra las demás tablas omitiendo la del número específicado
     private static void mostrarRestoDeTablas(int numExcluido){
         System.out.println("\nLa tabla del "+numExcluido+" no se mostrará");
         for (int i = 1; i<=10; i++){
             if(i == numExcluido){
                 continue;
             }
             System.out.println("--- Tabla del "+ i + "----");
             for (int j = 1; j<=10; j++){
                 System.out.println( i +"X"+ j + "+"+ (i*j));
             }
             System.out.println();
         }
     }
}
