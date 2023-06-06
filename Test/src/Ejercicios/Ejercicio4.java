package Ejercicios;

import static Ejercicios.Ejercicio1.leer;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en grados Celsius");
        double tempCelsius= leer.nextDouble();
        convertirAFahrenheit(tempCelsius);

    }

    public static void convertirAFahrenheit(double celsius){
        double tempFahrenheit = 32 + (9 * celsius /5);
        System.out.println("La temperatura en grados Fahrenheit es "+tempFahrenheit);
    }
}
