package org.example;

import  java.util.Scanner;
public class Ejercicio_Bucles {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = teclado.nextInt();

        for ( num = -100; num < 1; num++) {
            System.out.println("hola");


        }


        String cadena = teclado.next();

        int tamanyo = cadena.length();

        for (int i = tamanyo -1; i < 0; i++) {

            System.out.print(cadena.charAt(i));

        }

    }
}
