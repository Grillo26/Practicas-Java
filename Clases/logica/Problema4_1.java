package logica;

import java.util.Scanner;

/* "El Calculador de Pedidos de un Restaurante"
    Imagina que estás programando el sistema de pedidos de un restaurante pequeño.
    Los requerimientos son:
        -El programa debe pedir al usuario que ingrese el precio de un plato.
        -Si el precio ingresado es menor o igual a 0, muestra un mensaje de error y pide el número de nuevo (¡aquí usarás un if dentro del do-while!).
        -Si el precio es válido, el programa debe preguntar: "¿Es un pedido para llevar? (1 para sí, 0 para no)".
        -Si es para llevar, se le suma un cargo extra de $2.00 al precio del plato automáticamente.
        -El programa debe seguir pidiendo platos hasta que el usuario ingrese 0 como precio (esto cierra la cuenta).
        -Al finalizar, muestra:
        -La suma total de todos los pedidos (incluyendo los cargos extra).
        -El número total de platos vendidos.
* */
public class Problema4_1 {
    public static void main(String[] args) {

        System.out.println(" ======= SISTEMA DE PEDIDOS RESTAURANTE ======");
        double priceDish = 0;
        double totalSum = 0;
        int toGo = 0;
        int countDishSold =0 ;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese precio del plato: ");
            priceDish = scanner.nextDouble();
            if( priceDish <= 0){
                System.out.println(" Error, el número ingresado debe ser mayor a 0: " + priceDish);
            }else{

                do {
                    System.out.println("¿Es un pedido para llevar?");
                    System.out.println(" Ingrese 1 Sí");
                    System.out.println(" Ingrese 0 No");
                    toGo = scanner.nextInt();
                    if( toGo == 1){
                        totalSum += (priceDish + 2);
                        countDishSold++;
                        System.out.println("Valor aumentado +$2.00 ");
                    } else if (toGo == 0) {
                        totalSum += priceDish;
                        countDishSold++;
                    }else {
                        System.out.println("Debe ingresar una opción válida: 1 o 2 ");
                    }
                }while ( toGo <0 && toGo>1 );

            }
        }while ( priceDish != 0);
        System.out.println("Cierre de Caja");
        System.out.println("Total de platos vendidos: " + countDishSold);
        System.out.println("Total vendidos: " + totalSum);

    }
}
