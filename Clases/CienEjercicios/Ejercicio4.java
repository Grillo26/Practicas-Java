package CienEjercicios;

import java.util.Scanner;

/*
     Torre de asteriscos

 */
public class Ejercicio4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int tam = verificarNumero(sc);
            imprimirTorre(tam);
        }catch (Exception e){
            System.out.println("Ocurrió un error inesperado");
        }
    }

    private static int verificarNumero(Scanner scanner){
        int tam;
        while (true){
            System.out.println("Ingrese el número de filas de la torre:");
            if(scanner.hasNextInt()){
                tam = scanner.nextInt();
                if(tam > 0){
                    break;
                }else{
                    System.out.println("Error: Debe ingresar un número entero mayor a 0");
                }
            }else{
                System.out.println("Error: Debe ingresar un número válido (no letras)");
                scanner.next();
            }
        }
        return tam;
    }

    private static void imprimirTorre(int tam){
        for (int altura = 1; altura <= tam; altura++){

            // Aquí generamos los espacios
            for( int espacio = 1; espacio <=(tam-altura); espacio++){
                System.out.print(" ");
            }
            // Este es el clave, es lo que imprime el *
            for ( int i = 1; i <=(altura*2)-1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
