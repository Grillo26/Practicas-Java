package animales;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace sonido, de la clase padre");
    }
}

//HERENCIA
class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wauf");
    }
}

class Gato extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal{
    /**Polimorfismo*/
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //Objeto de la clase padre (Animal)

        var animal = new Animal();
        imprimirSonido(animal);

        var animalPerro = new Perro();
        imprimirSonido(animalPerro);

        var animalGato = new Gato();
        imprimirSonido(animalGato);
    }
}
