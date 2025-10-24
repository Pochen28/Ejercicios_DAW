package org.example;

import java.util.Scanner;

public class Ejercicio2_Bucles {
    static void main() {


        int a, b , c , d;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b= 0;
        c= 1;
        while (a!=0){
            b++;
            c = c * a/ b;
            a = teclado.nextInt();
        }

        d = b + c;
        System.out.println(d);
    }

}
