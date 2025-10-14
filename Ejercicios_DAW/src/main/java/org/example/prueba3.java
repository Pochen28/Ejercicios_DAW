package org.example;

import java.util.Scanner;

public class prueba3 {

    static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero_1 = 0;
        int numero_2 = 0;
        boolean bucle = false;

        do {
            try{
                System.out.println("Dame un número");
                numero_1 = teclado.nextInt();
                System.out.println("Dame otro número");
                numero_2 = teclado.nextInt();
                bucle = false;


            }catch ( Exception err){
                System.out.println("Error, introduce un número");
                bucle = true;
                teclado.nextLine();
            }
        }while (bucle == true);

        System.out.println("capullo");

    }
}
