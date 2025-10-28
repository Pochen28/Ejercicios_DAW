package org.example;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 12;
        String contrasena = "";

        for (int i = 0; i < longitud; i++) {
            int coger = aleatorio.nextInt(caracteres.length());
            contrasena += caracteres.charAt(coger);
        }

        System.out.println("Contraseña generada: " + contrasena);
    }
}
