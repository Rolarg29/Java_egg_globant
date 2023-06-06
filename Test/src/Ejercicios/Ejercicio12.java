package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    /*
    12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario.

    Las cadenas deben llegar con un formato fijo:
    tienen que ser de un máximo de 5 caracteres de largo,
    el primer carácter tiene que ser X
    y el último tiene que ser una O.

    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
    distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
    e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().
     */
    private static final Scanner LEER = new Scanner(System.in);

    public static void main(String[] args) {
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("[ Simulador dispositivo RS232 ]");
        System.out.println("Las cadenas que inicien en X, terminen en O y tengan una longitud de 5 caracteres se considerará CORRECTA");
        System.out.println("Para finalizar el envío de cadenas use la secuencia especial '&&&&&'");
        System.out.println("Comience...");
        String frase;
        do {
            System.out.println("Ingrese una secuencia");
            frase = LEER.nextLine();
            if (frase.length() == 5 && frase.charAt(0) == 'x' && frase.charAt(4) == 'o') {
                correctas += 1;
            } else if(!frase.equals("&&&&&")){
                incorrectas += 1;
            }
        } while (!frase.equals("&&&&&"));

        System.out.println("--------------");
        System.out.println("INFORME");
        System.out.println("--------------");
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
        System.out.println("--------------");
    }
}
