package videojuegos_sistema;

import java.io.Serializable;
import java.util.Objects;

public class VideoJuego implements Serializable {
    private final int idVideojuego;
    private String titulo;
    private String genero;
    private double precio;
    private static int counter;

    public VideoJuego() {
        this.idVideojuego = ++VideoJuego.counter;
    }

    public VideoJuego(String titulo, String genero, double precio) {
        this();
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "VideoJuego{ " +
                "idVideojuego=" + idVideojuego +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VideoJuego that = (VideoJuego) o;
        return idVideojuego == that.idVideojuego && Double.compare(precio, that.precio) == 0 && Objects.equals(titulo, that.titulo) && Objects.equals(genero, that.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVideojuego, titulo, genero, precio);
    }
}
