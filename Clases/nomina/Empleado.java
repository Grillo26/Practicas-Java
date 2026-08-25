package nomina;

public abstract class Empleado {

    private String nombre;
    private int id;

    public Empleado(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSalario();

    public void mostrarDatos(){
        System.out.println("*** Datos del Empleado ***");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Id: " + this.id);
    }
}

class EmpleadoAsalariado extends Empleado{
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, int id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return this.salarioMensual;
    }
}

class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;
    private double pagoPorHorasTrabajadas;

    public EmpleadoPorHoras(String nombre, int id, int horas, double pago) {
        super(nombre, id);
        this.horasTrabajadas = horas;
        this.pagoPorHorasTrabajadas = pago;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabajadas * pagoPorHorasTrabajadas;
    }
}
