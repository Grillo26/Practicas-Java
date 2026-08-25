package logica;
/*
    Crear un programa que muestre el producto de los primeros diez números impares.
    Primeros diez números impares uno,3,5,7,9,once, trece, quince, diez y siente, diez y nueve.
* */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Multiplicador de impares");
        long productoImpares = 1;
        for (int i=1; i<20; i+=2){ // sumará de dos en dos
            productoImpares *=i;
        }
        System.out.println("El resultado de multiplicar los primeros diez numeros impares es: " + productoImpares);
    }
}
