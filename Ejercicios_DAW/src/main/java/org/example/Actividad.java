package org.example;

import java.util.Scanner;

public class Actividad {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al comprobador de ISBN");
        System.out.print("Introduce el ISBN (10 dígitos, sin guiones): ");
        String isbn = teclado.next();
        String isbn_mayus = isbn.toUpperCase(); // Pasamos todo a mayúsculas

        System.out.println("¿Qué quieres hacer con el ISBN?");
        System.out.println(" [1] Validar ISBN \n [2] Reparar ISBN \n [3] Salir");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Validemos el ISBN");

                boolean contieneX = false;
                boolean error = false;

                for (int i = 0; i < 10; i++) {
                    char posicion = isbn_mayus.charAt(i);

                    // Si el último carácter es 'X'
                    if (i == 9 && posicion == 'X') {
                        contieneX = true;
                        System.out.println("Hay una X en el último dígito (vale 10).");
                    } else {
                        // Intentamos convertir cada carácter a número
                        try {
                            // Convertimos el carácter a String y luego a int
                            int numero = Integer.parseInt(String.valueOf(posicion));
                            System.out.println("Carácter numérico: " + numero);
                        } catch (NumberFormatException e) {
                            // Si no se puede convertir, no es un número
                            System.out.println("❌ Error: el carácter '" + posicion + "' no es un número.");
                            error = true;
                        }
                    }
                }

                // Mostrar el resultado final
                if (!error) {
                    System.out.println("✅ El ISBN tiene un formato válido.");
                } else {
                    System.out.println("❌ El ISBN contiene letras o caracteres no válidos.");
                }

                break;

            case 2:
                System.out.println("Vamos a reparar el ISBN.");
                break;

            case 3:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        teclado.close();
    }
}
