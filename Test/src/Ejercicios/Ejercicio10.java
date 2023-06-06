package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio10 {
//    10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//    solicite números al usuario hasta que la suma de los números introducidos supere el
//    límite inicial.
    private static final Scanner LEER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese un número que servirá como límite positivo: ");
        int limite = LEER.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrese un número");
            int nuevoNumero = LEER.nextInt();
            suma += nuevoNumero;
        }while (suma<=limite);
        System.out.println("La suma superó el limite establecido.");
        System.out.println("Suma: " + suma);
    }
}
