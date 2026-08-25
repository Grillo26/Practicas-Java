package supscripcion;

public class SistemaStreaming {

    // MÉTODO POLIMÓRFICO
    // No le importa si el usuario tiene un plan
    public static void procesarSubscription(Subscription user){
        user.mostrarInfo();
        System.out.println("Cantidad a cancelar: " + user.calcularPrecioFinal());
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("*** Pago de Streaming ****");

        //Creando los objetos
        Subscription subscription1 = new PlanEstudiante("Grillo26", 200, "UAJMS");
        Subscription subscription2 = new PlanFamiliar("Dasvid7", 50, 3);

        //Mostrando los datos
        procesarSubscription(subscription1);
        procesarSubscription(subscription2);

    }
}
