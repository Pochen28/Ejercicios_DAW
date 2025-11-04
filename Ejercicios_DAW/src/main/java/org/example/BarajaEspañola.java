package org.example;

import java.util.Random;
import java.util.Scanner;

public class BarajaEspañola {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean repetir = true;
        int cartas = 40;
        int contador = 0;

        do {

            System.out.println("Introduce el número de jugadores (mínimo 2, máximo 10): ");
            int jugadores = teclado.nextInt();
            int mazo = cartas % jugadores;

            if (jugadores <= 10 && jugadores > 1) {

                int distribucion = cartas / jugadores;
                for (int j = 0; j < jugadores ; j++) {
                    contador += 1;
                    System.out.println("----------------");
                    for (int d = 0; d < distribucion; d++) {
                        int banca = aleatorio.nextInt(1, 13);
                        int carta = aleatorio.nextInt(1, 5);


                        switch (carta) {

                            case 1:
                                System.out.println("Jugador " + contador + " tu carta es el " + banca + " de bastos");
                                break;

                            case 2:
                                System.out.println("Jugador " + contador + " tu carta es el " + banca + " de oros");
                                break;

                            case 3:
                                System.out.println("Jugador " + contador + " tu carta es el " + banca + " de copas");
                                break;

                            case 4:
                                System.out.println("Jugador " + contador + " tu carta es el " + banca + " de espadas");
                                break;
                        }

                    }
                    repetir = true;
                }
                System.out.println("----------------");
                System.out.println("Hay " + mazo + " cartas en el mazo.");


            } else {
                System.out.println("Número de jugadores incorrecto.");
                repetir = false;
            }


        } while (repetir == false);


    }
}
