package ventas;

public class PruebaVentas {

    public static void main(String[] args) {
        System.out.println("########## SISTEMA DE VENTAS ##########");

        var producto1 = new Producto("Blusa", 34.0);
        System.out.println(producto1);

        var producto2 = new Producto("Chompa", 490.0);
        System.out.println(producto2);

        //Primer Orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //orden1.mostrarOrden(); Cambiando por el método ToString
        System.out.println(orden1);

        //segunda Orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Gorra", 25));
        orden2.agregarProducto(producto1);
        //orden2.mostrarOrden(); Cambiando por el método ToString
        System.out.println(orden2);

    }
}
