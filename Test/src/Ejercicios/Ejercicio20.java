package Ejercicios;

import static test.Ejercicio5.leer;

public class Ejercicio20 {

    public static void main(String[] args) {
        int[][] matriz;
        System.out.println("Seleccione la opción que desee");
        System.out.println("1. Llenar su propia matriz");
        System.out.println("2. Usar matriz mágica base");
        System.out.print("> ");
        int opcion;
        do {
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    matriz = new int[3][3];
                    llenarMatriz(matriz);
                    mostrarMatriz(matriz);
                    calcularSuma(matriz);
                    break;
                case 2:
                    matriz = usarMatrizBase();
                    mostrarMatriz(matriz);
                    calcularSuma(matriz);
                    break;
                default:
                    System.out.println("Escoja una opción válida!");
            }
        } while (opcion != 1 && opcion != 2);
    }

    public static int[][] usarMatrizBase(){
        int[][] matriz = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };
        return matriz;
    }

    public static void llenarMatriz(int[][] matriz) {
        System.out.println("Llene la matriz de 3x3");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                do {
                    matriz[i][j] = leer.nextInt();
                }while(matriz[i][j]<1 || matriz[i][j]>9);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for(int i=0; i< matriz.length; i++){
            for (int j=0; j< matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void calcularSuma(int[][] matriz){
        int sumaD=0;
        int sumaDInv=0;
        int sumaFila = 0;
        int sumaColumna = 0;
        boolean esMagica = true;

        for (int i = 0; i <matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if(i==j){
                    sumaD+= matriz[i][j];
                }
                if(j==2-i){
                    sumaDInv += matriz[i][j];
                }
            }
        }
        for(int i=0; i<matriz.length; i++){
            sumaFila=0;
            sumaColumna=0;
            for(int j=0; j<matriz[0].length; j++){
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if(sumaFila!=sumaD||sumaColumna!=sumaD){
                esMagica=false;
            }
            System.out.println("La fila "+(i+1)+" suma: "+sumaFila);
            System.out.println("La columna "+(i+1)+" suma: "+sumaColumna);
            System.out.println("Es Mágica? "+esMagica);
            System.out.println("----------------");
        }

        System.out.println("======================");
        System.out.println("La suma de cada fila es: "+sumaFila);
        System.out.println("La suma de cada columna es: "+sumaColumna);
        System.out.println("La suma de la diagonal es: "+sumaD);
        System.out.println("La suma de la diagonal invertida es: "+sumaDInv);
        if (esMagica){
            System.out.println("La matriz es mágica!");
        }else{
            System.out.println("La matriz NO es mágica.");
        }
    }
}
