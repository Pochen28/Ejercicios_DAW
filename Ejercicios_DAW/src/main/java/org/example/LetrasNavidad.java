package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class LetrasNavidad {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = teclado.next();
        System.out.print("Cantidad de letras: ");
        String letras = teclado.next();

        String palabra_vector [] = palabra.split("");
        String letras_vector [] = letras.split("-");

        System.out.println(Arrays.toString(palabra_vector));
        System.out.println(Arrays.toString(letras_vector));

        if (palabra_vector.length == letras_vector.length){
            for (int i = 0; i < palabra_vector.length; i++) {

                for (int j = 0; j < Integer.parseInt(letras_vector[i]) ; j++) {
                    System.out.print(palabra_vector[i]);

                }

            }

        }else {

        }
    }
}
