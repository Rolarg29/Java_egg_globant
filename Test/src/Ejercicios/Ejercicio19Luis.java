package Ejercicios;

public class Ejercicio19Luis {
    public static void main(String[] args) {
        int[][] matriz = {
                { 0, 1, -2 },
                {-1, 0,  3 },
                { 2, -3, 0 }
        };

/*        int[][] matriz = {
                { 3, 3, -3 },
                {5, 6,  8 },
                {-2, 7, 4 }
        };*/

        boolean esAntiSimetrica = esAntiSimetrica(matriz);

        if (esAntiSimetrica) {
            System.out.println("La matriz es anti simétrica.");
        } else {
            System.out.println("La matriz NO es anti simétrica.");
        }
    }

    public static boolean esAntiSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false; // La matriz no es cuadrada, por lo tanto no puede ser anti simétrica
        }

        int[][] traspuesta = obtenerMatrizTraspuesta(matriz);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -traspuesta[i][j]) {
                    return false; // La matriz no cumple la condición de anti simetría
                }
            }
        }

        return true; // La matriz es anti simétrica
    }

    public static int[][] obtenerMatrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}
