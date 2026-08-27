package CienEjercicios.Problemas;

import java.util.Scanner;

/*
Reto: "El Filtrador de Números"
    Escribe un programa en Java que haga lo siguiente:
    Pida un número entero al usuario (asegúrate de usar hasNextInt() y un bucle para validar que
    realmente sea un número entero, por si ingresa letras). Si no es válido, muéstrale un mensaje de error
    y pídelo de nuevo.
    Pida un segundo número entero (el límite), validando también que sea un número válido.
    Haz un bucle que cuente desde 1 hasta ese número límite.
    En ese bucle, filtra y omite (usando continue) aquellos números que sean múltiplos del primer número que
    ingresó el usuario.
    Imprime los números restantes utilizando estrictamente printf para mostrar un mensaje claro (por ejemplo:
     Número válido procesado: %d%n).
 */
public class FiltradoNumeros {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el número base para filtrar (múltiplos):");
            int num1 = solicitarNumeroValido(scanner);

            System.out.print("Ingrese el número límite del conteo:");
            int num2 = solicitarNumeroValido(scanner);

            iniciarBucle(num1, num2);

        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado en la entrada de datos");
        }
    }

    private static int solicitarNumeroValido(Scanner scanner){
        while(true){
            if(scanner.hasNextInt()){
                int numeroIngresado =   scanner.nextInt();
                if(numeroIngresado > 0){
                    return numeroIngresado;
                }else{
                    System.out.println("❌ Error: El número base debe ser mayor a 0 para evitar divisiones inválidas.");                }
            }else{
                System.out.println("Debe ingresar un número válido");
                scanner.next();
            }
        }
    }

    private static void iniciarBucle(int num1, int num2){
        for (int i = 1; i<=num2; i++){
            if(i % num1 == 0){
                continue;
            }else{
                System.out.println("Número válido procesado: "+ i);
            }
        }
    }
}
