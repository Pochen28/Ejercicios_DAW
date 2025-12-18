package org.example.VectoresAdelante;

import java.util.Random;
import java.util.Scanner;

public class ElVerdugo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int posicion = 0;
        String letra = "";
        String palabra_elegida = "";
        String palabra [] = {"leotardo" , "cuantificador" , "catalogo" , "sobrepeso" , "ordenador"};
        palabra_elegida = palabra[aleatorio.nextInt(palabra.length)];


        System.out.println("Bienvenido al juego del ahoracado \nIntroduce una letra:");




        System.out.println(palabra_elegida);

        for (int i = 0; i < palabra_elegida.length(); i++) {
            System.out.print("_");
        }
        System.out.println("");
        for (int i = 0; i <=7; i++) {
            letra = teclado.next();
            posicion = palabra_elegida.indexOf(letra);
            if (posicion >=0){
                for (int j = 0; j < palabra_elegida.length(); j++) {
                    if (letra.charAt(0) == palabra_elegida.charAt(j)) {
                        System.out.println("La letra se encuentra en la posicion " + (j + 1));

                    }
                }

            }else {
                System.out.println("La letra no está en la palabra");
            }
        }
    }
}
