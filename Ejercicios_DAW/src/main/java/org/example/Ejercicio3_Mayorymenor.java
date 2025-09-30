package org.example;


import java.util.Scanner;

class Ejercicio3_Mayorymenor {
         static void main() {
            Scanner teclado = new Scanner(System.in);

             System.out.println("Introduce un número");
             int numero = teclado.nextInt();

             if(numero>0) {
                 System.out.println("El número " + numero + " es positivo");
             }else{
                 if (numero<0) {
                     System.out.println("El número " + numero + " es negativo");
                 }else{
                     System.out.println("El número " + numero +" es natural");
                 }
             }
         }



}
