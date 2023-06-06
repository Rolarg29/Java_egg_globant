package Ejercicios;

public class Ejercicio19 {
    /*
    19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
    una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
    de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        boolean esAntiSimetrica = true;

        int[][] matrizA = {
                {0, -2, 4},
                {2, 0, 2},
                {-4, -2, 0}
        };

        for(int i = 0; i <3;i++) {
            for(int j = 0; j <3;j++) {
                if(-matrizA[j][i] != matrizA[i][j]) {
                    esAntiSimetrica=false;
                    break;
                }
            }
        }

        if(esAntiSimetrica){
            System.out.println("La Matriz A es Anti simétrica :)");
        }else{
            System.out.println("La Matriz A NO es Anti simétrica :(");
        }
    }
}
