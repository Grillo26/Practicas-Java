package Aritmetica;

public class Rectangulo {

    double base;
    double altura;

    public Rectangulo(){}

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Calculando el área
    public void calcularArea(){
        double area = this.base * this.altura;
        System.out.println("El área del rectángulo es:" +area);
    }

    //Calculando perímetro
    public void calcularPerimetro(){
        double perimetro = (2*this.base) + (2*this.altura);
        System.out.println("El perímetro del rectángulo es: "+perimetro);
    }

    //Verificar si es cuadrado
    public void verificarCuadrado(){
        String message = (this.altura == this.base) ? "El objeto es un cuadrado" : "El objeto no es un cuadrado";
        System.out.println(message);
    }

    //Verificar en Boolean
    public boolean esCuadrado(){
        return this.base == this.altura;
    }

}
