package Ejercicios;

import java.util.Random;

import static Ejercicios.Ejercicio20.mostrarMatriz;

public class Ejercicio21 {
    /*
    21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
    que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
    menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
    columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
     */
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int[][] subMatriz = new int[3][3];

        llenarMatriz(matriz);
        llenarMatriz(subMatriz);
        mostrarMatriz(matriz);
        System.out.println("--------------------------------");
        mostrarMatriz(subMatriz);
        if(buscarCoincidencias(matriz,subMatriz)){
            System.out.println("La submatriz se encuentra en la matriz:)");
        }else{
            System.out.println("No se encuentra en la matriz");
        }

    }

    public static void llenarMatriz(int[][] matriz){
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                Random num = new Random();
                matriz[i][j] = num.nextInt(2);
            }
        }
    }

    public static boolean buscarCoincidencias(int[][] matriz1, int[][] matriz2) {
        boolean coincident;
        for (int i = 0; i < matriz1.length - 3; i++) {
            for (int j = 0; j < matriz1[i].length - 3; j++) {
                coincident = true;

                for (int x = 0; x < matriz2.length; x++) {
                    for (int y = 0; y < matriz2[x].length; y++) {
                        if (matriz1[i + x][j + y] != matriz2[x][y]) {
                            coincident = false;
//                            System.out.println("La primera posición se encuentra en ["+(i+x)+","+(j+y)+"]");
                            break;
                        }else if(matriz1[i + x][j + y] == matriz2[x][y]){
                        }
                    }
                    if (!coincident) {
                        break;
                    }
                }
                if (coincident) {
                    return true;
                }
            }
        }
        return false;
    }

}
