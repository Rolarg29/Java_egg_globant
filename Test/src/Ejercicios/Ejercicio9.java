package Ejercicios;

import static Ejercicios.Ejercicio1.leer;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase o palabra que empiece con A");
        String frase = leer.nextLine();
        String primeraLetra = frase.substring(0,1);

        if (primeraLetra.equalsIgnoreCase("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
