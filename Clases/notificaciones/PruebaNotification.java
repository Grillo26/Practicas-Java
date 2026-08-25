package notificaciones;

public class PruebaNotification {

    // Este método es POLIMÓRFICO: acepta al padre y a cualquier hijo
    static void ejecutarEnvio(Mensaje mensaje){
        mensaje.enviar();
    }
    public static void main(String[] args) {

        //Creando los objetos de las clases hijas
        Mensaje miMensajeGenerico = new Mensaje();
        Mensaje miEmail = new Email();
        Mensaje miWhatsapp = new Whatsapp();

        //Probando Polimorfismo
        ejecutarEnvio(miMensajeGenerico);
        ejecutarEnvio(miEmail);
        ejecutarEnvio(miWhatsapp);


    }
}
