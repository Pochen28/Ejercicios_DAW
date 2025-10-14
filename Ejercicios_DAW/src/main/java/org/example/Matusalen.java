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





        String num_string = Integer.toString(num);
        String num_izquierda = num_string.substring(0,1);
        String num_central = num_string.substring(2,3);
        String num_derecha = num_string.substring(3,4);
        int num_izquierda_int = Integer.parseInt(num_izquierda);
        int num_central_int = Integer.parseInt(num_central);
        int num_derecha_int = Integer.parseInt(num_derecha);



        System.out.println(num_izquierda_int*100);
        System.out.println(num_central_int*100);
        System.out.println(num_derecha_int*100);
    }

}
