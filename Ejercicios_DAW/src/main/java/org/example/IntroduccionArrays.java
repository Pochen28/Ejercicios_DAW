package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IntroduccionArrays {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int vector [] = {10, 7, 3, 1 ,25, 4};
        String vector2 [] = {"Ivan" , "Moi" , "Manuela" , "Jose"};
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));

        int vector3 [] = new int[6];
        System.out.println(Arrays.toString(vector3));
        String vector4 [] = new String[6];
        System.out.println(Arrays.toString(vector4));
        System.out.println(vector4);
        vector = vector3;
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector3));


        System.out.println("---------");


        int nums [] = new int[5];



        int nums2 [] = new int[5];

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));

        nums = nums2.clone();


        nums2 [2] = 34;

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));

        System.out.println(nums.length);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Numero: " + nums[i]+10);

        }
        int numeros [] = new int [6];
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(501);
            contador += numeros[i];

        }
        System.out.println(Arrays.toString(numeros));


    }
}
