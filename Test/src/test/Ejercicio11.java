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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        do{
            System.out.println("Ingrese una palabra");
            palabra = leer.nextLine();
        } while(!palabra.endsWith("."));
        codificar(palabra);
    }
    
    public static void codificar(String palabra){
        String nuevaPalabra = "";
        for (int i = 0; i < palabra.length(); i++) {
            String letra = palabra.substring(i,i+1);
            switch(letra.toLowerCase()){
                case "a":
                    nuevaPalabra=nuevaPalabra.concat("@");
                    break;
                case "e":
                    nuevaPalabra=nuevaPalabra.concat("#");
                    break;
                case "i":
                    nuevaPalabra=nuevaPalabra.concat("$");
                    break;
                case "o":
                    nuevaPalabra=nuevaPalabra.concat("%");
                    break;
                case "u":
                    nuevaPalabra=nuevaPalabra.concat("*");
                    break;
                default:
                    nuevaPalabra=nuevaPalabra.concat(letra);
                    break; 
            }
        }        
        System.out.println(nuevaPalabra);
    }
    
    
    
}
