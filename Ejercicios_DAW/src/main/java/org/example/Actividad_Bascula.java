package org.example;


import java.util.Scanner;

public class Actividad_Bascula {
    static void main(String[] args){
        Scanner teclado = new Scanner(System. in);

        final int altura_minima = 140;
        final double peso_maximo = 120;
        final int altura_maxima = 230;

        int num = 0;
        int altura = 0;
        int peso = 0;
        boolean repetir= false;
        boolean repetir2= false;

        System.out.println("***BENVENIDO AL RATÓN JUGUETÓN***");
        do {

            try {

                System.out.println("Introduce tu altura en cm.") ;
                altura = teclado.nextInt();
                repetir= false;

            }catch (Exception err){
                System.out.println("El formato introducido no es el correcto.");
                repetir= true;
            }
            teclado.nextLine();
        }while (repetir == true);

        if (altura > altura_maxima) {
            System.out.println("Lo siento, excedes la altura permitida por " +(altura - altura_maxima) +  "cm." );
        }else {
            if (altura < altura_minima) {
                System.out.println("Lo siento, no llegas la altura permitida por " + (altura_minima - altura) + "cm.");

            }else {
                do {
                    try {
                        System.out.println("Introduce tu peso en kg.");
                        peso = teclado.nextInt();
                        repetir2= false;

                    }catch (Exception err){
                        System.out.println("El formato introducido no es el correcto.");
                        repetir2= true;
                    }
                    teclado.nextLine();
                }while (repetir2 == true);

                if (peso > peso_maximo){
                    System.out.println("Lo siento, excedes el peso permitido por" + (peso - peso_maximo) + "kg.");

                }else{
                    if (peso< altura * 2/8){
                        System.out.println("Lo siento, pesas demasiado poco para tu altura.");
                    }else {
                        System.out.println("ENHORABUENA, PUEDES SUBIR AL RATÓN JUGUETÓN");
                    }
                }

            }
        }




    }
}
