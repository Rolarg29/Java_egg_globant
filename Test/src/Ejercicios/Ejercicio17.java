package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    /*
        17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).
     */

    static  Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];

        llenadoAleatorio(vector);
        contabilizarPorDigitos(vector);

    }

    private static void llenadoAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            Random random = new Random();
            vector[i] = random.nextInt(100000);
        }
        System.out.println("Vector Listo!");
    }

    private static void contabilizarPorDigitos(int[] vector){
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i=0; i< vector.length; i++) {
            int num= vector[i];
           if (num<10){
               cont1 +=1;
           }else if(num>=10 && num<100){
               cont2+=1;
           }else if(num>=100 && num<1000){
               cont3+=1;
           }else if(num>=1000 && num<10000){
               cont4+=1;
           }else if(num>=10000 && num<100000){
               cont5+=1;
           }
        }
        System.out.println("Los números que tienen 1 dígitos son: "+cont1);
        System.out.println("Los números que tienen 2 dígitos son: "+cont2);
        System.out.println("Los números que tienen 3 dígitos son: "+cont3);
        System.out.println("Los números que tienen 4 dígitos son: "+cont4);
        System.out.println("Los números que tienen 5 dígitos son: "+cont5);
    }
}
