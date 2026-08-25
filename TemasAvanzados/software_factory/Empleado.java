package software_factory;

public abstract  class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected Double salarioBase;
    protected static int contadorEmpleados = 0;

    public Empleado(){
        this.idEmpleado = ++contadorEmpleados;
    }
    public Empleado(  String nombre, Double salarioBase) {
        this();
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPago();
}

class Programador extends Empleado{
    private String lenguajePrincipal;

    public Programador(String nombre, Double salarioBase, String lenguajePrincipal) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public double calcularPago() {
        return this.salarioBase + 500;
    }
}

class LiderProyecto extends Empleado{
    private int cantidadPersonasACargo;

    public LiderProyecto(String nombre, Double salarioBase, int cantidadPersonasACargo) {
        super(nombre, salarioBase);
        this.cantidadPersonasACargo = cantidadPersonasACargo;
    }

    @Override
    public double calcularPago() {
        return this.salarioBase + ( (this.salarioBase*0.10) * this.cantidadPersonasACargo);
    }
}