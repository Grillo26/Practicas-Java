package CienEjercicios.Problemas;

import java.util.Scanner;
/*
 * SISTEMA DE MONITOREO DE TEMPERATURA DE UN SERVIDOR
 * Un centro de datos necesita monitorear la temperatura (°C) de un servidor durante N lecturas
 * para evitar sobrecalentamientos.
 * 1. En el main:
 *    - Pide al usuario la cantidad total de lecturas a registrar (N > 0).
 *      Usa un método auxiliar de validación con hasNextInt().
 * 2. Método procesarLecturas(int totalLecturas, Scanner scanner):
 *    - Mediante un bucle, pide consecutivamente la temperatura de cada lectura
 *      (números enteros entre -10 y 100 °C). Debes validar que cada lectura esté
 *      en ese rango de temperaturas válidas. Si ingresan letras o una temperatura
 *      fuera de rango, advierte al usuario y vuelve a pedir esa misma lectura sin
 *      avanzar el contador.

 *    - Alertas por lectura:
 *      * Si la temperatura es mayor a 45 °C, imprime:
 *        "⚠️ Alerta: Temperatura alta (" + temp + "°C)"
 *      * Si es menor o igual a 45 °C, imprime:
 *        "✅ Temperatura normal (" + temp + "°C)"
 *
 *    - Apagado de Emergencia (Detención):
 *      * Si se registran 3 lecturas seguidas mayores a 45 °C, el servidor corre
 *        riesgo de quemarse. Debes detener inmediatamente el ciclo con un break
 *        e imprimir:
 *        "🚨 APAGADO DE EMERGENCIA: 3 alertas de sobrecalentamiento consecutivas"
 *
 *    - Resumen final:
 *      * Muestra el número total de lecturas procesadas con éxito.
 *      * La temperatura más alta registrada.
 *      * La temperatura promedio general (protegida contra división por cero).
 */
public class MonitoreoTemperatura {
    public static void main(String[] args) {
        System.out.println("===== SISTEMA DE MONITOREO DE SERVIDOR =====");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Ingrese la cantidad total de lecturas a registrar: ");
            int totalLecturas = verificarNumero(scanner);
            procesarLecturas(totalLecturas, scanner);
        }catch (Exception e){
            System.out.println("Ocurrió un error inesperado en la entrada de datos");
        }
    }

    public static int verificarNumero(Scanner scanner){
        while (true){
            if(scanner.hasNextInt()){
                int numeroSolicitado = scanner.nextInt();
                if(numeroSolicitado >0){
                    return numeroSolicitado;
                }else{
                    System.out.println("Error: Debe ingresar un número mayor a 0");
                }
            }else{
                System.out.println("Error: Debe ingresar un numero válido");
                scanner.next(); // Limpieza del Buffer
            }
        }
    }

    public static int solicitarTemperaturaValida(Scanner scanner, int lecturaActual, int totalLecturas){
        while(true){
            System.out.print("Ingrese la temperatura para la lectura #" + lecturaActual+"(-10 a 100°C):");
            if(scanner.hasNextInt()){
                int temperatura = scanner.nextInt();
                if(temperatura >= -10 && temperatura <= 100){
                    return temperatura;
                }else{
                    System.out.println("Error: la temperatura debe estar entre -10 y 100°C\n");
                }
            }else{
                System.out.println("Error: Debe ingresar un número entero válido\n");
                scanner.next();
            }
        }
    }

    public static void procesarLecturas(int totalLecturas, Scanner scanner){
        int contadorConsecutivas = 0;
        int contadorConExito = 0;
        int temperaturaMaxima = Integer.MIN_VALUE;
        double sumaTemperaturas = 0;
        double mayor = Double.NEGATIVE_INFINITY;

        System.out.println("--- Registro de Lecturas ---");
        for (int i=1; i<=totalLecturas; i++){
            
            System.out.print("Ingrese Temperatura ("+i+"/"+totalLecturas+"): ");
            int temperatura = solicitarTemperaturaValida(scanner, i, totalLecturas);

            contadorConExito++;
            sumaTemperaturas += temperatura;

            if(temperatura> temperaturaMaxima){
                temperaturaMaxima = temperatura;
            }

            if(temperatura > 45){
                System.out.println("Alerta: Temperatura alta (" + temperatura + "°C)");
                contadorConsecutivas++;

                if( contadorConsecutivas == 3){
                    System.out.println("APAGADO DE EMERGENCIA: 3 alertas de sobrecalentamiento consecutivas");
                    break;
                }
            }else{
                System.out.println(" Temperatura normal (" + temperatura + "°C)");
                contadorConsecutivas = 0;
            }
        }
        System.out.println();
        System.out.println("===== RESUMEN DEL MONITOREO =====");
        System.out.println("Total de lecturas procesadas con éxito:"+ contadorConExito);
        if(contadorConExito == 0){
            System.out.println("Temperatura más alta registrada: N/A");
            System.out.println("Temperatura promedio general: 0.0°C (No se registraron datos)");
        }else{
            double promedio = sumaTemperaturas / contadorConExito;
            System.out.println("Temperatura más alta registrada: " + temperaturaMaxima+"°C");
            System.out.println("Temperatura promedio general:" + promedio+"°C");
        }

    }
}
