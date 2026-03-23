package org.example.EjerciciosRecuperar;

import java.util.Scanner;

public class Num_Suerte {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean repetir;

        do {
            System.out.println("Introduce tu fecha de nacimiento dd/mm/aaaa: ");
            String nacimiento = teclado.nextLine();
            System.out.println(nacimiento);



            try {
                if (nacimiento.length() == 10 && nacimiento.charAt(2) == '/' && nacimiento.charAt(5) == '/')  {
                    repetir = false;

                    int dia = Integer.parseInt(nacimiento.substring(0, 2));
                    int mes = Integer.parseInt(nacimiento.substring(3, 5));
                    int anyo = Integer.parseInt(nacimiento.substring(6, 10));
                    if (dia >= 1 && dia<=31 && mes>= 1 && mes<=12){
                        int suma = (dia + mes + anyo);
                        System.out.println(dia + " + " + mes + " + " + anyo + " = " + suma );
                        String suma_cifras = Integer.toString(suma);

                        int cifra1 = Integer.parseInt(suma_cifras.substring(0,1));
                        int cifra2 = Integer.parseInt(suma_cifras.substring(1,2));
                        int cifra3 = Integer.parseInt(suma_cifras.substring(2,3));
                        int cifra4 = Integer.parseInt(suma_cifras.substring(3,4));

                        int total = cifra1+cifra2+cifra3+cifra4;

                        System.out.println(cifra1 + " + " + cifra2 + " + " + cifra3 + " + " + cifra4 + " = " + total );
                        System.out.println("Tu numero de la suerte es el " + total);

                    }else {
                        System.out.println("Introduce los valores correspondientes de los días, meses y años.");
                        repetir= true;
                    }

                } else {
                    repetir= true;
                    System.out.println("ERROR, no se han introducido correctamente los caracteres. ");
                }

            } catch (Exception Err) {
                System.out.println("ERROR, sólo se aceptan números");
                repetir = true;
            }
            System.out.println(" ");
        } while (repetir);


    }
}
