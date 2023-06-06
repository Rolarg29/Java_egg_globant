package Ejercicios;

import java.util.Scanner;

public class Ejercicio13SinMatriz {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del cuadrado");
        int lados = leer.nextInt();
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if(i==0||i==lados-1||j == lados-1||j== 0) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");}
                }
            System.out.println();
        }
    }
}
