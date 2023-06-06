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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        boolean integradorAprobado;
        double calificacion;
        char inicial;
        
        
        System.out.println("Usted aprobó el examen intgrador de Pseint?");
        System.out.print("Indique verdadero o falso: ");
        integradorAprobado = leer.nextBoolean();
        
        System.out.print("Escriba la calificación que obtuvo: ");
        calificacion = leer.nextInt();
        
        System.out.print("Escriba la inicial de su nombre: ");
        inicial = leer.next().charAt(0);
    }
         public static Scanner leer = new Scanner(System.in);
}
