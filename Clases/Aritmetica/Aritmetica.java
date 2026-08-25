package Aritmetica;

public class Aritmetica {

    private int operando1;
    private int operando2;

    //Constructor Vacío
    public Aritmetica(){}

    //Constructor normal
    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

   public void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("El resultado de la resta es: "+ resultado);
    }

    public int getOperando1(){
        return this.operando1;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }
    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }
}
