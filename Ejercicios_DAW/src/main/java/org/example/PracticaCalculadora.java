package org.example;

import java.util.Scanner;

public class PracticaCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("BIENVENIDO");




        System.out.println("Introduce un número:");
        int num1 = teclado.nextInt();
        System.out.println("Elige una operación: ");
        System.out.println(" 1.(+) \n 2.(-) \n 3.(x) \n 4.(/) \n 5.(R) ");
        String signo = teclado.next();
        System.out.println("Introduce otro número para poder sumarlo con el primero:");
        double num2 = teclado.nextDouble();


        switch ( signo){
            case "+":
                System.out.println("Comencemos a sumar.");
                double suma = num1 + num2;
                System.out.println(suma);


            case "-":
                System.out.println("Comencemos a restar.");
                double resta = num1 - num2;
                System.out.println(resta);
            case "/":
                System.out.println( "" );

        }



    }
}
