package org.example;

import java.util.Scanner;

public class Páctica_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al comprobador de ISBN");
        System.out.println("Introduce el ISBN");
        String isbn = teclado.next();
        String isbn_mayus = isbn.toUpperCase(); // Convierte el ISBN a mayúsculas para poder tratar 'x' y 'X' igual

        if (isbn_mayus.length() != 10) {
            System.out.println("Error: el ISBN debe tener exactamente 10 caracteres.");
            return;
        }

        System.out.println("¿Qué quieres hacer con el ISBN?");
        System.out.println(" [1] Validar ISBN \n [2] Reparar ISBN \n [3] Salir");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                int suma = 0;
                System.out.println("Validemos el ISBN");

                for (int i = 0; i < 10; i++) {
                    int x = 0;
                    char posicion = isbn_mayus.charAt(i); // Obtiene cada carácter del ISBN

                    if (i == 9 && posicion == 'X') { // La 'X' en última posición vale 10
                        x = 10;
                    } else {
                        try {
                            x = Integer.parseInt("" + posicion); // Convierte el carácter numérico a entero para que salte error en el try catch si no hay un número
                        } catch (Exception Err) {
                            System.out.println("Error: se ha encontrado un carácter no numérico en una posición incorrecta.");
                            return;
                        }
                    }

                    int producto = x * (10 - i); // Multiplica cada dígito por su valor correspondiente
                    suma += producto;
                    System.out.println(x + " x " + (10 - i) + " = " + producto);
                }

                // Si la suma total es múltiplo de 11, el ISBN es válido
                if (suma % 11 == 0) {
                    System.out.println("El ISBN es válido, la suma total es: " + suma);
                } else {
                    System.out.println("El ISBN no es válido ya que no es divisible entre 11, la suma total es: " + suma);
                }

                break;

            case 2:
                System.out.println("Vamos a reparar el ISBN.");

                //  Verificamos que el ISBN contenga caracteres no válidos
                boolean caracteresInvalidos = false;
                for (int i = 0; i < isbn_mayus.length(); i++) {
                    char c = isbn_mayus.charAt(i);
                    if (!Character.isDigit(c) && c != 'X' && c != '?') {
                        caracteresInvalidos = true;
                        break;
                    }
                }

                if (caracteresInvalidos) {
                    System.out.println("Error: el ISBN contiene caracteres no válidos. Solo se permiten números, 'X' o '?'.");
                    return;
                }

                // Localiza la posición del carácter '?'
                int posicionfalta = isbn_mayus.indexOf('?');
                if (posicionfalta == -1) {
                    System.out.println("Error: no hay ningún signo '?' en el ISBN.");
                    return;
                }

                int suma2 = 0;

                // Calcula la suma sin tener en cuenta el signo '?'
                for (int i = 0; i < 10; i++) {
                    char c = isbn_mayus.charAt(i);

                    if (c != '?') {
                        int valor = 0;

                        if (i == 9 && c == 'X') {
                            valor = 10;
                        } else {
                            try {
                                valor = Integer.parseInt("" + c);
                            } catch (Exception e) {
                                System.out.println("Error: carácter no válido en el ISBN.");
                                return;
                            }
                        }

                        suma2 += valor * (10 - i);
                    }
                }

                int peso = 10 - posicionfalta; // Peso correspondiente al dígito faltante
                int valorFaltante = -1;

                // Prueba todos los valores posibles (0 a 10) para encontrar el que haga que la suma sea múltiplo de 11
                for (int posible = 0; posible <= 10; posible++) {
                    if ((suma2 + posible * peso) % 11 == 0) {
                        valorFaltante = posible;
                        break;
                    }
                }

                if (valorFaltante == -1) {
                    System.out.println("No se pudo determinar el dígito faltante correctamente.");
                } else if (valorFaltante == 10) {
                    System.out.println("El dígito que falta es una 'X'.");
                } else {
                    System.out.println("El dígito que falta es: " + valorFaltante);
                }

                break;

            case 3:
                System.out.println("Saliendo...");
                break;
        }
    }
}
