package videojuegos_sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiendaJuego {

    public static void main(String[] args) {
        catalogoVideojuegos();
    }

    public static void catalogoVideojuegos(){
        var salir = false;
        var datoIngresado = new Scanner(System.in);

        // Creando la lista de catalogo de tipo videojuegos
        List<VideoJuego> catalogo = new ArrayList<>();
        System.out.println("************ BIENVENIDO A LA TIENDA VIRTUAL *************");
        //Catalogo.mostrarVideojuegos();

        while(!salir){
            try{
                var option = mostrarMenu(datoIngresado);
                salir = ejecutarOpcion(option, datoIngresado, catalogo);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static int mostrarMenu(Scanner datoIngresado){
        System.out.println("""
                Menu:
                1. Explorar Catálogo
                2. Añadir al Carrito
                3. Ver mi Carrito
                4. Registrar Nuevo en la Tienda
                5. Salir
                Elige una opción: \s""");

        // Leemos y retornamos la opcion seleccionada
        return Integer.parseInt(datoIngresado.nextLine());
    }

    public static boolean ejecutarOpcion(int opcion, Scanner datoIngresado, List<VideoJuego> videoJuegos){
        var salir = false;
        switch(opcion){
            case 1 -> Catalogo.mostrarVideojuegos();
            case 2 -> addCarrito(datoIngresado, videoJuegos);
            case 3 -> mostrarCarrito(videoJuegos);
            case 4 -> agregarATienda(datoIngresado);
            case 5 -> {
                System.out.println("Regresa pronto, gracias");
                salir = true;
            }
        }
        return salir;
    }

    public static void addCarrito(Scanner datoIngresado, List<VideoJuego> videoJuegos){
        System.out.println("Que VideoJuego quieres comprar, selecciona Id:");
        var idVideojuego = Integer.parseInt(datoIngresado.nextLine());
        //Validamos si el videojuego exite en el catálogo
        var videoJuegoEncontrado = false;

        for( var videojuego: Catalogo.getVideojuegos()){
            if(idVideojuego == videojuego.getIdVideojuego()){
                //Si lo encuentra lo agrega
                videoJuegos.add(videojuego);
                System.out.println("Videojuego agregado: "  + videojuego);
                videoJuegoEncontrado = true;
                break;
            }
        }
        if(!videoJuegoEncontrado){
            System.out.println("Id del videojuego no encontrado");
        }
    }

    public static void mostrarCarrito(List<VideoJuego> videoJuegos){
        var ticket = "*** Ticket de venta ****";
        var total = 0.0;
        for (var videojuego : videoJuegos){
            ticket += "\n\t- " + videojuego.getTitulo() + " - $" + videojuego.getPrecio();
            total += videojuego.getPrecio();
        }
        ticket += "\n\tTotal -> $" +total;
        System.out.println(ticket);
    }

    private static void agregarATienda(Scanner datoIngresado){
        System.out.println("Ingrese Nombre de Videojuego: ");;
        var nombre = datoIngresado.nextLine();
        System.out.println("Precio del videojuego: ");
        var precio = Double.parseDouble(datoIngresado.nextLine());
        System.out.println("Ingrese Genero");
        var genero = datoIngresado.nextLine();
        Catalogo.agregarVideojuegos( new VideoJuego(nombre, genero, precio));
        System.out.println("El videojuego se agrego correctamente");
        Catalogo.mostrarVideojuegos();
    }
}
