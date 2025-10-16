package org.example;

import java.util.Scanner;

public class Ejercicio3_T2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número...");
        int numero = teclado.nextInt();
        System.out.println("Introduce las cifras que quieras eliminar");
        int cifras = teclado.nextInt();

        String numero_string = Integer.toString(numero);
        int tamanyo = numero_string.length();

        int nuevo_tamanyo = tamanyo - cifras;

        String numero_cortado = numero_string.substring(0, nuevo_tamanyo);
        System.out.println(numero_cortado);



    }
}
