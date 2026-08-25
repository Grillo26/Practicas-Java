package Aritmetica.Prueba;

import Aritmetica.Rectangulo;

public class PruebaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Probando métodos de rectángulo ****");

        //Creando el primero objeto
        var rectangulo1 = new Rectangulo(2.6,2.4);
        if(rectangulo1.esCuadrado()){
            System.out.println("Cuidado: este rectángulo tiene todos los lados iguales.");
        }
        rectangulo1.verificarCuadrado();
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
    }
}
