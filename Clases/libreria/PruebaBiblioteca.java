package libreria;

public class PruebaBiblioteca {

    public static void main(String[] args) {
        System.out.println(" ************ SISTEMA DE PRESTAMOS DE LIBROS ******************");

        //Creando los libros
        var libro1 = new Libro("La caperucita", "Grillo");
        var libro2 = new Libro("Pie pequeño", "El jose");
        var libro3 = new Libro("La Ollada", "Federico Mamani");
        var libro4 = new Libro("Pinocho", "Ezequiel Chavez");

        //Creando los prestamos
        var prestamo1 = new Prestamo();
        prestamo1.agregarLibro(libro1);
        prestamo1.agregarLibro(libro2);
        prestamo1.agregarLibro(libro3);
        System.out.println(prestamo1);

        var prestamo2 = new Prestamo();
        prestamo2.agregarLibro(libro4);
        prestamo2.agregarLibro(new Libro("La monumental", "River Plate"));
        prestamo2.agregarLibro(libro2);
        prestamo2.agregarLibro(libro3);
        System.out.println(prestamo2);

    }
}
