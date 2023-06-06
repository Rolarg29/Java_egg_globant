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
public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Ejercicio 4
        String nombre = "Rolando";
        int edad = 21;
        System.out.println(nombre);     
        System.out.println(edad);
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre2 = leer.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad2 = leer.nextInt();
        
        System.out.println("Usted se llama "+nombre2+" y tiene "+edad2+" años");
        
    }
}
