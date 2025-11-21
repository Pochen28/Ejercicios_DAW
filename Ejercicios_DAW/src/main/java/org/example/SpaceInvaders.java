package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceInvaders {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de filas");
        int filas = teclado.nextInt();
        
        String matriz [] [] = new String[filas][3];

        for (int i = 0; i < matriz.length; i++) {
            String fila [] = teclado.next().split("");

            if (fila.length == matriz [i].length){
                for (int j = 0; j < matriz[i].length; j++) {

                }
            }else {
                System.out.println("La entrada no tiene 3 elementos");
                i--;
            }
            
        }
        for (String fila [] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        for (int i = 0; i < matriz [0].length; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                System.out.println(matriz[i] [j]);
            }


        }
    }
}
