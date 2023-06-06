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
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if(EsMultiplo(num1,num2)){
            System.out.println("El primer número SI es múltiplo del segundo :)");
        } else{
            System.out.println("El primer número NO es múltiplo del segundo :(");
        }
        
    }
    
    public static boolean EsMultiplo(int n1, int n2){
        return n1 % n2 == 0;
    }
    
}
