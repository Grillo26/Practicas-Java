public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4,5); // varargs
        variosParametros("Carlos", 10,10,120);
    }

    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numeros) { //Recibe como un arreglo
        for ( var i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
