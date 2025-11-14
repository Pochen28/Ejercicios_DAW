package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticaPrimitiva {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean formato;
        String numeros = "";
        int ganador_primitiva [] = new int [6];
        for (int i = 0; i < ganador_primitiva.length; i++) {
            ganador_primitiva[i] = aleatorio.nextInt(0,50);
        }

        System.out.println("--La Primitiva--");

        do {
            System.out.println("Introduce 6 números entre el 1 y el 49 para la primitiva, y por último el reintegro, siguiendo el siguiente formato: N-N-N-N-N-N/R");

            numeros = teclado.nextLine();
            formato = numeros.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");
            if (!formato){
                System.out.println("Introduce correctamente el formato");
            }

        }while (formato == false);

        String vector_nums [] = numeros.split(numeros);



        System.out.println("Introduce el reintegro, un número del 0 al 9");
    }
}
