package libreria;

import java.util.Arrays;

public class Prestamo {
    private final int idPrestamo;
    private Libro[] libros;
    private int contadorLibros;
    private static final int MAX_LIBROS = 3;
    private static int contadorPrestamos;

    public Prestamo() {
        this.idPrestamo = ++Prestamo.contadorPrestamos;
        this.libros = new Libro[Prestamo.MAX_LIBROS];
    }

    public void agregarLibro(Libro libro){
        if(this.contadorLibros < Prestamo.MAX_LIBROS)
            this.libros[this.contadorLibros++] = libro;
        else System.out.println("Se ha superado el máximo de libros: " + Prestamo.MAX_LIBROS);
    }

    @Override
    public String toString() {
        return "Préstamo: \n" +
                "\tidPrestamo=" + idPrestamo + "\n"+
                "\tlibros=\n" + Arrays.toString(libros) +
                "\tcontadorLibros=" + contadorLibros;
    }
}
