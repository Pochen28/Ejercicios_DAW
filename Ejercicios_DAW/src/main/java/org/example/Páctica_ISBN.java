package org.example;

import java.util.Scanner;

public class Páctica_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int x;
        System.out.println("Bienvenido al comprobador de ISBN");
        System.out.println("Introduce el ISBN");
        String isbn = teclado.next();
        String isbn_mayus = isbn.toUpperCase();


        System.out.println("¿Qué quieres hacer con el ISBN?");
        System.out.println(" [1] Validar ISBN \n [2] Reparar ISBN \n [3] Salir");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Validemos el ISBN");

                    for (int i = 0; i < 10 ; i++) {
                        char posicion = isbn_mayus.charAt(i);
                        String comprobar_num = isbn.substring(0, 9);
                        if (i==9 && posicion == 'X' ){
                            x = 10;
                            System.out.println("Hay una X");
                        }else {
                           try {
                               int comprobar_int = Integer.parseInt(comprobar_num);

                               System.out.println("todo bien");
                           }catch (Exception Err){
                               System.out.println("Error");
                           }

                        }


                }

                break;


            case 2:
                System.out.println("Vamos a reparar el ISBN.");

                break;

            case 3:


                break;
        }
    }
}
