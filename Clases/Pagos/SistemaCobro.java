package Pagos;

public class SistemaCobro {

    //Método polimórfico: Acepta cualquier cosa que sea un métodopago
    public static void realizarCobro(MetodoPago metodoPago, double monto){
        System.out.println("Iniciando pasarela de pagos...");
        metodoPago.procesarPago(monto); // Aquí ocurre el polimorfismo
        System.out.println("Generando factura digital...");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        //Creando los objetos de las clases hijas, pero los guardamos en variables del padre
        MetodoPago pago1 = new TarjetaDebito("Carlos Mamani");
        MetodoPago pago2 = new TransferenciaQr("Carlos Mamani");

        System.out.println("*** BIENVENIDO AL PUNTO DE VENTA ***\n");

        //Polimorfismo
        realizarCobro(pago1, 500);
        realizarCobro(pago2,200);

    }
}
