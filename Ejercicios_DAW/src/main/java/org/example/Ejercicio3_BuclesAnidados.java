package org.example;

import java.util.Scanner;

public class Ejercicio3_BuclesAnidados {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int maximo = teclado.nextInt();
        tabla:
        for (int i = 0; i < 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
                if (i*j>maximo){
                    break tabla;
                }
            }
        }
    }
}
