public interface Traductor {

    //por default son públicos y abstractos
    void traducir();

    //Métodos con implementación por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }

}

class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco a ingles");
    }
}

class Frances implements Traductor{

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor en Francés");
    }

    public void traducir() {
        System.out.println("Traduzco a francés");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}