package org.example;

import java.util.Random;

public class Ejercicio_Contra {
    static void main(String[] args) {
        Random aleatorio = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasena = "";

        int longitud = 12;
        for (int i = 0; i <= longitud; i++) {
            int coger = aleatorio.nextInt(caracteres.length());
            contrasena += caracteres.charAt(coger);

        }
        System.out.println(contrasena);
    }
}
