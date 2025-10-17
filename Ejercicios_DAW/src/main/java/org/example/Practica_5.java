package org.example;

import java.util.Scanner;

public class Practica_5 {
    static void main() {
    Scanner teclado = new Scanner(System.in);
    boolean repetir = false;



    System.out.println("Introduce tu fecha de nacimiento dd/mm/aaaa: ");
    String nacimiento_palabra = teclado.nextLine();
    nacimiento_palabra = nacimiento_palabra.replace("/", "").replace("-" , "");
    System.out.println(nacimiento_palabra);
    int dia = Integer.parseInt(nacimiento_palabra.substring(0,2));
    int mes = Integer.parseInt(nacimiento_palabra.substring(2,4));
    int anyo = Integer.parseInt(nacimiento_palabra.substring(4,8));
    System.out.println(dia);
    System.out.println(mes);
    System.out.println(anyo);


    do {
        try {



        }catch (Exception Err) {


        }
    }while (repetir==true);






    }
}
