package Aritmetica;

import java.util.Objects;

public class CuentaBancaria {
    private String titular = "Carlos";
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Mostrar cuanto de saldo hay en la cuenta
    public void mostrarSaldo(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo actual:"+ this.saldo);
    }

    //Ingresar a la cuenta bancaria y sumar
    public void ingresar(double monto){
        if(verificarMayorACero(monto)){
            this.saldo += monto;
            System.out.println("Se agreso a su cuenta: "+ monto);
        }
        else{
            System.out.println("Debe ingresar un número mayor a cero");
        }
    }

    //Retirar de la cuenta bancaria y restar
    public void restar(double monto){
        if(verificarMayorACero(monto)){
            if(verificarMontoASaldo(monto)){
                saldo -= monto;
                System.out.println("Se descontó de su cuenta: "+monto);
            }
            else {
                System.out.println("El monto que ingreso es mayor al que tiene en su cuenta");
            }
        }
        else {
            System.out.println("Debe ingresar un número mayor a cero");
        }

    }

    //Verificar si estamos en la cuenta
    public boolean verificarUsuario(String user){
        return this.titular.equals(user);
    }

    //Verificar número mayor a cero
    boolean verificarMayorACero(Double monto){
        return monto>0;
    }

    //Verificar que número sea mayor al del saldo
    boolean verificarMontoASaldo(double monto){
        return this.saldo>=monto;
    }
}
