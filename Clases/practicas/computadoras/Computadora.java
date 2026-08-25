package practicas.computadoras;

public class Computadora {

    private final String marca;
    private final String modelo; //Inmutabilidad al usar final
    private int precio;

    public Computadora(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    @Override
    public String toString() {
        return "Computadora: "+this.marca+" "+this.modelo+" -$"+this.precio;
    }
}
