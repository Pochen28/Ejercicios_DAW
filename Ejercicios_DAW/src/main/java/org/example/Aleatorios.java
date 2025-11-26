package org.example;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int num = 0;
        int longitud = 12;
        String contrasena = "";

        for (int i = 0; i < 10; i++) {
            num = aleatorio.nextInt(4,8)+1;
            System.out.print(num + " ");
        }


        for (int i = 0; i < longitud; i++) {
            int coger = aleatorio.nextInt(caracteres.length());
            contrasena += caracteres.charAt(coger);
        }

        System.out.println("Contraseña generada: " + contrasena);
    }
}
