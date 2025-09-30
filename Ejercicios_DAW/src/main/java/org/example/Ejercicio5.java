package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {

        Scanner teclado = new Scanner(System.in);



        int numero= 0;
        try {
                numero = teclado.nextInt();
        }catch(Exception err){
            System.out.println("Introduce un formato correcto");
        }

    }
}
