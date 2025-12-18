package org.example.VectoresAdelante;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4_Vectores {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int vector [] = {3,4,5,4,9};

        int nuevo[] = new int [vector.length-1];

        int posicion_borrar = 3;

        for (int i = 0; i < nuevo.length ; i ++) {

            if (i>= posicion_borrar) {
                nuevo [i] = vector [i + 1];

            }else {
                nuevo [i] = vector [i];

            }

        }
        System.out.println(Arrays.toString(nuevo));








    }
}
