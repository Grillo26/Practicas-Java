package logica;

import java.util.Scanner;

/*  Consigna: Procesador de Calificaciones de un Curso
    Un profesor necesita procesar las notas finales de sus alumnos (valores decimales entre 0.0 y 10.0).
    El programa debe solicitar notas de forma continúa usando un bucle.
    Condición de parada: El ingreso de datos se detiene cuando el usuario ingresa el valor -1.
    Validaciones de entrada:
    Si el usuario ingresa un número menor a 0.0 (diferente de -1) o mayor a 10.0, debe mostrar "Nota fuera de rango (0-10)" y no contarla.
    Si el usuario ingresa texto/letras, debe capturar la excepción con try-catch, mostrar "Error: Ingrese un número válido" y limpiar el buffer para continuar sin romper el programa.
    Resultados al finalizar (al ingresar -1):
    Cantidad total de notas válidas ingresadas.
    La nota más alta ingresada.
    La nota más baja ingresada.
    El promedio general del curso (protegido contra división por cero si no se ingresó ninguna nota).
*
* */
public class Calificaciones {

    public static void main(String[] args) {
        Double nota;
        Double notaAlta = 0.0;
        Double notaBaja = 0.0;
        Double promedioGeneral;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese Nota");
            nota = scanner.nextDouble();

        }while (nota != -1);
        System.out.println("Nota alta: " + notaAlta);
        System.out.println("Nota baja: " + notaBaja);

    }
}
