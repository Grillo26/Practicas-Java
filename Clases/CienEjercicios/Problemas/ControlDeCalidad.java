package CienEjercicios.Problemas;

import java.util.Scanner;

/*
    Problema: Inspección de Piezas en Cadena de Montaje

    Una fábrica necesita inspeccionar un lote de productos numerados secuencialmente desde el 1 hasta un número límite N.
    1.- En el main, pide al usuario mediante métodos auxiliares de validación dos datos:
        -Cantidad total de piezas a inspeccionar (N): Debe ser un número mayor a 0.
        -Código de falla recurrente (X): Un número entero entre 2 y 9 (por ejemplo, el 3).
    2.- Crea un mtodo separado llamado procesarLote(int totalPiezas, int codigoFalla) que recorra las piezas desde la 1 hasta totalPiezas:
        -Piezas Defectuosas (Saltar): Si el número de la pieza es múltiplo de codigoFalla, la pieza está defectuosa. Debes usar continue para saltarla e
            imprimir: "⚠️ Pieza # [i] DEFECTUOSA - Descartada".
        -Piezas Aprobadas: Si no es múltiple de codigoFalla, imprime: "Pieza # [i] APROBADA".
        -Parada de Emergencia (Detener): Si se acumulan 5 piezas defectuosas seguidas, la máquina se sobrecalienta. Debes detener inmediatamente
            el bucle con un break e imprimir: "🚨 PARADA DE EMERGENCIA: Demasiadas fallas consecutivas".
    3.- Al finalizar el recorrido, muestra el total de piezas aprobadas y descartadas.
 */
public class ControlDeCalidad {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad total de piezas a inspeccionar:");
            int totalPiezas = verificarNumeroValido(scanner);

            System.out.print("Ingrese el código de falla recurrente (entre 2 y 9): ");
            int codigoFalla = verificarCodigoFalla(scanner);

            System.out.println("Procesando...");
            procesarLote(totalPiezas, codigoFalla);


        }catch (Exception e){
            System.out.println("Ocurrió un error inesperado en la entrada de datos");
        }
    }

    private static int verificarNumeroValido(Scanner scanner){
        while (true){
            if(scanner.hasNextInt()){
                int numeroIngresado = scanner.nextInt();
                if(numeroIngresado >0 ){
                    return numeroIngresado;
                }else{
                    System.out.println("Error: El número debe ser mayor a 0.");
                }
            }else{
                System.out.println("Error: debe ingresar un número válido");
                scanner.next();
            }
        }
    }

    private static int verificarCodigoFalla(Scanner scanner){
        while(true){
            if(scanner.hasNextInt()){
                int numeroIngresado = scanner.nextInt();
                if(numeroIngresado >1 && numeroIngresado <10){
                    return numeroIngresado;
                }else{
                    System.out.println("Error: debe ingresar un número entero entre 2 y 9");
                }
            }else{
                System.out.println("Error: debe ingresar un número válido. ");
                scanner.next();
            }
        }
    }

    private static void procesarLote(int totalPiezas, int codigoFalla){
        int contadorDefectuosas = 0;
        int contadorAprobadas = 0;
        int fallasConsecutivas = 0;

        for(int i=1; i<= totalPiezas; i++ ){
            if( i % codigoFalla == 0){
                System.out.println("Pieza #"+i+" DEFECTUOSA - Descartada");
                contadorDefectuosas++;
                fallasConsecutivas++;
                if(fallasConsecutivas == 5){
                    System.out.println("PARADA DE EMERGENCIA: Demasiadas fallas consecutivas");
                    break;
                }
                continue;
            }else{
                contadorAprobadas++;
                fallasConsecutivas = 0;
                System.out.println("Pieza #"+i+" APROBADA");
            }
        }
        System.out.println();
        System.out.println("===== RESUMEN DE INSPECCIÓN =====");
        System.out.println("Total piezas aprobadas: " + contadorAprobadas);
        System.out.println("Total piezas defectuosas: " + contadorDefectuosas);
    }

}
