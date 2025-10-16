package org.example;

public class Ejercicio4_T2 {
    static void main() {


        String frase_mundo = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String palabra = "Mundo";



        frase_mundo = frase_mundo.toUpperCase();
        palabra = palabra.toUpperCase();

        int longitud = frase_mundo.length();
        System.out.println("La longitud del texto es: " + longitud);


        frase_mundo = frase_mundo.replace(palabra, "");


        int longitud_nueva = frase_mundo.length();

        int veces_mundo = (longitud - longitud_nueva) / palabra.length();
        System.out.println("Cantidad de vecs que el texto dice mundo: " + veces_mundo);
        boolean verificar = frase_mundo.contains("Albaricoque");
        System.out.println(verificar);



    }
}
