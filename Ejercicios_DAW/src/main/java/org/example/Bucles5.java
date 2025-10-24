package org.example;

import java.util.Scanner;


public class Bucles5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un num.");
        int num = teclado.nextInt();
        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " * " + i + " = " + resultado);

        }

    }
}
