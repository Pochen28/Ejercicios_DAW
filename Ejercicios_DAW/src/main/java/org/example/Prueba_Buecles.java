package org.example;

import java.util.Scanner;

public class Prueba_Buecles {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el ISBN (10 dígitos, sin guiones): ");
        String isbn = teclado.nextLine();
        teclado.close();

        if (esValidoISBN(isbn)) {
            System.out.println("✅ El ISBN es válido.");
        } else {
            System.out.println("❌ El ISBN NO es válido.");
        }
    }

    // Método que valida un ISBN de 10 dígitos
    public static boolean esValidoISBN(String isbn) {
        // Comprobar longitud correcta
        if (isbn.length() != 10) {
            return false;
        }

        int suma = 0;

        for (int i = 0; i < 10; i++) {
            char c = isbn.charAt(i);
            int valor;

            // El último dígito puede ser 'X' y representa el valor 10
            if (i == 9 && (c == 'X' || c == 'x')) {
                valor = 10;
            } else if (Character.isDigit(c)) {
                valor = c - '0'; // Convertir el carácter a número
            } else {
                return false; // Carácter inválido
            }

            suma += valor * (10 - i);
        }

        // Si la suma es múltiplo de 11, el ISBN es válido
        return suma % 11 == 0;
    }
}
