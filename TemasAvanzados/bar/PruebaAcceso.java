package bar;

public class PruebaAcceso {
    public static void main(String[] args) {
        try{
            System.out.println("Intentando ingresar al sistema...");
            Acceso.validarEdad(14);
            System.out.println("Este Mensaje no se verá si hay error.");
        } catch (Exception e) {
            System.out.println("ERROR DEL SISTEMA: " + e.getMessage());
        }finally {
            System.out.println("Registro de auditoria finalizado (Este o no este el error");
        }
    }
}
