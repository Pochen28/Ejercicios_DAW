package org.example;

import java.util.Scanner;

public class Ejercicio4_BuclesAnidados {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        primos:
        for (int i = 2; i <=n ; i++) {
            for (int j = 2; j <i; j++) {
              if (i%j == 0) {
                  continue primos;

              }
            }
            System.out.println(i +" ");
        }
//        if (n%n  == 2 ){
//            System.out.println("Es primo");
//        }else {
//            System.out.println("no es");
//        }



    }
}
