package org.example;

import java.util.Random;
import java.util.Scanner;

public class Olivas {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int litros_columnas = 0;
        int num_columna = 0;
        int hileras = 0;
        int kilos = 0;
        System.out.println("Introduce el tamaño de tu bancal ");
        System.out.print("Ancho: ");
        int a = teclado.nextInt();
        System.out.print("Largo: ");
        int l = teclado.nextInt();
        int bancal [] [] = new int[a][l];


        System.out.println("Introduce (por hileras) los kg por árbol de tu bancal: ");
        for (int i = 0; i < bancal.length; i++) {
            for (int j = 0; j < bancal [i].length; j++) {

                hileras = teclado.nextInt();
                kilos += hileras;
                bancal [i] [j] = hileras;
            }

        }
        System.out.println("Mapa de tu bancal actual: ");
        for (int filas [] : bancal){
            for (int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }
        System.out.println("----------------");
        System.out.println("Total de kg obtenidos: " + kilos);
        System.out.println("Se pueden hacer " + kilos/8 + " de aceite.");

        for (int i = 0; i < bancal.length; i++) {
            for (int j = 0; j < bancal .length; j++) {
                litros_columnas += bancal [j] [i];

            }
            num_columna +=1;
            System.out.println("Hay " +litros_columnas + " litros en la columna " + num_columna );
            litros_columnas = 0;

        }
        System.out.println("Olivos más productivos (>35kg): ");
        for (int i = 0; i < bancal.length; i++) {
            for (int j = 0; j < bancal[i].length; j++) {
                if (bancal[i][j] > 35) {
                    System.out.println("En la posición: " + i + ", " + j + " hay un olivo con " + bancal[i][j] + " litros");
                }

            }
        }
        System.out.println("Olivos que han producido menos de 5kg esta temporada: ");
        String matrizmala = "";
        for (int i = 0; i < bancal.length; i++) {
            for (int j = 0; j < bancal [i].length; j++) {
                if (bancal [i] [j] <5){
                    matrizmala = "X";
                }else {
                    matrizmala = "0";
                }

                System.out.print(matrizmala + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Predicción replantación año que viene");
        int matrizint = 0;
        for (int i = 0; i < bancal.length; i++) {
            for (int j = 0; j < bancal [i].length; j++) {
                if (bancal[i] [j] <5){
                    matrizint = aleatorio.nextInt(14, 35) +1;
                }



                System.out.print(matrizint + " ");
            }
            System.out.print("\n");
        }

    }
}
