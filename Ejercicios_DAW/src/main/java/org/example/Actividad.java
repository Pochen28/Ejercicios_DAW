package org.example;

import java.util.Random;

public class Actividad {

    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = 12;
        String contraseña = "";

        Random aleatorio = new Random();

        for (int i = 0; i < longitud; i++) {
            int indice = aleatorio.nextInt(caracteres.length());
            contraseña += caracteres.charAt(indice);
        }

        System.out.println("Contraseña generada: " + contraseña);
    }
}
