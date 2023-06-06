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
public class Ejercicio7 {
    public static void main(String[] args) {
        
        System.out.println("Ingrese un número del 1 al 4 para indicar el tipo de motor");
        int motor = leer.nextInt();
        
        switch(motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para este tipo de bomba");
        }     
    }
}
