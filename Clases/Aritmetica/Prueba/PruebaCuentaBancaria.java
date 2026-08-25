package Aritmetica.Prueba;

import Aritmetica.CuentaBancaria;
import animales.Animal;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        System.out.println("*** PRUEBA DE CUENTA BANCARIA ***");
        var cuenta1 = new CuentaBancaria("Carlos", 0);
        cuenta1.ingresar(4);
        cuenta1.ingresar(-3);
        cuenta1.restar(-3);
        cuenta1.restar(2);
        cuenta1.mostrarSaldo();

        var animal = new Animal();
    }
}
