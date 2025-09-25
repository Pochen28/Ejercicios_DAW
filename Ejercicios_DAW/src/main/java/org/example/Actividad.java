package org.example;

import java.util.Scanner;

public class Actividad {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");

        String nombre = teclado.nextLine();

        System.out.println("¿A qué curso vas?");
        String curso = teclado.next();

        System.out.println("Hola " + nombre +" bienvenido a " + curso);

        System.out.println("Introduce un número...");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número...");
        int num2 = teclado.nextInt();

        System.out.println("El resultado es " +( num1 +num2 ));

        int resultado = num1+num2;
        System.out.println("El resultado es " + resultado);
    }
}
