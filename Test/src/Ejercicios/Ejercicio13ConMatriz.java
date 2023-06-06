package Ejercicios;

import java.util.Scanner;

public class Ejercicio13ConMatriz {
//    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//            * * * *
//            *     *
//            *     *
//            * * * *
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese el tamaño del cuadrado");
        int N = leer.nextInt();
        String[][] matrix = new String[N][N];
        llenarMatrix(matrix, N);
        mostrarMatrix(matrix, N);
    }

    private static void llenarMatrix(String[][] matrix, int N){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0 || i==N-1 || j == N-1) {
                    matrix[i][j] = "* ";
                }else{
                    matrix[i][j] = "  ";

                }
            }
        }
    }

    private static void mostrarMatrix(String[][] matrix, int N){
        for (int i =0; i<N; i++){
            for(int j=0;j<N; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
