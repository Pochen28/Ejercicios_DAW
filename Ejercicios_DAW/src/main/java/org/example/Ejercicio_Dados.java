package org.example;

import java.util.Random;

public class Ejercicio_Dados {
    static void main() {
        Random aleatorio = new Random();

        int dado = aleatorio.nextInt(0, 6) +1;
        System.out.println(dado);
        int dado2 = aleatorio.nextInt(0 , 6) + 1;
        System.out.println(dado2);
        System.out.println("Suma dados: " + (dado + dado2));
    }
}
