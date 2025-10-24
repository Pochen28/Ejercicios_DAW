package org.example;

import java.util.Scanner;

public class String_Cosas {
    static void main() {
        Scanner teclado = new Scanner(System.in);



        int a, b , c , d;

        a = teclado.nextInt();
        b= 0;
        c= 1;
        while (a!=0){
            b++;
            c = c + a/ b;
            a = teclado.nextInt();
        }

        d = b + c;
        System.out.println(d);

        String frase = "Me siento empodera -a-a, sigo empodera";

        int tamanyo = frase.length();
        System.out.println(tamanyo);

        System.out.println(frase.charAt(15));

        String trozo = frase.substring(10,22);
        System.out.println(trozo);
        String trozo2  = frase.substring(22);
        System.out.println(trozo2);

        int posicion_empodera = frase.indexOf("empodera");
        System.out.println(posicion_empodera);

        int posicion_empodera2 = frase.indexOf("empodera", 1);
        System.out.println(posicion_empodera2);

        int posicion_empodera_ult = frase.lastIndexOf("empodera");
        System.out.println(posicion_empodera_ult);

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        String nombre = "Iván                     ";
        System.out.println(nombre.trim() + " - " + nombre + " #");
        String nombre_mayus = nombre.toUpperCase();
        boolean iguales = nombre_mayus.trim().equals("IVÁN");
        System.out.println(iguales);

        boolean iguales2 = nombre.trim().equalsIgnoreCase("Iván");
        System.out.println(iguales2);

        String cambiada = frase.replace("empodera", "patriota");
        System.out.println(cambiada);

        String frase_concatenada = frase.concat(" Misha dame un becico");
        System.out.println(frase_concatenada);



    }

}
