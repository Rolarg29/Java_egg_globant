package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    /*
    14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
     */
    static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("=== CONVERSOR DE DIVISAS ===");
        System.out.println("============================");
        System.out.println("Seleccione a que divisa quiere convertir sus euros:");
        System.out.println("1.LIBRAS");
        System.out.println("2.DOLARES");
        System.out.println("3.YENES");
        System.out.println("4.CANCELAR OPERACIÓN!!!");
        System.out.println("============================");
        System.out.print("[OPCIÓN]>");
        int opcion = leer.nextInt();
        System.out.println("Ingrese la cantidad de euros a convertir:");
        System.out.print("[EUROS]>");
        double euros = leer.nextInt();

        seleccionarConversion(opcion, euros);

    }
    private static void seleccionarConversion(int opcion, double euros){
        double libras = euros * 0.86;
        double dolares = euros * 1.28611;
        double yenes = euros * 129.852;
        switch (opcion) {
            case 1:
                System.out.println(euros+" euros equivalen a '"+libras+"' Libras.");
                System.out.println("=============================================");
                break;
            case 2:
                System.out.println(euros+" euros equivalen a '"+ dolares +"' Dolares.");
                System.out.println("=============================================");
                break;
            case 3:
                System.out.println(euros+" euros equivalen a '"+ yenes +"' Yenes.");
                System.out.println("=============================================");
                break;
            case 4:
                System.out.println("Gracias, vuelva pronto!");
                break;
            default:
                System.out.println("Selecciona una opción válida!");
                seleccionarConversion(opcion, euros);
                break;
        }

    }
}
