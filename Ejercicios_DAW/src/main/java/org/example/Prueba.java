package org.example;

import java.util.Arrays;

public class Prueba {
    static void main() {
        int aux;
        int vector[] = {4, 7, 3,5, 9, 8};
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length -i -1; j++) {
                if (vector[j] > vector[j+1]){
                    aux= vector[j];
                    vector[j] = vector [j+1];
                    vector[j+1] = aux;
                }

            }

        }
        System.out.println(Arrays.toString(vector));
    }
}
