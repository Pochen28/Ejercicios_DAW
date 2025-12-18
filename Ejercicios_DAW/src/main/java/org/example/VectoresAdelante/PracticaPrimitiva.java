package org.example.VectoresAdelante;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticaPrimitiva {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean formato;
        String numeros = "";

        int ganador_primitiva[] = new int[6];

        for (int i = 0; i < 6; i++) {

            ganador_primitiva[i] = aleatorio.nextInt(49) + 1;

            for (int j = 0; j < i; j++) {
                if (ganador_primitiva[i] == ganador_primitiva[j]) {
                    ganador_primitiva[i] = aleatorio.nextInt(49) + 1;
                    j = -1;
                }
            }
        }

        int complementario;
        while (true) {
            complementario = aleatorio.nextInt(49) + 1;
            boolean repetido = false;
            for (int i = 0; i < 6; i++) {
                if (complementario == ganador_primitiva[i]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) break;
        }


        int reintegro = aleatorio.nextInt(10);

        int usuario_nums[] = new int[6];
        int usuario_reintegro = -1;



        do {
            System.out.println("Introduce 6 números entre 1-49 para la primitiva, y último el reintegro entre 0-9, siguiendo el siguiente formato: N-N-N-N-N-N/R");
            numeros = teclado.nextLine();
            formato = numeros.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1,2}");

            if (!formato) {
                System.out.println("Introduce correctamente el formato");
                continue;
            }


            String vector_nums[] = numeros.split("[-/]");
            boolean fueraRango = false;

            for (int i = 0; i < 6; i++) {
                int vector_int = Integer.parseInt(vector_nums[i]);
                if (vector_int < 1 || vector_int > 49) {
                    System.out.println("Deben ser números entre el 1 y el 49.");
                    fueraRango = true;
                    break;
                }
                usuario_nums[i] = vector_int;
            }


            if (fueraRango) {
                formato = false;
                continue;
            }



            usuario_reintegro = Integer.parseInt(vector_nums[6]);
            if (usuario_reintegro < 0 || usuario_reintegro > 9) {
                System.out.println("El reintegro debe ser un número entre 0 y 9.");
                formato = false;
                continue;
            }


            boolean hayRepetidos = false;
            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {
                    if (usuario_nums[i] == usuario_nums[j]) {
                        hayRepetidos = true;
                        break;
                    }
                }
                if (hayRepetidos) break;
            }

            if (hayRepetidos) {
                System.out.println("No puedes introducir números repetidos en la primitiva.");
                formato = false;
                continue;
            }

            formato = true;

        } while (!formato);


        System.out.println("Combinación ganadora:");
        System.out.println(Arrays.toString(ganador_primitiva));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: " + reintegro);


        int aciertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (usuario_nums[i] == ganador_primitiva[j]) {
                    aciertos++;
                    break;
                }
            }
        }

        boolean tienecomplementario = false;
        for (int i = 0; i < 6; i++) {
            if (usuario_nums[i] == complementario) {
                tienecomplementario = true;
                break;
            }
        }

        boolean aciertaReintegro = (usuario_reintegro == reintegro);

        String categoria;

        if (aciertos == 6 && aciertaReintegro) {
            categoria = "Categoría Especial: 6 aciertos + reintegro";
        } else if (aciertos == 6) {
            categoria = "1ª Categoría: 6 aciertos";
        } else if (aciertos == 5 && tienecomplementario) {
            categoria = "2ª Categoría: 5 aciertos + complementario";
        } else if (aciertos == 5) {
            categoria = "3ª Categoría: 5 aciertos";
        } else if (aciertos == 4) {
            categoria = "4ª Categoría: 4 aciertos";
        } else if (aciertos == 3) {
            categoria = "5ª Categoría: 3 aciertos";
        } else if (aciertaReintegro) {
            categoria = "Reintegro: sólo acertaste el reintegro";
        } else {
            categoria = "No premiado";
        }

        System.out.println("Resultado: " + categoria);
    }
}
