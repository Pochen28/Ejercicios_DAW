package org.example;

public class Ejercicio6_Vectores {
    static void main() {
        int vector[] = {1,2,3,4,5};
        boolean es_o_no = true;
        for (int i = 0; i < vector.length; i++) {

            if (vector[1]!=vector[vector.length-1-i]){
                System.out.println("No es");
                es_o_no = false;
                break;
            }
            if (es_o_no);


        }
    }
}
