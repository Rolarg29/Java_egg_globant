package test;

import java.util.Scanner;

/**
 *
 * @author roliz
 */
public class Ejercicio13y14 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca los miembros de su equipo");
        String[] equipo = new String[5];

        for (int i = 0; i < equipo.length; i++){
            System.out.println("Introduzca el nombre:");
            equipo[i] = leer.nextLine();
        }
        for (String s : equipo) {
            System.out.println(s);
        }

    }

}
