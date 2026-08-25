package rentaCar;

public abstract class Vehiculo {
    protected String patente;
    protected double tarifaBase;

    public Vehiculo(String patente, double tarifaBase) {
        this.patente = patente;
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularAlquiler(int dias);

    public void mostrarFicha(){
        System.out.println("******** FICHA DE ALQUILER ***********");
        System.out.println("Patente: " + this.patente);
    }
}

class AutoPasajero extends Vehiculo{

    private boolean tieneAireAcondicionado;

    public AutoPasajero(String patente, double tarifaBase, boolean tieneAireAcondicionado) {
        super(patente, tarifaBase);
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        if(tieneAireAcondicionado){
            System.out.println("Aire Acondicionado: Sí");
        }else{
            System.out.println("Aire Acondicionado: No");
        }
    }

    @Override
    public double calcularAlquiler(int dias) {
        if(tieneAireAcondicionado){
            return (this.tarifaBase * dias) + (dias * 10);
        }else{
           return this.tarifaBase * dias;
        }
    }
}

class CamionCarga extends Vehiculo{

    private double capacidadToneladas;

    public CamionCarga(String patente, double tarifaBase, double capacidad) {
        super(patente, tarifaBase);
        this.capacidadToneladas = capacidad;
    }

    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Capacidad del Camión (EN TONELADAS): " + capacidadToneladas);
    }

    @Override
    public double calcularAlquiler(int dias) {
        if (this.capacidadToneladas > 5){
            return (this.tarifaBase * dias) + ((20 * (this.tarifaBase * dias))/100);
        }else{
            return this.tarifaBase * dias;
        }
    }
}