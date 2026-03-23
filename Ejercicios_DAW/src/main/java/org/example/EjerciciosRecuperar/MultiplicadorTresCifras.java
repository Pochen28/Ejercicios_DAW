package org.example.EjerciciosRecuperar;
import java.util.Scanner;

public class MultiplicadorTresCifras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int multiplicando = 0;
        int multiplicador = 0;
        boolean repetir;

        do {
            repetir = false;
            try {
                System.out.println("Dame un multiplicando:");
                multiplicando = teclado.nextInt();

                System.out.println("Dame un multiplicador:");
                multiplicador = teclado.nextInt();

                // Corrección: Quité el ';' al final y ajusté la condición del if para el rango [100, 200]
                if (multiplicando > 200 || multiplicando < 100 || multiplicador > 200 || multiplicador < 100) {
                    System.out.println("Los valores de ambos números deben estar entre 100 y 200.");
                    repetir = true; // Forzamos a repetir si la validación de rango falla
                }

            } catch (Exception Err) {
                System.out.println("Error, se admiten números únicamente");
                repetir = true;
                teclado.nextLine(); // Importante para limpiar el buffer del scanner
            }

        } while (repetir);

        String intmultiplicando = Integer.toString(multiplicando);
        String intmultiplicador = Integer.toString(multiplicador);

        // Aquí empieza la unión de la segunda imagen
        int unidades = Integer.parseInt(intmultiplicador.substring(2, 3));
        int decenas = Integer.parseInt(intmultiplicador.substring(1, 2));
        int centenas = Integer.parseInt(intmultiplicador.substring(0, 1));

        int opr1 = multiplicando * unidades;
        int opr2 = multiplicando * decenas;
        int opr3 = multiplicando * centenas;
        int resultado = multiplicando * multiplicador;

        System.out.println();
        // He respetado los espacios para que el formato de salida sea igual al tuyo
        System.out.println("    " + multiplicando);
        System.out.println(" x " + multiplicador);
        System.out.println("--------");
        System.out.println("    " + opr1);
        System.out.println("  " + opr2);
        System.out.println(" " + opr3);
        System.out.println("--------");
        System.out.println(resultado);
    }
}