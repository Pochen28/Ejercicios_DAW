package org.example;

import java.util.Arrays;

public class IntroSplit {
    static void main() {
        String cadena = "Madrid,Barça,Valencia,Athletic,Hercules";
        String equipos[] = cadena.split("");
        System.out.println(Arrays.toString(equipos));
    }
}
