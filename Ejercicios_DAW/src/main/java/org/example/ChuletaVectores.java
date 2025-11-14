package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChuletaVectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int pos = 0;

            int vector [] = {7, 5, 10, 2, 1};
            int vector_copia [] = vector.clone();

            //Arrays.sort(vector_copia, Collections.reverseOrder());
            //System.out.println(Arrays.toString(vector_copia));

            Integer posicion = Arrays.binarySearch(vector_copia, 10);
            System.out.println(posicion);


    }
}
