package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = leer.nextInt();

        if (numero%2==0){
            System.out.println("El número '"+numero+"' es PAR");
        }else{
            System.out.println("El número '"+numero+"' es IMPAR");
        }
    }
}
