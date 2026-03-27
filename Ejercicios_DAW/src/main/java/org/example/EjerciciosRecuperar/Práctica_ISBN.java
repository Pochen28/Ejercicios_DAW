package org.example.EjerciciosRecuperar;

import java.util.Scanner;

public class Práctica_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        final double MULTIPLO = 11;

        System.out.println("****VALIDAR ISBN****");

        System.out.println("---------------------");

        System.out.println("[1] - Validar ISBN");
        System.out.println("[2] - Reparar ISBN");
        System.out.println("[X] - SALIR");

        System.out.println("---------------------");

        System.out.print("Elige una opcion: ");
        String opcion = teclado.nextLine();


        switch (opcion) {
            case "1":
                System.out.print("Introduce el ISBN a validar: ");
                String isbn = teclado.nextLine();

                if (isbn.length() != 10) {
                    System.err.println("Error: El ISBN debe tener 10 caracteres.");
                    return;
                }

                // Comprobar si hay una X mal puesta
                int posicionX = isbn.indexOf('X');
                if (posicionX != -1 && posicionX != 9) {
                    System.err.println("Error: La X solo puede estar al final.");
                    return;
                }

                int suma = 0;
                int factor = 10;

                for (int i = 0; i < 10; i++) {
                    char caracter = isbn.charAt(i);
                    int valor;

                    if (caracter == 'X' && i == 9) {
                        valor = 10;
                    } else if (caracter >= '0' && caracter <= '9') {
                        valor = caracter - '0';
                    } else {
                        System.err.println("Error: Caracter no válido.");
                        return;
                    }

                    suma += valor * factor;
                    factor--;
                }

                if (suma % MULTIPLO == 0) {
                    System.out.println("El ISBN es válido");
                } else {
                    System.err.println("El ISBN no es válido");
                }
                break;

            case "2":
                System.out.println("Introduce el ISBN a reparar");
                String ISBN_reparar = teclado.nextLine();

                if (ISBN_reparar.length() != 10) {
                    System.err.println("Error: El ISBN debe tener 10 caracteres.");
                    return;
                }

                // Comprobar signos en el ISBN
                int antes_Interrogacion = ISBN_reparar.indexOf('?');
                if (antes_Interrogacion <= 0) {
                    System.err.println("Error: No hay ningún signo en el ISBN.");
                    return;
                }

                // Comprobar si hay una X mal puesta
                int posicionX2 = ISBN_reparar.indexOf('X');
                if (posicionX2 != -1 && posicionX2 != 9) {
                    System.err.println("Error: La 'X' solo puede estar en la última posición.");
                    return;
                }

                boolean encontrado;
                String reemplazo = "";

                for (int i = 0; i <= 10; i++) {
                    if (i == 10) {
                        reemplazo = "X";
                    } else {
                        reemplazo = Integer.toString(i);
                    }


                    String isbnPrueba = ISBN_reparar.substring(0, antes_Interrogacion) + reemplazo + ISBN_reparar.substring(antes_Interrogacion + 1);

                    int suma2 = 0;
                    int factor2 = 10;
                    boolean valido = true;
                    int valor = 0;

                    for (int j = 0; j < 10; j++) {
                        char caracter = isbnPrueba.charAt(j);

                        if (caracter == 'X' && j == 9) {
                            valor = 10;
                        } else if (caracter >= '0' && caracter <= '9') {
                            valor = caracter - '0';
                        }


                        suma2 += valor * factor2;
                        factor2--;
                    }

                    if (valido && suma2 % MULTIPLO == 0) {
                        System.out.println("El digito que falta es " + reemplazo);
                    }
                }

            case "x":
            case "X":
                System.out.println("HASTA LUEGO :/");
                break;

            default:
                System.err.println("Solo puedes poner opciones válidas.");
        }
    }
}