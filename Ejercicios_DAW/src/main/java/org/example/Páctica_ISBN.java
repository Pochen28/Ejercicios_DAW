package org.example;

import java.util.Scanner;

public class Páctica_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al comprobador de ISBN");
        System.out.println("Introduce el ISBN");
        String isbn = teclado.next();
        String isbn_mayus = isbn.toUpperCase();


        System.out.println("¿Qué quieres hacer con el ISBN?");
        System.out.println(" [1] Validar ISBN \n [2] Reparar ISBN \n [3] Salir");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                int suma = 0;
                System.out.println("Validemos el ISBN");

                for (int i = 0; i < 10; i++) {

                    int x = 0;
                    char posicion = isbn_mayus.charAt(i);

                    if (i == 9 && posicion == 'X') {
                        x = 10;
                        System.out.println("Hay una X");
                    } else {
                        try {
                            x = Integer.parseInt("" + posicion);


                        } catch (Exception Err) {
                            System.out.println("Error");
                            return;
                        }

                    }
                    int producto = x * (10-i);
                    suma += producto;
                    System.out.println( x + " x " + (10- i) + " = " + producto);
                }

                break;


            case 2:
                System.out.println("Vamos a reparar el ISBN.");

                break;

            case 3:


                break;
        }
    }
}
