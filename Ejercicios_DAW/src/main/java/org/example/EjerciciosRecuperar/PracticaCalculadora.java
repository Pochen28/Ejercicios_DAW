package org.example.EjerciciosRecuperar;

import java.util.Scanner;


public class PracticaCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir;
        double num1 = 0;
        double num2 = 0;

        System.out.println("BIENVENIDO A CALCULATOR");
        do {
            System.out.println("Introduce un número:");

            if (teclado.hasNextDouble()) {
                num1 = teclado.nextDouble();
                repetir = true;

            } else {
                System.out.println("ERROR, sólo se aceptan números.");
                repetir = false;
                teclado.nextLine();
            }
        } while (!repetir);

        do {
            System.out.println("Elige una operación: ");
            System.out.println(" 1.(+) \n 2.(-) \n 3.(X) \n 4.(/) \n 5.(R) ");
            System.out.println("--------");
            String signo = teclado.next().toUpperCase();
            char verificar = signo.charAt(0);


            if (verificar == '+' || verificar == '-' || verificar == '/' || verificar == 'X' || verificar == 'R') {
                if (signo.length() == 1) {

                    boolean iguales = signo.equals("R");
                    repetir = true;
                    if (iguales) {
                        if (num1 > 0) {
                            System.out.println("Haremos la raíz del número");
                            double raiz = Math.sqrt(num1);
                            System.out.println("RESULTADO = " + raiz);
                        } else {
                            System.out.println("ERROR, no existen las raíces cuadradas para los números negativos.");
                        }

                    } else {

                        do {
                            System.out.println("Introduce otro número para poder operarlo con el primero:");
                            if (teclado.hasNextDouble()) {
                                num2 = teclado.nextDouble();
                                repetir = true;
                            } else {
                                System.out.println("Error, sólo se aceptan números.");
                                repetir = false;
                                teclado.nextLine();
                            }
                        } while (!repetir);


                        switch (signo) {
                            case "+":
                                System.out.println("Comencemos a sumar.");
                                double suma = num1 + num2;
                                System.out.println("RESULTADO = " + suma);
                                break;

                            case "-":
                                System.out.println("Comencemos a restar.");
                                double resta = num1 - num2;
                                System.out.println("RESULTADO = " + resta);
                                break;

                            case "X":
                                System.out.println("Comencemos a multiplicar.");
                                double multiplicacion = num1 * num2;
                                System.out.println("RESULTADO = " + multiplicacion);
                                break;

                            case "/":
                                if (num2 == 0) {
                                    System.out.println("Error, no se pueden dividir números entre cero.");
                                } else {
                                    System.out.println("Comencemos a dividir. ");
                                    double division = num1 / num2;
                                    System.out.println("RESULTADO = " + division);
                                    break;
                                }


                        }
                    }
                } else {
                    System.out.println("ERROR, debes introducir el signo para llevar a cabo la operación.");
                    repetir = false;
                    teclado.nextLine();
                }


            } else {
                System.out.println("ERROR, debes introducir únicamente los símbolos indicados.");
                repetir = false;
                teclado.nextLine();

            }

        }while (!repetir);
    }
}







