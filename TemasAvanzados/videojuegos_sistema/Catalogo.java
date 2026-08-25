package videojuegos_sistema;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private static final List<VideoJuego> videojuegos;

    // Bloque de tipo static inicializado
    static{
        videojuegos = new ArrayList<>();
        videojuegos.add( new VideoJuego("Maincraft", "Diversion", 300));
        videojuegos.add( new VideoJuego("Valorant", "Shouter", 0));
        videojuegos.add( new VideoJuego("WarThunder", "Guerra", 200));
        videojuegos.add( new VideoJuego("Repo", "Diversion", 123));
    }

    public static void agregarVideojuegos(VideoJuego videojuego){
        videojuegos.add(videojuego);
    }

    public static void mostrarVideojuegos(){
        var catalogoVideojuegos = "";
        for( var videojuego : videojuegos){
            catalogoVideojuegos += videojuego.toString() + "\n";
        }
        System.out.println("-------------- Catalogo de VideoJuegos Disponible ------------------");
        System.out.println(catalogoVideojuegos);
    }

    public static List<VideoJuego> getVideojuegos(){
        return videojuegos;
    }
}
