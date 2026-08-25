package supscripcion;

public abstract class Subscription {
    protected String nombreUsuario;
    protected double precioBase;

    public Subscription(String nombreUsuario, double precioBase) {
        this.nombreUsuario = nombreUsuario;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();

    public void mostrarInfo(){
        System.out.println("*** Datos del usuario ***");
        System.out.println("UserName: "+ this.nombreUsuario);
    }
}

class PlanFamiliar extends Subscription{

    private int cantidadCuentas;

    public PlanFamiliar(String nombreUsuario, double precioBase, int cantidadCuentas) {
        //5% por cada cuenta
        super(nombreUsuario, precioBase);
        this.cantidadCuentas = cantidadCuentas;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + ((this.cantidadCuentas * 5)*precioBase)/100;
    }
}

class PlanEstudiante extends Subscription{

    private String nombreUniversidad;

    public PlanEstudiante(String nombreUsuario, double precioBase, String universidad) {
        //descuento del 50% sobre el precio base
        super(nombreUsuario, precioBase);
        this.nombreUniversidad = universidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Universidad: "+ this.nombreUniversidad);
    }

    @Override
    public double calcularPrecioFinal() {
        return this.precioBase * 0.50;
    }
}
