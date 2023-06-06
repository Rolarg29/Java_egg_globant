package Ejercicios;

import static Ejercicios.Ejercicio1.leer;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
