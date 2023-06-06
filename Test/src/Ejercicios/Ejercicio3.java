package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase cualquiera.");
        String frase = teclado.nextLine();

        System.out.println("La frase en MAYUSCULAS: " + frase.toUpperCase());
        System.out.println("La frase en minusculas: " + frase.toLowerCase());

    }
}
