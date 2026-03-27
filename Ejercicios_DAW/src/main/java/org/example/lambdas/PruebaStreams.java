package org.example.lambdas;

import java.util.List;
import java.util.stream.Stream;

public class PruebaStreams {
    static void main() {
        Stream <String> pruebaStream = Stream.of("Gatos", "Leones", "Tigre", "Guepardo")
                .filter(felino -> felino.endsWith("s"))
                .filter(felino -> felino.contains("e"))
                .map(String::toUpperCase);
//                .anyMatch(felino -> felino.equals("leones"));
//                .count();


        List<String> felinos = pruebaStream.toList();
        System.out.println(felinos);
    }
}
