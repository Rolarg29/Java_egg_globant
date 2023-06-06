package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
//    11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//    pantalla el siguiente menú:
static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese 2 números enteros positivos:");
        double num1 = leer.nextInt();
        double num2 = leer.nextInt();

        mostrarMenu(num1, num2);
    }

    public static void mostrarMenu(double num1, double num2){
        System.out.println("======================================================");
        System.out.println("Seleccione la operación a realizar del siguiente menú:");
        System.out.println("======================================================");
        System.out.println("<  <  <  M E N Ú  >  >  >");
        System.out.println("======================================================");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("======================================================");
        System.out.print("Elija opción: ");
        int opcion = leer.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Suma de "+num1+" + "+num2+": " + (num1 + num2));
                mostrarMenu(num1, num2);
                break;
            case 2:
                System.out.println("Resta de "+num1+" - "+num2+": " + (num1 - num2));
                mostrarMenu(num1, num2);
                break;
            case 3:
                System.out.println("Multiplicación de "+num1+" x "+num2+": " + (num1 * num2));
                mostrarMenu(num1, num2);
                break;
            case 4:
                double division = num1 / num2;
                System.out.println("División de "+num1+" / "+num2+": " + division);
                mostrarMenu(num1, num2);
                break;
            case 5:
                leer.nextLine();
                confirmarSalida(num1, num2);
                break;
            default:
                System.out.println("Seleccione una opción válida >:V");
                mostrarMenu(num1, num2);
                break;
        }
    }

    public static void confirmarSalida(double num1, double num2){
        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
        String respuesta = leer.nextLine();
        if (respuesta.equalsIgnoreCase("S")){
            System.out.println("Gracias, vuelva pronto!");
        }else if (respuesta.equalsIgnoreCase("N")){
            mostrarMenu(num1, num2);
        }else{
            System.out.println("Responda (S/N)!!!");
            confirmarSalida(num1,num2);
        }
    }
}
