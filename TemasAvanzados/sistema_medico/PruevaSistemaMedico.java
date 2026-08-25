package sistema_medico;

public class PruevaSistemaMedico {
    public static void main(String[] args) {
        System.out.println("****** Bienvenidos al Sistema Médico *****");
        GestorCitas gestor = new GestorCitas();

        // 1. Precarga de datos (simulando una base de datos)
        Medico med = new Medico(101, "Carlos", "Mamani", "Desarrollo de Software");
        Paciente pac = new Paciente(500, "Juan", "Pérez", "Dolor de espalda por mucho código");

        // 2. Agendar Citas
        gestor.agendarCita(new Cita(med, pac, "2026-05-20 10:00 AM"));
        gestor.agendarCita(new Cita(med, pac, "2026-05-21 03:30 PM"));

        // 3. Prueba de Búsqueda y Excepciones
        try {
            System.out.println("\nBuscando cita #1...");
            System.out.println(gestor.buscarCitaPorId(1));

            System.out.println("\nBuscando cita #99 (Esta fallará)...");
            System.out.println(gestor.buscarCitaPorId(99));

        } catch (CitaNoEncontradaException e) {
            System.err.println("ALERTA: " + e.getMessage());
        }

        // 4. Listado Final
        gestor.mostrarTodas();
    }
}
