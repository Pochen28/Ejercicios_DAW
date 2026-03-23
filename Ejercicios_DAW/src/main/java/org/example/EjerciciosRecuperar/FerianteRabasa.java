package org.example.EjerciciosRecuperar;

import java.util.Scanner;

public class FerianteRabasa {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean repetir;
        int altura = 0;
        double peso_min = 0;
        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        do {
            try{
                repetir = true;
                System.out.println("Leyendo altura (cm)...");
                altura = teclado.nextInt();
                if (altura < 140){
                    System.out.println("Lo siento, no puedes montar en la atracción, te faltan " + (140 - altura) + "cm para poder subir.");
                    return;
                } else if (altura > 230) {
                    System.out.println("Lo siento, sobrepasas el límite de altura por " + (altura - 230) + "cm.");
                    return;
                }

            }catch (Exception Err){
                repetir = false;
                System.out.println("Error de lectura, baja de la báscula y vuelve a subir.");
            }
            teclado.nextLine();
        }while (!repetir);

        do {
            try {
                repetir = true;
                System.out.println("Leyendo peso (kg)...");
                int peso = teclado.nextInt();
                peso_min = altura*2/8.0;
                System.out.println("Pesas " + peso + "kg.");
                if (peso > 120 ){
                    System.out.println("Lo siento, sobrepasas por " + (peso - 120) + "cm el límite de la atracción.");
                    return;
                }else if (peso < peso_min){
                    System.out.println("Lo siento, te faltan " + (peso_min - peso) + "kg para poder subiur a la atracción.");
                    return;
                }
                System.out.println("Peso mínimo calculado: " + peso_min);
                System.out.println("¡¡¡Sube a la atracción!!!");

            }catch (Exception Err){
                repetir = false;
                System.out.println("Error de lectura, baja de la báscula y vuelve a subir.");
            }
            teclado.nextLine();
        }while (!repetir);
    }
}