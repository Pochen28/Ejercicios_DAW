package org.example;

public class Switch {
    static void main() {
        int dia_de_la_semana = 2;

        switch (dia_de_la_semana) {

            case 1:
                System.out.println("LUNES");

            case 2:
                System.out.println("MARTES");

            case 3:
                System.out.println("MIÉRCOLES");

            case 4:
                System.out.println("JUEVES");

            case 5:
                System.out.println("VIERNES");

            case 6:
                System.out.println("SÁBADO");

            case 7:
                System.out.println("DOMINGO");
                default:
                 System.out.println("Día no válido.");
                    break;


        }

    }
}