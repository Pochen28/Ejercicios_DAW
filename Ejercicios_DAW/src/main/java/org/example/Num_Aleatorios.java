package org.example;

import java.util.Random;
import java.util.Scanner;

public class Num_Aleatorios {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int sacar_num = 0;

        System.out.println("Define el rango de los números");
        System.out.println("El primer número, va desde: ");
        int num1 = teclado.nextInt();
        System.out.println("Escribe el segundo número, va hasta");
        int num2 = teclado.nextInt();

        System.out.println("¿Cuántos números quieres generar dentro del rango?");
        int cant = teclado.nextInt();

        for (int i = 0; i < cant; i++) {

            if (num1 < num2){
                sacar_num = aleatorio.nextInt(num1, num2) +1;
                System.out.println(sacar_num);
            }else {
                System.out.println("Pro");
            }


        }
    }
}
