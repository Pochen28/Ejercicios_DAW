package org.example;

import java.util.Scanner;


public class PracticaCalculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = true;
        boolean repetir2 = true;
        boolean repetir3 = true;
        double num1 = 0;
        double num2 = 0;

        System.out.println("BIENVENIDO A CALCULATOR");
        // Bucle para asegurarse de que el primer valor introducido sea un número válido
        do {
            System.out.println("Introduce un número:");

            if (teclado.hasNextDouble()) { // Comprueba si el valor introducido es numérico
                num1 = teclado.nextDouble();
                repetir = true;
            } else {
                System.out.println("ERROR, sólo se aceptan números.");
                repetir = false;
                teclado.nextLine();
            }

        } while (repetir == false);


        do {
            System.out.println("Elige una operación: ");

<<<<<<< HEAD
            System.out.println(" 1.(+) \n 2.(-) \n 3.(X) \n 4.(/) \n 5.(R) ");

            System.out.println(" 1.(+) \n 2.(-) \n 3.(x) \n 4.(/) \n 5.(R) ");
=======



            System.out.println(" 1.(+) \n 2.(-) \n 3.(x) \n 4.(/) \n 5.(R) ");


            System.out.println(" 1.(+) \n 2.(-) \n 3.(X) \n 4.(/) \n 5.(R) ");



>>>>>>> ee66348105c6e504d4d20d21db7121041c8dcac9
            System.out.println("--------");
            String signo = teclado.next();
            String signo_mayus = signo.toUpperCase();
            char verificar = signo_mayus.charAt(0);
<<<<<<< HEAD

            if (verificar == '+' || verificar == '-' || verificar == '/' || verificar == 'X' || verificar == 'R') { // Comprueba que el símbolo esté entre los permitidos

                if (verificar == '+' || verificar == '-' || verificar == '/' || verificar == 'x' || verificar == 'R') { // Comprueba que el símbolo esté entre los permitidos
                    if (signo_mayus.length() == 1) {

=======








                if (verificar == '+' || verificar == '-' || verificar == '/' || verificar == 'X' || verificar == 'R') { // Comprueba que el símbolo esté entre los permitidos

                    if (signo_mayus.length() == 1) {

>>>>>>> ee66348105c6e504d4d20d21db7121041c8dcac9
                        boolean iguales = signo_mayus.equals("R");
                        repetir3 = true;
                        if (iguales) {
                            if (num1 > 0) { // Control para no hacer raíz cuadrada de negativos
                                System.out.println("Haremos la raíz del número");
                                double raiz = Math.sqrt(num1);
                                System.out.println("RESULTADO = " + raiz);
                            } else {
                                System.out.println("ERROR, no existen las raíces cuadradas para los números negativos.");
                            }

                        } else {
                            // Si no es raíz, pido el segundo número
                            do {
                                System.out.println("Introduce otro número para poder operarlo con el primero:");
                                if (teclado.hasNextDouble()) {
                                    num2 = teclado.nextDouble();
                                    repetir2 = true;
                                } else {
                                    System.out.println("Error, sólo se aceptan números.");
                                    repetir2 = false;
                                    teclado.nextLine();
                                }
                            } while (repetir2 = false);


                            switch (signo_mayus) { // Introduzco un switch para realizar la operación seleccionada
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

                                case "x":
                                    System.out.println("Comencemos a multiplicar.");
                                    double multiplicacion = num1 * num2;
                                    System.out.println("RESULTADO = " + multiplicacion);
                                    break;

                                case "/":


                                    if (num2 == 0) { // Control para evitar la división entre cero
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
                        repetir3 = false;
                        teclado.nextLine();
                    }


                } else {
                    System.out.println("ERROR, debes introducir únicamente los símbolos indicados.");
                    repetir3 = false;
                    teclado.nextLine();
                }

<<<<<<< HEAD
            }

        } while (repetir3 == false) ; // Repite mientras haya un error con el signo
    }

}
=======


        } while (repetir3 = false);

    }

}

>>>>>>> ee66348105c6e504d4d20d21db7121041c8dcac9
