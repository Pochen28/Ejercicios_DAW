package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LaFiestaAburrida {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int rnd = 0;
        int num_gente = teclado.nextInt();
        System.out.println("¿Cuántas personas no conoces?");
        String nombres [] = {"Ivan", "Manuela" , "Moi" , "Paula" , "ALex"} ;

        for (int i = 0; i < num_gente; i++) {
            rnd = 0;
            rnd =  aleatorio.nextInt(num_gente)+1;
            System.out.println("Soy " + nombres[rnd]);

        }


    }
}
