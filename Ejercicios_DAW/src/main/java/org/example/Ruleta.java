package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("BIENVENIDO A LA RULETA");

        final String colores[] = {"rojo","negro"};

        Integer numeros[] = new Integer[37];

        for (int i=0;i< numeros.length;i++){
            numeros[i]=i;
        }

        final String par_impar[] = {"par","impar"};

        System.out.println("Introduce tu número (0-36)...");
        int numero_apuesta = teclado.nextInt();

        if (!Arrays.asList(numeros).contains(numero_apuesta)){
            System.out.println("ERROR. El número no es válido (0-36).");
            return;
        }

        String color_apuesta = "";
        String par_impar_apuesta="";

        if (numero_apuesta!=0){

            System.out.println("Introduce color: ");
            color_apuesta = teclado.next();

            if (!Arrays.asList(colores).contains(color_apuesta.toLowerCase())){
                System.out.println("ERROR. El color debe ser rojo-negro.");
                return;
            }

            System.out.println("Introduce par/impar: ");
            par_impar_apuesta = teclado.next();

            if (!Arrays.asList(par_impar).contains(par_impar_apuesta.toLowerCase())){
                System.out.println("ERROR. La opción debe ser par/impar.");
                return;
            }

        }

        String color_sorteo = colores[aleatorio.nextInt(2)];

        int numero_sorteo = aleatorio.nextInt(37);

        String par_impar_sorteo;

        if (numero_sorteo % 2 == 0){
            par_impar_sorteo="par";
        }else{
            par_impar_sorteo="impar";
        }

        System.out.println("Ha salido " + numero_sorteo + " " + color_sorteo + " " + par_impar_sorteo);

        if (numero_apuesta==numero_sorteo && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta)){
            System.out.println("HAS GANADO!!");
        } else if (numero_apuesta==numero_sorteo) {
            if (numero_sorteo==0){
                System.out.println("HAS GANADO Y TODA LA MESA PIERDE");
            }else{
                System.out.println("HAS ACERTADO EL NÚMERO");
            }
        } else if (color_apuesta.equals(color_sorteo)) {
            System.out.println("Has acertado el color " + color_apuesta);
        } else if (par_impar_apuesta.equals(par_impar_sorteo)) {
            System.out.println("Has acertado " + par_impar_apuesta);
        }else{
            System.out.println("HAS PERDIDO");
        }


    }
}