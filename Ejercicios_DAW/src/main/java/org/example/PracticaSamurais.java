package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticaSamurais {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int id_samurai [] = new int [7];
        int contador1 = 0;
        boolean repetir = true;

        String potencia = "";

        System.out.println("BATALLA DE SAMURÁIS");

        do {

            System.out.println("EQUIPO 1");
            System.out.println("Introduce la poencia de tus samuráis (dividida entre espacios y potencia máxima = 24)");
            potencia  = teclado.nextLine();
            System.out.println(potencia.length());


            if (potencia.length() == 13){
                repetir = true;


            }else {
                System.out.println("Error, introduce únicamnete 7 números.");
                repetir = false;
            }

        }while (repetir == false);

        System.out.println(potencia);
        String potencia_individual [] = potencia.split(" ");
        System.out.println(Arrays.toString(potencia_individual));
        for (int i = 0; i < potencia_individual.length; i++) {
            contador1 += Integer.parseInt(potencia_individual[i]);
        }
        System.out.println(contador1);





    }
}
