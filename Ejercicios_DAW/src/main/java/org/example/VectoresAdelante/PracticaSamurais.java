package org.example.VectoresAdelante;

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


        for (int num_equipo = 1; num_equipo <= 2; num_equipo++) {
            boolean equipo_valido = false;
            int[] equipo_actual;

            if (num_equipo == 1) {
                equipo_actual = equipo1;
            } else {
                equipo_actual = equipo2;
            }

            // Repite hasta que el equipo se cree correctamente
            do {
                System.out.println("Prepara al EQUIPO " + num_equipo + ":");
                System.out.println("Introduce las potencias de tus 7 samuráis separadas por espacios:");

                String linea = teclado.nextLine();
                String[] valores = linea.split(" ");

                // Controla que se introduzcan 7 números
                if (valores.length != num_samurais) {
                    System.out.println(" ERROR: Debes escribir exactamente 7 números.");
                } else {
                    int suma = 0;
                    boolean hay_error = false;

                    // Comprueba que los datos sean válidos y estén en el rango
                    for (int i = 0; i < num_samurais; i++) {
                        try {
                            int potencia = Integer.parseInt(valores[i]);
                            if (potencia < potencia_min || potencia > potencia_max) {
                                System.out.println(" ERROR: La potencia de cada samurái debe estar entre 1 y 24.");
                                hay_error = true;
                                break;
                            }
                            equipo_actual[i] = potencia;
                            suma = suma + potencia;
                        } catch (Exception Err) {
                            System.out.println(" ERROR: Solo se permiten números enteros.");
                            hay_error = true;
                            break;
                        }
                    }

                    // Comprueba que la suma total sea 30
                    if (!hay_error) {
                        if (suma != potencia_total) {
                            System.out.println(" ERROR: La suma total debe ser 30. Has puesto " + suma + ".");
                        } else {
                            System.out.println(" Equipo " + num_equipo + " completado con éxito.");
                            equipo_valido = true;
                        }
                    }
                }

            } while (equipo_valido == false);
        }

        // --- INICIO DE LA BATALLA ---
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             ¡QUE COMIENCE EL DUELO!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int inicio = random.nextInt(num_samurais);
        System.out.println("El enfrentamiento comienza con el samurái número " + (inicio + 1) + ".");
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

            int sam1 = equipo1[posicion];
            int sam2 = equipo2[posicion];

            System.out.print(" Samurái " + (posicion + 1) + ": ");


            if (sam1 > sam2) {
                System.out.println("Victoria del EQUIPO 1 (" + sam1 + " vs " + sam2 + ")");
                equipo2[posicion] = 0;
                bajas2 = bajas2 + 1;
            } else if (sam2 > sam1) {
                System.out.println("Victoria del EQUIPO 2 (" + sam2 + " vs " + sam1 + ")");
                equipo1[posicion] = 0;
                bajas1 = bajas1 + 1;
            } else {
                System.out.println("Empate (" + sam1 + " vs " + sam2 + "). Ambos caen al suelo.");
                equipo1[posicion] = 0;
                equipo2[posicion] = 0;
                bajas1 = bajas1 + 1;
                bajas2 = bajas2 + 1;
            }

            // Avanza al siguiente samurái
            posicion = posicion + 1;
            if (posicion == num_samurais) {
                posicion = 0;
            }
        }


        System.out.println("==============================================");
        System.out.println("                RESULTADO FINAL");
        System.out.println("==============================================");

        if (bajas1 >= 4 && bajas2 >= 4) {
            System.out.println(" Empate. Los dos equipos han perdido demasiados guerreros.");
        } else if (bajas1 >= 4) {
            System.out.println(" ¡EQUIPO 2 TRIUNFA! El equipo 1 ha tenido " + bajas1 + " bajas.");
        } else {
            System.out.println(" ¡EQUIPO 1 TRIUNFA! El equipo 2 ha tenido " + bajas2 + " bajas.");
        }
    }
}
