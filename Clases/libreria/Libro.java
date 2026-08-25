package libreria;

public class Libro {
    private final int idLibro;
    private String titulo;
    private String autor;
    private static int contadorLibro;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLibro = ++Libro.contadorLibro;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static int getContadorLibro() {
        return contadorLibro;
    }

    public static void setContadorLibro(int contadorLibro) {
        Libro.contadorLibro = contadorLibro;
    }

    @Override
    public String toString() {
        return "\t\tLibro: \n" +
                "\t\t\tidLibro=" + this.idLibro + "\n"+
                "\t\t\ttitulo='" + this.titulo + "'\n" +
                "\t\t\tautor='" + this.autor + "'\n";
    }
}
