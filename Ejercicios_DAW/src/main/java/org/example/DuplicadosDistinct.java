package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DuplicadosDistinct {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeritos[] = {1, 2, 6, 3, 8, 6, 6, 5, 1, 3, 4, 5, 6};


        int numeritos_limpio[] = Arrays.stream(numeritos).distinct().toArray();

        System.out.println(Arrays.toString(numeritos_limpio));









        int numeros[] = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(18) + 1;
        }
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        boolean comprobar = true;
        int contador = 0;
        while (comprobar) {
            for (int i = 0; i < numeros.length; i++) {
                comprobar = false;
                if (i != numeros.length - 1 && numeros[i] == numeros[i + 1]) {
                    System.out.println("Duplicado " + numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(50) + 1;
                    Arrays.sort(numeros);
                    contador +=1;
                    comprobar = true;
                }
            }
        }
        System.out.println(contador);

    }
}
