package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VectoresEjercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int original [] = {1, 2, 3, 4, 5};
        int aux = 0;

        for (int i = 0; i < original.length; i++) {

            aux = original[i];
            original[i] = original[original.length-1];
            original[original.length-1 -i] = aux;
            System.out.println(Arrays.toString(original));



        }
    }
}
