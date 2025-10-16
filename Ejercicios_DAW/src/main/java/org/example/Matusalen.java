package org.example;
import java.util.Scanner;
public class Matusalen {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        int num = 0;
        int multiplicando = 0;
        int multiplicador = 0;
        boolean repetir = false;




        do {


            try {
                System.out.println("Dame un multiplicando:");
                multiplicando = teclado.nextInt();


                System.out.println("Dame un multiplicador:");
                multiplicador = teclado.nextInt();


                if (multiplicando> 900 || multiplicando<100 || multiplicador> 900 || multiplicador< 100);
                System.out.println("Los valores de ambos números deben estar entre 100 y 200.");


            }catch (Exception Err){


                System.out.println("Error, se admiten números únicamente");
                repetir = true;
                teclado.nextLine();
            }


        }while (repetir==true);










        String intmultiplicando= Integer.toString(multiplicando);
        String intmultiplicador = Integer.toString(multiplicador);




        int unidades = Integer.parseInt(intmultiplicador.substring(2,3));
        int decenas = Integer.parseInt(intmultiplicador.substring(1,2));
        int centenas = Integer.parseInt(intmultiplicador.substring(0,1));




        int opr1 = multiplicando* unidades;
        int opr2 = multiplicando* decenas;
        int opr3 = multiplicando* centenas;
        int resultado = multiplicando * multiplicador;




        System.out.println();
        System.out.println("  " + multiplicando);
        System.out.println(" x " + multiplicador);
        System.out.println("-------");
        System.out.println("   " + opr1);
        System.out.println("  " + opr2);
        System.out.println(" " + opr3);
        System.out.println("-------");
        System.out.println(resultado);
    }


}
