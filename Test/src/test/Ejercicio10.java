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
public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int[] num= new int[4];
        
        System.out.println("Ingrese 4 números (entre 1 y 20)");
        

        for(int i=0;i<4;i++){
            
            do{
                System.out.println("Ingrese número "+(i+1)+" de 4");
                num[i] = leer.nextInt();
            }while(num[i]<0 || num[i]>20);
        }
        
        for(int i=0;i<4;i++){
            System.out.print(num[i]+" ");
            
            for (int j = 0; j < num[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
