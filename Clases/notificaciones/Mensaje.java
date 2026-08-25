package notificaciones;

public class Mensaje {
    public void enviar(){
        System.out.println("Enviando un mensaje genérico");
    }
}

class Email extends Mensaje{
    @Override
    public void enviar(){
        System.out.println("Enviando correo con protocolo SMTP y archivos adjuntos");
    }
}

class Whatsapp extends Mensaje{
    @Override
    public void enviar(){
        System.out.println("Enviando mensaje cifrado por la API de WhatsApp");
    }
}
