package Aritmetica.Prueba;

import Aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Aritmética***");

        //Creando el primer object
        var aritmetica1 = new Aritmetica(20,10);
        System.out.println("Atributo operando1:" + aritmetica1.getOperando1());
        aritmetica1.setOperando1(50);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("Dirección de memoria Obj1: " + aritmetica1);

        System.out.println();

        //Creando un segundo objeto
        var aritmetica2 = new Aritmetica(30,20);
        aritmetica2.sumar();
        aritmetica2.restar();
        System.out.println("Dirección de memoria Obj2: "+ aritmetica2);


    }
}
