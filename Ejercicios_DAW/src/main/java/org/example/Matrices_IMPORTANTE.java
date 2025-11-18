package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices_IMPORTANTE {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int matriz[] [] = {{1,2,3},{4,5,6},{7,8,9}};

        int matriz2 [] [] = new int [3] [3];
        int posicion = aleatorio.nextInt(3);
        int posicion2 = aleatorio.nextInt(3);
        System.out.println(matriz[posicion] [posicion2]);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();

        }

        int vector[] = {1,2,3,4};

        for (int num : vector){
            System.out.println(num);

        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
            for (int nums : fila){
                System.out.print(nums);
            }
            System.out.println();
        }
    }
}
