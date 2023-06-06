package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese 2 números:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma es: "+ suma);
    }
}
