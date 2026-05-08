package org.jesus.api.stream.ejemplos.tareas;

import java.util.stream.Stream;

public class Tarea3 {
    public static void main(String[] args) {
        String[][] lenguajes = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };

        Stream<String> arregloPlano = Stream.of(lenguajes)
                .flatMap(Stream::of)
                .distinct();

        arregloPlano.forEach(System.out::println);
    }
}
