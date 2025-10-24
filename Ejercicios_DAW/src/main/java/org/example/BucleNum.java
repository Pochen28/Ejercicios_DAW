package org.example;
import  java.util.Scanner;
public class BucleNum {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        System.out.println("¿Cuántos números quieres sumar?");
        int veces = teclado.nextInt();


        for (int i = 1; i <= veces; i++) {
            System.out.println("Introduce un número: ");
            int num = teclado.nextInt();
            contador += num;
            System.out.println("La suma acumulada es: " + contador);
        }
    }
}
