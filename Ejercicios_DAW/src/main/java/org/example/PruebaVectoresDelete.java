package org.example;

import java.util.Arrays;

public class PruebaVectoresDelete {
    static void main() {
        int vector[] = {3,5,4,1};
        int matriz[][] = new int[2][4];

        for (int i = 0; i < matriz[0].length; i++) {
            matriz[0][i] = vector[i];
        }
        System.out.println(Arrays.deepToString(matriz));

        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }


        for (int[] files : matriz) {
            for (int columns : files){
                System.out.print(columns + " ");
            }
            System.out.print("\n");
        }
    }
}
