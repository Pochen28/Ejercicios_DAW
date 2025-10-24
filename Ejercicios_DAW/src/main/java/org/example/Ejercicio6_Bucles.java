package org.example;

import java.util.Scanner;

public class Ejercicio6_Bucles {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int factorial = 1;
        for (int i = N; i > 0; i--) {
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
