/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static test.Ejercicio5.leer;

/**
 *
 * @author roliz
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese 2 números enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if(num1>25 && num2>25){
            System.out.println("Ambos números son mayores a 25");
        } else if(num1>25 || num2>25){
            System.out.println("Solo uno de los dos números es mayor a 25");
        } else {
            System.out.println("Ninguno es mayor a 25");
        }
                
    }
    
}
