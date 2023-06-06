/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author roliz
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        int contador = 1;
        long suma = 0;
        
        do{
            System.out.println("Ingrese el numero "+contador+" de 20");
            num = leer.nextInt();
            if(num>0){
               suma += num; 
            } else if (num==0){
                break;
            }           
            contador++;
            System.out.println("subtotal: "+suma);
        } while(contador<=20);
        
        System.out.println("La suma de los números es: " + suma + ", de los " +contador+ " números que ingresaste");
    }
    
}
