package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();

        System.out.println("El doble es: " + numero*2);
        System.out.println("El triple es: " + numero*3);
        System.out.println("La raíz cuadrada es: " + Math.sqrt(numero));
    }
}
