package org.example.lambdas;

public class Programa {
    static void main() {
        Prueba anonima = new Prueba() {
            @Override
            public char saludar(String nombre) {
                System.out.println("Hola soy " + nombre);
                return nombre.charAt(nombre.length()-1);
            }
        };
        Prueba lambda = (nombre) -> {
            System.out.println("Hola soy " + nombre + ", una lambda");
            return nombre.charAt(nombre.length()-1);
        };
        anonima.saludar("Jose");
        lambda.saludar("Ivan");
    }
}
