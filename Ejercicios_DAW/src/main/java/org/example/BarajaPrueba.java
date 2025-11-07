package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BarajaPrueba {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir = true;
        int cartas = 40;
        int contador = 0;

        do {
            System.out.println("Introduce el número de jugadores (mínimo 2, máximo 10): ");
            int jugadores = teclado.nextInt();
            int mazoSobrante = cartas % jugadores;

            if (jugadores <= 10 && jugadores > 1) {


                String[] palos = {"bastos", "oros", "copas", "espadas"};
                int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

                List<String> mazo = new ArrayList<>();

                for (String palo : palos) {
                    for (int numero : numeros) {
                        mazo.add(numero + " de " + palo);
                    }
                }


                Collections.shuffle(mazo);

                int distribucion = cartas / jugadores;
                int indice = 0;

                // ✅ 3. Repartir cartas equitativamente
                for (int j = 0; j < jugadores; j++) {
                    contador += 1;
                    System.out.println("----------------");
                    System.out.println("Jugador " + contador + ":");

                    for (int d = 0; d < distribucion; d++) {
                        System.out.println("  " + mazo.get(indice));
                        indice++;
                    }
                }

                // ✅ 4. Mostrar cartas sobrantes
                System.out.println("----------------");
                if (mazoSobrante > 0) {
                    System.out.println("Hay " + mazoSobrante + " cartas en el mazo:");
                    for (int s = 0; s < mazoSobrante; s++) {
                        System.out.println("  " + mazo.get(indice));
                        indice++;
                    }
                } else {
                    System.out.println("No sobran cartas, el mazo se repartió completo.");
                }

                repetir = true;

            } else {
                System.out.println("Número de jugadores incorrecto.");
                repetir = false;
            }

        } while (repetir == false);
    }
}
