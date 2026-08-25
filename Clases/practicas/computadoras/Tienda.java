package practicas.computadoras;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    // Declaramos la lista private para proteger el inventario
    private List<Computadora> inventario;

    public Tienda(List<Computadora> inventario) {

        //Aquí nace la lista en la memoria
        this.inventario = new ArrayList<>();
    }

    public void agregarComputadora(Computadora c){
        this.inventario.add(c);
    }

    /*public void buscarPorMarca(String marca){
        System.out.println("Resultados para: "+marca);
        inventario.forEach(c -> {
            if(c.getMarca().equalsIgnoreCase(marca)){
                System.out.println(c);
            }
        });
    }*/

    public List<Computadora> buscarPorMarca(String marca){
        List<Computadora> resultados = new ArrayList<>();
        for (Computadora c : inventario){
            if(c.getMarca().equalsIgnoreCase(marca)){
                resultados.add(c);
            }
        }
        return resultados;
    }

    public void venderComputadora(String modelo){
        boolean fueEliminado = inventario.removeIf(c-> c.getModelo().equals(modelo));
        if(fueEliminado){
            System.out.println("Venta Exitosa del modelo: "+ modelo);
        }else {
            System.out.println("No se encontró el modelo: "+ modelo);
        }
    }
}
