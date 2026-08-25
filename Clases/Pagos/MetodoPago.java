package Pagos;

public abstract class MetodoPago {

    protected String titular;

    public MetodoPago(String titular){
        this.titular = titular;
    }

    //Método abstracto
    public abstract void procesarPago(double monto);
}

class TarjetaDebito extends MetodoPago{
    public TarjetaDebito(String titular){
        super(titular);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("💳 Procesando pago con Tarjeta de Débito...");
        System.out.println("Titular: " + this.titular + " | Monto: $" + monto);
        System.out.println("Validando chip y PIN... Pago exitoso.");
    }
}

class TransferenciaQr extends MetodoPago{
    public TransferenciaQr(String titular){
        super(titular);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("📱 Procesando pago mediante código QR...");
        System.out.println("Titular: " + this.titular + " | Monto: $" + monto);
        System.out.println("Generando hash de transacción... Pago recibido.");
    }
}