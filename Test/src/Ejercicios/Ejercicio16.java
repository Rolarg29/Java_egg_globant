package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    /*
    16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
    al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del vector:");
        int N = leer.nextInt();
        int[] vector = new int[N];

        llenadoAleatorio(vector);
        System.out.println("Ingrese el número que desee buscar en el vector:");
        int numBuscado = leer.nextInt();
        buscarNumero(vector, numBuscado);
    }


    private static void llenadoAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            Random random = new Random();
            vector[i] = random.nextInt(10);
        }
        System.out.println("Vector Listo!");
    }
    private static void buscarNumero(int[] vector, int num){
        int contadorDuplicados=0;
        int posicion=vector.length;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==num){
                if (posicion==vector.length){
                    posicion=i;
                }
                contadorDuplicados+=1;
            }
        }
        if (posicion!=vector.length){
            System.out.println("El número se encuentra en la posición: "+posicion);
            if(contadorDuplicados>1){
                System.out.println("Aparece "+contadorDuplicados+" veces.");
            }else{
                System.out.println("Solo aparece 1 vez.");
            }
        }else {
            System.out.println("El número no se encuentra en el vector.");
        }

    }

}
