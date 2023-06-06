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
public class Ejercicio8 {
    public static void main(String[] args) {
        
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = leer.nextInt();
        
        while(nota > 10 || nota < 0){
            System.out.println("La nota no es válida, ingresela nuevamente");
            nota = leer.nextInt();
        }
        System.out.println("Excelente! la nota está entre 0 y 10");
    }
    
}
