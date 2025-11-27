package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicoBingo {
    static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int carton [] [] = new int [3] [3];

        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton [i].length; j++) {
                carton [i] [j] = aleatorio.nextInt(0,90)+1;
            }
        }
        for (int filas [] : carton){
            for (int columnas  : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }
    }
}
