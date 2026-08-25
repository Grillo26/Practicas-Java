package rentaCar;

public class GestorAlquiler {

    public static void procesarRecibo(Vehiculo vehiculo, int dias){
        vehiculo.mostrarFicha();
        System.out.println("Candidad de días: " + dias);
        System.out.println("Precio cancelar: " + vehiculo.calcularAlquiler(dias));

    }

    public static void main(String[] args) {
        System.out.println("############# SISTEMA ALQUILER #############");
        System.out.println("Bienvenidos al sistema, esto es para practicas POO");
        System.out.println();

        //Creando los objetos
        Vehiculo vehiculo1 = new AutoPasajero("N34432", 100,true);
        Vehiculo vehiculo2 = new AutoPasajero("XKD222", 80, false);

        Vehiculo vehiculo3 = new CamionCarga("JUE221", 400, 3);
        Vehiculo vehiculo4 = new CamionCarga("SDAQ333", 600, 6);

        //Mostrando los datos
        procesarRecibo(vehiculo1,2);
        procesarRecibo(vehiculo2,3);
        procesarRecibo(vehiculo3,5);
        procesarRecibo(vehiculo4,2);

    }

}
