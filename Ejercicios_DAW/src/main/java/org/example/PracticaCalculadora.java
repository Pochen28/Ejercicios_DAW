package org.example;

import javax.xml.stream.util.XMLEventAllocator;
import java.util.Scanner;

public class PracticaCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = true;
        boolean repetir2 = true;
        double num1 = 0;
        double num2 = 0;
        System.out.println("BIENVENIDO");
        do {
            System.out.println("Introduce un número:");


            if (teclado.hasNextDouble()){
                num1 = teclado.nextDouble();
                repetir = true;
            }else {
                System.out.println("ERROR, sólo se aceptan números.");
                repetir = false;
                teclado.nextLine();
            }

        }while (repetir == false);

        System.out.println("Elige una operación: ");
        System.out.println(" 1.(+) \n 2.(-) \n 3.(x) \n 4.(/) \n 5.(R) ");
        String signo = teclado.next();

        String signo_mayus = signo.toUpperCase();
        boolean iguales = signo_mayus.equals("R");

        if (signo.length()== 1);
             System.out.println("hola");


        if (iguales){
            if (num1 > 0){
                System.out.println("Haremos la raíz del número");
                double raiz = Math.sqrt(num1);
                System.out.println(raiz);
            }else {
                System.out.println("ERROR, no existen las raíces cuadradas para los números negativos.");
            }

        }else {
            do {
                System.out.println("Introduce otro número para poder operarlo con el primero:");
                if (teclado.hasNextDouble()){
                    num2 = teclado.nextDouble();
                    repetir2 = true;
                }else {
                    System.out.println("Error, sólo se aceptan números.");
                    repetir2 = false;
                    teclado.nextLine();
                }
            }while (repetir2 = false);



            switch ( signo){
                case "+":
                    System.out.println("Comencemos a sumar.");
                    double suma = num1 + num2;
                    System.out.println(suma);
                    break;


                case "-":
                    System.out.println("Comencemos a restar.");
                    double resta = num1 - num2;
                    System.out.println(resta);
                    break;

                case "x":
                    System.out.println("Comencmos a multiplicar.");
                    double multiplicacion = num1 * num2;
                    System.out.println(multiplicacion);
                    break;
                case "/":
                    System.out.println("Comencemos a dividir. ");

                    if (num2 == 0){
                        System.out.println("Error, no se pueden dividir números entre cero.");
                    }else {
                        double division = num1 / num2;
                        System.out.println(division);
                        break;
                    }




            }
        }
    }
}


