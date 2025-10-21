package org.example;

import java.util.Scanner;

public class prueba3 {

    static void main (String[] args){

        Scanner teclado = new Scanner(System.in);


        boolean bucle = false;

        do {
            try{
                System.out.println("Dame un número");
                int numero_1 = teclado.nextInt();
                System.out.println("Dame otro número");
                int numero_2 = teclado.nextInt();













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
