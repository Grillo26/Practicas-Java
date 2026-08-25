package nomina;

public class PruebaNomina {

    // MÉTODO POLIMÓRFICO
    // No le importa si es Asalariado o Por Horas, solo sabe que es un Empleado
    public static void imprimirRecibo(Empleado e){
        e.mostrarDatos();
        System.out.println("Salario a depositar: $" + e.calcularSalario());
        System.out.println("---------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== GENERADOR DE NÓMINA MENSUAL ===\n");

        //Creando los objetos
        Empleado empleado1 = new EmpleadoAsalariado("Carlos Enrique", 1, 5000);
        Empleado empleado2 = new EmpleadoPorHoras("Enrique Torrez", 2, 8, 10);

        //Mostramos el recibo
        imprimirRecibo(empleado1);
        imprimirRecibo(empleado2);
    }
}
