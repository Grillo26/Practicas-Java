package sistema_medico;

import java.util.ArrayList;
import java.util.List;

public class GestorCitas {
    private List<Cita> listaCitas = new ArrayList<>();

    public void agendarCita(Cita cita){
        listaCitas.add(cita);
        System.out.println("Cita agendada correctamente! Id: "+ cita.getIdCita());
    }

    public Cita buscarCitaPorId(int id) throws CitaNoEncontradaException {
        for (Cita cita: listaCitas){
            if(cita.getIdCita() == id){
                System.out.println("Cita encontrada: "+ cita);
            }
        }
        throw new CitaNoEncontradaException("No se encontró la cita con el id: "+ id);
    }

    public void mostrarTodas(){
        System.out.println("***** Historial de Citas *****");
        if (listaCitas.isEmpty()) System.out.println("No hay registradas");
        for (Cita cita : listaCitas ) System.out.println(cita);
    }
}

