package org.example;

import java.util.Arrays;

public class DuplicadosArray {
    static void main() {

        int vector[] = {3, 6, 2, 7, 2, 4};

        int aux [] = new int [vector.length];
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]!=vector[i-1]){
                aux[i] = vector[i];
                cont++;
            }

        }
        System.out.println(Arrays.toString(vector));
    }

}


