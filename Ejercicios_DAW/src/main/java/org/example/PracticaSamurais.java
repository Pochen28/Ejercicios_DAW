package org.example;

import java.util.Random;
import java.util.Scanner;

public class PracticaSamurais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int num_samurais = 7;
        int potencia_total = 30;
        int potencia_min = 1;
        int potencia_max = 24;

        int[] equipo1 = new int[num_samurais];
        int[] equipo2 = new int[num_samurais];

        System.out.println("==============================================");
        System.out.println("        ~ BATALLA LEGENDARIA DE SAMURÁIS ~");
        System.out.println("==============================================");

        // CREACIÓN DE EQUIPOS
        for (int num_equipo = 1; num_equipo <= 2; num_equipo++) {
            boolean correcto = false;
            int[] equipo_actual;

            if (num_equipo == 1) {
                equipo_actual = equipo1;
            } else {
                equipo_actual = equipo2;
            }

            while (!correcto) {
                System.out.println("Configura el EQUIPO " + num_equipo + ":");
                System.out.println("Introduce las potencias de tus 7 samuráis separadas por espacios:");

                String linea = teclado.nextLine();
                String[] valores = linea.split(" ");

                if (valores.length != num_samurais) {
                    System.out.println("ERROR: Debes escribir exactamente 7 números.");
                    continue;
                }

                int suma = 0;
                boolean error = false;

                for (int i = 0; i < num_samurais; i++) {
                    try {
                        int potencia = Integer.parseInt(valores[i]);
                        if (potencia < potencia_min || potencia > potencia_max) {
                            System.out.println("ERROR: Cada samurái debe tener una potencia entre 1 y 24.");
                            error = true;
                            break;
                        }
                        equipo_actual[i] = potencia;
                        suma = suma + potencia;
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: Solo puedes introducir números enteros.");
                        error = true;
                        break;
                    }
                }

                if (error) {
                    continue;
                }

                if (suma != potencia_total) {
                    System.out.println("ERROR: La suma total debe ser 30. Has puesto " + suma + ".");
                } else {
                    System.out.println("EQUIPO " + num_equipo + " preparado correctamente.");
                    correcto = true;
                }
            }
        }

        // INICIO DE LA BATALLA
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             ¡QUE COMIENCE EL DUELO!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int inicio = random.nextInt(num_samurais);
        System.out.println("El combate arranca con el samurái número " + (inicio + 1) + ".");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int bajas1 = 0;
        int bajas2 = 0;
        int posicion = inicio;

        while (bajas1 < 4 && bajas2 < 4) {
            if (equipo1[posicion] == 0 && equipo2[posicion] == 0) {
                posicion = posicion + 1;
                if (posicion == num_samurais) {
                    posicion = 0;
                }
                continue;
            }

            int s1 = equipo1[posicion];
            int s2 = equipo2[posicion];

            System.out.print("   Samurái " + (posicion + 1) + ": ");

            if (s1 > s2) {
                System.out.println("Victoria del EQUIPO 1 (" + s1 + " vs " + s2 + ")");
                equipo2[posicion] = 0;
                bajas2 = bajas2 + 1;
            } else if (s2 > s1) {
                System.out.println("Victoria del EQUIPO 2 (" + s2 + " vs " + s1 + ")");
                equipo1[posicion] = 0;
                bajas1 = bajas1 + 1;
            } else {
                System.out.println("Empate (" + s1 + " vs " + s2 + ") – ambos caen en combate.");
                equipo1[posicion] = 0;
                equipo2[posicion] = 0;
                bajas1 = bajas1 + 1;
                bajas2 = bajas2 + 1;
            }

            posicion = posicion + 1;
            if (posicion == num_samurais) {
                posicion = 0;
            }
        }

        System.out.println("==============================================");
        System.out.println("                RESULTADO FINAL");
        System.out.println("==============================================");

        if (bajas1 >= 4 && bajas2 >= 4) {
            System.out.println(" Empate total. Ambos equipos han perdido demasiados samuráis.");
        } else if (bajas1 >= 4) {
            System.out.println(" ¡EQUIPO 2 GANA! El equipo 1 ha sufrido " + bajas1 + " bajas.");
        } else {
            System.out.println(" ¡EQUIPO 1 GANA! El equipo 2 ha sufrido " + bajas2 + " bajas.");
        }
    }
}
