package org.example.EjerciciosRecuperar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BatallaDeSamurais {
    static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int samurai_aleatorio;
        boolean repetir;
        String [] potencias1;
        String [] potencias2;
        int suma_potencias;
        System.out.println("Equipo 1");
        do {
            suma_potencias = 0;
            System.out.println("Introduce la potencia de los samuráis:");
            String potencia1 = teclado.nextLine();
            potencias1 = potencia1.split(" ");
            System.out.println(Arrays.toString(potencias1));
            for (String suma : potencias1) {
                suma_potencias += Integer.parseInt(suma);
            }
            repetir = true;
            if (suma_potencias != 30){
                System.out.println("Error. La potencia total no suma 30. ");
                repetir = false;
            }
            if (potencias1.length != 7){
                System.out.println("Error, debes de introducir la potencia de los 7 samuráis.");
                repetir = false;
            }

        }while (!repetir);
        System.out.println("Equipo completado.");
        System.out.println("Equipo 2");
        do {
            suma_potencias = 0;
            System.out.println("Introduce la potencia de los samuráis:");
            String potencia2 = teclado.nextLine();
            potencias2 = potencia2.split(" ");
            System.out.println(Arrays.toString(potencias2));
            for (String suma : potencias2) {
                suma_potencias += Integer.parseInt(suma);
            }
            repetir = true;
            if (suma_potencias != 30){
                System.out.println("Error. La potencia total no suma 30. ");
                repetir = false;
            }
            if (potencias2.length != 7){
                System.out.println("Error, debes de introducir la potencia de los 7 samuráis.");
                repetir = false;
            }

        }while (!repetir);
        System.out.println("Equipo completado.");
        boolean [] usados = new boolean [7];
        boolean primero = true;
        int muertos1 = 0;
        int muertos2 = 0;

        System.out.println("¡Empieza la batalla!");

        for (int i = 0; i < 7; i++) {
            
            do {
                samurai_aleatorio = aleatorio.nextInt(potencias1.length);
            }while (usados [samurai_aleatorio]); // esta parte me ayudé con IA pero patri te juro que entiendo como funciona eso de jugar con el verdadero y falso de la posicion dentro del vector booleano :)

            usados [samurai_aleatorio] = true;

            if (primero){
                System.out.println("La batalla inicia con el Samurai " + (samurai_aleatorio) +1);
            }

            int valor1 = Integer.parseInt(potencias1[samurai_aleatorio]);
            int valor2 = Integer.parseInt(potencias2[samurai_aleatorio]);

            if (valor1 > valor2){
                System.out.println( "Samurai " + (samurai_aleatorio +1) + ". Gana el equipo 1. " + potencias1[samurai_aleatorio] + " vs " + potencias2[samurai_aleatorio]);
                muertos2++;
            }else if (valor1 < valor2){
                System.out.println("Samurai " + (samurai_aleatorio +1) + ". Gana el equipo 2. " + potencias1[samurai_aleatorio] + " vs " + potencias2[samurai_aleatorio]);
                muertos1++;
            }else {
                System.out.println("Empate");
                muertos1++;
                muertos2++;
            }
            if (muertos1 >= 4 && muertos2 >= 4 ){
                System.out.println("EMPATE TÉCNICO, han muerto más de la mitad de samuráis de ambos equipos. Fin de la partida.");
                return;
            } else if (muertos1 >= 4){
                System.out.println("¡¡¡VICTORIA PARA EL EQUIPO 2!!!");
                return;
            } else if (muertos2 >= 4){
                System.out.println("¡¡¡VICTORIA PARA EL EQUIPO 1!!!");
                return;
            }
            primero = false;
        }






    }
}
